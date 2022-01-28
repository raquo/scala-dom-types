package com.raquo.domtypes.generic.defs.styles.keywords

import com.raquo.domtypes.generic.builders.StyleStringValueBuilder

trait NoneStyle[T] extends StyleStringValueBuilder[T] {

  lazy val none: T = buildStringValue("none")

}
