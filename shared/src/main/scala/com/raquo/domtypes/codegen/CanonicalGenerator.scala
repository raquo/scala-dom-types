package com.raquo.domtypes.codegen

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

  def tagDefsPackagePath: String = defsPackagePath + ".tags"

  def attrDefsPackagePath: String = defsPackagePath + ".attrs"

  def propDefsPackagePath: String = defsPackagePath + ".props"

  def eventPropDefsPackagePath: String = defsPackagePath + ".eventProps"

  def stylePropDefsPackagePath: String = defsPackagePath + ".styles"

  def keysPackagePath: String = basePackagePath + ".keys"

  def tagKeysPackagePath: String = basePackagePath + ".tags"

  def derivedStylePropKeyPackagePath: String = keysPackagePath

  def settersPackagePath: String = basePackagePath + ".setters"

  def styleTraitsPackageName: String = "traits"

  def styleUnitTraitsPackageName: String = "units"

  def styleTraitsPackagePath(renameTo: Option[String] = None): String = {
    renameTo match {
      case Some(newName) =>
        if (styleTraitsPackageName.isEmpty) {
          throw new Exception("Unable to rename empty styleTraitsPackageName package name")
        }
        stylePropDefsPackagePath + "." + "{" + styleTraitsPackageName + " => " + newName + "}"
      case None =>
        concatPackageNames(stylePropDefsPackagePath, styleTraitsPackageName)
    }
  }

  def styleUnitTraitsPackagePath(renameTo: Option[String] = None): String = {
    renameTo match {
      case Some(newName) =>
        if (styleUnitTraitsPackageName.isEmpty) {
          throw new Exception("Unable to rename empty styleUnitTraitsPackageName package name")
        }
        stylePropDefsPackagePath + "." + "{" + styleUnitTraitsPackageName + " => " + newName + "}"
      case None =>
        concatPackageNames(stylePropDefsPackagePath, styleUnitTraitsPackageName)
    }
  }

  def keyKindConstructor(keyKind: String): String = {
    "new " + keyKind
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

  def baseScalaJsMathMlElementType: String = "dom.MathMLElement"

  def baseScalaJsSvgElementType: String = "dom.svg.Element"

  def scalaJsElementTypeParam: String = "El"

  def baseScalaJsEventType: String = "dom.Event"

  def keyImplNameArgName: String = "name"

  def tagKeyTypeImport(keyTypes: String*): String = {
    val keyTypesStr = if (keyTypes.size == 1) {
      keyTypes.head
    } else {
      s"{${keyTypes.sorted.mkString(", ")}}"
    }
    s"import ${tagKeysPackagePath}.${keyTypesStr}"
  }

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

  def writeToFile(packagePath: String, fileName: String, fileContent: String): File = {
    val filePath = baseOutputDirectoryPath + "/" + packagePath.replace(basePackagePath + ".", "").replace(".", "/") + "/" + fileName.replaceAll(".scala$", "") + ".scala"
    val outputFile = new File(filePath)
    outputFile.getParentFile.mkdirs()

    val fileOutputStream = new FileOutputStream(outputFile)
    val outputPrintStream = new PrintStream(fileOutputStream)

    outputPrintStream.print(fileContent)
    outputPrintStream.flush()

    // Flush written file contents to disk https://stackoverflow.com/a/4072895/2601788
    fileOutputStream.flush()
    fileOutputStream.getFD.sync()

    outputPrintStream.close()

    outputFile
  }

  // --

  def generateTagsTrait(
    tagType: TagType,
    defGroups: List[(String, List[TagDef])],
    printDefGroupComments: Boolean,
    traitCommentLines: List[String],
    traitModifiers: List[String],
    traitName: String,
    keyKind: String,
    baseImplDefComments: List[String],
    keyImplName: String,
    defType: DefType
  ): String = {
    val (defs, defGroupComments) = defsAndGroupComments(defGroups, printDefGroupComments)

    val baseImplDef = if(tagType == HtmlTagType) {
      List(
        s"def ${keyImplName}[$scalaJsElementTypeParam <: $baseScalaJsHtmlElementType]($keyImplNameArgName: String, void: Boolean = false): ${keyKind}[$scalaJsElementTypeParam] = ${keyKindConstructor(keyKind)}($keyImplNameArgName, void)"
      )
    } else  if (tagType == SvgTagType) {
      List(
        s"def ${keyImplName}[$scalaJsElementTypeParam <: $baseScalaJsSvgElementType]($keyImplNameArgName: String): ${keyKind}[$scalaJsElementTypeParam] = ${keyKindConstructor(keyKind)}($keyImplNameArgName)",
      )
    } else if (tagType == MathMlTagType) {
      List(
        s"def ${keyImplName}[$scalaJsElementTypeParam <: $baseScalaJsMathMlElementType]($keyImplNameArgName: String): ${keyKind}[$scalaJsElementTypeParam] = ${keyKindConstructor(keyKind)}($keyImplNameArgName)",
      )
    } else {
      ???
    }

    val headerLines = List(
      s"package $tagDefsPackagePath",
      "",
      tagKeyTypeImport(keyKind),
      scalaJsDomImport,
      "",
    ) ++ standardTraitCommentLines.map("// " + _)

    new TagsTraitGenerator(
      defs = defs,
      defGroupComments = defGroupComments,
      headerLines = headerLines,
      traitCommentLines = traitCommentLines,
      traitModifiers = traitModifiers,
      traitName = traitName,
      traitExtends = Nil,
      traitThisType = None,
      defType = _ => defType,
      keyType = tag => keyKind + "[" + tag.scalaJsElementType + "]",
      keyImplName = _ => keyImplName,
      keyImplNameArgName = keyImplNameArgName,
      baseImplDefComments = baseImplDefComments,
      baseImplDef = baseImplDef,
      outputImplDefs = true,
      format = format
    ).printTrait().getOutput()
  }

  def generateAttrsTrait(
    defGroups: List[(String, List[AttrDef])],
    printDefGroupComments: Boolean,
    traitCommentLines: List[String],
    traitModifiers: List[String],
    traitName: String,
    keyKind: String,
    implNameSuffix: String,
    baseImplDefComments: List[String],
    baseImplName: String,
    namespaceImports: List[String],
    namespaceImpl: String => String,
    transformAttrDomName: String => String,
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
        s"def ${baseImplName}[V]($keyImplNameArgName: String, codec: Codec[V, String], namespace: Option[String]): ${keyKind}[V] = ${keyKindConstructor(keyKind)}($keyImplNameArgName, codec, namespace)"
      )
    } else {
      List(
        s"def ${baseImplName}[V]($keyImplNameArgName: String, codec: Codec[V, String]): ${keyKind}[V] = ${keyKindConstructor(keyKind)}($keyImplNameArgName, codec)"
      )
    }

    val headerLines = List(
      s"package $attrDefsPackagePath",
      "",
      keyTypeImport(keyKind),
      codecsImport,
    ) ++ namespaceImports ++ List("") ++ standardTraitCommentLines.map("// " + _)

    new AttrsTraitGenerator(
      defs = defs.map(d => d.copy(domName = transformAttrDomName(d.domName))),
      defGroupComments = defGroupComments,
      headerLines = headerLines,
      traitCommentLines = traitCommentLines,
      traitModifiers = traitModifiers,
      traitName = traitName,
      traitExtends = Nil,
      traitThisType = None,
      defType = _ => defType,
      keyKind = keyKind,
      keyImplName = attr => attrImplName(attr.codec, implNameSuffix),
      keyImplNameArgName = keyImplNameArgName,
      baseImplDefComments = baseImplDefComments,
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
    traitModifiers: List[String],
    traitName: String,
    keyKind: String,
    implNameSuffix: String,
    baseImplDefComments: List[String],
    baseImplName: String,
    defType: DefType
  ): String = {
    val (defs, defGroupComments) = defsAndGroupComments(defGroups, printDefGroupComments)

    val baseImplDef = List(
      s"def ${baseImplName}[V, DomV]($keyImplNameArgName: String, codec: Codec[V, DomV]): ${keyKind}[V, DomV] = ${keyKindConstructor(keyKind)}($keyImplNameArgName, codec)"
    )

    val headerLines = List(
      s"package $propDefsPackagePath",
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
      traitModifiers = traitModifiers,
      traitName = traitName,
      traitExtends = Nil,
      traitThisType = None,
      defType = _ => defType,
      keyKind = keyKind,
      keyImplName = prop => propImplName(prop.codec, implNameSuffix),
      keyImplNameArgName = keyImplNameArgName,
      baseImplDefComments = baseImplDefComments,
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
    traitModifiers: List[String],
    traitName: String,
    traitExtends: List[String],
    traitThisType: Option[String],
    baseImplDefComments: List[String],
    outputBaseImpl: Boolean,
    keyKind: String,
    keyImplName: String,
    defType: DefType
  ): String = {
    val (defs, defGroupComments) = defsAndGroupComments(defSources, printDefGroupComments)

    val baseImplDef = if (outputBaseImpl) List(
      s"def ${keyImplName}[Ev <: ${baseScalaJsEventType}]($keyImplNameArgName: String): ${keyKind}[Ev] = ${keyKindConstructor(keyKind)}($keyImplNameArgName)"
    ) else {
      Nil
    }

    val headerLines = List(
      s"package $eventPropDefsPackagePath",
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
      traitModifiers = traitModifiers,
      traitName = traitName,
      traitExtends = traitExtends,
      traitThisType = traitThisType,
      defType = _ => defType,
      keyKind = keyKind,
      keyImplName = _ => keyImplName,
      keyImplNameArgName = keyImplNameArgName,
      baseImplDefComments = baseImplDefComments,
      baseImplDef = baseImplDef,
      outputImplDefs = true,
      format = format
    ).printTrait().getOutput()
  }

  def generateStylePropsTrait(
    defSources: List[(String, List[StylePropDef])],
    printDefGroupComments: Boolean,
    traitCommentLines: List[String],
    traitModifiers: List[String],
    traitName: String,
    keyKind: String,
    keyKindAlias: String,
    setterType: String,
    setterTypeAlias: String,
    derivedKeyKind: String,
    derivedKeyKindAlias: String,
    baseImplDefComments: List[String],
    baseImplName: String,
    defType: DefType,
    lengthUnitsNumType: String,
    outputUnitTraits: Boolean
  ): String = {
    val (defs, defGroupComments) = defsAndGroupComments(defSources, printDefGroupComments)

    val baseImplDef = List(
      s"def ${baseImplName}[V]($keyImplNameArgName: String): ${keyKind}[V] = ${keyKindConstructor(keyKind)}($keyImplNameArgName)"
    )

    val headerLines = List(
      s"package $stylePropDefsPackagePath",
      ""
    ) ++ {
      if (outputUnitTraits) {
        List(
          keyTypeImport(keyKind),
          "import " + derivedStylePropKeyPackagePath + "." + derivedKeyKind
        )
      } else {
        List(
          keyTypeImport(keyKind)
        )
      }
    } ++ List(
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
      traitModifiers = traitModifiers,
      traitName = traitName,
      traitExtends = Nil,
      traitThisType = None,
      defType = _ => defType,
      keyKind = keyKind,
      keyKindAlias = keyKindAlias,
      setterType = setterType,
      setterTypeAlias = setterTypeAlias,
      derivedKeyKind = derivedKeyKind,
      derivedKeyKindAlias = derivedKeyKindAlias,
      keyImplName = _.implName,
      keyImplNameArgName = keyImplNameArgName,
      baseImplName = baseImplName,
      baseImplDefComments = baseImplDefComments,
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
    traitModifiers: List[String],
    traitName: String,
    extendsTraits: List[String],
    extendsUnitTraits: List[String],
    propKind: String,
    keywordType: String,
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

    val keywordKind = keywordType.replace("[_]", "")

    val headerLines = List(
      s"package ${styleTraitsPackagePath()}",
      "",
      keyTypeImport(propKind),
      setterTypeImport(keywordKind),
    ) ++ (
      if (outputUnitTypes && extendsUnitTraits.nonEmpty) {
        List(
          "import " + styleUnitTraitsPackagePath(renameTo = Some(styleUnitTraitsPackageAlias)),
          "import " + derivedStylePropKeyPackagePath + "." + derivedKeyKind
        )
      } else Nil
    ) ++ List("") ++ standardTraitCommentLines.map("// " + _)

    val generator = new StyleKeywordsTraitGenerator(
      defs = defs,
      defGroupComments = defGroupComments,
      headerLines = headerLines,
      traitCommentLines = traitCommentLines,
      traitModifiers = traitModifiers,
      traitName = traitName.replace("[_]", ""),
      extendsFeatureTraits = extendsTraits,
      extendsUnitTraits = if (outputUnitTypes) extendsUnitTraits.map(
        transformUnitTraitName(keywordType, derivedKeyKind, lengthUnitsNumType)
      ) else Nil,
      keyImplName = _ => ???, // unused, the implementation is not function-based for keywords
      keyImplNameArgName = keyImplNameArgName, // unused, the implementation is not function-based for keywords
      keywordImpl = keyImpl,
      keywordType = keywordType,
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
        defs.head -> List(
          if (groupName.isEmpty) "" else s"-- ${groupName} --"
        )
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
      case "BooleanAsAttrPresence" => "boolAsPresence" + suffix
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
