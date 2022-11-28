package com.raquo.domtypes.old.defs.styles.keywords

import com.raquo.domtypes.old.builders.StyleStringValueBuilder

trait NoneStyle[T] extends StyleStringValueBuilder[T] {

  lazy val none: T = buildStringValue("none")

}
