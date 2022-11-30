package com.raquo.domtypes.codegen.generators

import com.raquo.domtypes.codegen.{DefType, CodeFormatting}
import com.raquo.domtypes.common.EventPropDef

class EventPropsTraitGenerator(
  override protected val defs: List[EventPropDef],
  override protected val defGroupComments: EventPropDef => List[String],
  override protected val headerLines: List[String],
  override protected val traitCommentLines: List[String],
  override protected val traitName: String,
  override protected val keyImplName: EventPropDef => String,
  defType: EventPropDef => DefType,
  keyKind: String,
  baseImplDef: List[String],
  override protected val outputImplDefs: Boolean,
  format: CodeFormatting
) extends TraitGenerator[EventPropDef](format) {

  override protected def printDef(keyDef: EventPropDef): Unit = {
    blockCommentLines(commentLinesWithDocs(keyDef.commentLines, keyDef.docUrls))
    line(
      defType(keyDef).codeStr,
      " ",
      keyDef.scalaName,
      ": ",
      keyKind,
      "[",
      keyDef.scalaJsEventType,
      "] = ",
      impl(keyDef)
    )
  }

  protected def impl(keyDef: EventPropDef): String = {
    List[String](
      keyImplName(keyDef),
      "(",
      repr(keyDef.domName),
      ")"
    ).mkString
  }

  override protected def printImplDefs(): Unit = {
    baseImplDef.foreach(line)
  }

}
