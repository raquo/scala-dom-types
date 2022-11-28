package com.raquo.domtypes.generators

import com.raquo.domtypes.common.ReflectedHtmlAttrDef

class ReflectedHtmlAttrDefsSourceGenerator(
  objectName: String,
  objectCommentLines: List[String],
  defs: Array[ReflectedHtmlAttrDef],
  params: ListingParams
) extends SourceGenerator(params.format) {

  override protected def apply(): Unit = {
    line("package com.raquo.domtypes.defs.reflectedAttrs")
    line("")
    line(s"import com.raquo.domtypes.common.ReflectedHtmlAttrDef")
    line("")
    blockCommentLines(objectCommentLines)
    enter(s"object $objectName {", "}") {
      line("")
      enter("val defs: List[ReflectedHtmlAttrDef] = List(", ")") {
        line("")
        defs.foreach { attrDef =>
          printAttrDef(attrDef, withComma = true)
        }
      }
      line("")
    }
  }

  protected def printAttrDef(attrDef: ReflectedHtmlAttrDef, withComma: Boolean): Unit = {
    enter("ReflectedHtmlAttrDef(", ")" + (if (withComma) "," else "")) {
      import attrDef._
      classParamLine("scalaName", scalaName)
      classParamLine("domAttrName", domAttrName)
      classParamLine("domPropName", domPropName)
      classParamLine("scalaValueType", scalaValueType)
      classParamLine("domPropValueType", domPropValueType)
      classParamLine("attrCodec", attrCodec)
      classParamLine("propCodec", propCodec)
      classParamLine("commentLines", commentLines)
      classParamLine("docUrls", docUrls)
    }
    line()
  }
}

