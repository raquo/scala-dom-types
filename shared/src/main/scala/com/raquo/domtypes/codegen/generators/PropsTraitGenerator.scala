package com.raquo.domtypes.codegen.generators

import com.raquo.domtypes.codegen.DefType.InlineProtectedDef
import com.raquo.domtypes.codegen.{DefType, CodeFormatting}
import com.raquo.domtypes.common.PropDef

class PropsTraitGenerator(
  override protected val defs: List[PropDef],
  override protected val defGroupComments: PropDef => List[String],
  override protected val headerLines: List[String],
  override protected val traitCommentLines: List[String],
  override protected val traitName: String,
  override protected val keyImplName: PropDef => String,
  defType: PropDef => DefType,
  keyKind: String,
  baseImplName: String,
  baseImplDef: List[String],
  transformCodecName: String => String,
  override protected val outputImplDefs: Boolean,
  format: CodeFormatting
) extends TraitGenerator[PropDef](format) {

  lazy val codecByImplName: Map[String, String] = {
    distinctImplNames()
      .map(implName => (implName, uniqueValueForImpl(implName, _.codec, clue = "codec")))
      .toMap
  }

  lazy val scalaValueTypeByImplName: Map[String, String] = {
    distinctImplNames()
      .map(implName => (implName, uniqueValueForImpl(implName, _.scalaValueType, clue = "scalaValueType")))
      .toMap
  }

  lazy val domValueTypeByImplName: Map[String, String] = {
    distinctImplNames()
      .map(implName => (implName, uniqueValueForImpl(implName, _.domValueType, clue = "domValueType")))
      .toMap
  }

  override protected def printDef(keyDef: PropDef): Unit = {
    blockCommentLines(commentLinesWithDocs(keyDef.commentLines, keyDef.docUrls))
    line(List[String](
      defType(keyDef).codeStr,
      " ",
      keyDef.scalaName,
      ": ",
      keyKind,
      "[",
      keyDef.scalaValueType,
      ", ",
      keyDef.domValueType,
      "] = ",
      impl(keyDef)
    ).mkString)
  }

  override protected def impl(keyDef: PropDef): String = {
    List[String](
      keyImplName(keyDef),
      "(",
      repr(keyDef.domName),
      ")"
    ).mkString
  }

  override protected def printImplDefs(): Unit = {
    baseImplDef.foreach(line)
    line()
    line()

    distinctImplNames().foreach { implName =>
      line(List[String](
        InlineProtectedDef.codeStr,
        " ",
        implName,
        "(key: String)",
        ": ",
        keyKind,
        "[",
        scalaValueTypeByImplName(implName),
        ", ",
        domValueTypeByImplName(implName),
        "]",
        " = ",
        baseImplName,
        s"(key, ${transformCodecName(codecByImplName(implName))})",
      ).mkString)
      line()
    }
  }

}
