package com.raquo.dombuilder

import com.raquo.dombuilder.builders.nodes.{NodeBuilder, TagBuilder}
import com.raquo.dombuilder.builders.{AttrBuilder, EventPropBuilder, PropBuilder, StyleBuilder}
import com.raquo.dombuilder.definitions.attrs.{Attrs, GlobalAttrs, InputAttrs}
import com.raquo.dombuilder.definitions.eventProps.{ClipboardEventProps, FormEventProps, KeyboardEventProps, MouseEventProps}
import com.raquo.dombuilder.definitions.tags.{Tags, Tags2}
import com.raquo.dombuilder.definitions.props.{NodeProps, Props}
import com.raquo.dombuilder.definitions.styles.{Styles, Styles2}
import com.raquo.dombuilder.domapi.{CommentApi, ElementApi, TextApi, TreeApi}
import com.raquo.dombuilder.simple.builders.{SimpleCommentBuilder, SimpleTagBuilder, SimpleTextBuilder}
import com.raquo.dombuilder.simple.nodes.{SimpleComment, SimpleElement, SimpleNode, SimpleText}
import org.scalajs.dom

package object simple {

  val commentApi: CommentApi[SimpleNode, dom.Comment] = new jsdom.domapi.CommentApi[SimpleNode] {}

  val elementApi: ElementApi[SimpleNode, dom.Element] = new jsdom.domapi.ElementApi[SimpleNode] {}

  val textNodeApi: TextApi[SimpleNode, dom.Text] = new jsdom.domapi.TextApi[SimpleNode] {}

  val treeApi: TreeApi[SimpleNode, dom.Node] = new jsdom.domapi.TreeApi[SimpleNode] {}

  val commentBuilder: NodeBuilder[SimpleComment, SimpleNode, dom.Comment] = new SimpleCommentBuilder {}

  val tagBuilder: TagBuilder[SimpleElement, SimpleNode, dom.Element] = new SimpleTagBuilder {}

  val textBuilder: NodeBuilder[SimpleText, SimpleNode, dom.Text] = new SimpleTextBuilder {}

  object tags
    extends Tags[SimpleElement, SimpleNode, dom.Element]
    with SimpleTagBuilder

  object tags2
    extends Tags2[SimpleElement, SimpleNode, dom.Element]
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
