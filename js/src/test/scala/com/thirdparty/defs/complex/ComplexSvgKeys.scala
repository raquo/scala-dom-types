package com.thirdparty.defs.complex

import com.thirdparty.codecs.IterableAsSpaceSeparatedStringCodec
import com.thirdparty.keys.SvgAttr

trait ComplexSvgKeys {

  /**
    * Assigns a class name or set of class names to an element. You may assign the same
    * class name or names to any number of elements. If you specify multiple class names,
    * they must be separated by whitespace characters.
    *
    * The class name of an element has two key roles:
    * - As a style sheet selector, for use when an author wants to assign style
    * information to a set of elements.
    * - For general usage by the browser.
    * The class can be used to style SVG content using CSS.
    */
  val className: SvgAttr[Iterable[String]] = new SvgAttr("class", IterableAsSpaceSeparatedStringCodec, namespace = None)

  lazy val cls: SvgAttr[Iterable[String]] = className
}
