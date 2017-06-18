package com.raquo.dombuilder.jsdom

import com.raquo.dombuilder.generic.definitions.eventProps.{ClipboardEventProps, ErrorEventProps, FormEventProps, KeyboardEventProps, MouseEventProps}
import com.raquo.dombuilder.generic.definitions.tags._
import com.raquo.dombuilder.generic.simple.SharedSimple
import com.raquo.dombuilder.jsdom.builders.StyleBuilder
import com.raquo.dombuilder.jsdom.definitions.styles.{Styles, Styles2}
import com.raquo.dombuilder.jsdom.keys.EventProp
import com.raquo.dombuilder.jsdom.nodes.ChildNode
import com.raquo.dombuilder.jsdom.simple.builders.{SimpleEventBuilder, SimpleTag, SimpleTagBuilder}
import com.raquo.dombuilder.jsdom.simple.nodes.{SimpleElement, SimpleRoot, SimpleText}
import org.scalajs.dom

package object simple extends SharedSimple {

  type SimpleHtmlElement = SimpleElement[dom.html.Element]

  object events
    extends MouseEventProps[EventProp, dom.Event, dom.MouseEvent]
    with FormEventProps[EventProp, dom.Event]
    with KeyboardEventProps[EventProp, dom.Event, dom.KeyboardEvent]
    with ClipboardEventProps[EventProp, dom.Event]
    with ErrorEventProps[EventProp, dom.Event, dom.ErrorEvent]
    with SimpleEventBuilder

  object tags
    extends DocumentTags[SimpleTag, dom.Element, dom.html.Html, dom.html.Head, dom.html.Base, dom.html.Link, dom.html.Meta, dom.html.Script, dom.html.Element]
    with GroupingTags[SimpleTag, dom.Element, dom.html.Paragraph, dom.html.HR, dom.html.Pre, dom.html.Quote, dom.html.OList, dom.html.UList, dom.html.LI, dom.html.DList, dom.html.DT, dom.html.DD, dom.html.Element, dom.html.Div]
    with TextTags[SimpleTag, dom.Element, dom.html.Anchor, dom.html.Element, dom.html.Span, dom.html.BR, dom.html.Mod]
    with FormTags[SimpleTag, dom.Element, dom.html.Form, dom.html.FieldSet, dom.html.Legend, dom.html.Label, dom.html.Input, dom.html.Button, dom.html.Select, dom.html.DataList, dom.html.OptGroup, dom.html.Option, dom.html.TextArea]
    with SectionTags[SimpleTag, dom.Element, dom.html.Body, dom.html.Element, dom.html.Heading]
    with EmbedTags[SimpleTag, dom.Element, dom.html.Image, dom.html.IFrame, dom.html.Embed, dom.html.Object, dom.html.Param, dom.html.Video, dom.html.Audio, dom.html.Source, dom.html.Track, dom.html.Canvas, dom.html.Map, dom.html.Area]
    with TableTags[SimpleTag, dom.Element, dom.html.Table, dom.html.TableCaption, dom.html.TableCol, dom.html.TableSection, dom.html.TableRow, dom.html.TableCell, dom.html.TableHeaderCell]
    with SimpleTagBuilder

  object tags2
    extends MiscTags[SimpleTag, dom.Element, dom.html.Title, dom.html.Style, dom.html.Element, dom.html.Quote, dom.html.Progress, dom.html.Menu]
    with SimpleTagBuilder

  object styles
    extends Styles
    with StyleBuilder

  object styles2
    extends Styles2
    with StyleBuilder

  def mount(
    container: dom.Element,
    child: SimpleRefNode with ChildNode[SimpleRefNode, dom.Element]
  ): SimpleRoot = {
    new SimpleRoot(container, child)
  }

  implicit def textNode(text: String): SimpleText = {
    new SimpleText(text)
  }
}
