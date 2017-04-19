package com.raquo.dombuilder.domapi

trait ElementApi[N, +DomElement] {

  def createElement(tagName: String): DomElement
}
