package com.raquo.domtypes

import com.raquo.domtypes.common.{HtmlTagType, SvgTagType}
import com.raquo.domtypes.temp.generators._
import com.raquo.domtypes.temp.parsers._
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

import java.io.{File, FileOutputStream, PrintStream}
import scala.io.Source

class TranspilerSpec extends AnyFunSpec with Matchers {

  // #Note this is not a test – it's a one-time-use generator to translate old SDT definitions to the new format.
  //  This does not generate code for third party libraries, this only generates the future code of SDT.
  //  This will be discarded once we release the new version based on this generated code.


  private val baseSourceDirPath = "shared/src/main/scala/com/raquo/domtypes/old/defs"

  // private val baseTargetDirPath = "shared/src/main/scala/com/raquo/domtypes" // #nc

  private val baseTargetDirPath = "shared/src/main/scala/com/raquo/domtypes/defs"

  private val format = codegen.CodeFormatting()


  it("Generate new style trait defs") {
    println("=======================")
    println("=== STYLE TRAITS ===")
    println("=======================")

    val sourceDir = new File(baseSourceDirPath + "/styles/keywords")

    val targetDir = new File(baseTargetDirPath + "/styles")

    val defs = for {
      inputFile <- sourceDir.listFiles().sorted
    } yield {
      val traitDef = StyleTraitTraitParser(
        inputFileName = inputFile.getName,
        inputFile = Source.fromFile(inputFile)
      )

      println(inputFile.getName)
      println("-----------")

      traitDef
    }

    val outputFile = new File(targetDir.getPath + "/StyleTraits.scala")
    outputFile.getParentFile.mkdirs()

    val outputPrintStream = new PrintStream(new FileOutputStream(outputFile))

    val fileContent = new StyleTraitDefsSourceGenerator(
      objectName = "StyleTraits",
      defs,
      format = format
    ).generate()

    outputPrintStream.print(fileContent)
  }



  it("Generate new style prop defs") {
    println("===================")
    println("=== STYLE PROPS ===")
    println("===================")

    val sourceDir = new File(baseSourceDirPath + "/styles")

    val targetDir = new File(baseTargetDirPath + "/styles")

    val inputFile = new File(sourceDir.getPath + "/Styles.scala")

    val (styleDefs, globalCommentLines) = StylePropTraitParser(
      inputFileName = inputFile.getName,
      inputFile = Source.fromFile(inputFile)
    )

    println(inputFile.getName)
    println("-----------")

    val outputFile = new File(targetDir.getPath + "/StyleProps.scala")
    outputFile.getParentFile.mkdirs()

    val outputPrintStream = new PrintStream(new FileOutputStream(outputFile))

    val fileContent = new StylePropDefsSourceGenerator(
      objectName = "StyleProps",
      objectCommentLines = globalCommentLines,
      styleDefs,
      format = format
    ).generate()

    outputPrintStream.print(fileContent)
  }



  it("Generate new reflected attr defs") {
    println("=======================")
    println("=== REFLECTED ATTRS ===")
    println("=======================")

    val sourceDir = new File(baseSourceDirPath + "/reflectedAttrs")

    val targetDir = new File(baseTargetDirPath + "/reflectedAttrs")

    for {
      inputFile <- sourceDir.listFiles()
    } yield {
      val (attrDefs, globalCommentLines) = ReflectedHtmlAttrTraitParser(
        inputFileName = inputFile.getName,
        inputFile = Source.fromFile(inputFile)
      )

      println(inputFile.getName)
      println("-----------")

      val outputFile = new File(targetDir.getPath + "/" + inputFile.getName)
      outputFile.getParentFile.mkdirs()

      val outputPrintStream = new PrintStream(new FileOutputStream(outputFile))

      val fileContent = new ReflectedHtmlAttrDefsSourceGenerator(
        objectName = inputFile.getName.replace(".scala", ""),
        objectCommentLines = globalCommentLines ++ List(
          "",
          "@see https://developer.mozilla.org/en-US/docs/Glossary/Attribute#reflection_of_an_attribute",
          "@see https://html.spec.whatwg.org/multipage/common-dom-interfaces.html#reflecting-content-attributes-in-idl-attributes"
        ),
        attrDefs,
        format = format
      ).generate()

      outputPrintStream.print(fileContent)
    }
  }



