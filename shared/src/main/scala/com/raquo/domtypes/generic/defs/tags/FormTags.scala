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
  @inline def form: T[HtmlForm] = htmlTag("form")

  /**
    * A set of fields.
    *
    *  MDN
    */
  @inline def fieldSet: T[HtmlFieldSet] = htmlTag("fieldset")

  /**
    * The caption for a fieldset.
    *
    *  MDN
    */
  @inline def legend: T[HtmlLegend] = htmlTag("legend")

  /**
    * The caption of a single field
    *
    *  MDN
    */
  @inline def label: T[HtmlLabel] = htmlTag("label")

  /**
    * A typed data field allowing the user to input data.
    *
    *  MDN
    */
  @inline def input: T[HtmlInput] = htmlTag("input", void = true)

  /**
    * A button
    *
    *  MDN
    */
  @inline def button: T[HtmlButton] = htmlTag("button")

  /**
    * A control that allows the user to select one of a set of options.
    *
    *  MDN
    */
  @inline def select: T[HtmlSelect] = htmlTag("select")

  /**
    * A set of predefined options for other controls.
    *
    *  MDN
    */
  @inline def dataList: T[HtmlDataList] = htmlTag("datalist")

  /**
    * A set of options, logically grouped.
    *
    *  MDN
    */
  @inline def optGroup: T[HtmlOptGroup] = htmlTag("optgroup")

  /**
    * An option in a select element.
    *
    *  MDN
    */
  @inline def option: T[HtmlOption] = htmlTag("option")

  /**
    * A multiline text edit control.
    *
    *  MDN
    */
  @inline def textArea: T[HtmlTextArea] = htmlTag("textarea")
}
