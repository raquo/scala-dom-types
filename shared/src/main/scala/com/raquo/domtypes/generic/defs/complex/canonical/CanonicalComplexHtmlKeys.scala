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

  @inline override def className: RA[String, String] = stringReflectedAttr(attrKey = "class", propKey = "className")

  @inline override def rel: RA[String, String] = stringReflectedAttr("rel")

  @inline override def role: RA[String, String] = stringReflectedAttr("role")

  @inline override def dataAttr(suffix: String): A[String] = stringHtmlAttr(s"data-$suffix")

  @inline override def styleAttr: A[String] = stringHtmlAttr("style")
}