  it("Generate new attr defs") {
    println("=============")
    println("=== ATTRS ===")
    println("=============")

    val sourceDir = new File(baseSourceDirPath + "/attrs")

    val targetDir = new File(baseTargetDirPath + "/attrs")

    for {
      inputFile <- sourceDir.listFiles()
    } yield {
      val (attrDefs, globalCommentLines) = AttrTraitParser(
        inputFileName = inputFile.getName,
        inputFile = Source.fromFile(inputFile)
      )

      println(inputFile.getName)
      println("-----------")

      val outputFile = new File(targetDir.getPath + "/" + inputFile.getName)
      outputFile.getParentFile.mkdirs()

      val outputPrintStream = new PrintStream(new FileOutputStream(outputFile))

      val fileContent = new AttrDefsSourceGenerator(
        objectName = inputFile.getName.replace(".scala", ""),
        objectCommentLines = globalCommentLines,
        attrDefs,
        format = format
      ).generate()

      outputPrintStream.print(fileContent)
    }
  }



  it("Generate new event prop defs") {
    println("===================")
    println("=== EVENT PROPS ===")
    println("===================")

    val propsSourceDir = new File(baseSourceDirPath + "/eventProps")

    val propsTargetDir = new File(baseTargetDirPath + "/eventProps")

    for {
      inputFile <- propsSourceDir.listFiles()
    } yield {
      val (eventPropDefs, globalCommentLines) = EventPropTraitParser(
        inputFileName = inputFile.getName,
        inputFile = Source.fromFile(inputFile)
      )

      println(inputFile.getName)
      println("-----------")

      val outputFile = new File(propsTargetDir.getPath + "/" + inputFile.getName)
      outputFile.getParentFile.mkdirs()

      val outputPrintStream = new PrintStream(new FileOutputStream(outputFile))

      val fileContent = new EventPropDefsSourceGenerator(
        objectName = inputFile.getName.replace(".scala", ""),
        objectCommentLines = globalCommentLines,
        eventPropDefs,
        format = format
      ).generate()

      outputPrintStream.print(fileContent)
    }
  }



  it("Generate new tag defs") {
    println("============")
    println("=== TAGS ===")
    println("============")

    val tagsSourceDir = new File(baseSourceDirPath + "/tags")

    val tagsTargetDir = new File(baseTargetDirPath + "/tags")

    for {
      tagsFile <- tagsSourceDir.listFiles()
    } yield {
      val tagType = if (tagsFile.getName.startsWith("Svg")) SvgTagType else HtmlTagType
      val (tagDefs, globalCommentLines) = TagTraitParser(
        inputFileName = tagsFile.getName,
        // inputFile = Source.fromResource("tags/DocumentTags.scala")
        // inputFile = Source.fromFile("shared/src/main/scala/com/raquo/domtypes/generic/defs/tags/DocumentTags.scala"),
        inputFile = Source.fromFile(tagsFile),
        tagType = tagType
      )

      println(tagsFile.getName)
      println("-----------")

      val outputFile = new File(tagsTargetDir.getPath + "/" + tagsFile.getName)
      outputFile.getParentFile.mkdirs()

      val outputPrintStream = new PrintStream(new FileOutputStream(outputFile))

      val fileContent = new TagDefsSourceGenerator(
        objectName = tagsFile.getName.replace(".scala", ""),
        objectCommentLines = globalCommentLines,
        tagDefs,
        format = format
      ).generate()

      outputPrintStream.print(fileContent)
    }
  }
}
