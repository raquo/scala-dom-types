package com.raquo.domtypes.old.fixtures.complexKeys

import com.raquo.domtypes.old.builders.{HtmlAttrBuilder, PropBuilder, ReflectedHtmlAttrBuilder}
import com.raquo.domtypes.old.defs.complex.ComplexHtmlKeys

trait ExampleComplexHtmlKeys[RA[_, _], A[_], P[_, _]] extends ComplexHtmlKeys[
  RA[String, String],
  RA[String, String],
  RA[String, String],
  A[String],
  A[String],
] { this: ReflectedHtmlAttrBuilder[RA] with HtmlAttrBuilder[A] with PropBuilder[P] =>

  override lazy val className: RA[String, String] = stringReflectedAttr(attrKey = "class", propKey = "className")

  override lazy val rel: RA[String, String] = stringReflectedAttr("rel", "rel")

  override lazy val role: RA[String, String] = stringReflectedAttr("role", "role")

  override def dataAttr(suffix: String): A[String] = stringHtmlAttr(s"data-$suffix")

  override lazy val styleAttr: A[String] = stringHtmlAttr("style")
}