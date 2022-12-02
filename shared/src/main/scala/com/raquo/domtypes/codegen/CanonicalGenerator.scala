package com.raquo.domtypes.codegen

import com.raquo.domtypes.codegen.DefType.LazyVal
import com.raquo.domtypes.codegen.generators._
import com.raquo.domtypes.common._

import java.io.{File, FileOutputStream, PrintStream}

class CanonicalGenerator(
  val baseOutputDirectoryPath: String,
  val basePackagePath: String,
  val standardTraitCommentLines: List[String],
  val format: CodeFormatting
) {

  def defsPackagePath: String = basePackagePath + ".defs"

  def tagsPackagePath: String = defsPackagePath + ".tags"

  def attrsPackagePath: String = defsPackagePath + ".attrs"

  def propsPackagePath: String = defsPackagePath + ".props"

  def eventPropsPackagePath: String = defsPackagePath + ".eventProps"

  def stylePropsPackagePath: String = defsPackagePath + ".styles"

  def keysPackagePath: String = basePackagePath + ".keys"

  def derivedStylePropPackagePath: String = keysPackagePath

  def settersPackagePath: String = basePackagePath + ".setters"

  def styleTraitsPackageName: String = "traits"

  def styleUnitTraitsPackageName: String = "units"

  def styleTraitsPackagePath(renameTo: Option[String] = None): String = {
    renameTo match {
      case Some(newName) =>
        if (styleTraitsPackageName.isEmpty) {
          throw new Exception("Unable to rename empty styleTraitsPackageName package name")
        }
        stylePropsPackagePath + "." + "{" + styleTraitsPackageName + " => " + newName + "}"
      case None =>
        concatPackageNames(stylePropsPackagePath, styleTraitsPackageName)
    }
  }

  def styleUnitTraitsPackagePath(renameTo: Option[String] = None): String = {
    renameTo match {
      case Some(newName) =>
        if (styleUnitTraitsPackageName.isEmpty) {
          throw new Exception("Unable to rename empty styleUnitTraitsPackageName package name")
        }
        stylePropsPackagePath + "." + "{" + styleUnitTraitsPackageName + " => " + newName + "}"
      case None =>
        concatPackageNames(stylePropsPackagePath, styleUnitTraitsPackageName)
    }
  }

  def styleTraitsPackageAlias = "s"

  def styleUnitTraitsPackageAlias = "u"

  def transformUnitTraitName(
    setterTypeAlias: String,
    derivedKeyKindAlias: String,
    lengthUnitsNumType: String
  )(
    unitTraitName: String
  ): String = {
    val typeParams = unitTraitName match {
      case "Length" => s"$derivedKeyKindAlias, $lengthUnitsNumType"
      case "Color" => s"$setterTypeAlias, $derivedKeyKindAlias[_]"
      case _ => derivedKeyKindAlias
    }
    styleUnitTraitsPackageAlias + "." + unitTraitName + "[" + typeParams + "]"
  }

  def scalaJsDomImport: String = "import org.scalajs.dom"

  def codecsImport: String = s"import ${basePackagePath}.codecs._"

  def baseScalaJsHtmlElementType: String = "dom.html.Element"

  def baseScalaJsSvgElementType: String = "dom.svg.Element"

  def baseScalaJsEventType: String = "dom.Event"

  def keyTypeImport(keyTypes: String*): String = {
    val keyTypesStr = if (keyTypes.size == 1) {
      keyTypes.head
    } else {
      s"{${keyTypes.sorted.mkString(", ")}}"
    }
    s"import ${keysPackagePath}.${keyTypesStr}"
  }

  def setterTypeImport(setterType: String) = s"import ${settersPackagePath}.${setterType}"

  def directoryPath(baseDirectoryPath: String, packagePath: String): String = {
    baseDirectoryPath + "/" + packagePath.replace(".", "/")
  }

  def concatPackageNames(names: String*): String = {
    names.filter(_.nonEmpty).mkString(".")
  }


  // --

  def writeToFile(packagePath: String, fileName: String, fileContent: String): Unit = {
    val filePath = baseOutputDirectoryPath + "/" + packagePath.replace(basePackagePath + ".", "").replace(".", "/") + "/" + fileName.replaceAll(".scala$", "") + ".scala"
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
    traitCommentLines: List[String],
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

    val headerLines = List(
      s"package $tagsPackagePath",
      "",
      keyTypeImport(keyKind),
      scalaJsDomImport,
      "",
    ) ++ standardTraitCommentLines.map("// " + _)

    new TagsTraitGenerator(
      defs = defs,
      defGroupComments = defGroupComments,
      headerLines = headerLines,
      traitCommentLines = traitCommentLines,
      traitName = traitName,
      defType = _ => defType,
      keyKind = _ => keyKind,
      keyImplName = _ => keyImplName,
      baseImplDef = baseImplDef,
      outputImplDefs = true,
      format = format
    ).printTrait().getOutput()
  }

  def generateAttrsTrait(
    defGroups: List[(String, List[AttrDef])],
    printDefGroupComments: Boolean,
    traitCommentLines: List[String],
    traitName: String,
    keyKind: String,
    implNameSuffix: String,
    baseImplName: String,
    namespaceImports: List[String],
    namespaceImpl: String => String,
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

    val headerLines = List(
      s"package $attrsPackagePath",
      "",
      keyTypeImport(keyKind),
      codecsImport,
    ) ++ namespaceImports ++ List("") ++ standardTraitCommentLines.map("// " + _)

    new AttrsTraitGenerator(
      defs = defs,
      defGroupComments = defGroupComments,
      headerLines = headerLines,
      traitCommentLines = traitCommentLines,
      traitName = traitName,
      defType = _ => defType,
      keyKind = keyKind,
      keyImplName = attr => attrImplName(attr.codec, implNameSuffix),
      baseImplName = baseImplName,
      baseImplDef = baseImplDef,
      transformCodecName = _ + "Codec",
      namespaceImpl = namespaceImpl,
      outputImplDefs = true,
      format = format
    ).printTrait().getOutput()
  }

  def generatePropsTrait(
    defGroups: List[(String, List[PropDef])],
    printDefGroupComments: Boolean,
    traitCommentLines: List[String],
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

    val headerLines = List(
      s"package $propsPackagePath",
      "",
      keyTypeImport(keyKind),
      codecsImport,
      ""
    ) ++ standardTraitCommentLines.map("// " + _)

    new PropsTraitGenerator(
      defs = defs,
      defGroupComments = defGroupComments,
      headerLines = headerLines,
      traitCommentLines = traitCommentLines,
      traitName = traitName,
      defType = _ => defType,
      keyKind = keyKind,
      keyImplName = prop => propImplName(prop.codec, implNameSuffix),
      baseImplName = baseImplName,
      baseImplDef = baseImplDef,
      transformCodecName = _ + "Codec",
      outputImplDefs = true,
      format = format
    ).printTrait().getOutput()
  }

  def generateEventPropsTrait(
    defSources: List[(String, List[EventPropDef])],
    printDefGroupComments: Boolean,
    traitCommentLines: List[String],
    traitName: String,
    keyKind: String,
    keyImplName: String,
    defType: DefType
  ): String = {
    val (defs, defGroupComments) = defsAndGroupComments(defSources, printDefGroupComments)

    val baseImplDef = List(
      s"def ${keyImplName}[Ev <: ${baseScalaJsEventType}](key: String): ${keyKind}[Ev] = ${keyKind}(key)"
    )

    val headerLines = List(
      s"package $eventPropsPackagePath",
      "",
      keyTypeImport(keyKind),
      scalaJsDomImport,
      ""
    ) ++ standardTraitCommentLines.map("// " + _)

    new EventPropsTraitGenerator(
      defs = defs,
      defGroupComments = defGroupComments,
      headerLines = headerLines,
      traitCommentLines = traitCommentLines,
      traitName = traitName,
      defType = _ => defType,
      keyKind = keyKind,
      keyImplName = _ => keyImplName,
      baseImplDef = baseImplDef,
      outputImplDefs = true,
      format = format
    ).printTrait().getOutput()
  }

  def generateStylePropsTrait(
    defSources: List[(String, List[StylePropDef])],
    printDefGroupComments: Boolean,
    traitCommentLines: List[String],
    traitName: String,
    keyKind: String,
    keyKindAlias: String,
    setterType: String,
    setterTypeAlias: String,
    derivedKeyKind: String,
    derivedKeyKindAlias: String,
    baseImplName: String,
    defType: DefType,
    lengthUnitsNumType: String,
    outputUnitTraits: Boolean
  ): String = {
    val (defs, defGroupComments) = defsAndGroupComments(defSources, printDefGroupComments)

    val baseImplDef = List(
      s"def ${baseImplName}[V](key: String): ${keyKind}[V] = ${keyKind}(key)"
    )

    val headerLines = List(
      s"package $stylePropsPackagePath",
      "",
      if (outputUnitTraits) {
        keyTypeImport(keyKind, derivedKeyKind)
      } else {
        keyTypeImport(keyKind)
      },
      "import " + styleTraitsPackagePath(Some(styleTraitsPackageAlias))
    ) ++ (
      if (outputUnitTraits) {
        List(
          "import " + styleUnitTraitsPackagePath(Some(styleUnitTraitsPackageAlias)),
          setterTypeImport(setterType.replace("[_]", "")),
        )
      } else {
        Nil
      }
    ) ++ List("") ++ standardTraitCommentLines.map("// " + _)

    val generator = new StylePropsTraitGenerator(
      defs = defs,
      defGroupComments = defGroupComments,
      headerLines = headerLines,
      traitCommentLines = traitCommentLines,
      traitName = traitName,
      defType = _ => defType,
      keyKind = keyKind,
      keyKindAlias = keyKindAlias,
      setterType = setterType,
      setterTypeAlias = setterTypeAlias,
      derivedKeyKind = derivedKeyKind,
      derivedKeyKindAlias = derivedKeyKindAlias,
      keyImplName = _.implName,
      baseImplName = baseImplName,
      baseImplDef = baseImplDef,
      transformTraitName = styleTraitsPackageAlias + "." + _,
      transformUnitTraitName = transformUnitTraitName(setterTypeAlias, derivedKeyKindAlias, lengthUnitsNumType),
      outputUnitTraits = outputUnitTraits,
      outputImplDefs = true,
      format = format
    )

    generator.printTrait().getOutput()
  }

  def generateStyleKeywordsTrait(
    defSources: List[(String, List[StyleKeywordDef])],
    printDefGroupComments: Boolean,
    traitCommentLines: List[String],
    traitName: String,
    extendsTraits: List[String],
    extendsUnitTraits: List[String],
    propKind: String,
    keywordKind: String,
    derivedKeyKind: String,
    lengthUnitsNumType: String,
    defType: DefType,
    outputUnitTypes: Boolean,
    allowSuperCallInOverride: Boolean
  ): String = {
    val (defs, defGroupComments) = defsAndGroupComments(defSources, printDefGroupComments)

    def keyImpl(k: StyleKeywordDef): String = {
      if (k.isOverride && allowSuperCallInOverride) {
        s"super.${k.scalaName}"
      } else {
        val keywordStr = SourceRepr(k.domName)
        s"""this := $keywordStr"""
      }
    }

    val headerLines = List(
      s"package ${styleTraitsPackagePath()}",
      "",
      keyTypeImport(propKind),
      setterTypeImport(keywordKind),
    ) ++ (
      if (outputUnitTypes && extendsUnitTraits.nonEmpty) {
        List(
          "import " + styleUnitTraitsPackagePath(renameTo = Some(styleUnitTraitsPackageAlias)),
          "import " + derivedStylePropPackagePath + "." + derivedKeyKind
        )
      } else Nil
    ) ++ List("") ++ standardTraitCommentLines.map("// " + _)

    val generator = new StyleKeywordsTraitGenerator(
      defs = defs,
      defGroupComments = defGroupComments,
      headerLines = headerLines,
      traitCommentLines = traitCommentLines,
      traitName = traitName,
      extendsTraits = extendsTraits,
      extendsUnitTraits = if (outputUnitTypes) extendsUnitTraits.map(
        transformUnitTraitName(keywordKind + "[_]", derivedKeyKind, lengthUnitsNumType)
      ) else Nil,
      keyImplName = _ => ???, // unused, the implementation is not function-based for keywords
      keywordImpl = keyImpl,
      keywordKind = keywordKind,
      derivedKeyKind = derivedKeyKind,
      propKind = propKind,
      defType = _ => defType,
      format = format
    )

    generator.printTrait().getOutput()

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
