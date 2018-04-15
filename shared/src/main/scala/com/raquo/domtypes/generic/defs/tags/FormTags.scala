package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.HtmlTagBuilder

trait FormTags[T[_ <: DomHtmlElement], DomHtmlElement, HtmlForm <: DomHtmlElement, HtmlFieldSet <: DomHtmlElement, HtmlLegend <: DomHtmlElement, HtmlLabel <: DomHtmlElement, HtmlInput <: DomHtmlElement, HtmlButton <: DomHtmlElement, HtmlSelect <: DomHtmlElement, HtmlDataList <: DomHtmlElement, HtmlOptGroup <: DomHtmlElement, HtmlOption <: DomHtmlElement, HtmlTextArea <: DomHtmlElement] {
  this: HtmlTagBuilder[T, DomHtmlElement] =>

  // @TODO[Docs] add links to canonical ScalaJS types in comments

  /**
    * Represents a form, consisting of controls, that can be submitted to a
    * server for processing.
    *
    *  MDN
    */
  lazy val form: T[HtmlForm] = htmlTag("form")

  /**
    * A set of fields.
    *
    *  MDN
    */
  lazy val fieldSet: T[HtmlFieldSet] = htmlTag("fieldset")

  /**
    * The caption for a fieldset.
    *
    *  MDN
    */
  lazy val legend: T[HtmlLegend] = htmlTag("legend")

  /**
    * The caption of a single field
    *
    *  MDN
    */
  lazy val label: T[HtmlLabel] = htmlTag("label")

  /**
    * A typed data field allowing the user to input data.
    *
    *  MDN
    */
  lazy val input: T[HtmlInput] = htmlTag("input", void = true)

  /**
    * A button
    *
    *  MDN
    */
  lazy val button: T[HtmlButton] = htmlTag("button")

  /**
    * A control that allows the user to select one of a set of options.
    *
    *  MDN
    */
  lazy val select: T[HtmlSelect] = htmlTag("select")

  /**
    * A set of predefined options for other controls.
    *
    *  MDN
    */
  lazy val dataList: T[HtmlDataList] = htmlTag("datalist")

  /**
    * A set of options, logically grouped.
    *
    *  MDN
    */
  lazy val optGroup: T[HtmlOptGroup] = htmlTag("optgroup")

  /**
    * An option in a select element.
    *
    *  MDN
    */
  lazy val option: T[HtmlOption] = htmlTag("option")

  /**
    * A multiline text edit control.
    *
    *  MDN
    */
  lazy val textArea: T[HtmlTextArea] = htmlTag("textarea")
}
