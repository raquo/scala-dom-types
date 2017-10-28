package com.raquo.domtypes

import com.raquo.domtypes.generic.builders.canonical.{CanonicalAttrBuilder, CanonicalEventPropBuilder, CanonicalPropBuilder, CanonicalReflectedAttrBuilder}
import com.raquo.domtypes.generic.builders.{AttrBuilder, EventPropBuilder, PropBuilder, ReflectedAttrBuilder, StyleBuilders, Tag, TagBuilder}
import com.raquo.domtypes.generic.defs.attrs.{AriaAttrs, Attrs}
import com.raquo.domtypes.generic.defs.eventProps.{ClipboardEventProps, ErrorEventProps, FormEventProps, KeyboardEventProps, MediaEventProps, MiscellaneousEventProps, MouseEventProps, WindowEventProps}
import com.raquo.domtypes.generic.defs.props.Props
import com.raquo.domtypes.generic.defs.reflectedAttrs.ReflectedAttrs
import com.raquo.domtypes.generic.defs.styles.{Styles, Styles2, StylesMisc}
import com.raquo.domtypes.jsdom.defs.tags.{DocumentTags, EmbedTags, FormTags, GroupingTags, MiscTags, SectionTags, TableTags, TextTags}
import com.raquo.domtypes.generic.keys.{Attr, EventProp, Prop, Style}
import org.scalajs.dom

/** We just want to make sure that this compiles. */
class CompileTest {

  trait SomeStyleSetter

  object Bundle
    // Attrs
    extends Attrs[Attr]
    with AriaAttrs[Attr]
    // Event Props
    with ClipboardEventProps[EventProp, dom.Event]
    with ErrorEventProps[EventProp, dom.Event, dom.ErrorEvent]
    with FormEventProps[EventProp, dom.Event]
    with KeyboardEventProps[EventProp, dom.Event, dom.KeyboardEvent]
    with MediaEventProps[EventProp, dom.Event]
    with MiscellaneousEventProps[EventProp, dom.Event]
    with MouseEventProps[EventProp, dom.Event, dom.MouseEvent]
    with WindowEventProps[EventProp, dom.Event]
    // Props
    with Props[Prop]
    // Reflected Attrs
    with ReflectedAttrs[Prop]
    // Styles
    with Styles[SomeStyleSetter]
    with Styles2[SomeStyleSetter]
    with StylesMisc[SomeStyleSetter]
    // Tags
    with DocumentTags[Tag]
    with EmbedTags[Tag]
    with FormTags[Tag]
    with GroupingTags[Tag]
    with MiscTags[Tag]
    with SectionTags[Tag]
    with TableTags[Tag]
    with TextTags[Tag]
    // Builders
    with AttrBuilder[Attr]
    with EventPropBuilder[EventProp, dom.Event]
    with PropBuilder[Prop]
    with ReflectedAttrBuilder[Prop]
    with StyleBuilders[SomeStyleSetter]
    with TagBuilder[Tag, dom.Element]
    // Concrete Builders
    with CanonicalAttrBuilder
    with CanonicalReflectedAttrBuilder
    with CanonicalEventPropBuilder[dom.Event]
    with CanonicalPropBuilder {

    override def buildDoubleStyleSetter(style: Style[Double], value: Double): SomeStyleSetter = ???

    override def buildIntStyleSetter(style: Style[Int], value: Int): SomeStyleSetter = ???

    override def buildStringStyleSetter(style: Style[_], value: String): SomeStyleSetter = ???

    override def tag[Ref <: dom.Element](tagName: String, void: Boolean): Tag[Ref] = ???
  }
}
