package com.raquo.domtypes.codegen.generators

import com.raquo.domtypes.codegen.DefType.InlineProtectedDef
import com.raquo.domtypes.codegen.{DefType, CodeFormatting}
import com.raquo.domtypes.common.AttrDef

class AttrsTraitGenerator(
  override protected val defs: List[AttrDef],
  override protected val defGroupComments: AttrDef => List[String],
  override protected val headerLines: List[String],
  override protected val traitCommentLines: List[String],
  override protected val traitName: String,
  override protected val keyImplName: AttrDef => String,
  defType: AttrDef => DefType,
  keyKind: String,
  baseImplName: String,
  baseImplDef: List[String],
  transformCodecName: String => String,
  namespaceImpl: String => String,
  override protected val outputImplDefs: Boolean,
  format: CodeFormatting
) extends TraitGenerator[AttrDef](format) {

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

  override protected val defAliases: AttrDef => List[String] = _.scalaAliases

  override protected def printDef(keyDef: AttrDef, alias: Option[String]): Unit = {
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
      keyDef.scalaValueType,
      "] = ",
      if (alias.isEmpty) impl(keyDef) else keyDef.scalaName
    )
  }

  protected def impl(keyDef: AttrDef): String = {
    List[String](
      keyImplName(keyDef),
      "(",
      repr(keyDef.domName),
      keyDef.namespace.map(", namespace = " + namespaceImpl(_)).getOrElse(""),
      ")"
    ).mkString
  }

  override protected def printImplDefs(): Unit = {
    baseImplDef.foreach(line)
    line()
    line()
    val anyKeyHasDefinedNamespace = defs.exists(_.namespace.isDefined)
    distinctImplNames().foreach { implName =>
      val namespaceIsDefinedOptions: List[Boolean] = distinctByImpl(implName, _.namespace.isDefined)
      namespaceIsDefinedOptions.foreach { isNamespaceDefined =>
        val maybeNamespaceParam = if (anyKeyHasDefinedNamespace) {
          s", ${if (isNamespaceDefined) "Some(namespace)" else "namespace = None"}"
        } else {
          ""
        }
        line(
          InlineProtectedDef.codeStr,
          " ",
          implName,
          if (isNamespaceDefined) {
            "(key: String, namespace: String)"
          } else {
            "(key: String)"
          },
          ": ",
          keyKind,
          "[",
          scalaValueTypeByImplName(implName),
          "]",
          " = ",
          baseImplName,
          s"(",
          "key",
          ", ",
          transformCodecName(codecByImplName(implName)),
          maybeNamespaceParam,
          ")"
        )
        line()
      }
    }
  }

}
