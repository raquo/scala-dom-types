package com.raquo.domtypes.generic.defs.attrs

import com.raquo.domtypes.generic.builders.HtmlAttrBuilder
import com.raquo.domtypes.generic.codecs.BooleanAsTrueFalseStringCodec

/**
  * ARIA is a set of special accessibility attributes which can be added
  * to any markup, but is especially suited to HTML. The role attribute
  * defines what the general type of object is (such as an article, alert,
  * or slider). Additional ARIA attributes provide other useful properties,
  * such as a description for a form or the current value of a progressbar.
  *
  * MDN
  *
  * @tparam A Attribute, canonically [[com.raquo.domtypes.generic.keys.HtmlAttr]]
  */
trait AriaAttrs[A[_]] { this: HtmlAttrBuilder[A] =>

  // @TODO[API] Provide more specific traits or maybe type-tagged strings for enumerated attributes

  /**
    * Identifies the currently active descendant of a composite widget.
    */
  lazy val activeDescendant: A[String] = stringHtmlAttr("aria-activedescendant")

  /**
    * Indicates whether assistive technologies will present all, or only parts of, the
    * changed region based on the change notifications defined by the aria-relevant
    * attribute. See related [[relevant]].
    */
  lazy val atomic: A[Boolean] = htmlAttr("aria-atomic", BooleanAsTrueFalseStringCodec)

  /**
    * Indicates whether user input completion suggestions are provided.
    *
    * Enumerated: "inline" | "list" | "both" | "none" (default)
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-autocomplete
    */
  lazy val autoComplete: A[String] = stringHtmlAttr("aria-autocomplete")

  /**
    * Indicates whether an element, and its subtree, are currently being updated.
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-busy
    */
  lazy val busy: A[Boolean] = htmlAttr("aria-busy", BooleanAsTrueFalseStringCodec)

  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other
    * widgets. See related [[pressed]] and [[selected]].
    *
    * Enumerated: Tristate – "true" | "false" | "mixed" | undefined (default)
    * - undefined means the element does not support being checked
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-checked
    */
  lazy val checked: A[String] = stringHtmlAttr("aria-checked")

  /**
    * Identifies the element (or elements) whose contents or presence are controlled
    * by the current element. See related [[owns]].
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-controls
    */
  lazy val controls: A[String] = stringHtmlAttr("aria-controls")

  /**
    * Identifies the element (or elements) that describes the object.
    * See related [[labelledBy]].
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-describedby
    */
  lazy val describedBy: A[String] = stringHtmlAttr("aria-describedby")

  /**
    * Indicates that the element is perceivable but disabled, so it is not editable
    * or otherwise operable. See related [[hidden]] and [[readOnly]].
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-disabled
    */
  lazy val disabled: A[Boolean] = htmlAttr("aria-disabled", BooleanAsTrueFalseStringCodec)

  /**
    * Indicates what functions can be performed when the dragged object is released
    * on the drop target. This allows assistive technologies to convey the possible
    * drag options available to users, including whether a pop-up menu of choices is
    * provided by the application. Typically, drop effect functions can only be
    * provided once an object has been grabbed for a drag operation as the drop
    * effect functions available are dependent on the object being dragged.
    *
    * Enumerated: "copy" | "move" | "link" | "execute" | "popup" | "none" (default)
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-dropeffect
    */
  lazy val dropEffect: A[String] = stringHtmlAttr("aria-dropeffect")

  /**
    * Indicates whether the element, or another grouping element it controls, is
    * currently expanded or collapsed.
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-expanded
    */
  lazy val expanded: A[Boolean] = htmlAttr("aria-expanded", BooleanAsTrueFalseStringCodec)

  /**
    * Identifies the next element (or elements) in an alternate reading order of
    * content which, at the user's discretion, allows assistive technology to
    * override the general default of reading in document source order.
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-flowto
    */
  lazy val flowTo: A[String] = stringHtmlAttr("aria-flowto")

  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-grabbed
    */
  lazy val grabbed: A[Boolean] = htmlAttr("aria-grabbed", BooleanAsTrueFalseStringCodec)

  /**
    * Indicates that the element has a popup context menu or sub-level menu.
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-haspopup
    */
  lazy val hasPopup: A[Boolean] = htmlAttr("aria-haspopup", BooleanAsTrueFalseStringCodec)

  /**
    * Indicates that the element and all of its descendants are not visible or
    * perceivable to any user as implemented by the author.
    * See related [[disabled]].
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-hidden
    */
  lazy val hidden: A[Boolean] = htmlAttr("aria-hidden", BooleanAsTrueFalseStringCodec)

  /**
    * Indicates the entered value does not conform to the format expected by the
    * application.
    *
    * Enumerated: "grammar" | "spelling" | "true" | "false" (default)
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-invalid
    */
  lazy val invalid: A[String] = stringHtmlAttr("aria-invalid")

