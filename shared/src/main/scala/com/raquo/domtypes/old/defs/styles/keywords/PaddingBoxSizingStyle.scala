package com.raquo.domtypes.old.defs.styles.keywords

trait PaddingBoxSizingStyle[T] extends BoxSizingStyle[T] {

  lazy val paddingBox: T = buildStringValue("padding-box")
}
