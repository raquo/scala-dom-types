package com.raquo.domtypes.old.defs.styles.keywords

import com.raquo.domtypes.old.builders.StyleStringValueBuilder

trait NormalStyle[T] extends StyleStringValueBuilder[T] {

  lazy val normal: T = buildStringValue("normal")

}
