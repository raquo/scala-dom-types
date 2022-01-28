package com.raquo.domtypes.fixtures.complexKeys

import com.raquo.domtypes.generic.builders.SvgAttrBuilder
import com.raquo.domtypes.generic.defs.complex

trait ExampleComplexSvgKeys[A[_]] extends complex.ComplexSvgKeys[A[String]] { this: SvgAttrBuilder[A] =>

  override lazy val className: A[String] = stringSvgAttr("class")
}
