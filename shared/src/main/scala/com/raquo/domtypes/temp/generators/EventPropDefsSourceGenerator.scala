package com.raquo.domtypes.temp.generators

import com.raquo.domtypes.common.EventPropDef

class EventPropDefsSourceGenerator(
  objectName: String,
  objectCommentLines: List[String],
  defs: Array[EventPropDef],
  params: ListingParams
) extends SourceGenerator(params.format) {

  override protected def apply(): Unit = {
    line("package com.raquo.domtypes.defs.eventProps")
    line("")
    line(s"import com.raquo.domtypes.common.EventPropDef")
    line("")
    blockCommentLines(objectCommentLines)
    enter(s"object $objectName {", "}") {
      line("")
      enter("val defs: List[EventPropDef] = List(", ")") {
        line("")
        defs.foreach { propDef =>
          printPropDef(propDef, withComma = true)
        }
      }
      line("")
    }
  }

  protected def printPropDef(propDef: EventPropDef, withComma: Boolean): Unit = {
    enter("EventPropDef(", ")" + (if (withComma) "," else "")) {
      import propDef._
      classParamLine("scalaName", scalaName)
      classParamLine("domName", domName)
      classParamLine("scalaJsEventType", scalaJsEventType)
      classParamLine("javascriptEventType", javascriptEventType)
      classParamLine("commentLines", commentLines)
      classParamLine("docUrls", docUrls)
    }
    line()
  }
}

