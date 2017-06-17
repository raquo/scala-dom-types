package com.raquo.dombuilder.example.components

import com.raquo.dombuilder.jsdom.simple
import com.raquo.dombuilder.jsdom.simple.{SimpleHtmlElement, attrs, events, styles}
import com.raquo.dombuilder.jsdom.simple.tags._

class Toggle(initialIsChecked: Boolean) {

  private var _isChecked = false

  private val inputNode = input(
    attrs.typ := "checkbox",
    events.onChange := (_ => setChecked(!_isChecked))
  )

  private val captionNode = simple.textNode(captionText)

  val element: SimpleHtmlElement = div(
    attrs.cls := "Toggle",
    div(
      inputNode,
      captionNode
    )
  )

  setChecked(initialIsChecked, force = true)

  @inline def isChecked: Boolean = _isChecked

  def setChecked(newIsChecked: Boolean, force: Boolean = false): Unit = {
    if (force || _isChecked != newIsChecked) {
      _isChecked = !_isChecked
      (attrs.checked := newIsChecked).applyTo(inputNode)
      captionNode.setText(captionText)
      (styles.color := color).applyTo(element)
    }
  }

  def color: String = {
    if (_isChecked) "green" else "red"
  }

  def captionText: String = {
    if (_isChecked) "ON" else "off"
  }
}
