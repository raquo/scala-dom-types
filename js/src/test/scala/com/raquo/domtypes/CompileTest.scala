package com.raquo.domtypes

import com.raquo.domtypes.fixtures.builders.ExampleReflectedHtmlAttrBuilder.ReflectedAttr
import com.raquo.domtypes.fixtures.builders._
import com.raquo.domtypes.fixtures.complexKeys._
import com.raquo.domtypes.fixtures.keys._
import com.raquo.domtypes.fixtures.styles._
import com.raquo.domtypes.fixtures.tags._
import com.raquo.domtypes.generic.builders.{HtmlTagBuilder, SvgTagBuilder}
import com.raquo.domtypes.generic.defs.attrs.{AriaAttrs, HtmlAttrs, SvgAttrs}
import com.raquo.domtypes.generic.defs.props.Props
import com.raquo.domtypes.generic.defs.reflectedAttrs.ReflectedHtmlAttrs
import com.raquo.domtypes.generic.defs.styles.Styles
import com.raquo.domtypes.jsdom.defs.eventProps.{ClipboardEventProps, DocumentOnlyEventProps, ErrorEventProps, FormEventProps, HTMLElementEventProps, KeyboardEventProps, MediaEventProps, MiscellaneousEventProps, MouseEventProps, PointerEventProps, WindowOnlyEventProps}
import com.raquo.domtypes.jsdom.defs.tags.{DocumentTags, EmbedTags, FormTags, GroupingTags, MiscTags, SectionTags, SvgTags, TableTags, TextTags}
import org.scalajs.dom

/** We just want to make sure that this compiles. */
class CompileTest {

  object Bundle
    // Attrs
    extends HtmlAttrs[HtmlAttr]
    // Event Props
    with ClipboardEventProps[EventProp]
    with ErrorEventProps[EventProp]
    with FormEventProps[EventProp]
    with KeyboardEventProps[EventProp]
    with MediaEventProps[EventProp]
    with MiscellaneousEventProps[EventProp]
    with MouseEventProps[EventProp]
    with PointerEventProps[EventProp]
    with DocumentOnlyEventProps[EventProp]
    with WindowOnlyEventProps[EventProp]
    // Props
    with Props[Prop]
    // Reflected Attrs
    with ReflectedHtmlAttrs[ReflectedAttr]
    // Styles
    with Styles[ExampleStyleProp, ExampleStyleSetter, ExampleDerivedStyleProp.Base, Int]
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
    with ExampleComplexHtmlKeys[ReflectedAttr, HtmlAttr, Prop]
    with ExampleHtmlAttrBuilder
    with ExampleReflectedHtmlAttrBuilder
    with ExampleEventPropBuilder[dom.Event]
    with ExamplePropBuilder
    with ExampleSvgAttrBuilder // Not needed but want to ensure compatibility
    with ExampleStylePropBuilder
    with ExampleTagBuilders {

    object aria
      extends AriaAttrs[HtmlAttr]
      with ExampleHtmlAttrBuilder

    object svg
      extends SvgTags[Tag]
      with ExampleComplexSvgKeys[SvgAttr]
      with SvgAttrs[SvgAttr]
      with ExampleSvgAttrBuilder
      with ExampleTagBuilders
  }

  object SpecificEventProps
    extends HTMLElementEventProps[EventProp]
    with ExampleEventPropBuilder[dom.Event]


  trait ExampleTagBuilders extends HtmlTagBuilder[Tag, dom.Element] with SvgTagBuilder[Tag, dom.svg.Element] {

    override def htmlTag[Ref <: dom.Element](tagName: String, void: Boolean): Tag[Ref] = ???

    override def svgTag[Ref <: dom.svg.Element](tagName: String, void: Boolean): Tag[Ref] = ???
  }








}
