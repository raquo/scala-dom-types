package com.raquo.domtypes

import com.raquo.domtypes.codegen.DefType.LazyVal
import com.raquo.domtypes.codegen._
import com.raquo.domtypes.common.{HtmlTagType, SvgTagType, MathMlTagType}
import com.raquo.domtypes.defs.styles.StyleTraitDefs
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class GeneratorSpec extends AnyFunSpec with Matchers {

  // This file is an example of how you can use Scala DOM Types to generate
  // typed traits for your library. This is implemented as a test here, but
  // in your own project you can make your build depend on Scala DOM types
  // at compile time only, and call the generators at compile time.
  //
  // If you're using SBT, you'll need to put this code under the `project`
  // directory, and require Scala DOM Types as a dependency in
  // `project/build.sbt`.
  //
  // The generated output of this GeneratorSpec is used in CompileSpec
  //
  // See SDT docs for details, and the Laminar repo for a more fleshed out
  // usage example.

  object generator extends CanonicalGenerator(
    baseOutputDirectoryPath = "js/src/test/scala/com/thirdparty",
    basePackagePath = "com.thirdparty",
    standardTraitCommentLines = List(
      "#NOTE: GENERATED CODE",
      " - This file is generated at compile time from the data in Scala DOM Types",
      " - See `GeneratorSpec.scala` for code generation params",
      " - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.",
    ),
    format = CodeFormatting()
  ) {

    // you can override lots of internals in this scope
  }

  private val defGroups = new CanonicalDefGroups()

  it("Generate HTML tags") {
    println("=== HTML TAGS ===")

    val traitName = "HtmlTags"

    val fileContent = generator.generateTagsTrait(
      tagType = HtmlTagType,
      defGroups = defGroups.htmlTagsDefGroups,
      printDefGroupComments = true,
      traitCommentLines = Nil,
      traitModifiers = Nil,
      traitName = traitName,
      keyKind = "HtmlTag",
      baseImplDefComments = Nil,
      keyImplName = "htmlTag",
      defType = LazyVal
    )

    generator.writeToFile(
      packagePath = generator.tagDefsPackagePath,
      fileName = traitName,
      fileContent = fileContent
    )
  }

  it("Generate SVG tags") {
    println("=== SVG TAGS ===")

    val traitName = "SvgTags"

    val fileContent = generator.generateTagsTrait(
      tagType = SvgTagType,
      defGroups = defGroups.svgTagsDefGroups,
      printDefGroupComments = false,
      traitCommentLines = Nil,
      traitModifiers = Nil,
      traitName = traitName,
      keyKind = "SvgTag",
      baseImplDefComments = Nil,
      keyImplName = "svgTag",
      defType = LazyVal
    )

    generator.writeToFile(
      packagePath = generator.tagDefsPackagePath,
      fileName = traitName,
      fileContent = fileContent
    )
  }

  it("Generate MathMl tags") {
    println("=== MATHML TAGS ===")

    val traitName = "MathMlTags"

    val fileContent = generator.generateTagsTrait(
      tagType = MathMlTagType,
      defGroups = defGroups.mathMlTagsDefGroups,
      printDefGroupComments = false,
      traitCommentLines = Nil,
      traitModifiers = Nil,
      traitName = traitName,
      keyKind = "MathMlTag",
      baseImplDefComments = Nil,
      keyImplName = "mathMlTag",
      defType = LazyVal
    )

    generator.writeToFile(
      packagePath = generator.tagDefsPackagePath,
      fileName = traitName,
      fileContent = fileContent
    )
  }

  it("Generate HTML attributes ") {
    println("=== HTML ATTRS ===")

    val traitName = "HtmlAttrs"

    val fileContent = generator.generateAttrsTrait(
      defGroups = defGroups.htmlAttrDefGroups,
      printDefGroupComments = false,
      traitCommentLines = Nil,
      traitModifiers = Nil,
      traitName = traitName,
      keyKind = "HtmlAttr",
      implNameSuffix = "HtmlAttr",
      baseImplDefComments = Nil,
      baseImplName = "htmlAttr",
      namespaceImports = Nil,
      namespaceImpl = _ => ???,
      transformAttrDomName = identity,
      defType = LazyVal
    )

    generator.writeToFile(
      packagePath = generator.attrDefsPackagePath,
      fileName = traitName,
      fileContent = fileContent
    )
  }

  it("Generate SVG attributes ") {
    println("=== SVG ATTRS ===")

    val traitName = "SvgAttrs"

    val fileContent = generator.generateAttrsTrait(
      defGroups = defGroups.svgAttrDefGroups,
      printDefGroupComments = false,
      traitModifiers = Nil,
      traitName = traitName,
      traitCommentLines = Nil,
      keyKind = "SvgAttr",
      implNameSuffix = "SvgAttr",
      baseImplDefComments = Nil,
      baseImplName = "svgAttr",
      namespaceImports = Nil,
      namespaceImpl = SourceRepr(_),
      transformAttrDomName = identity,
      defType = LazyVal
    )

    generator.writeToFile(
      packagePath = generator.attrDefsPackagePath,
      fileName = traitName,
      fileContent = fileContent
    )
  }

  it("Generate Aria attributes ") {
    println("=== ARIA ATTRS ===")

    val traitName = "AriaAttrs"

    val fileContent = generator.generateAttrsTrait(
      defGroups = defGroups.ariaAttrDefGroups,
      printDefGroupComments = false,
      traitModifiers = Nil,
      traitName = traitName,
      traitCommentLines = Nil,
      keyKind = "AriaAttr",
      implNameSuffix = "AriaAttr",
      baseImplDefComments = Nil,
      baseImplName = "ariaAttr",
      namespaceImports = Nil,
      namespaceImpl = _ => ???,
      transformAttrDomName = identity,
      defType = LazyVal
    )

    generator.writeToFile(
      packagePath = generator.attrDefsPackagePath,
      fileName = traitName,
      fileContent = fileContent
    )
  }

  it("Generate HTML Props") {
    println("=== HTML Props ===")

    val traitName = "Props"

    val fileContent = generator.generatePropsTrait(
      defGroups = defGroups.propDefGroups,
      printDefGroupComments = true,
      traitCommentLines = Nil,
      traitModifiers = Nil,
      traitName = traitName,
      keyKind = "Prop",
      implNameSuffix = "Prop",
      baseImplDefComments = Nil,
      baseImplName = "prop",
      defType = LazyVal
    )

    generator.writeToFile(
      packagePath = generator.propDefsPackagePath,
      fileName = traitName,
      fileContent = fileContent
    )
  }

  it("Generate Global Event Props") {
    println("=== Global Event Props ===")

    val traitName = "GlobalEventProps"

    val fileContent = generator.generateEventPropsTrait(
      defSources = defGroups.globalEventPropDefGroups,
      printDefGroupComments = true,
      traitCommentLines = List("Events that are available on both Window, Document, and HTML elements"),
      traitModifiers = Nil,
      traitName = traitName,
      traitExtends = Nil,
      traitThisType = None,
      baseImplDefComments = Nil,
      outputBaseImpl = true,
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

  it("Generate Document Event Props") {
    println("=== Document Event Props ===")

    val traitName = "DocumentEventProps"

    val fileContent = generator.generateEventPropsTrait(
      defSources = defGroups.documentEventPropDefGroups,
      printDefGroupComments = false,
      traitCommentLines = List("Document-only events"),
      traitModifiers = Nil,
      traitName = traitName,
      traitExtends = Nil,
      traitThisType = Some("GlobalEventProps"),
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

  it("Generate Window Event Props") {
    println("=== Window Event Props ===")

    val traitName = "WindowEventProps"

    val fileContent = generator.generateEventPropsTrait(
      defSources = defGroups.windowEventPropDefGroups,
      printDefGroupComments = false,
      traitCommentLines = List("Window-only events"),
      traitModifiers = Nil,
      traitName = traitName,
      traitExtends = Nil,
      traitThisType = Some("GlobalEventProps"),
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

  it("Generate Style Props") {
    println("=== Style Props ===")

    val traitName = "StyleProps"

    val fileContent = generator.generateStylePropsTrait(
      defSources = defGroups.stylePropDefGroups,
      printDefGroupComments = true,
      traitCommentLines = Nil,
      traitModifiers = Nil,
      traitName = traitName,
      keyKind = "StyleProp",
      keyKindAlias = "StyleProp",
      setterType = "StyleSetter[_]",
      setterTypeAlias = "SS",
      derivedKeyKind = "DerivedStyleProp",
      derivedKeyKindAlias = "DSP",
      baseImplDefComments = Nil,
      baseImplName = "styleProp",
      defType = LazyVal,
      lengthUnitsNumType = "Int",
      outputUnitTraits = true
    )

    generator.writeToFile(
      packagePath = generator.stylePropDefsPackagePath,
      fileName = traitName,
      fileContent = fileContent
    )
  }

  it("Generate Style Keywords") {
    println("=== Style Keywords ===")

    StyleTraitDefs.defs.foreach { styleTrait =>
      val fileContent = generator.generateStyleKeywordsTrait(
        defSources = styleTrait.keywordDefGroups,
        printDefGroupComments = styleTrait.keywordDefGroups.length > 1,
        traitCommentLines = Nil,
        traitModifiers = Nil,
        traitName = styleTrait.scalaName,
        extendsTraits = styleTrait.extendsTraits.map(_.replace("[_]", "")),
        extendsUnitTraits = styleTrait.extendsUnits,
        propKind = "StyleProp",
        keywordType = "StyleSetter[_]",
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
  }

}
