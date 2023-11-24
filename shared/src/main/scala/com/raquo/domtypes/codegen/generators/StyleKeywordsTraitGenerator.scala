package com.raquo.domtypes.codegen.generators

import com.raquo.domtypes.codegen.{CodeFormatting, DefType}
import com.raquo.domtypes.common.StyleKeywordDef

class StyleKeywordsTraitGenerator(
  override protected val defs: List[StyleKeywordDef],
  override protected val defGroupComments: StyleKeywordDef => List[String],
  override protected val headerLines: List[String],
  override protected val traitCommentLines: List[String],
  override protected val traitModifiers: List[String],
  override protected val traitName: String,
  extendsFeatureTraits: List[String],
  extendsUnitTraits: List[String],
  override protected val keyImplName: StyleKeywordDef => String,
  override protected val keyImplNameArgName: String,
  keywordImpl: StyleKeywordDef => String,
  keywordType: String,
  derivedKeyKind: String,
  propKind: String,
  defType: StyleKeywordDef => DefType,
  format: CodeFormatting
) extends TraitGenerator[StyleKeywordDef](format) {

  override protected val defAliases: StyleKeywordDef => List[String] = _.scalaAliases

  override protected val outputImplDefs: Boolean = false

  override protected val traitExtends: List[String] = {
    extendsFeatureTraits ++ extendsUnitTraits //.map(_.replace("[_", "[" + derivedKeyKind).replace("_]", derivedKeyKind + "]"))
  }

  override protected val traitThisType: Option[String] = Some(s"${propKind}[_]")

  override protected def printDef(keyDef: StyleKeywordDef, alias: Option[String]): Unit = {
    if (alias.isEmpty) {
      blockCommentLines(commentLinesWithDocs(keyDef.commentLines, keyDef.scalaAliases, keyDef.docUrls))
    }
    line(
      if (keyDef.isOverride) "override " else "",
      defType(keyDef).codeStr,
      " ",
      alias.getOrElse(keyDef.scalaName),
      ": ",
      keywordType,
      " = ",
      if (alias.isEmpty) keywordImpl(keyDef) else keyDef.scalaName
    )
  }

  override protected def printBeforeAllDefs(): Unit = {
    line()
  }

  override protected def printAfterDef(): Unit = {
    line()
  }

  override protected def printBeforeDefGroupComments(keyDef: StyleKeywordDef): Unit = {
    val comments = defGroupComments(keyDef)
    if (comments.nonEmpty) {
      line()
    }
  }

  override protected def printAfterDefGroupComments(keyDef: StyleKeywordDef): Unit = {
    val comments = defGroupComments(keyDef)
    if (comments.nonEmpty) {
      if (!(comments.size == 1 && comments.head.isEmpty)) {
        line()
      }
    }
  }

  override protected def printImplDefs(): Unit = {}

}
