package com.raquo.domtypes.temp.generators

import com.raquo.domtypes.common.StylePropDef

class StylePropDefsSourceGenerator(
  objectName: String,
  objectCommentLines: List[String],
  defs: Array[StylePropDef],
  params: ListingParams
) extends SourceGenerator(params.format) {

  override protected def apply(): Unit = {
    line("package com.raquo.domtypes.defs.styles")
    line("")
    line(s"import com.raquo.domtypes.common.StylePropDef")
    line("")
    blockCommentLines(objectCommentLines)
    enter(s"object $objectName {", "}") {
      line("")
      enter("val defs: List[StylePropDef] = List(", ")") {
        line("")
        defs.foreach { styleDef =>
          printStyleDef(styleDef, withComma = true)
        }
      }
      line("")
    }
  }

  protected def printStyleDef(styleDef: StylePropDef, withComma: Boolean): Unit = {
    enter("StylePropDef(", ")" + (if (withComma) "," else "")) {
      import styleDef._
      classParamLine("scalaName", scalaName)
      classParamLine("domName", domName)
      classParamLine("valueType", valueType)
      classParamLine("valueTraits", valueTraits)
      classParamLine("implName", implName)
      classParamLine("commentLines", commentLines)
      classParamLine("docUrls", docUrls)
    }
    line()
  }
}

