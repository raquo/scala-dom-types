package com.thirdparty.defs.attrs

import com.thirdparty.keys.AriaAttr
import com.thirdparty.codecs._

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait AriaAttrs {


  def ariaAttr[V](key: String, codec: Codec[V, String]): AriaAttr[V] = AriaAttr(key, codec)


  @inline protected def boolAsTrueFalseAriaAttr(key: String): AriaAttr[Boolean] = ariaAttr(key, BooleanAsTrueFalseStringCodec)

  @inline protected def doubleAriaAttr(key: String): AriaAttr[Double] = ariaAttr(key, DoubleAsStringCodec)

  @inline protected def intAriaAttr(key: String): AriaAttr[Int] = ariaAttr(key, IntAsStringCodec)

  @inline protected def stringAriaAttr(key: String): AriaAttr[String] = ariaAttr(key, StringAsIsCodec)



  /**
    * Identifies the currently active descendant of a composite widget.
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-activedescendant
    */
  lazy val activeDescendant: AriaAttr[String] = stringAriaAttr("aria-activedescendant")


  /**
    * Indicates whether assistive technologies will present all, or only parts of, the
    * changed region based on the change notifications defined by the aria-relevant
    * attribute. See related [[relevant]].
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-atomic
    */
  lazy val atomic: AriaAttr[Boolean] = boolAsTrueFalseAriaAttr("aria-atomic")


  /**
    * Indicates whether user input completion suggestions are provided.
    * 
    * Enumerated: "inline" | "list" | "both" | "none" (default)
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-autocomplete
    */
  lazy val autoComplete: AriaAttr[String] = stringAriaAttr("aria-autocomplete")


  /**
    * Indicates whether an element, and its subtree, are currently being updated.
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-busy
    */
  lazy val busy: AriaAttr[Boolean] = boolAsTrueFalseAriaAttr("aria-busy")


  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other
    * widgets. See related [[pressed]] and [[selected]].
    * 
    * Enumerated: Tristate – "true" | "false" | "mixed" | undefined (default)
    * - undefined means the element does not support being checked
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-checked
    */
  lazy val checked: AriaAttr[String] = stringAriaAttr("aria-checked")


  /**
    * Identifies the element (or elements) whose contents or presence are controlled
    * by the current element. See related [[owns]].
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-controls
    */
  lazy val controls: AriaAttr[String] = stringAriaAttr("aria-controls")


  /**
    * Indicates the element that represents the current item within a container
    * or set of related elements.
    * 
    * Enumerated:
    * "page" | "step" | "location" | "date" | "time" | "true" | "false" (default)
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-current
    */
  lazy val current: AriaAttr[String] = stringAriaAttr("aria-current")


  /**
    * Identifies the element (or elements) that describes the object.
    * See related [[labelledBy]].
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-describedby
    */
  lazy val describedBy: AriaAttr[String] = stringAriaAttr("aria-describedby")


  /**
    * Indicates that the element is perceivable but disabled, so it is not editable
    * or otherwise operable. See related [[hidden]] and [[readOnly]].
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-disabled
    */
  lazy val disabled: AriaAttr[Boolean] = boolAsTrueFalseAriaAttr("aria-disabled")


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
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-dropeffect
    */
  lazy val dropEffect: AriaAttr[String] = stringAriaAttr("aria-dropeffect")


  /**
    * Indicates whether the element, or another grouping element it controls, is
    * currently expanded or collapsed.
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-expanded
    */
  lazy val expanded: AriaAttr[Boolean] = boolAsTrueFalseAriaAttr("aria-expanded")


  /**
    * Identifies the next element (or elements) in an alternate reading order of
    * content which, at the user's discretion, allows assistive technology to
    * override the general default of reading in document source order.
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-flowto
    */
  lazy val flowTo: AriaAttr[String] = stringAriaAttr("aria-flowto")


  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-grabbed
    */
  lazy val grabbed: AriaAttr[Boolean] = boolAsTrueFalseAriaAttr("aria-grabbed")


  /**
    * Indicates that the element has a popup context menu or sub-level menu.
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-haspopup
    */
  lazy val hasPopup: AriaAttr[Boolean] = boolAsTrueFalseAriaAttr("aria-haspopup")


  /**
    * Indicates that the element and all of its descendants are not visible or
    * perceivable to any user as implemented by the author.
    * See related [[disabled]].
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-hidden
    */
  lazy val hidden: AriaAttr[Boolean] = boolAsTrueFalseAriaAttr("aria-hidden")


  /**
    * Indicates the entered value does not conform to the format expected by the
    * application.
    * 
    * Enumerated: "grammar" | "spelling" | "true" | "false" (default)
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-invalid
    */
  lazy val invalid: AriaAttr[String] = stringAriaAttr("aria-invalid")


  /**
    * Defines a string value that labels the current element.
    * See related [[labelledBy]].
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-label
    */
  lazy val label: AriaAttr[String] = stringAriaAttr("aria-label")


  /**
    * Identifies the element (or elements) that labels the current element.
    * See related [[label]] and [[describedBy]].
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-labelledby
    */
  lazy val labelledBy: AriaAttr[String] = stringAriaAttr("aria-labelledby")


  /**
    * Defines the hierarchical level of an element within a structure.
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-level
    */
  lazy val level: AriaAttr[Int] = intAriaAttr("aria-level")


  /**
    * Indicates that an element will be updated, and describes the types of updates the
    * user agents, assistive technologies, and user can expect from the live region.
    * 
    * Enumerated: "polite" | "assertive" | "off" (default)
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-live
    */
  lazy val live: AriaAttr[String] = stringAriaAttr("aria-live")


  /**
    * Indicates whether a text box accepts multiple lines of input or only a single line.
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-multiline
    */
  lazy val multiLine: AriaAttr[Boolean] = boolAsTrueFalseAriaAttr("aria-multiline")


  /**
    * Indicates that the user may select more than one item from the current selectable descendants.
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-multiselectable
    */
  lazy val multiSelectable: AriaAttr[Boolean] = boolAsTrueFalseAriaAttr("aria-multiselectable")


  /**
    * Indicates whether the element and orientation is horizontal or vertical.
    * 
    * Enumerated: "vertical" | "horizontal" (default)
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-orientation
    */
  lazy val orientation: AriaAttr[String] = stringAriaAttr("aria-orientation")


  /**
    * Identifies an element (or elements) in order to define a visual, functional, or
    * contextual parent/child relationship between DOM elements where the DOM hierarchy
    * cannot be used to represent the relationship. See related [[controls]].
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-owns
    */
  lazy val owns: AriaAttr[String] = stringAriaAttr("aria-owns")


  /**
    * Defines an element's number or position in the current set of listitems or treeitems.
    * Not required if all elements in the set are present in the DOM. See related [[setSize]].
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-posinset
    */
  lazy val posInSet: AriaAttr[Int] = intAriaAttr("aria-posinset")


  /**
    * Indicates the current "pressed" state of toggle buttons. See related [[checked]] and [[selected]].
    * 
    * Enumerated: Tristate – "true" | "false" | "mixed" | undefined (default)
    * - undefined means the element does not support being pressed
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-pressed
    */
  lazy val pressed: AriaAttr[String] = stringAriaAttr("aria-pressed")


  /**
    * Indicates that the element is not editable, but is otherwise operable. See related [[disabled]].
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-readonly
    */
  lazy val readOnly: AriaAttr[Boolean] = boolAsTrueFalseAriaAttr("aria-readonly")


  /**
    * Indicates what user agent change notifications (additions, removals, etc.)
    * assistive technologies will receive within a live region. See related [[atomic]].
    * 
    * Enumerated: "additions" | "removals" | "text" | "all" | "additions text" (default)
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-relevant
    */
  lazy val relevant: AriaAttr[String] = stringAriaAttr("aria-relevant")


  /**
    * Indicates that user input is required on the element before a form may be submitted.
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-required
    */
  lazy val required: AriaAttr[Boolean] = boolAsTrueFalseAriaAttr("aria-required")


  /**
    * Indicates the current "selected" state of various widgets.
    * See related [[checked]] and [[pressed]].
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-selected
    */
  lazy val selected: AriaAttr[Boolean] = boolAsTrueFalseAriaAttr("aria-selected")


  /**
    * Defines the number of items in the current set of listitems or treeitems.
    * Not required if all elements in the set are present in the DOM.
    * See related [[posInSet]].
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-setsize
    */
  lazy val setSize: AriaAttr[Int] = intAriaAttr("aria-setsize")


  /**
    * Indicates if items in a table or grid are sorted in ascending or descending order.
    * 
    * Enumerated: "ascending" | "descending" | "other" | "none" (default)
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-sort
    */
  lazy val sort: AriaAttr[String] = stringAriaAttr("aria-sort")


  /**
    * Defines the maximum allowed value for a range widget.
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-valuemax
    */
  lazy val valueMax: AriaAttr[Double] = doubleAriaAttr("aria-valuemax")


  /**
    * Defines the minimum allowed value for a range widget.
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-valuemin
    */
  lazy val valueMin: AriaAttr[Double] = doubleAriaAttr("aria-valuemin")


  /**
    * Defines the current value for a range widget. See related [[valueText]].
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-valuenow
    */
  lazy val valueNow: AriaAttr[Double] = doubleAriaAttr("aria-valuenow")


  /**
    * Defines the human readable text alternative of aria-valuenow for a range widget.
    * 
    * @see https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-valuetext
    */
  lazy val valueText: AriaAttr[String] = stringAriaAttr("aria-valuetext")


}
