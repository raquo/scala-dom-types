package com.raquo.domtypes.old.defs.styles.keywords

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/display */
trait DisplayStyle[T] extends NoneStyle[T] {

  // #TODO[API] how to deal with tupled values ?

//  /** Two-value syntax, e.g. "inline flex" */
//  def tupled(outside: T, inside: T): T = buildStringValue(s"${valueAsString(outside)} ${valueAsString(inside)}")

//  /** Two-value syntax, e.g. "inline flex" */
//  def tupled(outside: String, inside: String): T = buildStringValue(s"$outside $inside")



  // -- Outside values --

  /** The element generates a block element box  --MDN */
  lazy val block: T = buildStringValue("block")

  /** The element generates one or more inline element boxes  --MDN */
  lazy val inline: T = buildStringValue("inline")



  // -- Inside values (except `table`, see below) --

  /** The element lays out its contents using flow layout (block-and-inline layout).
    *
    * If its outer display type is inline or run-in, and it is participating in a
    * block or inline formatting context, then it generates an inline box.
    * Otherwise it generates a block container box.
    *
    * Depending on the value of other properties (such as position, float, or overflow)
    * and whether it is itself participating in a block or inline formatting context,
    * it either establishes a new block formatting context (BFC) for its contents or
    * integrates its contents into its parent formatting context.  --MDN
    */
  lazy val flow: T = buildStringValue("flow")

  /** The element generates a block element box that establishes a new block
    * formatting context, defining where the formatting root lies  --MDN
    */
  lazy val flowRoot: T = buildStringValue("flow-root")

  /** The element behaves like a block element and lays out its content according
    * to the flexbox model  --MDN
    */
  lazy val flex: T = buildStringValue("flex")

  /** The element behaves like a block element and lays out its content according
    * to the grid model  --MDN
    */
  lazy val grid: T = buildStringValue("grid")

  /** The element behaves like an inline element and lays out its content according
    * to the ruby formatting model. It behaves like the corresponding HTML <ruby>
    * elements.  --MDN
    */
  lazy val ruby: T = buildStringValue("ruby")



  // -- Legacy values --

  /** The element generates a block element box that will be flowed with
    * surrounding content as if it were a single inline box.  --MDN
    */
  lazy val inlineBlock: T = buildStringValue("inline-block")

  /** The element behaves like an inline element and lays out its content
    * according to the flexbox model  --MDN
    */
  lazy val inlineFlex: T = buildStringValue("inline-flex")

  /** The element behaves like an inline element and lays out its content
    * according to the grid model  --MDN
    */
  lazy val inlineGrid: T = buildStringValue("inline-grid")

  /** The inline-table value does not have a direct mapping in HTML. It behaves
    * like a table HTML element, but as an inline box, rather than a
    * block-level box. Inside the table box is a block-level context  --MDN
    */
  lazy val inlineTable: T = buildStringValue("inline-table")



  // -- Box generation --

  /** Turns off the display of an element (it has no effect on layout); all
    * descendant elements also have their display turned off. The document is
    * rendered as though the element did not exist. --MDN
    *
    * To render an element box's dimensions, yet have its contents be invisible,
    * see the visibility property.
    */
  override lazy val none: T = buildStringValue("none")

  /** These elements don't produce a specific box by themselves.
    * They are replaced by their pseudo-box and their child boxes.  --MDN
    */
  lazy val contents: T = buildStringValue("contents")



  // -- List item --

  /** The element generates a block box for the content and a separate list-item
    * inline box  --MDN */
  lazy val listItem: T = buildStringValue("list-item")



  // -- Table --

  /** Behaves like the table HTML element. It defines a block-level box  --MDN */
  lazy val table: T = buildStringValue("table")

  /** Behaves like the caption HTML element  --MDN */
  lazy val tableCaption: T = buildStringValue("table-caption")

  /** Behaves like the td HTML element  --MDN */
  lazy val tableCell: T = buildStringValue("table-cell")

  /** These elements behave like the corresponding col HTML elements  --MDN */
  lazy val tableColumn: T = buildStringValue("table-column")

  /** These elements behave like the corresponding colgroup HTML elements  --MDN */
  lazy val tableColumnGroup: T = buildStringValue("table-column-group")

  /** These elements behave like the corresponding tfoot HTML elements  --MDN */
  lazy val tableFooterGroup: T = buildStringValue("table-footer-group")

  /** These elements behave like the corresponding thead HTML elements  --MDN */
  lazy val tableHeaderGroup: T = buildStringValue("table-header-group")

  /** Behaves like the tr HTML element  --MDN */
  lazy val tableRow: T = buildStringValue("table-row")

  /** These elements behave like the corresponding tbody HTML elements  --MDN */
  lazy val tableRowGroup: T = buildStringValue("table-row-group")

}
