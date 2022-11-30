package com.raquo.domtypes.codegen.generators

import com.raquo.domtypes.codegen.{DefType, CodeFormatting}
import com.raquo.domtypes.common.TagDef

class TagsTraitGenerator(
  override protected val defs: List[TagDef],
  override protected val defGroupComments: TagDef => List[String],
  override protected val headerLines: List[String],
  override protected val traitCommentLines: List[String],
  override protected val traitName: String,
  override protected val keyImplName: TagDef => String,
  defType: TagDef => DefType,
  keyKind: TagDef => String,
  override protected val outputImplDefs: Boolean,
  baseImplDef: List[String],
  format: CodeFormatting
) extends TraitGenerator[TagDef](format) {

  override protected def printDef(keyDef: TagDef): Unit = {
    blockCommentLines(commentLinesWithDocs(keyDef.commentLines, keyDef.docUrls))
    line(
      defType(keyDef).codeStr,
      " ",
      keyDef.scalaName,
      ": ",
      keyKind(keyDef),
      "[",
      keyDef.scalaJsElementType,
      "] = ",
      impl(keyDef)
    )
  }

  def impl(keyDef: TagDef): String = {
    List[String](
      keyImplName(keyDef),
      "(",
      repr(keyDef.domName),
      if (keyDef.isVoid) ", void = true" else "",
      ")"
    ).mkString
  }

  override protected def printImplDefs(): Unit = {
    baseImplDef.foreach(line)
  }
}
