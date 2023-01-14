package com.raquo.domtypes.codegen.generators

import com.raquo.domtypes.codegen.{DefType, CodeFormatting}
import com.raquo.domtypes.common.EventPropDef

class EventPropsTraitGenerator(
  override protected val defs: List[EventPropDef],
  override protected val defGroupComments: EventPropDef => List[String],
  override protected val headerLines: List[String],
  override protected val traitCommentLines: List[String],
  override protected val traitModifiers: List[String],

  override protected val traitName: String,
  override protected val traitExtends: List[String],
  override protected val traitThisType: Option[String],
  override protected val keyImplName: EventPropDef => String,
  defType: EventPropDef => DefType,
  keyKind: String,
  baseImplDefComments: List[String],
  baseImplDef: List[String],
  override protected val outputImplDefs: Boolean,
  format: CodeFormatting
) extends TraitGenerator[EventPropDef](format) {

  override protected val defAliases: EventPropDef => List[String] = _.scalaAliases

  override protected def printDef(keyDef: EventPropDef, alias: Option[String]): Unit = {
    if (alias.isEmpty) {
      blockCommentLines(commentLinesWithDocs(keyDef.commentLines, keyDef.docUrls))
    }
    line(
      defType(keyDef).codeStr,
      " ",
      alias.getOrElse(keyDef.scalaName),
      ": ",
      keyKind,
      "[",
      keyDef.scalaJsEventType,
      "] = ",
      if (alias.isEmpty) impl(keyDef) else keyDef.scalaName
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
    blockCommentLines(baseImplDefComments)
    baseImplDef.foreach(line)
  }

}
