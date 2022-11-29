package com.raquo.domtypes.temp.generators

import com.raquo.domtypes.codegen.CodeFormatting
import com.raquo.domtypes.common.AttrDef

class AttrDefsSourceGenerator(
  objectName: String,
  objectCommentLines: List[String],
  defs: Array[AttrDef],
  format: CodeFormatting
) extends TempSourceGenerator(format) {

  override protected def apply(): Unit = {
    line("package com.raquo.domtypes.defs.attrs")
    line("")
    line(s"import com.raquo.domtypes.common.{AttrDef, SvgTagType, HtmlTagType}")
    line("")
    blockCommentLines(objectCommentLines)
    enter(s"object $objectName {", "}") {
      line("")
      enter("val defs: List[AttrDef] = List(", ")") {
        line("")
        defs.foreach { attrDef =>
          printAttrDef(attrDef, withComma = true)
        }
      }
      line("")
    }
  }

  protected def printAttrDef(attrDef: AttrDef, withComma: Boolean): Unit = {
    enter("AttrDef(", ")" + (if (withComma) "," else "")) {
      import attrDef._
      classParamLine("tagType", tagType)
      classParamLine("scalaName", scalaName)
      classParamLine("domName", domName)
      classParamLine("namespace", namespace)
      classParamLine("scalaValueType", scalaValueType)
      classParamLine("codec", codec)
      classParamLine("commentLines", commentLines)
      classParamLine("docUrls", docUrls)
    }
    line()
  }
}

