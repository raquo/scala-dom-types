package com.thirdparty.tags

import org.scalajs.dom

trait Tag[El <: dom.Element] {
  val domName: String
}

case class HtmlTag[El <: dom.html.Element](
  override val domName: String,
  void: Boolean
) extends Tag[El]

case class SvgTag[El <: dom.svg.Element](
  override val domName: String
) extends Tag[El]

case class MathMlTag[El <: dom.MathMLElement](
  override val domName: String
) extends Tag[dom.MathMLElement]
