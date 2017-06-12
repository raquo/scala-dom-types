package com.raquo.dombuilder

import com.raquo.dombuilder.builders.{AttrBuilder, EventPropBuilder, NodeBuilder, PropBuilder, StyleBuilder, TagBuilder}
import com.raquo.dombuilder.definitions.attrs.{Attrs, GlobalAttrs, InputAttrs}
import com.raquo.dombuilder.definitions.eventProps.{ClipboardEventProps, FormEventProps, KeyboardEventProps, MouseEventProps, SharedEventProps}
import com.raquo.dombuilder.definitions.tags.{Tags, Tags2}
import com.raquo.dombuilder.definitions.props.{NodeProps, Props}
import com.raquo.dombuilder.definitions.styles.{Styles, Styles2}
import com.raquo.dombuilder.domapi.{CommentApi, ElementApi, EventApi, TextApi, TreeApi}
import com.raquo.dombuilder.jsdom.domapi.{JsCommentApi, JsElementApi, JsEventApi, JsTextApi, JsTreeApi}
import com.raquo.dombuilder.simple.builders.{SimpleCommentBuilder, SimpleTagBuilder, SimpleTextBuilder}
import com.raquo.dombuilder.simple.nodes.{SimpleComment, SimpleElement, SimpleNode, SimpleText}
import org.scalajs.dom

import scala.scalajs.js

package object simple {

  val commentApi: CommentApi = new JsCommentApi {}

  val elementApi: ElementApi = new JsElementApi {}

  val eventApi: EventApi[SimpleNode, dom.Node, dom.Event, js.Function1] = new JsEventApi[SimpleNode] {}

  val textNodeApi: TextApi = new JsTextApi {}

  val treeApi: TreeApi[SimpleNode, dom.Node] = new JsTreeApi[SimpleNode] {}

  val commentBuilder: SimpleCommentBuilder = new SimpleCommentBuilder {}

  val tagBuilder: TagBuilder[SimpleElement, SimpleNode] = new SimpleTagBuilder {}

  val textBuilder: NodeBuilder[SimpleText, SimpleNode, dom.Text, dom.Node] = new SimpleTextBuilder {}

  object tags
    extends Tags[SimpleElement, SimpleNode]
    with SimpleTagBuilder

  object tags2
    extends Tags2[SimpleElement, SimpleNode]
    with SimpleTagBuilder

  object attrs
    extends Attrs[SimpleNode]
    with InputAttrs[SimpleNode]
    with GlobalAttrs[SimpleNode]
    with AttrBuilder[SimpleNode]

  object props
    extends Props[SimpleNode]
    with PropBuilder[SimpleNode]

  object nodeProps
    extends NodeProps[SimpleNode]
    with PropBuilder[SimpleNode]

  object events
    extends MouseEventProps[SimpleNode, dom.KeyboardEvent, dom.Event, js.Function1]
    with FormEventProps[SimpleNode, dom.Event, js.Function1]
    with KeyboardEventProps[SimpleNode, dom.KeyboardEvent, dom.Event, js.Function1]
    with ClipboardEventProps[SimpleNode, dom.Event, js.Function1]
    with EventPropBuilder[SimpleNode, dom.Event, js.Function1] // @TODO add more `with`?
    with SharedEventProps[SimpleNode, dom.ErrorEvent, dom.Event, js.Function1]
  {
    override val eventApi: EventApi[SimpleNode, dom.Node, dom.Event, js.Function1] = simple.eventApi
  }

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
