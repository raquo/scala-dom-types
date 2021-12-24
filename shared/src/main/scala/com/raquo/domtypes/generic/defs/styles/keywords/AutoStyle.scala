package com.raquo.domtypes.generic.defs.styles.keywords

import com.raquo.domtypes.generic.builders.StyleStringValueBuilder

trait AutoStyle[T] extends StyleStringValueBuilder[T] {

  lazy val auto: T = buildStringValue("auto")

}
