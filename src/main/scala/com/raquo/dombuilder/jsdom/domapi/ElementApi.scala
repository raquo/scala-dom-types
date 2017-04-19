package com.raquo.dombuilder.jsdom.domapi

import com.raquo.dombuilder.domapi
import org.scalajs.dom

trait ElementApi[N] extends domapi.ElementApi[N, dom.Element] {

  @inline override def createElement(tagName: String): dom.Element = {
    dom.document.createElement(tagName)
  }
}
