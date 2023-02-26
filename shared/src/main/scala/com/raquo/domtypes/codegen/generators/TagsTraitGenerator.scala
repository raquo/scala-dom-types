package com.raquo.domtypes.codegen.generators

import com.raquo.domtypes.codegen.{DefType, CodeFormatting}
import com.raquo.domtypes.common.TagDef

class TagsTraitGenerator(
  override protected val defs: List[TagDef],
  override protected val defGroupComments: TagDef => List[String],
  override protected val headerLines: List[String],
  override protected val traitCommentLines: List[String],
  override protected val traitModifiers: List[String],
  override protected val traitName: String,
  override protected val traitExtends: List[String],
  override protected val traitThisType: Option[String],
  override protected val keyImplName: TagDef => String,
  override protected val keyImplNameArgName: String,
  defType: TagDef => DefType,
  keyType: TagDef => String,
  override protected val outputImplDefs: Boolean,
  baseImplDefComments: List[String],
  baseImplDef: List[String],
  format: CodeFormatting
) extends TraitGenerator[TagDef](format) {

  override protected val defAliases: TagDef => List[String] = _.scalaAliases

  override protected def printDef(keyDef: TagDef, alias: Option[String]): Unit = {
    if (alias.isEmpty) {
      blockCommentLines(commentLinesWithDocs(keyDef.commentLines, keyDef.docUrls))
    }
    line(
      defType(keyDef).codeStr,
      " ",
      alias.getOrElse(keyDef.scalaName),
      ": ",
      keyType(keyDef),
      " = ",
      if (alias.isEmpty) impl(keyDef) else keyDef.scalaName
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
    blockCommentLines(baseImplDefComments)
    baseImplDef.foreach(line)
  }
}
