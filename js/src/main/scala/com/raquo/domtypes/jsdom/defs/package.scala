package com.raquo.domtypes.jsdom

import com.raquo.domtypes.generic
import com.raquo.domtypes.jsdom.defs.events._
import org.scalajs.dom

package object defs {

  object eventProps {

    type ClipboardEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.ClipboardEventProps[dom.Event, EP, dom.Event, dom.ClipboardEvent]

    type ErrorEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.ErrorEventProps[EP, dom.Event, dom.ErrorEvent]

    type FormEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.FormEventProps[
      EP,
      dom.Event,
      TypedTargetFocusEvent[dom.Element],
      dom.Event,
      TypedTargetEvent[dom.Element],
      TypedTargetEvent[dom.html.Element],
      TypedTargetEvent[dom.html.Form],
      TypedTargetEvent[dom.html.Input]
    ]

    type KeyboardEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.KeyboardEventProps[EP, dom.Event, dom.KeyboardEvent]

    type MediaEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.MediaEventProps[EP, dom.Event]

    type MiscellaneousEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.MiscellaneousEventProps[
      EP,
      dom.Event,
      dom.AnimationEvent,
      dom.TransitionEvent,
      dom.UIEvent
    ]

    type MouseEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.MouseEventProps[
      EP,
      dom.Event,
      dom.MouseEvent,
      TypedTargetMouseEvent[dom.Element],
      dom.DragEvent
    ]

    type PointerEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.PointerEventProps[
      EP,
      dom.Event,
      dom.PointerEvent,
      TypedTargetPointerEvent[dom.Element]
    ]

    type WindowOnlyEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.WindowOnlyEventProps[
      EP,
      dom.Event,
      dom.UIEvent,
      dom.BeforeUnloadEvent,
      dom.HashChangeEvent,
      dom.MessageEvent,
      PageTransitionEvent, // @TODO contribute this type to scala-js-dom
      dom.PopStateEvent,
      dom.StorageEvent
    ]

    type DocumentOnlyEventProps[EP[_ <: dom.Event]] = generic.defs.eventProps.DocumentOnlyEventProps[
      EP,
      dom.Event
    ]

    // See this comment thread for examples on how to use the traits below: https://github.com/raquo/scala-dom-types/pull/9#discussion_r151857048

    /** Matches GlobalEventHandlers: https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers */
    trait GlobalEventProps[EP[_ <: dom.Event]]
      extends ErrorEventProps[EP]
      with FormEventProps[EP]
      with KeyboardEventProps[EP]
      with MediaEventProps[EP]
      with MiscellaneousEventProps[EP]
      with MouseEventProps[EP]
      with PointerEventProps[EP] { this: generic.builders.EventPropBuilder[EP, dom.Event] => }

    /** Matches WindowEventHandlers: https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers */
    trait WindowEventProps[EP[_ <: dom.Event]]
      extends GlobalEventProps[EP]
      with WindowOnlyEventProps[EP] { this: generic.builders.EventPropBuilder[EP, dom.Event] => }

    trait DocumentEventProps[EP[_ <: dom.Event]]
      extends GlobalEventProps[EP]
      with DocumentOnlyEventProps[EP]
      with ClipboardEventProps[EP] { this: generic.builders.EventPropBuilder[EP, dom.Event] => }

    trait ElementEventProps[EP[_ <: dom.Event]]
      extends GlobalEventProps[EP] { this: generic.builders.EventPropBuilder[EP, dom.Event] => }

    trait HTMLElementEventProps[EP[_ <: dom.Event]]
      extends ElementEventProps[EP]
      with ClipboardEventProps[EP] { this: generic.builders.EventPropBuilder[EP, dom.Event] => }

  }

  object tags {

    type DocumentTags[T[_ <: dom.html.Element]] = generic.defs.tags.DocumentTags[T, dom.html.Element, dom.html.Html, dom.html.Head, dom.html.Base, dom.html.Link, dom.html.Meta, dom.html.Script, dom.html.Element]

    type GroupingTags[T[_ <: dom.html.Element]] = generic.defs.tags.GroupingTags[T, dom.html.Element, dom.html.Paragraph, dom.html.HR, dom.html.Pre, dom.html.Quote, dom.html.OList, dom.html.UList, dom.html.LI, dom.html.DList, dom.html.Element, dom.html.Div]

    type TextTags[T[_ <: dom.html.Element]] = generic.defs.tags.TextTags[T, dom.html.Element, dom.html.Anchor, dom.html.Element, dom.html.Span, dom.html.BR, dom.html.Mod]

    type FormTags[T[_ <: dom.html.Element]] = generic.defs.tags.FormTags[T, dom.html.Element, dom.html.Form, dom.html.FieldSet, dom.html.Legend, dom.html.Label, dom.html.Input, dom.html.Button, dom.html.Select, dom.html.DataList, dom.html.OptGroup, dom.html.Option, dom.html.TextArea]

    type SectionTags[T[_ <: dom.html.Element]] = generic.defs.tags.SectionTags[T, dom.html.Element, dom.html.Body, dom.html.Element, dom.html.Heading]

    type EmbedTags[T[_ <: dom.html.Element]] = generic.defs.tags.EmbedTags[T, dom.html.Element, dom.html.Image, dom.html.IFrame, dom.html.Embed, dom.html.Object, dom.html.Param, dom.html.Video, dom.html.Audio, dom.html.Source, dom.html.Track, dom.html.Canvas, dom.html.Map, dom.html.Area]

    type TableTags[T[_ <: dom.html.Element]] = generic.defs.tags.TableTags[T, dom.html.Element, dom.html.Table, dom.html.TableCaption, dom.html.TableCol, dom.html.TableSection, dom.html.TableRow, dom.html.TableCell]

    type MiscTags[T[_ <: dom.html.Element]] = generic.defs.tags.MiscTags[T, dom.html.Element, dom.html.Title, dom.html.Style, dom.html.Element, dom.html.Quote, dom.html.Progress, dom.html.Menu]

    type SvgTags[T[_ <: dom.svg.Element]] = generic.defs.tags.SvgTags[
      T,
      dom.svg.Element,
      dom.svg.A,
      dom.svg.Circle,
      dom.svg.ClipPath,
      dom.svg.Defs,
      dom.svg.Desc,
      dom.svg.Ellipse,
      dom.svg.FEBlend,
      dom.svg.FEColorMatrix,
      dom.svg.ComponentTransferFunction,
      dom.svg.FEComposite,
      dom.svg.FEConvolveMatrix,
      dom.svg.FEDiffuseLighting,
      dom.svg.FEDisplacementMap,
      dom.svg.FEDiffuseLighting,
      dom.svg.FEFlood,
      dom.svg.FEFuncA,
      dom.svg.FEFuncB,
      dom.svg.FEFuncG,
      dom.svg.FEFuncR,
      dom.svg.FEGaussianBlur,
      dom.svg.FEImage,
      dom.svg.FEMerge,
      dom.svg.FEMergeNode,
      dom.svg.FEMorphology,
      dom.svg.FEOffset,
      dom.svg.FEPointLight,
      dom.svg.FESpecularLighting,
      dom.svg.FESpecularLighting,
      dom.svg.FETile,
      dom.svg.FETurbulence,
      dom.svg.Filter,
      dom.svg.G,
      dom.svg.Image,
      dom.svg.Line,
      dom.svg.LinearGradient,
      dom.svg.Marker,
      dom.svg.Mask,
      dom.svg.Metadata,
      dom.svg.Path,
      dom.svg.Pattern,
      dom.svg.Polygon,
      dom.svg.Polyline,
      dom.svg.RadialGradient,
      dom.svg.RectElement,
      dom.svg.SVG,
      dom.svg.Stop,
      dom.svg.Switch,
      dom.svg.Symbol,
      dom.svg.Text,
      dom.svg.TextPath,
      dom.svg.TSpan,
      dom.svg.Use,
      dom.svg.View
    ]

  }

}
