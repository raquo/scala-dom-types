package com.raquo.dombuilder

import com.raquo.dombuilder.builders.{AttrBuilder, EventPropBuilder, PropBuilder, StyleBuilder, TextNodeBuilder}
import com.raquo.dombuilder.definitions.attrs.{Attrs, GlobalAttrs, InputAttrs}
import com.raquo.dombuilder.definitions.eventProps.{ClipboardEventProps, FormEventProps, KeyboardEventProps, MouseEventProps}
import com.raquo.dombuilder.definitions.nodes.{Elements, Elements2}
import com.raquo.dombuilder.definitions.props.Props
import com.raquo.dombuilder.definitions.styles.{Styles, Styles2}
import com.raquo.dombuilder.domapi.TextNodeApi
import org.scalajs.dom

package object simple {

  val builder: SimpleBuilder = new SimpleBuilder {}

  val textNodeApi: TextNodeApi[SimpleNode, dom.Text] = new jsdom.domapi.TextNodeApi[SimpleNode] {}

  // @TODO extract in a separate class?
  val textNodeBuilder: TextNodeBuilder[SimpleText, SimpleNode, dom.Text] = new TextNodeBuilder[SimpleText, SimpleNode, dom.Text] {
    override def textNode(text: String): SimpleText with SimpleNode = {
      new SimpleText(text)
    }
  }
  val nodeBuilder: SimpleNodeBuilder = new SimpleNodeBuilder {}

  object elements
    extends Elements[SimpleElement, SimpleNode]
    with SimpleNodeBuilder

  object elements2
    extends Elements2[SimpleElement, SimpleNode]
    with SimpleNodeBuilder

  object attrs
    extends Attrs[SimpleNode]
    with InputAttrs[SimpleNode]
    with GlobalAttrs[SimpleNode]
    with AttrBuilder[SimpleNode]

  object props
    extends Props[SimpleNode]
    with PropBuilder[SimpleNode]

  object events
    extends MouseEventProps[SimpleNode]
    with FormEventProps[SimpleNode]
    with KeyboardEventProps[SimpleNode]
    with ClipboardEventProps[SimpleNode]
    with EventPropBuilder[SimpleNode] // @TODO add more `with`?

  object styles
    extends Styles[SimpleNode]
    with StyleBuilder[SimpleNode]

  object styles2
    extends Styles2[SimpleNode]
    with StyleBuilder[SimpleNode]

  implicit def textToNode(text: String): SimpleText = {
    new SimpleText(text)
  }
}
