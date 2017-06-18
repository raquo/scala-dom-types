package com.raquo.dombuilder.generic.defs.attrs

import com.raquo.dombuilder.generic.builders.SpecializedBuilder

// @TODO[Performance] Do we need those vals to be lazy? Scala.js optimizes away unused code anyway, and lazy vals produce more generated code than vals

trait Attrs[A[_]] { this: SpecializedBuilder[A] =>

  /**
    * This is the single required attribute for anchors defining a hypertext
    * source link. It indicates the link target, either a URL or a URL fragment.
    * A URL fragment is a name preceded by a hash mark (#), which specifies an
    * internal target location (an ID) within the current document. URLs are not
    * restricted to Web (HTTP)-based documents. URLs might use any protocol
    * supported by the browser. For example, file, ftp, and mailto work in most
    * user agents.
    *
    * MDN
    */
  lazy val href: A[String] = build("href")

  /**
    * This attribute defines the alternative text describing the image. Users
    * will see this displayed if the image URL is wrong, the image is not in one
    * of the supported formats, or until the image is downloaded.
    *
    * MDN
    */
  lazy val alt: A[String] = build("alt")

  /**
    * This attribute names a relationship of the linked document to the current
    * document. The attribute must be a space-separated list of the link types
    * values. The most common use of this attribute is to specify a link to an
    * external style sheet: the rel attribute is set to stylesheet, and the href
    * attribute is set to the URL of an external style sheet to format the page.
    *
    *
    * MDN
    */
  lazy val rel: A[String] = build("rel")

  /**
    * If the value of the type attribute is image, this attribute specifies a URI
    * for the location of an image to display on the graphical submit button;
    * otherwise it is ignored.
    *
    * MDN
    */
  lazy val src: A[String] = build("src")

  /**
    *
    */
  lazy val xmlns: A[String] = build("xmlns")

  /**
    * If the value of the type attribute is file, this attribute indicates the
    * types of files that the server accepts; otherwise it is ignored.
    *
    * MDN
    */
  lazy val accept: A[String] = build("accept")

  /**
    * Declares the character encoding of the page or script. Used on meta and
    * script elements.
    *
    * MDN
    */
  lazy val charset: A[String] = build("charset")

  /**
    * This Boolean attribute indicates that the form control is not available for
    * interaction. In particular, the click event will not be dispatched on
    * disabled controls. Also, a disabled control's value isn't submitted with
    * the form.
    *
    * This attribute is ignored if the value of the type attribute is hidden.
    *
    * MDN
    */
  lazy val disabled: A[Boolean] = build("disabled")

  /**
    * Describes elements which belongs to this one. Used on labels and output
    * elements.
    *
    * MDN
    */
  lazy val `for`: A[String] = build("for")
  lazy val forId: A[String] = `for`

  /**
    * The number of visible text lines for the control.
    *
    * MDN
    */
  lazy val rows: A[Int] = build("rows")

  /**
    * The visible width of the text control, in average character widths. If it
    * is specified, it must be a positive integer. If it is not specified, the
    * default value is 20 (HTML5).
    *
    * MDN
    */
  lazy val cols: A[Int] = build("cols")

  /**
    * The attribute describes the role(s) the current element plays in the
    * context of the document. This can be used, for example,
    * by applications and assistive technologies to determine the purpose of
    * an element. This could allow a user to make informed decisions on which
    * actions may be taken on an element and activate the selected action in a
    * device independent way. It could also be used as a mechanism for
    * annotating portions of a document in a domain specific way (e.g.,
    * a legal term taxonomy). Although the role attribute may be used to add
    * semantics to an element, authors should use elements with inherent
    * semantics, such as p, rather than layering semantics on semantically
    * neutral elements, such as div role="paragraph".
    *
    * See: [[http://www.w3.org/TR/role-attribute/#s_role_module_attributes]]
    */
  lazy val role: A[String] = build("role")

