package com.raquo.domtypes.old.defs.styles.units

import com.raquo.domtypes.old.builders.DerivedStylePropBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/url() */
trait UrlUnits[T[_]] extends DerivedStylePropBuilder[T] {

  /** Provide a URL to wrap into the CSS `url()` function. */
  lazy val url: T[String] = derivedStyle { s =>
    s"""url(${encodeUrlValue(s)})"""
  }
}
