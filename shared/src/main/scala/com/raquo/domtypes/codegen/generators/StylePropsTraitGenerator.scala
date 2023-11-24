package com.raquo.domtypes.codegen.generators

import com.raquo.domtypes.codegen.DefType.ProtectedDef
import com.raquo.domtypes.codegen.{CodeFormatting, DefType}
import com.raquo.domtypes.common.StylePropDef

class StylePropsTraitGenerator(
  override protected val defs: List[StylePropDef],
  override protected val defGroupComments: StylePropDef => List[String],
  override protected val headerLines: List[String],
  override protected val traitCommentLines: List[String],
  override protected val traitModifiers: List[String],
  override protected val traitName: String,
  override protected val traitExtends: List[String],
  override protected val traitThisType: Option[String],
  override protected val keyImplName: StylePropDef => String,
  override protected val keyImplNameArgName: String,
  defType: StylePropDef => DefType,
  keyKind: String,
  keyKindAlias: String,
  setterType: String,
  setterTypeAlias: String,
  derivedKeyKind: String,
  derivedKeyKindAlias: String,
  baseImplName: String,
  baseImplDefComments: List[String],
  baseImplDef: List[String],
  transformTraitName: String => String,
  transformUnitTraitName: String => String,
  override protected val outputImplDefs: Boolean,
  outputUnitTraits: Boolean,
  format: CodeFormatting
) extends TraitGenerator[StylePropDef](format) {

  lazy val valueTraitsByImplName: Map[String, List[String]] = {
    distinctImplNames()
      .map(implName => (implName, uniqueValueForImpl(implName, _.valueTraits, clue = "valueTraits")))
      .toMap
  }

  lazy val valueUnitTraitsByImplName: Map[String, List[String]] = {
    distinctImplNames()
      .map(implName => (implName, uniqueValueForImpl(implName, _.valueUnits, clue = "valueUnits")))
      .toMap
  }

  override protected val defAliases: StylePropDef => List[String] = _.scalaAliases

  def hasSpecialTraits(implName: String): Boolean = {
    valueTraitsByImplName(implName).nonEmpty || valueUnitTraitsByImplName(implName).nonEmpty
  }

  def implNameIsShared(implName: String): Boolean = {
    defs.count(_.implName == implName) > 1
  }

  def implDefName(implName: String): String = {
    if (implName.contains("[_]")) {
      implName.replace("[_]", "[V]")
    } else {
      implName
    }
    // val valueTypes = distinctValueTypesByImplName(implName)
    // if (valueTypes.size == 1) {
    //   implName.replace("[_]", "")
    // } else {
    //   implName.replace("[_]", "[V]")
    // }
  }

  // def propTypeByImplName(implName: String): String = {
  //   val valueTypes = distinctValueTypesByImplName(implName)
  //   if (valueTypes.size == 1) {
  //     val valueType = valueTypes.head
  //     if (hasSpecialTraits(implName)) {
  //       s"$keyKind[$valueType]"
  //     } else {
  //       implName.capitalize
  //     }
  //   } else {
  //     if (hasSpecialTraits(implName)) {
  //       s"$keyKind[V]"
  //     } else {
  //       implName.capitalize.replace("[_]", "[V]")
  //     }
  //   }
  // }

  lazy val distinctValueTypesByImplName: Map[String, List[String]] = {
    distinctImplNames()
      .filterNot(_.contains("[_]")) // #Note: defined only for non-generic impls
      .map(implName => (implName, distinctByImpl(implName, _.valueType)))
      .toMap
  }

  override protected def printBeforeAllDefs(): Unit = {
    val shouldAliasKeyKind = keyKindAlias != keyKind
    val shouldAliasDerivedKeyKind = (derivedKeyKindAlias != derivedKeyKind) && outputUnitTraits
    val setterKind = setterType.replace("[_]", "")
    val shouldAliasSetterType = (setterTypeAlias != setterKind) && !setterTypeAlias.startsWith(setterKind + "[") && outputUnitTraits

    // Option.when is not supported by Scala 2.12
    def when[A](cond: Boolean)(a: => A): Option[A] = if (cond) Some(a) else None

    val typeAliases = List(
      when(shouldAliasKeyKind)(s"protected type ${keyKindAlias}[V] = $keyKind[V]"),
      when(shouldAliasDerivedKeyKind)(s"protected type ${derivedKeyKindAlias}[V] = $derivedKeyKind[V]"),
      when(shouldAliasSetterType)(s"protected type $setterTypeAlias = $setterType")
    ).flatten

    if (typeAliases.nonEmpty) {
      line()
      typeAliases.foreach { l =>
        line()
        line(l)
      }
    }
    super.printBeforeAllDefs()
  }

  override protected def printDef(keyDef: StylePropDef, alias: Option[String]): Unit = {
    if (alias.isEmpty) {
      blockCommentLines(commentLinesWithDocs(keyDef.commentLines, keyDef.scalaAliases, keyDef.docUrls))
    }
    line(
      defType(keyDef).codeStr,
      " ",
      alias.getOrElse(keyDef.scalaName),
      ": ",
      mainKeyType(keyDef.valueType),
      traitTypeMixins(keyDef.valueTraits, typeParam = None),
      unitTraitTypeMixins(keyDef.valueUnits, typeParam = None),
      // keyTypeForImplName(keyDef.valueTraits).replace("[_]", s"[${keyDef.valueType}]"),
      " = ",
      if (alias.isEmpty) impl(keyDef) else keyDef.scalaName
    )
  }

  protected def impl(keyDef: StylePropDef): String = {
    List[String](
      keyImplName(keyDef).replace("[_]", ""),
      "(",
      repr(keyDef.domName),
      ")"
    ).mkString
  }

  // def styleTypeName(implName: String): String = implName.capitalize

  // def printStyleTypes(): Unit = {
  //   distinctImplNames().filter(hasSpecialTraits).foreach { implName =>
  //     line(
  //       "type ",
  //       styleTypeName(implName),
  //       " = ",
  //       keyKind,
  //       "[",
  //       valueTypeByImplName(implName),
  //       "]",
  //       " with ",
  //       valueTraitsByImplName(implName).map(_ + "Style").mkString(" with ")
  //     )
  //     line()
  //   }
  // }

  def mainKeyType(typeParam: String): String = {
    keyKindAlias + s"[$typeParam]"
  }

  def traitTypeMixins(valueTraits: List[String], typeParam: Option[String]): String = {
    val typeParamReplacement = typeParam.map("[" + _ + "]").getOrElse("")
    valueTraits.map(" with " + transformTraitName(_)).map(_.replace("[_]", typeParamReplacement)).mkString
  }

  def unitTraitTypeMixins(valueUnitTraits: List[String], typeParam: Option[String]): String = {
    if (outputUnitTraits) {
      val typeParamReplacement = typeParam.map("[" + _ + "]").getOrElse("")
      valueUnitTraits.map(" with " + transformUnitTraitName(_)).map(_.replace("[_]", typeParamReplacement)).mkString
    } else {
      ""
    }
  }

  // def keyTypeForImplName(valueTraits: List[String]): String = {
  //   List[String](
  //     keyKind,
  //     "[_]",
  //     valueTraits.map(" with " + transformTraitName(_)).mkString,
  //   ).mkString
  // }

  override protected def printImplDefs(): Unit = {

    val allImplNames = distinctImplNames()

    val basicImpls = allImplNames.filterNot(hasSpecialTraits)

    val sharedImpls = allImplNames.filter(hasSpecialTraits).filter(implNameIsShared)

    val customImpls = allImplNames.filter(hasSpecialTraits).filterNot(implNameIsShared)

    // printStyleTypes()
    // line()
    // line()
    blockCommentLines(baseImplDefComments)
    baseImplDef.foreach(line)
    line()
    line()
    line("// -- Basic types --")
    line()
    basicImpls.foreach { implName =>
      printImplDef(implName)
      line()
    }
    line()
    line("// -- Shared types --")
    line()
    sharedImpls.foreach { implName =>
      printImplDef(implName)
      line()
    }
    line()
    line("// -- Unique types --")
    line()
    customImpls.foreach { implName =>
      printImplDef(implName)
      line()
    }
  }

  def printImplDef(implName: String): Unit = {
    val valueTraits = valueTraitsByImplName(implName)
    val valueUnitTraits = valueUnitTraitsByImplName(implName)
    val typeParam = if (implName.contains("[_]")) "V" else distinctValueTypesByImplName(implName).head


    enter(List[String](
      ProtectedDef.codeStr,
      " ",
      implDefName(implName),
      "(key: String)",
      ": ",
      // keyTypeForImplName(valueTraits).replace("[_]", s"[$typeParam]"),
      mainKeyType(typeParam),
      traitTypeMixins(valueTraits, typeParam = None),
      unitTraitTypeMixins(valueUnitTraits, typeParam = None),
      " = "
    ).mkString) {
      line(implDefImpl(implName, valueTraits, valueUnitTraits, keyKindTypeParam = Some(typeParam), traitsTypeParam = None))
    }
  }

  def implDefImplName(implName: String, keyKindTypeParam: Option[String]): String = {
    s"new ${keyKind}${keyKindTypeParam.map("[" + _ + "]").getOrElse("")}"
  }

  def implDefImpl(
    implName: String,
    valueTraits: List[String],
    valueUnitTraits: List[String],
    keyKindTypeParam: Option[String],
    traitsTypeParam: Option[String]
  ): String = {
    List(
      s"${implDefImplName(implName, keyKindTypeParam)}",
      "(key)",
      traitTypeMixins(valueTraits, traitsTypeParam),
      unitTraitTypeMixins(valueUnitTraits, traitsTypeParam),
    ).mkString
  }

}
