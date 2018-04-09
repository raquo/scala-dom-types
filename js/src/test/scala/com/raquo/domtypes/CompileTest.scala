package com.raquo.domtypes

import com.raquo.domtypes.generic.builders.canonical.CanonicalReflectedAttrBuilder.ReflectedAttr
import com.raquo.domtypes.generic.builders.canonical.{CanonicalAttrBuilder, CanonicalEventPropBuilder, CanonicalPropBuilder, CanonicalReflectedAttrBuilder, CanonicalSvgAttrBuilder}
import com.raquo.domtypes.generic.builders.{StyleBuilders, Tag, TagBuilder}
import com.raquo.domtypes.generic.defs.attrs.{AriaAttrs, Attrs, SvgAttrs}
import com.raquo.domtypes.generic.defs.props.Props
import com.raquo.domtypes.generic.defs.reflectedAttrs.ReflectedAttrs
import com.raquo.domtypes.generic.defs.styles.{Styles, Styles2}
import com.raquo.domtypes.generic.keys.{Attr, EventProp, Prop, Style, SvgAttr}
import com.raquo.domtypes.jsdom.defs.eventProps.{ClipboardEventProps, ErrorEventProps, FormEventProps, HTMLElementEventProps, KeyboardEventProps, MediaEventProps, MiscellaneousEventProps, MouseEventProps, WindowOnlyEventProps}
import com.raquo.domtypes.jsdom.defs.tags.{DocumentTags, EmbedTags, FormTags, GroupingTags, MiscTags, SectionTags, SvgTags, TableTags, TextTags}
import org.scalajs.dom

/** We just want to make sure that this compiles. */
class CompileTest {

  trait SomeStyleSetter

  trait SomeStyleBuilders extends StyleBuilders[SomeStyleSetter] {

    override def buildDoubleStyleSetter(style: Style[Double], value: Double): SomeStyleSetter = ???

    override def buildIntStyleSetter(style: Style[Int], value: Int): SomeStyleSetter = ???

    override def buildStringStyleSetter(style: Style[_], value: String): SomeStyleSetter = ???
  }

  trait SomeTagBuilder extends TagBuilder[Tag, dom.Element] {

    override def tag[Ref <: dom.Element](tagName: String, void: Boolean): Tag[Ref] = ???
  }

  trait SomeSvgTagBuilder extends TagBuilder[Tag, dom.svg.Element] {

    override def tag[Ref <: dom.svg.Element](tagName: String, void: Boolean): Tag[Ref] = ???
  }

  object Bundle
    // Attrs
    extends Attrs[Attr]
    with AriaAttrs[Attr]
    // Event Props
    with ClipboardEventProps[EventProp]
    with ErrorEventProps[EventProp]
    with FormEventProps[EventProp]
    with KeyboardEventProps[EventProp]
    with MediaEventProps[EventProp]
    with MiscellaneousEventProps[EventProp]
    with MouseEventProps[EventProp]
    with WindowOnlyEventProps[EventProp]
    // Props
    with Props[Prop]
    // Reflected Attrs
    with ReflectedAttrs[ReflectedAttr]
    // Styles
    with Styles[SomeStyleSetter]
    with Styles2[SomeStyleSetter]
    // Tags
    with DocumentTags[Tag]
    with EmbedTags[Tag]
    with FormTags[Tag]
    with GroupingTags[Tag]
    with MiscTags[Tag]
    with SectionTags[Tag]
    with TableTags[Tag]
    with TextTags[Tag]
    // Concrete Builders
    with CanonicalAttrBuilder
    with CanonicalReflectedAttrBuilder
    with CanonicalEventPropBuilder[dom.Event]
    with CanonicalPropBuilder
    with SomeStyleBuilders
    with SomeTagBuilder {

    object svg
      extends SvgAttrs[SvgAttr]
      with SvgTags[Tag]
      with CanonicalSvgAttrBuilder
      with SomeSvgTagBuilder
  }

  object SpecificEventProps
    extends HTMLElementEventProps[EventProp]
    with CanonicalEventPropBuilder[dom.Event]
}
