package com.raquo.domtypes.generic.defs.styles.keywords

import com.raquo.domtypes.generic.builders.StyleStringValueBuilder

trait NormalStyle[T] extends StyleStringValueBuilder[T] {

  lazy val normal: T = buildStringValue("normal")

}
