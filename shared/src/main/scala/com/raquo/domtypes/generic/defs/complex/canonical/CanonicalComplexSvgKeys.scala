package com.raquo.domtypes.generic.defs.complex.canonical

import com.raquo.domtypes.generic.builders.SvgAttrBuilder
import com.raquo.domtypes.generic.defs.complex.ComplexSvgKeys

trait CanonicalComplexSvgKeys[A[_]] extends ComplexSvgKeys[A[String], A[String]] { this: SvgAttrBuilder[A] =>

  override lazy val className: A[String] = stringSvgAttr("class")

  override lazy val cls: A[String] = className
}
