package com.thirdparty.defs.styles.units

import com.thirdparty.keys.DerivedStylePropBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/url */
trait Url[T[_]] extends DerivedStylePropBuilder[T] {

  /** Provide a URL to wrap into the CSS `url()` function. */
  lazy val url: T[String] = derivedStyle { s =>
    s"""url(${encodeUrlValue(s)})"""
  }
}
