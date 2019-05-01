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
  @inline final def form: T[HtmlForm] = htmlTag("form")

  /**
    * A set of fields.
    *
    *  MDN
    */
  @inline final def fieldSet: T[HtmlFieldSet] = htmlTag("fieldset")

  /**
    * The caption for a fieldset.
    *
    *  MDN
    */
  @inline final def legend: T[HtmlLegend] = htmlTag("legend")

  /**
    * The caption of a single field
    *
    *  MDN
    */
  @inline final def label: T[HtmlLabel] = htmlTag("label")

  /**
    * A typed data field allowing the user to input data.
    *
    *  MDN
    */
  @inline final def input: T[HtmlInput] = htmlTag("input", void = true)

  /**
    * A button
    *
    *  MDN
    */
  @inline final def button: T[HtmlButton] = htmlTag("button")

  /**
    * A control that allows the user to select one of a set of options.
    *
    *  MDN
    */
  @inline final def select: T[HtmlSelect] = htmlTag("select")

  /**
    * A set of predefined options for other controls.
    *
    *  MDN
    */
  @inline final def dataList: T[HtmlDataList] = htmlTag("datalist")

  /**
    * A set of options, logically grouped.
    *
    *  MDN
    */
  @inline final def optGroup: T[HtmlOptGroup] = htmlTag("optgroup")

  /**
    * An option in a select element.
    *
    *  MDN
    */
  @inline final def option: T[HtmlOption] = htmlTag("option")

  /**
    * A multiline text edit control.
    *
    *  MDN
    */
  @inline final def textArea: T[HtmlTextArea] = htmlTag("textarea")
}
