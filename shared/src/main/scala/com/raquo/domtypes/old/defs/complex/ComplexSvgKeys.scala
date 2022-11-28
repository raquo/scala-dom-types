package com.raquo.domtypes.old.defs.complex

/** This trait gives you a very flexible way to define SVG keys that
  * consuming libraries often have strong opinions about.
  *
  * If your opinions are too strong to use this trait – don't! You can implement
  * any subset of these keys yourself with whatever names you like.
  */
trait ComplexSvgKeys[ClassNameA] {

  /**
    * Assigns a class name or set of class names to an element. You may assign the same
    * class name or names to any number of elements. If you specify multiple class names,
    * they must be separated by whitespace characters.
    *
    * The class name of an element has two key roles:
    * - As a style sheet selector, for use when an author wants to assign style
    *   information to a set of elements.
    * - For general usage by the browser.
    *   The class can be used to style SVG content using CSS.
    *
    * Value 	<list-of-class-names>
    *
    * MDN
    */
  def className: ClassNameA

  lazy val cls: ClassNameA = className
}
