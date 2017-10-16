package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.TagBuilder

trait FormTags[T[_ <: DomElement], DomElement, HtmlForm <: DomElement, HtmlFieldSet <: DomElement, HtmlLegend <: DomElement, HtmlLabel <: DomElement, HtmlInput <: DomElement, HtmlButton <: DomElement, HtmlSelect <: DomElement, HtmlDataList <: DomElement, HtmlOptGroup <: DomElement, HtmlOption <: DomElement, HtmlTextArea <: DomElement] {
  this: TagBuilder[T, DomElement] =>

  // @TODO[Docs] add links to canonical ScalaJS types in comments

  /**
    * Represents a form, consisting of controls, that can be submitted to a
    * server for processing.
    *
    *  MDN
    */
  lazy val form: T[HtmlForm] = tag("form")

  /**
    * A set of fields.
    *
    *  MDN
    */
  lazy val fieldSet: T[HtmlFieldSet] = tag("fieldset")

  /**
    * The caption for a fieldset.
    *
    *  MDN
    */
  lazy val legend: T[HtmlLegend] = tag("legend")

  /**
    * The caption of a single field
    *
    *  MDN
    */
  lazy val label: T[HtmlLabel] = tag("label")

  /**
    * A typed data field allowing the user to input data.
    *
    *  MDN
    */
  lazy val input: T[HtmlInput] = tag("input", void = true)

  /**
    * A button
    *
    *  MDN
    */
  lazy val button: T[HtmlButton] = tag("button")

  /**
    * A control that allows the user to select one of a set of options.
    *
    *  MDN
    */
  lazy val select: T[HtmlSelect] = tag("select")

  /**
    * A set of predefined options for other controls.
    *
    *  MDN
    */
  lazy val dataList: T[HtmlDataList] = tag("datalist")

  /**
    * A set of options, logically grouped.
    *
    *  MDN
    */
  lazy val optGroup: T[HtmlOptGroup] = tag("optgroup")

  /**
    * An option in a select element.
    *
    *  MDN
    */
  lazy val option: T[HtmlOption] = tag("option")

  /**
    * A multiline text edit control.
    *
    *  MDN
    */
  lazy val textArea: T[HtmlTextArea] = tag("textarea")
}
