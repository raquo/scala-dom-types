package com.raquo

import org.scalajs.dom

package object dombuilder {

  // These types are here so that we can stub them in JVM, to generate HTML
  // @TODO Better names for these?

  type DNode = dom.Node
  type DElement = dom.Element
  type DText = dom.Text
  type DComment = dom.Comment
}
