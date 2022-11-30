package com.raquo.domtypes.codegen.generators

import com.raquo.domtypes.codegen.{CodeFormatting, DefType}
import com.raquo.domtypes.common.StyleKeywordDef

class StyleKeywordsTraitGenerator(
  override protected val defs: List[StyleKeywordDef],
  override protected val defGroupComments: StyleKeywordDef => List[String],
  override protected val headerLines: List[String],
  override protected val traitCommentLines: List[String],
  override protected val traitName: String,
  extendsTraits: List[String],
  override protected val keyImplName: StyleKeywordDef => String,
  keywordImpl: StyleKeywordDef => String,
  keywordKind: String,
  propKind: String,
  defType: StyleKeywordDef => DefType,
  format: CodeFormatting
) extends TraitGenerator[StyleKeywordDef](format) {

  override protected val outputImplDefs: Boolean = false

  override protected def printTraitDef(inside: => Unit): Unit = {
    val withTraits = if (extendsTraits.nonEmpty) {
      s"extends ${extendsTraits.head}" + extendsTraits.tail.map(" with " + _).mkString + " "
    } else ""
    enter(s"trait $traitName $withTraits{ this: ${propKind}[_] => ", "}")(inside)
  }

  override protected def printDef(keyDef: StyleKeywordDef): Unit = {
    blockCommentLines(commentLinesWithDocs(keyDef.commentLines, keyDef.docUrls))
    line(
      if (keyDef.isOverride) "override " else "",
      defType(keyDef).codeStr,
      " ",
      keyDef.scalaName,
      ": ",
      keywordKind,
      "[_]",
      " = ",
      keywordImpl(keyDef)
    )
  }

  override protected def printBeforeAllDefs(): Unit = {
    line()
  }

  override protected def printAfterDef(): Unit = {
    line()
  }

  override protected def printImplDefs(): Unit = {}

}
