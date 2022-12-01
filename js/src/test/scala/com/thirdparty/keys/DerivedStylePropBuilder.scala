package com.thirdparty.keys

import com.raquo.ew._

import scala.scalajs.js

trait DerivedStylePropBuilder[T[_]] {

  protected def derivedStyle[A](encode: (A => String)): T[A]

  protected def encodeUrlValue(url: String): String = {
    // #TODO[Security] Review this.
    val escaped = url.ew.replace(
      DerivedStylePropBuilder.urlPattern,
      DerivedStylePropBuilder.urlReplacer
    ).str
    s""""$escaped"""" // #Note output is wrapped in double quotes
  }

  protected def encodeCalcValue(exp: String): String = {
    // #TODO[Security] Review this.
    val escaped = exp.ew.replace(
      DerivedStylePropBuilder.calcPattern,
      DerivedStylePropBuilder.calcReplacer
    ).str
    s"$escaped" // #Note output is NOT wrapped in double quotes
  }
}

object DerivedStylePropBuilder {

  private val calcPattern = new js.RegExp("[\"\'\n\r\f\\\\;]", flags = "g")

  private val urlPattern = new js.RegExp("[\"\n\r\f\\\\]", flags = "g")

  private val calcReplacer: js.Function1[String, String] = { _ => " " }

  private val urlReplacer: js.Function1[String, String] = {
    case "\"" => "%22"
    case "\\" => "%5C"
    case _ => " "
  }
}
