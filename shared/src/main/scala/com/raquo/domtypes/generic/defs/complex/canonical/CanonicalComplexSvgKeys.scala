package com.raquo.domtypes.generic.defs.complex.canonical

import com.raquo.domtypes.generic.builders.SvgAttrBuilder
import com.raquo.domtypes.generic.defs.complex.ComplexSvgKeys

trait CanonicalComplexSvgKeys[A[_]] extends ComplexSvgKeys[A[String]] { this: SvgAttrBuilder[A] =>

  @inline override def className: A[String] = stringSvgAttr("class")
}
