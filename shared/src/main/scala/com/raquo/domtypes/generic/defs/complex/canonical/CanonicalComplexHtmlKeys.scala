package com.raquo.domtypes.generic.defs.complex.canonical

import com.raquo.domtypes.generic.builders.{HtmlAttrBuilder, PropBuilder, ReflectedHtmlAttrBuilder}
import com.raquo.domtypes.generic.defs.complex.ComplexHtmlKeys

trait CanonicalComplexHtmlKeys[RA[_, _], A[_], P[_, _]] extends ComplexHtmlKeys[
  RA[String, String],
  RA[String, String],
  RA[String, String],
  A[String],
  A[String],
  P[String, String]
] { this: ReflectedHtmlAttrBuilder[RA] with HtmlAttrBuilder[A] with PropBuilder[P] =>

  override lazy val className: RA[String, String] = stringReflectedAttr(attrKey = "class", propKey = "className")

  override lazy val cls: RA[String, String] = className

  override lazy val rel: RA[String, String] = stringReflectedAttr("rel")

  override def dataAttr(suffix: String): A[String] = stringHtmlAttr(s"data-$suffix")

  override lazy val styleAttr: A[String] = stringHtmlAttr("style")

  override lazy val textContent: P[String, String] = stringProp("textContent")

}
