package com.raquo.domtypes

import com.raquo.domtypes.codegen.DefType.LazyVal
import com.raquo.domtypes.codegen._
import com.raquo.domtypes.common.{HtmlTagType, SvgTagType}
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class GeneratorSpec extends AnyFunSpec with Matchers {

  private val targetDirPath = "js/src/test/scala/com/thirdparty/defs"

  private val generator = new CanonicalGenerator(
    basePackageName = "com.thirdparty",
    standardTraitCommentLines = List(
      "!!! #Note: This code is generated from the data in Scala DOM Types !!!"
    ),
    format = CodeFormatting()
  )

  private val defGroups = new CanonicalDefGroups()

  it("Generate HTML tags") {
    println("=== HTML TAGS ===")

    val traitName = "HtmlTags"

    val fileContent = generator.generateTagsTrait(
      tagType = HtmlTagType,
      defGroups = defGroups.htmlTagsDefGroups,
      printDefGroupComments = true,
      traitName = traitName,
      keyKind = "HtmlTag",
      keyImplName = "htmlTag",
      defType = LazyVal
    )

    generator.writeToFile(
      s"${targetDirPath}/${traitName}.scala",
      fileContent
    )
  }

  it("Generate SVG tags") {
    println("=== SVG TAGS ===")

    val traitName = "SvgTags"

    val fileContent = generator.generateTagsTrait(
      tagType = SvgTagType,
      defGroups = defGroups.svgTagsDefGroups,
      printDefGroupComments = false,
      traitName = traitName,
      keyKind = "SvgTag",
      keyImplName = "svgTag",
      defType = LazyVal
    )

    generator.writeToFile(
      s"${targetDirPath}/${traitName}.scala",
      fileContent
    )
  }

  it("Generate HTML attributes ") {
    println("=== HTML ATTRS ===")

    val traitName = "HtmlAttrs"

    val fileContent = generator.generateAttrsTrait(
      defGroups = defGroups.htmlAttrDefGroups,
      printDefGroupComments = false,
      traitName = traitName,
      keyKind = "HtmlAttr",
      implNameSuffix = "HtmlAttr",
      baseImplName = "htmlAttr",
      defType = LazyVal
    )

    generator.writeToFile(
      s"${targetDirPath}/${traitName}.scala",
      fileContent
    )
  }

  it("Generate SVG attributes ") {
    println("=== SVG ATTRS ===")

    val traitName = "SvgAttrs"

    val fileContent = generator.generateAttrsTrait(
      defGroups = defGroups.svgAttrDefGroups,
      printDefGroupComments = false,
      traitName = traitName,
      keyKind = "SvgAttr",
      implNameSuffix = "SvgAttr",
      baseImplName = "svgAttr",
      defType = LazyVal
    )

    generator.writeToFile(
      s"${targetDirPath}/${traitName}.scala",
      fileContent
    )
  }

  it("Generate Aria attributes ") {
    println("=== ARIA ATTRS ===")

    val traitName = "AriaAttrs"

    val fileContent = generator.generateAttrsTrait(
      defGroups = defGroups.ariaAttrDefGroups,
      printDefGroupComments = false,
      traitName = traitName,
      keyKind = "AriaAttr",
      implNameSuffix = "AriaAttr",
      baseImplName = "ariaAttr",
      defType = LazyVal
    )

    generator.writeToFile(
      s"${targetDirPath}/${traitName}.scala",
      fileContent
    )
  }

  it("Generate HTML Props") {
    println("=== HTML Props ===")

    val traitName = "Props"

    val fileContent = generator.generatePropsTrait(
      defGroups = defGroups.propDefGroups,
      printDefGroupComments = true,
      traitName = traitName,
      keyKind = "Prop",
      implNameSuffix = "Prop",
      baseImplName = "prop",
      defType = LazyVal
    )

    generator.writeToFile(
      s"${targetDirPath}/${traitName}.scala",
      fileContent
    )
  }

  it("Generate Event Props") {
    println("=== Event Props ===")

    val traitName = "EventProps"

    val fileContent = generator.generateEventPropsTrait(
      defSources = defGroups.eventPropDefGroups,
      printDefGroupComments = true,
      traitName = traitName,
      keyKind = "EventProp",
      keyImplName = "eventProp",
      defType = LazyVal
    )

    generator.writeToFile(
      s"${targetDirPath}/${traitName}.scala",
      fileContent
    )
  }

}
