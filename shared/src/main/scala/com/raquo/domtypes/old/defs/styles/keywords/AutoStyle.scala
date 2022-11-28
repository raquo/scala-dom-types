package com.raquo.domtypes.old.defs.styles.keywords

import com.raquo.domtypes.old.builders.StyleStringValueBuilder

trait AutoStyle[T] extends StyleStringValueBuilder[T] {

  lazy val auto: T = buildStringValue("auto")

}
