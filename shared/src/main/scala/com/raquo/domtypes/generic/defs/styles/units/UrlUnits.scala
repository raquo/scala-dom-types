package com.raquo.domtypes.generic.defs.styles.units

import com.raquo.domtypes.generic.builders.DerivedStylePropBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/url() */
trait UrlUnits[T[_]] extends DerivedStylePropBuilder[T] {

  // #TODO[Performance] We could use JavaScript native string replace, don't need to bring in java.lang machinery for that
  //  Although it's kinda inevitable in any real user code anyway, so not much of a problem in practice.

  /** Provide a URL to wrap into the CSS `url()` function. */
  lazy val url: T[String] = derivedStyle { s =>
    s"""url(${encodeUrlValue(s)})"""
  }
}
