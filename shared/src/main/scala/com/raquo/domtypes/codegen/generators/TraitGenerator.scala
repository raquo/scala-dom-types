package com.raquo.domtypes.codegen.generators

import com.raquo.domtypes.codegen.CodeFormatting

abstract class TraitGenerator[Def](format: CodeFormatting) extends SourceGenerator(format) {

  protected val defs: List[Def]

  protected val defAliases: Def => List[String]

  protected val defGroupComments: Def => List[String]

  protected val headerLines: List[String]

  protected val traitCommentLines: List[String]

  protected val traitName: String

  protected val keyImplName: Def => String

  protected val outputImplDefs: Boolean


  def printTrait(): this.type = {
    headerLines.foreach(line)
    line()
    blockCommentLines(traitCommentLines)
    printTraitDef {
      printBeforeAllDefs()
      defs.foreach { keyDef =>
        printBeforeDefGroupComments(keyDef)
        printDefGroupComment(keyDef)
        printAfterDefGroupComments(keyDef)
        printBeforeDef()
        printDef(keyDef, alias = None)
        printAfterDef()
        val aliases = defAliases(keyDef)
        if (aliases.nonEmpty) {
          aliases.foreach { alias =>
            printBeforeDef()
            printDef(keyDef, Some(alias))
            printAfterDef()
          }
        }
      }
      printAfterAllDefs()
    }
    this
  }

  protected def printTraitDef(inside: => Unit): Unit = {
    enter(s"trait $traitName {", "}")(inside)
  }

  protected def printBeforeAllDefs(): Unit = {
    if (outputImplDefs) {
      line()
      line()
      printImplDefs()
      line()
      line()
    } else {
      line()
      line()
    }
  }

  protected def printAfterAllDefs(): Unit = {}

  protected def printBeforeDef(): Unit = {}

  protected def printAfterDef(): Unit = {
    line()
    line()
  }

  protected def printBeforeDefGroupComments(keyDef: Def): Unit = {}

  protected def printAfterDefGroupComments(keyDef: Def): Unit = {
    if (defGroupComments(keyDef).nonEmpty) {
      line()
      line()
    }
  }

  protected def printDefGroupComment(keyDef: Def): Unit = {
    defGroupComments(keyDef).foreach { l =>
      line("// " + l)
    }
  }

  protected def printDef(keyDef: Def, alias: Option[String]): Unit

  protected def printImplDefs(): Unit

  protected def commentLinesWithDocs(commentLines: List[String], docUrls: List[String]): List[String] = {
    (commentLines.nonEmpty, docUrls.nonEmpty) match {
      case (true, true) =>
        commentLines ++ List("") ++ docUrls.map("@see " + _)
      case _ =>
        commentLines ++ docUrls.map("@see " + _)
    }
  }

  def distinctImplNames(): List[String] = {
    defs.map(keyImplName).distinct.sorted
  }

  def distinctByImpl[A](implName: String, f: Def => A): List[A] = {
    defs
      .filter(keyImplName(_) == implName)
      .foldLeft(List[A]())((acc, k) => (acc :+ f(k)).distinct)
  }

  def uniqueValueForImpl[A](implName: String, f: Def => A, clue: String): A = {
    val values = distinctByImpl(implName, f)
    if (values.isEmpty) {
      throw new Exception(s"No ${clue} found for implName `${implName}`")
    } else if (values.size > 1) {
      throw new Exception(s"Multiple different ${clue}-s found for the same implName: `${implName}` -> (${values.map(_.toString).mkString(", ")})")
    } else {
      values.head
    }
  }
}
