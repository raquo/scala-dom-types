package com.raquo.domtypes.old.builders

import com.raquo.domtypes.old.defs.styles.keywords.BaseStyle

trait StyleStringValueBuilder[T] extends BaseStyle[T] {

  protected def buildStringValue(value: String): T

  protected def valueAsString(value: T): String
}