  /**
    * This attribute gives the value associated with the http-equiv or name
    * attribute, depending of the context.
    *
    * MDN
    */
  lazy val content: A[String] = build("content")

  /**
    * This enumerated attribute defines the pragma that can alter servers and
    * user-agents behavior. The value of the pragma is defined using the content
    * attribute and can be one of the following:
    *
    *   - content-language
    *   - content-type
    *   - default-style
    *   - refresh
    *   - set-cookie
    *
    * MDN
    */
  lazy val httpEquiv: A[String] = build("http-equiv")

  /**
    * This attribute specifies the media which the linked resource applies to.
    * Its value must be a media query. This attribute is mainly useful when
    * linking to external stylesheets by allowing the user agent to pick
    * the best adapted one for the device it runs on.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/HTML/Element/link#attr-media
    */
  lazy val media: A[String] = build("media")

  /**

    * This attribute contains a non-negative integer value that indicates for
    * how many columns the cell extends. Its default value is 1; if its value
    * is set to 0, it extends until the end of the <colgroup>, even if implicitly
    * defined, that the cell belongs to. Values higher than 1000 will be considered
    * as incorrect and will be set to the default value (1).
    *
    * MDN
    */
  lazy val colSpan: A[Int] = build("colspan")

  /**
    * This attribute contains a non-negative integer value that indicates for how many
    * rows the cell extends. Its default value is 1; if its value is set to 0, it extends
    * until the end of the table section (<thead>, <tbody>, <tfoot>, even if implicitly
    * defined, that the cell belongs to. Values higher than 65534 are clipped down to 65534.
    *
    * MDN
    */
  lazy val rowSpan: A[Int] = build("rowspan")

  /**
    * ARIA is a set of special accessibility attributes which can be added
    * to any markup, but is especially suited to HTML. The role attribute
    * defines what the general type of object is (such as an article, alert,
    * or slider). Additional ARIA attributes provide other useful properties,
    * such as a description for a form or the current value of a progressbar.
    *
    * MDN
    */
  object aria{

    /**
      * Identifies the currently active descendant of a composite widget.
      */
    lazy val activeDescendant = build("aria-activedescendant")

    /**
      * Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. See related aria-relevant.
      */
    lazy val atomic = build("aria-atomic")

    /**
      * Indicates whether user input completion suggestions are provided.
      */
    lazy val autoComplete = build("aria-autocomplete")

    /**
      * Indicates whether an element, and its subtree, are currently being updated.
      */
    lazy val busy = build("aria-busy")

    /**
      * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets. See related aria-pressed and aria-selected.
      */
    lazy val checked = build("aria-checked")

    /**
      * Identifies the element (or elements) whose contents or presence are controlled by the current element. See related aria-owns.
      */
    lazy val controls = build("aria-controls")

    /**
      * Identifies the element (or elements) that describes the object. See related aria-labelledby.
      */
    lazy val describedBy = build("aria-describedby")

    /**
      * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable. See related aria-hidden and aria-readonly.
      */
    lazy val disabled = build("aria-disabled")

    /**
      * Indicates what functions can be performed when the dragged object is released on the drop target. This allows assistive technologies to convey the possible drag options available to users, including whether a pop-up menu of choices is provided by the application. Typically, drop effect functions can only be provided once an object has been grabbed for a drag operation as the drop effect functions available are dependent on the object being dragged.
      */
    lazy val dropEffect = build("aria-dropeffect")

    /**
      * Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed.
      */
    lazy val expanded = build("aria-expanded")

    /**
      * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion, allows assistive technology to override the general default of reading in document source order.
      */
    lazy val flowTo = build("aria-flowto")

    /**
      * Indicates an element's "grabbed" state in a drag-and-drop operation.
      */
    lazy val grabbed = build("aria-grabbed")

    /**
      * Indicates that the element has a popup context menu or sub-level menu.
      */
    lazy val hasPopup = build("aria-haspopup")

