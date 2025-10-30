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
  override protected val traitModifiers: List[String],
  override protected val traitExtends: List[String],
  override protected val traitThisType: Option[String],
  override protected val keyImplName: PropDef => String,
  override protected val keyImplNameArgName: String,
  keyImplReflectedAttrNameArgName: Option[String],
  defType: PropDef => DefType,
  keyKind: String,
  useDomVTypeParam: Boolean,
  baseImplDefComments: List[String],
  baseImplName: String,
  baseImplDef: List[String],
  transformCodecName: String => String,
  override protected val outputImplDefs: Boolean,
  format: CodeFormatting
) extends TraitGenerator[PropDef](format) {

  override protected val defAliases: PropDef => List[String] = _.scalaAliases

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

  override protected def printDef(keyDef: PropDef, alias: Option[String]): Unit = {
    if (alias.isEmpty) {
      blockCommentLines(commentLinesWithDocs(keyDef.commentLines, keyDef.scalaAliases, keyDef.docUrls))
    }
    line(
      defType(keyDef).codeStr,
      " ",
      alias.getOrElse(keyDef.scalaName),
      ": ",
      keyKind,
      "[",
      keyDef.scalaValueType,
      if (useDomVTypeParam)
        ", " + keyDef.domValueType
      else
        "",
      "] = ",
      if (alias.isEmpty) impl(keyDef) else keyDef.scalaName
    )
  }

  protected def impl(keyDef: PropDef): String = {
    List[String](
      keyImplName(keyDef),
      "(",
      repr(keyDef.domName),
      keyImplReflectedAttrNameArgName
        .flatMap { argName =>
          keyDef.reflectedAttr.map { attr =>
            s", ${argName} = " + repr(attr.domName)
          }
        }.getOrElse(""),
      ")"
    ).mkString
  }

  override protected def printImplDefs(): Unit = {
    blockCommentLines(baseImplDefComments)
    baseImplDef.foreach(line)
    line()
    line()

    distinctImplNames().foreach(printImplDef)
  }

  protected def printImplDef(implName: String): Unit = {
    line(
      InlineProtectedDef.codeStr,
      " ",
      implName,
      "(",
      s"$keyImplNameArgName: String",
      keyImplReflectedAttrNameArgName
        .map { argName =>
          s", $argName: String = null"
        }.getOrElse(""),
      "): ",
      keyKind,
      "[",
      scalaValueTypeByImplName(implName),
      if (useDomVTypeParam)
        ", " + domValueTypeByImplName(implName)
      else
        "",
      "]",
      " = ",
      baseImplName,
      s"(",
      s"$keyImplNameArgName, ",
      keyImplReflectedAttrNameArgName.map { argName => s"Option($argName), "}.getOrElse(""),
      s"${transformCodecName(codecByImplName(implName))})",
    )
    line()
  }

}
