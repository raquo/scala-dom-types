package com.raquo.domtypes.old.defs.styles.keywords

import com.raquo.domtypes.old.builders.StyleStringValueBuilder

trait BoxSizingStyle[T] extends StyleStringValueBuilder[T] {

  lazy val borderBox: T = buildStringValue("border-box")

  lazy val contentBox: T = buildStringValue("content-box")
}