    /**
      * Indicates that the element and all of its descendants are not visible or perceivable to any user as implemented by the author. See related aria-disabled.
      */
    lazy val hidden = build("aria-hidden")

    /**
      * Indicates the entered value does not conform to the format expected by the application.
      */
    lazy val invalid = build("aria-invalid")

    /**
      * Defines a string value that labels the current element. See related aria-labelledby.
      */
    lazy val label = build("aria-label")

    /**
      * Identifies the element (or elements) that labels the current element. See related aria-label and aria-describedby.
      */
    lazy val labelledBy = build("aria-labelledby")

    /**
      * Defines the hierarchical level of an element within a structure.
      */
    lazy val level = build("aria-level")

    /**
      * Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region.
      */
    lazy val live = build("aria-live")

    /**
      * Indicates whether a text box accepts multiple lines of input or only a single line.
      */
    lazy val multiLine = build("aria-multiline")

    /**
      * Indicates that the user may select more than one item from the current selectable descendants.
      */
    lazy val multiSelectable = build("aria-multiselectable")

    /**
      * Indicates whether the element and orientation is horizontal or vertical.
      */
    lazy val orientation = build("aria-orientation")

    /**
      * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship between DOM elements where the DOM hierarchy cannot be used to represent the relationship. See related aria-controls.
      */
    lazy val owns = build("aria-owns")

    /**
      * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM. See related aria-setsize.
      */
    lazy val posInSet = build("aria-posinset")

    /**
      * Indicates the current "pressed" state of toggle buttons. See related aria-checked and aria-selected.
      */
    lazy val pressed = build("aria-pressed")

    /**
      * Indicates that the element is not editable, but is otherwise operable. See related aria-disabled.
      */
    lazy val readOnly = build("aria-readonly")

    /**
      * Indicates what user agent change notifications (additions, removals, etc.) assistive technologies will receive within a live region. See related aria-atomic.
      */
    lazy val relevant = build("aria-relevant")

    /**
      * Indicates that user input is required on the element before a form may be submitted.
      */
    lazy val required = build("aria-required")

    /**
      * Indicates the current "selected" state of various widgets. See related aria-checked and aria-pressed.
      */
    lazy val selected = build("aria-selected")

    /**
      * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM. See related aria-posinset.
      */
    lazy val setSize = build("aria-setsize")

    /**
      * Indicates if items in a table or grid are sorted in ascending or descending order.
      */
    lazy val sort = build("aria-sort")

    /**
      * Defines the maximum allowed value for a range widget.
      */
    lazy val valueMax = build("aria-valuemax")

    /**
      * Defines the minimum allowed value for a range widget.
      */
    lazy val valueMin = build("aria-valuemin")

    /**
      * Defines the current value for a range widget. See related aria-valuetext.
      */
    lazy val valueNow = build("aria-valuenow")

    /**
      * Defines the human readable text alternative of aria-valuenow for a range widget.
      */
    lazy val valueText = build("aria-valuetext")
  }

  /**
    * Indicates a selected option in an option list of a <select> element.
    */
  lazy val selected: A[Boolean] = build("selected")

  /**
    * For use in &lt;style&gt; tags.
    *
    * If this attribute is present, then the style applies only to its parent element.
    * If absent, the style applies to the whole document.
    */
  lazy val scoped: A[Boolean] = build("scoped")

  /**
    * For use in &lt;meter&gt; tags.
    *
    * @see https://css-tricks.com/html5-meter-element/
    */
  lazy val high: A[Double] = build("high")

  /**
    * For use in &lt;meter&gt; tags.
    *
    * @see https://css-tricks.com/html5-meter-element/
    */
  lazy val low: A[Double] = build("low")

  /**
    * For use in &lt;meter&gt; tags.
    *
    * @see https://css-tricks.com/html5-meter-element/
    */
  lazy val optimum: A[Double] = build("optimum")

  /** IE-specific property to prevent user selection */
  lazy val unSelectable: A[Boolean] = build("unselectable")
}
