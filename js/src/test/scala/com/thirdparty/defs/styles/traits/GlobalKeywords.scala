package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait GlobalKeywords { this: StyleProp[_] =>

  /**
    * The initial CSS keyword applies the initial (or default) value of a
    * property to an element.
    */
  lazy val initial: StyleSetter[_] = this := "initial"

  /**
    * The inherit CSS keyword causes the element for which it is specified to
    * take the computed value of the property from its parent element.
    */
  lazy val inherit: StyleSetter[_] = this := "inherit"

  /**
    * The revert CSS keyword reverts the cascaded value of the property from its
    * current value to the value the property would have had if no changes had
    * been made by the current style origin to the current element.
    */
  lazy val revert: StyleSetter[_] = this := "revert"

  /**
    * The unset CSS keyword resets a property to its inherited value if the
    * property naturally inherits from its parent, and to its initial value if
    * not. In other words, it behaves like the inherit keyword in the first case,
    * when the property is an inherited property, and like the initial keyword in
    * the second case, when the property is a non-inherited property.
    */
  lazy val unset: StyleSetter[_] = this := "unset"

}
