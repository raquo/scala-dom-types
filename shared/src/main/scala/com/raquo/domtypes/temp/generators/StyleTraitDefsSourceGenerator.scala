package com.raquo.domtypes.temp.generators

import com.raquo.domtypes.common.{StyleKeywordDef, StyleTraitDef}

class StyleTraitDefsSourceGenerator(
  objectName: String,
  defs: Array[StyleTraitDef],
  params: ListingParams
) extends SourceGenerator(params.format) {

  override protected def apply(): Unit = {
    line("package com.raquo.domtypes.defs.styles")
    line("")
    line(s"import com.raquo.domtypes.common.{StyleKeywordDef, StyleTraitDef}")
    line("")
    enter(s"object $objectName {", "}") {
      line("")
      enter("val defs: List[StyleTraitDef] = List(", ")") {
        line("")
        defs.foreach { styleTraitDef =>
          printStyleTraitDef(styleTraitDef, withComma = true)
        }
      }
      line("")
    }
  }

  protected def printStyleTraitDef(styleDef: StyleTraitDef, withComma: Boolean): Unit = {
    enter("StyleTraitDef(", ")" + (if (withComma) "," else "")) {
      import styleDef._
      classParamLine("scalaName", scalaName)
      classParamLine("extendsTraits", extendsTraits)
      classParamLine("extendsUnits", extendsUnits)
      classParamLine("keywords", keywords, printStyleKeywordDef)
    }
    line()
  }

  protected def printStyleKeywordDef(styleDef: StyleKeywordDef): Unit = {
    enter("StyleKeywordDef(", "),") {
      import styleDef._
      classParamLine("scalaName", scalaName)
      classParamLine("domName", domName)
      classParamLine("commentLines", commentLines)
      classParamLine("docUrls", docUrls)
    }
    line()
  }
}

