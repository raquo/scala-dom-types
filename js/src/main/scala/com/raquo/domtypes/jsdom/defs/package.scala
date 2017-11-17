package com.raquo.domtypes.jsdom

import com.raquo.domtypes.generic
import com.raquo.domtypes.jsdom.defs.events.{TypedTargetEvent, PageTransitionEvent}
import org.scalajs.dom

package object defs {

  object eventProps {
    type ClipboardEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.ClipboardEventProps[EP, dom.Event, dom.ClipboardEvent]
    type ErrorEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.ErrorEventProps[EP, dom.Event, dom.ErrorEvent]
    type FormEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.FormEventProps[EP, dom.Event, dom.FocusEvent, dom.Event, TypedTargetEvent[dom.html.Element], TypedTargetEvent[dom.html.Form], TypedTargetEvent[dom.html.Input]]
    type KeyboardEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.KeyboardEventProps[EP, dom.Event, dom.KeyboardEvent]
    type MediaEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.MediaEventProps[EP, dom.Event]
    type MiscellaneousEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.MiscellaneousEventProps[EP, dom.Event, dom.UIEvent]
    type MouseEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.MouseEventProps[EP, dom.Event, dom.MouseEvent, dom.DragEvent, TypedTargetEvent[dom.html.Element]]
    type WindowEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.WindowEventProps[EP, dom.Event, dom.UIEvent, dom.BeforeUnloadEvent, dom.HashChangeEvent, dom.MessageEvent, PageTransitionEvent, dom.PopStateEvent, dom.StorageEvent]

    trait EventPropsInGlobal[EP[_ <: dom.Event]] extends ErrorEventProps[EP] with FormEventProps[EP] with KeyboardEventProps[EP] with MediaEventProps[EP] with MiscellaneousEventProps[EP] with MouseEventProps[EP] { this: generic.builders.EventPropBuilder[EP, dom.Event] => }
    trait EventPropsInWindow[EP[_ <: dom.Event]] extends EventPropsInGlobal[EP] with WindowEventProps[EP] { this: generic.builders.EventPropBuilder[EP, dom.Event] => }
    trait EventPropsInDocument[EP[_ <: dom.Event]] extends EventPropsInGlobal[EP] with ClipboardEventProps[EP] { this: generic.builders.EventPropBuilder[EP, dom.Event] => }
    trait EventPropsInElement[EP[_ <: dom.Event]] extends EventPropsInGlobal[EP] { this: generic.builders.EventPropBuilder[EP, dom.Event] => }
    trait EventPropsInHTMLElement[EP[_ <: dom.Event]] extends EventPropsInGlobal[EP] with ClipboardEventProps[EP] { this: generic.builders.EventPropBuilder[EP, dom.Event] => }
  }

  object tags {
    type DocumentTags[T[_ <: dom.Element]] = generic.defs.tags.DocumentTags[T, dom.Element, dom.html.Html, dom.html.Head, dom.html.Base, dom.html.Link, dom.html.Meta, dom.html.Script, dom.html.Element]
    type GroupingTags[T[_ <: dom.Element]] = generic.defs.tags.GroupingTags[T, dom.Element, dom.html.Paragraph, dom.html.HR, dom.html.Pre, dom.html.Quote, dom.html.OList, dom.html.UList, dom.html.LI, dom.html.DList, dom.html.DT, dom.html.DD, dom.html.Element, dom.html.Div]
    type TextTags[T[_ <: dom.Element]] = generic.defs.tags.TextTags[T, dom.Element, dom.html.Anchor, dom.html.Element, dom.html.Span, dom.html.BR, dom.html.Mod]
    type FormTags[T[_ <: dom.Element]] = generic.defs.tags.FormTags[T, dom.Element, dom.html.Form, dom.html.FieldSet, dom.html.Legend, dom.html.Label, dom.html.Input, dom.html.Button, dom.html.Select, dom.html.DataList, dom.html.OptGroup, dom.html.Option, dom.html.TextArea]
    type SectionTags[T[_ <: dom.Element]] = generic.defs.tags.SectionTags[T, dom.Element, dom.html.Body, dom.html.Element, dom.html.Heading]
    type EmbedTags[T[_ <: dom.Element]] = generic.defs.tags.EmbedTags[T, dom.Element, dom.html.Image, dom.html.IFrame, dom.html.Embed, dom.html.Object, dom.html.Param, dom.html.Video, dom.html.Audio, dom.html.Source, dom.html.Track, dom.html.Canvas, dom.html.Map, dom.html.Area]
    type TableTags[T[_ <: dom.Element]] = generic.defs.tags.TableTags[T, dom.Element, dom.html.Table, dom.html.TableCaption, dom.html.TableCol, dom.html.TableSection, dom.html.TableRow, dom.html.TableCell, dom.html.TableHeaderCell]
    type MiscTags[T[_ <: dom.Element]] = generic.defs.tags.MiscTags[T, dom.Element, dom.html.Title, dom.html.Style, dom.html.Element, dom.html.Quote, dom.html.Progress, dom.html.Menu]
  }

}
