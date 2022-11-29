package com.raquo.domtypes.codegen

sealed abstract class DefType(val codeStr: String) {
  override def toString: String = codeStr
}

object DefType {

  object Val extends DefType("val")

  object FinalVal extends DefType("final val")

  object LazyVal extends DefType("lazy val")

  object Def extends DefType("def")

  object InlineDef extends DefType("@inline def")

  object InlineProtectedDef extends DefType("@inline protected def")

  case class OtherDefType(override val codeStr: String) extends DefType(codeStr)
}
