package com.raquo.domtypes.generic.defs.styles.keywords

trait PaddingBoxSizingStyle[T] extends BoxSizingStyle[T] {

  lazy val paddingBox: T = buildStringValue("padding-box")
}
