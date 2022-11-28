package com.raquo.domtypes.old.defs.styles.keywords

import com.raquo.domtypes.old.builders.StyleStringValueBuilder

trait BaseStyle[T] { this: StyleStringValueBuilder[T] =>

  /**
    * The initial CSS keyword applies the initial (or default) value of a
    * property to an element.  --MDN
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/initial
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/initial_value
    */
  lazy val initial: T = buildStringValue("initial")

  /**
    * The inherit CSS keyword causes the element for which it is specified to
    * take the computed value of the property from its parent element.  --MDN
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/inherit
    */
  lazy val inherit: T = buildStringValue("inherit")

  /**
    * The revert CSS keyword reverts the cascaded value of the property from its
    * current value to the value the property would have had if no changes had
    * been made by the current style origin to the current element.  --MDN
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/revert
    * @see https://developer.mozilla.org/en-US/docs/Glossary/Style_origin
    */
  lazy val revert: T = buildStringValue("revert")

  /**
    * The unset CSS keyword resets a property to its inherited value if the
    * property naturally inherits from its parent, and to its initial value if
    * not. In other words, it behaves like the inherit keyword in the first case,
    * when the property is an inherited property, and like the initial keyword in
    * the second case, when the property is a non-inherited property.  --MDN
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/unset
    */
  lazy val unset: T = buildStringValue("unset")
}
