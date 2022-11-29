package com.raquo.domtypes.codegen

import com.raquo.domtypes.codegen.generators._
import com.raquo.domtypes.common._

import java.io.{File, FileOutputStream, PrintStream}

class CanonicalGenerator(
  val basePackageName: String,
  val standardTraitCommentLines: List[String],
  val format: CodeFormatting
) {

  val defsPackageName: String = s"${basePackageName}.defs"

  val scalaJsDomImport: String = "import org.scalajs.dom"

  val codecsImport: String = s"import ${basePackageName}.codecs._"

  val baseScalaJsHtmlElementType: String = "dom.html.Element"

  val baseScalaJsSvgElementType: String = "dom.svg.Element"

  val baseScalaJsElementType: String = "dom.Element"

  val baseScalaJsEventType: String = "dom.Event"

  def keyTypeImport(keyType: String) = s"import ${basePackageName}.keys.${keyType}"



  // --

  def writeToFile(filePath: String, fileContent: String): Unit = {
    val outputFile = new File(filePath)
    outputFile.getParentFile.mkdirs()

    val outputPrintStream = new PrintStream(new FileOutputStream(outputFile))

    outputPrintStream.print(fileContent)
  }

  // --

  def generateTagsTrait(
    tagType: TagType,
    defGroups: List[(String, List[TagDef])],
    printDefGroupComments: Boolean,
    traitName: String,
    keyKind: String,
    keyImplName: String,
    defType: DefType
  ): String = {
    val (defs, defGroupComments) = defsAndGroupComments(defGroups, printDefGroupComments)

    val baseImplDef = if(tagType == HtmlTagType) {
      List(
        s"def ${keyImplName}[El <: $baseScalaJsHtmlElementType](key: String, void: Boolean = false): ${keyKind}[El] = ${keyKind}(key, void)"
      )
    } else {
      List(
        s"def ${keyImplName}[El <: $baseScalaJsSvgElementType](key: String): ${keyKind}[El] = ${keyKind}(key)",
      )
    }

    new TagsTraitGenerator(
      defs = defs,
      defGroupComments = defGroupComments,
      headerLines = List(
        s"package $defsPackageName",
        "",
        keyTypeImport(keyKind),
        scalaJsDomImport
      ),
      traitCommentLines = standardTraitCommentLines,
      traitName = traitName,
      defType = _ => defType,
      keyKind = _ => keyKind,
      keyImplName = _ => keyImplName,
      baseImplDef = baseImplDef,
      outputImplDefs = true,
      format = format
    ).generate()
  }

  def generateAttrsTrait(
    defGroups: List[(String, List[AttrDef])],
    printDefGroupComments: Boolean,
    traitName: String,
    keyKind: String,
    implNameSuffix: String,
    baseImplName: String,
    defType: DefType
  ): String = {
    val (defs, defGroupComments) = defsAndGroupComments(defGroups, printDefGroupComments)

    val tagTypes = defs.foldLeft(List[TagType]())((acc, k) => (acc :+ k.tagType).distinct)
    if (tagTypes.size > 1) {
      throw new Exception("Sorry, generateAttrsTrait does not support mixing attrs of different types in one call. You can contribute a PR (please contact us first), or bypass this limitation by calling AttrsTraitGenerator manually.")
    }
    val tagType = tagTypes.head

    val baseImplDef = if (tagType == SvgTagType) {
      List(
        s"def ${baseImplName}[V](key: String, codec: Codec[V, String], namespace: Option[String]): ${keyKind}[V] = ${keyKind}(key, codec, namespace)"
      )
    } else {
      List(
        s"def ${baseImplName}[V](key: String, codec: Codec[V, String]): ${keyKind}[V] = ${keyKind}(key, codec)"
      )
    }

    new AttrsTraitGenerator(
      defs = defs,
      defGroupComments = defGroupComments,
      headerLines = List(
        s"package $defsPackageName",
        "",
        keyTypeImport(keyKind),
        codecsImport
      ),
      traitCommentLines = standardTraitCommentLines,
      traitName = traitName,
      defType = _ => defType,
      keyKind = keyKind,
      keyImplName = attr => attrImplName(attr.codec, implNameSuffix),
      baseImplName = baseImplName,
      baseImplDef = baseImplDef,
      transformCodecName = _ + "Codec",
      transformNamespace = SourceRepr(_),
      outputImplDefs = true,
      format = format
    ).generate()
  }

  def generatePropsTrait(
    defGroups: List[(String, List[PropDef])],
    printDefGroupComments: Boolean,
    traitName: String,
    keyKind: String,
    implNameSuffix: String,
    baseImplName: String,
    defType: DefType
  ): String = {
    val (defs, defGroupComments) = defsAndGroupComments(defGroups, printDefGroupComments)

    val baseImplDef = List(
      s"def ${baseImplName}[Value, DomValue](key: String, codec: Codec[Value, DomValue]): ${keyKind}[Value, DomValue] = ${keyKind}(key, codec)"
    )

    new PropsTraitGenerator(
      defs = defs,
      defGroupComments = defGroupComments,
      headerLines = List(
        s"package $defsPackageName",
        "",
        keyTypeImport(keyKind),
        codecsImport
      ),
      traitCommentLines = standardTraitCommentLines,
      traitName = traitName,
      defType = _ => defType,
      keyKind = keyKind,
      keyImplName = prop => propImplName(prop.codec, implNameSuffix),
      baseImplName = baseImplName,
      baseImplDef = baseImplDef,
      transformCodecName = _ + "Codec",
      outputImplDefs = true,
      format = format
    ).generate()
  }

  def generateEventPropsTrait(
    defSources: List[(String, List[EventPropDef])],
    printDefGroupComments: Boolean,
    traitName: String,
    keyKind: String,
    keyImplName: String,
    defType: DefType
  ): String = {
    val (defs, defGroupComments) = defsAndGroupComments(defSources, printDefGroupComments)

    val baseImplDef = List(
      s"def ${keyImplName}[Ev <: ${baseScalaJsEventType}](key: String): ${keyKind}[Ev] = ${keyKind}(key)"
    )

    new EventPropsTraitGenerator(
      defs = defs,
      defGroupComments = defGroupComments,
      headerLines = List(
        s"package $defsPackageName",
        "",
        keyTypeImport(keyKind),
        scalaJsDomImport
      ),
      traitCommentLines = standardTraitCommentLines,
      traitName = traitName,
      defType = _ => defType,
      keyKind = keyKind,
      keyImplName = _ => keyImplName,
      baseImplDef = baseImplDef,
      outputImplDefs = true,
      format = format
    ).generate()
  }

  // --

  def defsAndGroupComments[Def <: KeyDef](
    defSources: List[(String, List[Def])],
    printDefGroupComments: Boolean
  ): (List[Def], Def => List[String]) = {
    val defs = defSources.flatMap(_._2)

    val defGroupComments = if (printDefGroupComments) {
      defSources.map { case (groupName, defs) =>
        defs.head -> List(s"-- ${groupName} --")
      }.toMap
    } else {
      Map.empty[Def, List[String]]
    }

    (defs, defGroupComments.getOrElse(_, Nil))
  }

  def attrImplName(codec: String, suffix: String): String = {
    codec match {
      case "StringAsIs" => "string" + suffix
      case "IntAsString" => "int" + suffix
      case "DoubleAsString" => "double" + suffix
      case "BooleanAsTrueFalseString" => "boolAsTrueFalse" + suffix
      case "BooleanAsYesNoString" => "boolAsYesNo" + suffix
      case "BooleanAsOnOffString" => "boolAsOnOff" + suffix
      case _ => throw new Exception(s"No attrImplName defined for codec ${codec}")
    }
  }

  def propImplName(codec: String, suffix: String): String = {
    codec match {
      case "StringAsIs" => "string" + suffix
      case "IntAsIs" => "int" + suffix
      case "DoubleAsIs" => "double" + suffix
      case "BooleanAsIs" => "bool" + suffix
      case _ => throw new Exception(s"No propImplName defined for codec ${codec}")
    }
  }

}
