package com.raquo.domtypes.temp.generators

import com.raquo.domtypes.common.TagDef

class TagDefsSourceGenerator(
  objectName: String,
  objectCommentLines: List[String],
  defs: Array[TagDef],
  params: ListingParams
) extends SourceGenerator(params.format) {

  override protected def apply(): Unit = {
    val importTagType = defs(0).tagType // Assuming they're all the same in the file
    line("package com.raquo.domtypes.defs.tags")
    line("")
    line(s"import com.raquo.domtypes.common.{${importTagType.sourceStr}, TagDef}")
    line("")
    blockCommentLines(objectCommentLines)
    enter(s"object $objectName {", "}") {
      line("")
      enter("val defs: List[TagDef] = List(", ")") {
        line("")
        defs.foreach { tagDef =>
          printTagDef(tagDef, withComma = true)
        }
      }
      line("")
    }
  }

  protected def printTagDef(tagDef: TagDef, withComma: Boolean): Unit = {
    enter("TagDef(", ")" + (if (withComma) "," else "")) {
      import tagDef._
      classParamLine("tagType", tagType)
      classParamLine("scalaName", scalaName)
      classParamLine("domName", domName)
      classParamLine("isVoid", isVoid)
      classParamLine("scalaJsElementType", scalaJsElementType)
      classParamLine("javascriptElementType", javascriptElementType)
      classParamLine("implName", implName)
      classParamLine("commentLines", commentLines)
      classParamLine("docUrls", docUrls)
    }
    line()
  }
}

object TagDefsSourceGenerator {

}
