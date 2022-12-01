package com.raquo.domtypes.old.fixtures.complexKeys

import com.raquo.domtypes.old.builders.SvgAttrBuilder
import com.raquo.domtypes.old.defs.complex.ComplexSvgKeys

trait ExampleComplexSvgKeys[A[_]] extends ComplexSvgKeys[A[String]] { this: SvgAttrBuilder[A] =>

  override lazy val className: A[String] = stringSvgAttr("class")
}
