package com.raquo.domtypes.generic.defs.styles.units

import com.raquo.domtypes.generic.builders.DerivedStylePropBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/url() */
trait UrlUnits[T[_]] extends DerivedStylePropBuilder[T] {

  // #TODO[Performance] We could use JavaScript native string replace, don't need to bring in java.lang machinery for that
  //  Although it's kinda inevitable in any real app

  // #Warning[Integrity] This url method implementation should provide enough
  //  escaping to set a CSS property value with inline styles, but it's not
  //  safe to inject this into a CSS stylesheet. For that, you would need to
  //  also escape newlines and whitespace characters such as \n \r \f.

  /** Provide a URL to wrap into the CSS `url()` function. */
  lazy val url: T[String] = derivedStyle { s =>
    val cssEncodedUrl = s.replace("\"", "%22").replace("\\", "%5C")
    s"""url("$cssEncodedUrl")"""
  }
}
