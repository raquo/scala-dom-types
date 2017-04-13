package com.raquo.dombuilder

import com.raquo.dombuilder.builders.{AttrBuilder, EventPropBuilder, PropBuilder, StyleBuilder}
import com.raquo.dombuilder.definitions.attrs.{Attrs, GlobalAttrs, InputAttrs}
import com.raquo.dombuilder.definitions.eventProps.{ClipboardEventProps, FormEventProps, KeyboardEventProps, MouseEventProps}
import com.raquo.dombuilder.definitions.nodes.{Elements, Elements2}
import com.raquo.dombuilder.definitions.props.Props
import com.raquo.dombuilder.definitions.styles.{Styles, Styles2}

package object simple {

//  val attrBuilder: AttrBuilder[SimpleNode] = new AttrBuilder[SimpleNode] {}
//  val eventPropBuilder: EventPropBuilder[SimpleNode] = new EventPropBuilder[SimpleNode] {}
//  val propBuilder: PropBuilder[SimpleNode] = new PropBuilder[SimpleNode] {}
//  val styleBuilder: StyleBuilder[SimpleNode] = new StyleBuilder[SimpleNode] {}

  val builder: SimpleBuilder = new SimpleBuilder {}

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
