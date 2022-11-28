package com.raquo.domtypes.old.defs.props

import com.raquo.domtypes.old.builders.PropBuilder
import com.raquo.domtypes.old.codecs.BooleanAsIsCodec
import com.raquo.domtypes.old.defs.reflectedAttrs.ReflectedHtmlAttrs

/** @tparam P Prop[ScalaValue, RawDomValue] - representation of DOM Property such as "selected" */
trait Props[P[_, _]] { this: PropBuilder[P] =>

  /**
    * In addition to the checked and unchecked states, there is a third state
    * a checkbox can be in: indeterminate. This is a state in which it's
    * impossible to say whether the item is toggled on or off.
    *
    * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes
    */
  lazy val indeterminate: P[Boolean, Boolean] = prop("indeterminate", BooleanAsIsCodec)

  /**
    * When the value of the type attribute is "radio" or "checkbox", this property
    * determines whether it is checked or not.
    *
    * See also [[ReflectedHtmlAttrs.defaultChecked]]
    */
  lazy val checked: P[Boolean, Boolean] = prop("checked", BooleanAsIsCodec)

  /**
    * Indicates whether an <option> element is _currently_ selected. This is different from `selected` _attribute_,
    * which contains the _initial_ selected status of the element.
    * More info: https://stackoverflow.com/a/6004028/2601788 (`selected` behaves similar to `value`)
    *
    * See also [[ReflectedHtmlAttrs.defaultSelected]]
    */
  lazy val selected: P[Boolean, Boolean] = prop("selected", BooleanAsIsCodec)

  /**
    * Current value of the element. This is different from `value` _attribute_,
    * which contains the _initial_ value of the element.
    * More info: https://stackoverflow.com/a/6004028/2601788
    *
    * See also [[ReflectedHtmlAttrs.defaultValue]]
    */
  lazy val value: P[String, String] = stringProp("value")
}
