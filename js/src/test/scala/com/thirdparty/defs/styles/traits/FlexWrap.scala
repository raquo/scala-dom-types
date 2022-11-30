package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait FlexWrap { this: StyleProp[_] => 

  /**
    * The flex items are laid out in a single line which may cause the
    * flex container to overflow. The cross-start is either equivalent
    * to start or before depending flex-direction value.
    */
  lazy val nowrap: StyleSetter[_] = this := "nowrap"

  /**
    * The flex items break into multiple lines. The cross-start is
    * either equivalent to start or before depending flex-direction
    * value and the cross-end is the opposite of the specified
    * cross-start.
    */
  lazy val wrap: StyleSetter[_] = this := "wrap"

  /**
    * Behaves the same as wrap but cross-start and cross-end are
    * permuted.
    */
  lazy val wrapReverse: StyleSetter[_] = this := "wrap-reverse"

}
