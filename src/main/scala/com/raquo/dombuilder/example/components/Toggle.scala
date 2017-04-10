package com.raquo.dombuilder.example.components

import com.raquo.dombuilder.simple.{SimpleElement, SimpleText, attrs, events, styles}
import com.raquo.dombuilder.simple.elements._

class Toggle(initialIsChecked: Boolean) extends SimpleElement("div") {

  private var _isChecked = false

  private val inputNode = input(
    attrs.typ := "checkbox",
    events.onChange := (_ => setChecked(!_isChecked))
  )

  private val captionNode = new SimpleText(captionText)

  this.apply(
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
      inputNode(attrs.checked := newIsChecked)
      captionNode.setText(captionText)
      this(styles.color := color)
    }
  }

  def color: String = {
    if (_isChecked) "green" else "red"
  }

  def captionText: String = {
    if (_isChecked) "ON" else "off"
  }
}
