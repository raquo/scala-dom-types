package com.raquo.sbt.domtypes

import com.raquo.domtypes.codegen.CanonicalDefGroups
import com.raquo.domtypes.codegen.CanonicalGenerator
import com.raquo.domtypes.codegen.CodeFormatting
import com.raquo.domtypes.codegen.DefType.LazyVal
import com.raquo.domtypes.codegen.SourceRepr
import com.raquo.domtypes.common.AttrDef
import com.raquo.domtypes.common.HtmlTagType
import com.raquo.domtypes.common.PropDef
import com.raquo.domtypes.common.TagDef
import com.raquo.domtypes.defs.styles.StyleTraitDefs

import java.io.File

// This is a rough draft of a wrapper around CanonicalGenerator that provides a more user-friendly API.
// In its current form, it is essentially the Laminator project's /project/DomDefsGenerator.scala file.
// The `typeDefsPackage` is the only required argument for the generator. The Laminar project
// overrides some methods in the CanonicalGenerator as a means to customize generator settings.
// For this proof-of-concept, I've simply made those overrides configuration options. You can imagine
// how this would extend to meet the needs of other client projects (by adding more options).
//
// This is essentially a port of the Laminar project's /project/DomDefsGenerator.scala.
// See: https://github.com/raquo/Laminar/blob/2ca18da3d8f66daf850af820746fef933ba0c2f9/project/DomDefsGenerator.scala
//
// There is no SBT dependency, so the final draft could be added to the core library if desired so that
// it would be available to non-SBT clients as well (such as Mill).
final case class ConfiguredGenerator(
    typeDefsPackage: String,
    settersPackagePath: Option[String] = None,
    scalaJsElementTypeParam: Option[String] = None
) { config =>
  def generateDomTypeDefs(
      managedSourceDir: File
  ): Seq[File] = {
    val packageName = config.typeDefsPackage
    val targetDir = new File(managedSourceDir, typeDefsPackage.replace(".", File.separator))
    object generator
        extends CanonicalGenerator(
          baseOutputDirectoryPath = targetDir.getAbsolutePath,
          basePackagePath = packageName,
          standardTraitCommentLines = Nil,
          format = CodeFormatting()
        ) {
      override def settersPackagePath: String = config.settersPackagePath.getOrElse(super.settersPackagePath)
      override def scalaJsElementTypeParam: String = config.scalaJsElementTypeParam.getOrElse(super.scalaJsElementTypeParam)
      // TODO: more overrides from config
    }
    val defGroups = new CanonicalDefGroups()

    def mkTagsFile(
        traitName: String,
        groups: CanonicalDefGroups => List[(String, List[TagDef])],
        keyImplName: String,
        packagePath: CanonicalGenerator => String
    ): File = {
      val content = generator.generateTagsTrait(
        tagType = HtmlTagType,
        defGroups = groups(defGroups),
        printDefGroupComments = true,
        traitCommentLines = Nil,
        traitModifiers = Nil,
        traitName = traitName,
        keyKind = traitName,
        baseImplDefComments = Nil,
        keyImplName = keyImplName,
        defType = LazyVal
      )
      generator.writeToFile(packagePath = packagePath(generator), fileName = traitName, fileContent = content)
    }

    // made the following helpers in haste to simplify this proof-of-concept. There could be some errors here.
    // TODO(markschaake): Final draft should probably remove the helpers and carefully set each param for each group
    // according to configuration.
    def mkAttrsFile(
        traitName: String,
        groups: CanonicalDefGroups => List[(String, List[AttrDef])],
        keyImplName: String,
        packagePath: CanonicalGenerator => String,
        nameSpaceImpl: String => String,
        transformAttrDomName: String => String = identity
    ): File = {
      val content = generator.generateAttrsTrait(
        defGroups = groups(defGroups),
        printDefGroupComments = true,
        traitCommentLines = Nil,
        traitModifiers = Nil,
        traitName = traitName,
        keyKind = traitName,
        implNameSuffix = traitName,
        baseImplDefComments = Nil,
        baseImplName = keyImplName,
        namespaceImports = Nil,
        namespaceImpl = nameSpaceImpl,
        transformAttrDomName = transformAttrDomName,
        defType = LazyVal
      )
      generator.writeToFile(packagePath = packagePath(generator), fileName = traitName, fileContent = content)
    }

    def mkPropsFile(
        traitName: String,
        groups: CanonicalDefGroups => List[(String, List[PropDef])],
        keyImplName: String,
        packagePath: CanonicalGenerator => String
    ): File = {
      val content = generator.generatePropsTrait(
        defGroups = groups(defGroups),
        printDefGroupComments = true,
        traitCommentLines = Nil,
        traitModifiers = Nil,
        traitName = traitName,
        keyKind = traitName,
        implNameSuffix = traitName,
        baseImplDefComments = Nil,
        baseImplName = keyImplName,
        defType = LazyVal
      )
      generator.writeToFile(packagePath = packagePath(generator), fileName = traitName, fileContent = content)
    }

    val htmlTags = mkTagsFile("HtmlTags", _.htmlTagsDefGroups, "htmlTag", _.tagDefsPackagePath)

    val svgTags = mkTagsFile("SvgTags", _.svgTagsDefGroups, "svgTag", _.tagDefsPackagePath)
    val htmlAttrs = mkAttrsFile("HtmlAttrs", _.htmlAttrDefGroups, "htmlAttr", _.attrDefsPackagePath, identity)
    val svgAttrs = mkAttrsFile("SvgAttrs", _.svgAttrDefGroups, "svgAttr", _.attrDefsPackagePath, SourceRepr(_))
    val ariaAttrs = mkAttrsFile(
      "AriaAttrs",
      _.ariaAttrDefGroups,
      "ariaAttr",
      _.attrDefsPackagePath,
      identity,
      ariaAttrName => if (ariaAttrName.startsWith("aria-")) ariaAttrName.substring(5) else throw new Exception(s"Aria attribute does not start with aria")
    )
    val htmlProps = mkPropsFile("HtmlProps", _.propDefGroups, "htmlProp", _.propDefsPackagePath)
    val globalEventProps = {
      val baseTraitName = "GlobalEventProps"

      val subTraits = List(
        "WindowEventProps" -> defGroups.windowEventPropDefGroups,
        "DocumentEventProps" -> defGroups.documentEventPropDefGroups
      )
      val content = generator.generateEventPropsTrait(
        defSources = defGroups.globalEventPropDefGroups,
        printDefGroupComments = true,
        traitCommentLines = Nil,
        traitModifiers = Nil,
        traitName = baseTraitName,
        traitExtends = Nil,
        traitThisType = None,
        baseImplDefComments = Nil,
        outputBaseImpl = true,
        keyKind = "EventProp",
        keyImplName = "eventProp",
        defType = LazyVal
      )
      val mainTrait = generator.writeToFile(packagePath = generator.eventPropDefsPackagePath, fileName = baseTraitName, fileContent = content)
      val subTraitFiles = subTraits.map { case (traitName, groups) =>
        val fileContent = generator.generateEventPropsTrait(
          defSources = groups,
          printDefGroupComments = true,
          traitCommentLines = List(groups.head._1),
          traitModifiers = Nil,
          traitName = traitName,
          traitExtends = Nil,
          traitThisType = Some(baseTraitName),
          baseImplDefComments = Nil,
          outputBaseImpl = false,
          keyKind = "EventProp",
          keyImplName = "eventProp",
          defType = LazyVal
        )

        generator.writeToFile(
          packagePath = generator.eventPropDefsPackagePath,
          fileName = traitName,
          fileContent = fileContent
        )
      }
      mainTrait :: subTraitFiles
    }
    val styleProps = {
      val traitName = "StyleProps"
      val baseTraitName = "StyleProps"
      val content = generator.generateStylePropsTrait(
        defSources = defGroups.stylePropDefGroups,
        printDefGroupComments = true,
        traitCommentLines = Nil,
        traitModifiers = Nil,
        traitName = traitName,
        keyKind = "StyleProp",
        keyKindAlias = "StyleProp",
        setterType = "StyleSetter",
        setterTypeAlias = "SS",
        derivedKeyKind = "DerivedStyleProp",
        derivedKeyKindAlias = "DSP",
        baseImplDefComments = Nil,
        baseImplName = "styleProp",
        defType = LazyVal,
        lengthUnitsNumType = "Int",
        outputUnitTraits = true
      )
      generator.writeToFile(packagePath = generator.stylePropDefsPackagePath, fileName = baseTraitName, fileContent = content)
    }
    val styleTraits = StyleTraitDefs.defs.map { styleTrait =>
      val fileContent = generator.generateStyleKeywordsTrait(
        defSources = styleTrait.keywordDefGroups,
        printDefGroupComments = styleTrait.keywordDefGroups.length > 1,
        traitCommentLines = Nil,
        traitModifiers = Nil,
        traitName = styleTrait.scalaName.replace("[_]", ""),
        extendsTraits = styleTrait.extendsTraits.map(_.replace("[_]", "")),
        extendsUnitTraits = styleTrait.extendsUnits,
        propKind = "StyleProp",
        keywordType = "StyleSetter",
        derivedKeyKind = "DerivedStyleProp",
        lengthUnitsNumType = "Int",
        defType = LazyVal,
        outputUnitTypes = true,
        allowSuperCallInOverride = false // can't access lazy val from `super`
      )

      generator.writeToFile(
        packagePath = generator.styleTraitsPackagePath(),
        fileName = styleTrait.scalaName.replace("[_]", ""),
        fileContent = fileContent
      )
    }
    Seq(htmlTags, svgTags, htmlAttrs, svgAttrs, ariaAttrs, htmlProps, styleProps) ++ globalEventProps ++ styleTraits
  }
}
