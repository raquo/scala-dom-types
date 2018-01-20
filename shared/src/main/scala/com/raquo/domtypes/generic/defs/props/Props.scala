package com.raquo.domtypes.generic.defs.props

import com.raquo.domtypes.generic.builders.PropBuilder
import com.raquo.domtypes.generic.codecs.BooleanAsIsCodec

/** @tparam P DOM Property, canonically [[com.raquo.domtypes.generic.keys.Prop]] */
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
    * See also [[com.raquo.domtypes.generic.defs.reflectedAttrs.ReflectedAttrs.defaultChecked]]
    */
  lazy val checked: P[Boolean, Boolean] = prop("checked", BooleanAsIsCodec)

  /** Determines the textual content of an element and all its descendants.
    * Setting this property replaces all of the node's children with a text node containing
    * the provided string.
    *
    * MDN
    */
  lazy val textContent: P[String, String] = stringProp("textContent")

  /**
    * Indicates whether an <option> element is _currently_ selected. This is different from `selected` _attribute_,
    * which contains the _initial_ selected status of the element.
    * More info: https://stackoverflow.com/a/6004028/2601788 (`selected` behaves similar to `value`)
    *
    * See also [[com.raquo.domtypes.generic.defs.reflectedAttrs.ReflectedAttrs.defaultSelected]]
    */
  lazy val selected: P[Boolean, Boolean] = prop("selected", BooleanAsIsCodec)

  /**
    * Current value of the element. This is different from `value` _attribute_,
    * which contains the _initial_ value of the element.
    * More info: https://stackoverflow.com/a/6004028/2601788
    *
    * See also [[com.raquo.domtypes.generic.defs.reflectedAttrs.ReflectedAttrs.defaultValue]]
    */
  lazy val value: P[String, String] = stringProp("value")

  /**
    * The Element.innerHTML property sets or gets the HTML syntax describing the element's descendants.
    *
    * MDN
    */
  lazy val innerHTML: P[String, String] = stringProp("innerHTML")
}