  /**
    * Defines a string value that labels the current element.
    * See related [[labelledBy]].
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-label
    */
  lazy val label: A[String] = stringHtmlAttr("aria-label")

  /**
    * Identifies the element (or elements) that labels the current element.
    * See related [[label]] and [[describedBy]].
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-labelledby
    */
  lazy val labelledBy: A[String] = stringHtmlAttr("aria-labelledby")

  /**
    * Defines the hierarchical level of an element within a structure.
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-level
    */
  lazy val level: A[Int] = intHtmlAttr("aria-level")

  /**
    * Indicates that an element will be updated, and describes the types of updates the
    * user agents, assistive technologies, and user can expect from the live region.
    *
    * Enumerated: "polite" | "assertive" | "off" (default)
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-live
    */
  lazy val live: A[String] = stringHtmlAttr("aria-live")

  /**
    * Indicates whether a text box accepts multiple lines of input or only a single line.
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-multiline
    */
  lazy val multiLine: A[Boolean] = htmlAttr("aria-multiline", BooleanAsTrueFalseStringCodec)

  /**
    * Indicates that the user may select more than one item from the current selectable descendants.
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-multiselectable
    */
  lazy val multiSelectable: A[Boolean] = htmlAttr("aria-multiselectable", BooleanAsTrueFalseStringCodec)

  /**
    * Indicates whether the element and orientation is horizontal or vertical.
    *
    * Enumerated: "vertical" | "horizontal" (default)
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-orientation
    */
  lazy val orientation: A[String] = stringHtmlAttr("aria-orientation")

  /**
    * Identifies an element (or elements) in order to define a visual, functional, or
    * contextual parent/child relationship between DOM elements where the DOM hierarchy
    * cannot be used to represent the relationship. See related [[controls]].
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-owns
    */
  lazy val owns: A[String] = stringHtmlAttr("aria-owns")

  /**
    * Defines an element's number or position in the current set of listitems or treeitems.
    * Not required if all elements in the set are present in the DOM. See related [[setSize]].
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-posinset
    */
  lazy val posInSet: A[Int] = intHtmlAttr("aria-posinset")

  /**
    * Indicates the current "pressed" state of toggle buttons. See related [[checked]] and [[selected]].
    *
    * Enumerated: Tristate – "true" | "false" | "mixed" | undefined (default)
    * - undefined means the element does not support being pressed
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-pressed
    */
  lazy val pressed: A[String] = stringHtmlAttr("aria-pressed")

  /**
    * Indicates that the element is not editable, but is otherwise operable. See related [[disabled]].
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-readonly
    */
  lazy val readOnly: A[Boolean] = htmlAttr("aria-readonly", BooleanAsTrueFalseStringCodec)

  /**
    * Indicates what user agent change notifications (additions, removals, etc.)
    * assistive technologies will receive within a live region. See related [[atomic]].
    *
    * Enumerated: "additions" | "removals" | "text" | "all" | "additions text" (default)
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-relevant
    */
  lazy val relevant: A[String] = stringHtmlAttr("aria-relevant")

  /**
    * Indicates that user input is required on the element before a form may be submitted.
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-required
    */
  lazy val required: A[Boolean] = htmlAttr("aria-required", BooleanAsTrueFalseStringCodec)

  /**
    * Indicates the current "selected" state of various widgets.
    * See related [[checked]] and [[pressed]].
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-selected
    */
  lazy val selected: A[Boolean] = htmlAttr("aria-selected", BooleanAsTrueFalseStringCodec)

  /**
    * Defines the number of items in the current set of listitems or treeitems.
    * Not required if all elements in the set are present in the DOM.
    * See related [[posInSet]].
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-setsize
    */
  lazy val setSize: A[Int] = intHtmlAttr("aria-setsize")

  /**
    * Indicates if items in a table or grid are sorted in ascending or descending order.
    *
    * Enumerated: "ascending" | "descending" | "other" | "none" (default)
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-sort
    */
  lazy val sort: A[String] = stringHtmlAttr("aria-sort")

  /**
    * Defines the maximum allowed value for a range widget.
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-valuemax
    */
  lazy val valueMax: A[Double] = doubleHtmlAttr("aria-valuemax")

  /**
    * Defines the minimum allowed value for a range widget.
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-valuemin
    */
  lazy val valueMin: A[Double] = doubleHtmlAttr("aria-valuemin")

  /**
    * Defines the current value for a range widget. See related [[valueText]].
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-valuenow
    */
  lazy val valueNow: A[Double] = doubleHtmlAttr("aria-valuenow")

  /**
    * Defines the human readable text alternative of aria-valuenow for a range widget.
    *
    * https://www.w3.org/TR/wai-aria/states_and_properties#aria-valuetext
    */
  lazy val valueText: A[String] = stringHtmlAttr("aria-valuetext")
}
