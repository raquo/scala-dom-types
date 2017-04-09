package com.raquo

// @TODO[Universal] remove scalajs here
import com.raquo.dombuilder.simple.SimpleBuilder
import org.scalajs.dom


package object dombuilder extends {

  type EventCallback[E <: dom.raw.Event] = E => Unit

  type GenericEventCallback = EventCallback[dom.Event]

  type MouseEventCallback = EventCallback[dom.MouseEvent]

//  object tags extends Elements[VNode, VNodeData] with VNodeBuilders
//
//  object allTags extends Elements[VNode, VNodeData] with Elements2[VNode, VNodeData] with VNodeBuilders
//
//  object attrs extends Attrs[VNode, VNodeData] with InputAttrs[VNode, VNodeData] with GlobalAttrs[VNode, VNodeData] with VNodeBuilders
//
//  object props extends Props[VNode, VNodeData] with VNodeBuilders // @TODO add more `with`?
//
//  object events
//    extends MouseEventProps[VNode, VNodeData]
//    with FormEventProps[VNode, VNodeData]
//    with KeyboardEventProps[VNode, VNodeData]
//    with ClipboardEventProps[VNode, VNodeData]
//    with VNodeBuilders
//
//  object styles extends Styles[VNode, VNodeData] with VNodeBuilders

//  @inline implicit def textToChildNode(
//    text: String
//  ): ChildNode[VNode, VNodeData] = {
//    Conversions.textToChildNode[VNode, VNodeData](text)(vnodeBuilders)
//  }

//  @inline implicit def toIterableNode(
//    modifiers: Iterable[Modifier[VNode, VNodeData]]
//  ): IterableNode[VNode, VNodeData] = {
//    Conversions.toIterableNode[VNode, VNodeData](modifiers)
//  }
//
//  @inline implicit def optionToModifier[T](
//    maybeModifier: Option[T]
//  )(
//    implicit toModifier: T => Modifier[VNode, VNodeData]
//  ): Modifier[VNode, VNodeData] = {
//    Conversions.optionToModifier[T, VNode, VNodeData](maybeModifier)
//  }
}
