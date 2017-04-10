package com.raquo.dombuilder

import com.raquo.dombuilder.definitions.attrs.{Attrs, GlobalAttrs, InputAttrs}
import com.raquo.dombuilder.definitions.eventProps.{ClipboardEventProps, FormEventProps, KeyboardEventProps, MouseEventProps}
import com.raquo.dombuilder.definitions.nodes.{Elements, Elements2}
import com.raquo.dombuilder.definitions.props.Props
import com.raquo.dombuilder.definitions.styles.{Styles, Styles2}

package object simple {

  val builder: SimpleBuilder = new SimpleBuilder {}

  object elements
    extends Elements[SimpleElement, SimpleNode]
    with SimpleBuilder

  object elements2
    extends Elements2[SimpleElement, SimpleNode]
    with SimpleBuilder

  object attrs
    extends Attrs[SimpleNode]
    with InputAttrs[SimpleNode]
    with GlobalAttrs[SimpleNode]
    with SimpleBuilder

  object props
    extends Props[SimpleNode]
    with SimpleBuilder // @TODO add more `with`?

  object events
    extends MouseEventProps[SimpleNode]
    with FormEventProps[SimpleNode]
    with KeyboardEventProps[SimpleNode]
    with ClipboardEventProps[SimpleNode]
    with SimpleBuilder

  object styles
    extends Styles[SimpleNode]
    with SimpleBuilder

  object styles2
    extends Styles2[SimpleNode]
    with SimpleBuilder
}
