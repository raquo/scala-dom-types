package com.raquo.domtypes.defs.attrs

import com.raquo.domtypes.common.{AttrDef, SvgTagType, HtmlTagType}

/**
  * ARIA is a set of special accessibility attributes which can be added
  * to any markup, but is especially suited to HTML. The role attribute
  * defines what the general type of object is (such as an article, alert,
  * or slider). Additional ARIA attributes provide other useful properties,
  * such as a description for a form or the current value of a progressbar.
  * 
  * 
  * @tparam A Attribute[Value]
  * 
  */
object AriaAttrs {
  
  val defs: List[AttrDef] = List(
    
    AttrDef(
      tagType = HtmlTagType,
      scalaName = "activeDescendant",
      domName = "aria-activedescendant",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Identifies the currently active descendant of a composite widget.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-activedescendant",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "atomic",
      domName = "aria-atomic",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsTrueFalseString",
      commentLines = List(
        "Indicates whether assistive technologies will present all, or only parts of, the",
        "changed region based on the change notifications defined by the aria-relevant",
        "attribute. See related [[relevant]].",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-atomic",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "autoComplete",
      domName = "aria-autocomplete",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Indicates whether user input completion suggestions are provided.",
        "",
        "Enumerated: \"inline\" | \"list\" | \"both\" | \"none\" (default)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-autocomplete",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "busy",
      domName = "aria-busy",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsTrueFalseString",
      commentLines = List(
        "Indicates whether an element, and its subtree, are currently being updated.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-busy",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "checked",
      domName = "aria-checked",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Indicates the current \"checked\" state of checkboxes, radio buttons, and other",
        "widgets. See related [[pressed]] and [[selected]].",
        "",
        "Enumerated: Tristate – \"true\" | \"false\" | \"mixed\" | undefined (default)",
        "- undefined means the element does not support being checked",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-checked",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "controls",
      domName = "aria-controls",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Identifies the element (or elements) whose contents or presence are controlled",
        "by the current element. See related [[owns]].",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-controls",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "current",
      domName = "aria-current",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Indicates the element that represents the current item within a container",
        "or set of related elements.",
        "",
        "Enumerated:",
        "\"page\" | \"step\" | \"location\" | \"date\" | \"time\" | \"true\" | \"false\" (default)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-current",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "describedBy",
      domName = "aria-describedby",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Identifies the element (or elements) that describes the object.",
        "See related [[labelledBy]].",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-describedby",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "disabled",
      domName = "aria-disabled",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsTrueFalseString",
      commentLines = List(
        "Indicates that the element is perceivable but disabled, so it is not editable",
        "or otherwise operable. See related [[hidden]] and [[readOnly]].",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-disabled",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "dropEffect",
      domName = "aria-dropeffect",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Indicates what functions can be performed when the dragged object is released",
        "on the drop target. This allows assistive technologies to convey the possible",
        "drag options available to users, including whether a pop-up menu of choices is",
        "provided by the application. Typically, drop effect functions can only be",
        "provided once an object has been grabbed for a drag operation as the drop",
        "effect functions available are dependent on the object being dragged.",
        "",
        "Enumerated: \"copy\" | \"move\" | \"link\" | \"execute\" | \"popup\" | \"none\" (default)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-dropeffect",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "expanded",
      domName = "aria-expanded",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsTrueFalseString",
      commentLines = List(
        "Indicates whether the element, or another grouping element it controls, is",
        "currently expanded or collapsed.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-expanded",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "flowTo",
      domName = "aria-flowto",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Identifies the next element (or elements) in an alternate reading order of",
        "content which, at the user's discretion, allows assistive technology to",
        "override the general default of reading in document source order.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-flowto",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "grabbed",
      domName = "aria-grabbed",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsTrueFalseString",
      commentLines = List(
        "Indicates an element's \"grabbed\" state in a drag-and-drop operation.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-grabbed",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "hasPopup",
      domName = "aria-haspopup",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsTrueFalseString",
      commentLines = List(
        "Indicates that the element has a popup context menu or sub-level menu.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-haspopup",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "hidden",
      domName = "aria-hidden",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsTrueFalseString",
      commentLines = List(
        "Indicates that the element and all of its descendants are not visible or",
        "perceivable to any user as implemented by the author.",
        "See related [[disabled]].",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-hidden",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "invalid",
      domName = "aria-invalid",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Indicates the entered value does not conform to the format expected by the",
        "application.",
        "",
        "Enumerated: \"grammar\" | \"spelling\" | \"true\" | \"false\" (default)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-invalid",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "label",
      domName = "aria-label",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Defines a string value that labels the current element.",
        "See related [[labelledBy]].",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-label",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "labelledBy",
      domName = "aria-labelledby",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Identifies the element (or elements) that labels the current element.",
        "See related [[label]] and [[describedBy]].",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-labelledby",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "level",
      domName = "aria-level",
      namespace = None,
      scalaValueType = "Int",
      codec = "IntAsString",
      commentLines = List(
        "Defines the hierarchical level of an element within a structure.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-level",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "live",
      domName = "aria-live",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Indicates that an element will be updated, and describes the types of updates the",
        "user agents, assistive technologies, and user can expect from the live region.",
        "",
        "Enumerated: \"polite\" | \"assertive\" | \"off\" (default)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-live",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "multiLine",
      domName = "aria-multiline",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsTrueFalseString",
      commentLines = List(
        "Indicates whether a text box accepts multiple lines of input or only a single line.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-multiline",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "multiSelectable",
      domName = "aria-multiselectable",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsTrueFalseString",
      commentLines = List(
        "Indicates that the user may select more than one item from the current selectable descendants.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-multiselectable",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "orientation",
      domName = "aria-orientation",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Indicates whether the element and orientation is horizontal or vertical.",
        "",
        "Enumerated: \"vertical\" | \"horizontal\" (default)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-orientation",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "owns",
      domName = "aria-owns",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Identifies an element (or elements) in order to define a visual, functional, or",
        "contextual parent/child relationship between DOM elements where the DOM hierarchy",
        "cannot be used to represent the relationship. See related [[controls]].",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-owns",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "posInSet",
      domName = "aria-posinset",
      namespace = None,
      scalaValueType = "Int",
      codec = "IntAsString",
      commentLines = List(
        "Defines an element's number or position in the current set of listitems or treeitems.",
        "Not required if all elements in the set are present in the DOM. See related [[setSize]].",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-posinset",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "pressed",
      domName = "aria-pressed",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Indicates the current \"pressed\" state of toggle buttons. See related [[checked]] and [[selected]].",
        "",
        "Enumerated: Tristate – \"true\" | \"false\" | \"mixed\" | undefined (default)",
        "- undefined means the element does not support being pressed",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-pressed",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "readOnly",
      domName = "aria-readonly",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsTrueFalseString",
      commentLines = List(
        "Indicates that the element is not editable, but is otherwise operable. See related [[disabled]].",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-readonly",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "relevant",
      domName = "aria-relevant",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Indicates what user agent change notifications (additions, removals, etc.)",
        "assistive technologies will receive within a live region. See related [[atomic]].",
        "",
        "Enumerated: \"additions\" | \"removals\" | \"text\" | \"all\" | \"additions text\" (default)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-relevant",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "required",
      domName = "aria-required",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsTrueFalseString",
      commentLines = List(
        "Indicates that user input is required on the element before a form may be submitted.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-required",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "selected",
      domName = "aria-selected",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsTrueFalseString",
      commentLines = List(
        "Indicates the current \"selected\" state of various widgets.",
        "See related [[checked]] and [[pressed]].",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-selected",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "setSize",
      domName = "aria-setsize",
      namespace = None,
      scalaValueType = "Int",
      codec = "IntAsString",
      commentLines = List(
        "Defines the number of items in the current set of listitems or treeitems.",
        "Not required if all elements in the set are present in the DOM.",
        "See related [[posInSet]].",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-setsize",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "sort",
      domName = "aria-sort",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Indicates if items in a table or grid are sorted in ascending or descending order.",
        "",
        "Enumerated: \"ascending\" | \"descending\" | \"other\" | \"none\" (default)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-sort",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "valueMax",
      domName = "aria-valuemax",
      namespace = None,
      scalaValueType = "Double",
      codec = "DoubleAsString",
      commentLines = List(
        "Defines the maximum allowed value for a range widget.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-valuemax",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "valueMin",
      domName = "aria-valuemin",
      namespace = None,
      scalaValueType = "Double",
      codec = "DoubleAsString",
      commentLines = List(
        "Defines the minimum allowed value for a range widget.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-valuemin",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "valueNow",
      domName = "aria-valuenow",
      namespace = None,
      scalaValueType = "Double",
      codec = "DoubleAsString",
      commentLines = List(
        "Defines the current value for a range widget. See related [[valueText]].",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-valuenow",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "valueText",
      domName = "aria-valuetext",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Defines the human readable text alternative of aria-valuenow for a range widget.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-valuetext",
      ),
    ),

  )
  
}
