package com.raquo.dombuilder.dombuilder.jsdom.nodes

import org.scalajs.dom
import com.raquo.dombuilder.dombuilder.generic

import scala.scalajs.js

trait Element[+Ref <: dom.Element]
  extends generic.nodes.Element
  with generic.nodes.RefNode[Ref]
{

  override protected[this] def createRef(): Ref = {
    // @TODO[Integrity] Seems ok to me, as long as tagname matches R
    dom.document.createElement(tagName).asInstanceOf[Ref]
  }

  override def setAttribute[V](attrName: String, value: V): Unit = {
    value match {
      case true => ref.setAttribute(attrName, "")
      case false => removeAttribute(attrName)
      case _ => ref.setAttribute(attrName, value.toString)
    }
  }

  override def removeAttribute(attrName: String): Unit = {
    ref.removeAttribute(attrName)
  }

  override def setProperty[V](propName: String, value: V): Unit = {
    ref.asInstanceOf[js.Dynamic].updateDynamic(propName)(value.asInstanceOf[js.Any])
  }

  override def setStyle[V](propName: String, value: V): Unit = {
    // @TODO[Integrity] Sort out the difference between Element and HTMLElement once and for all.
    ref.asInstanceOf[dom.html.Element].style.asInstanceOf[js.Dynamic].updateDynamic(propName)(value.asInstanceOf[js.Any])
  }
}
