package com.raquo.domtypes.codegen

import com.raquo.domtypes.common._
import com.raquo.domtypes.defs.attrs._
import com.raquo.domtypes.defs.eventProps._
import com.raquo.domtypes.defs.props.Props
import com.raquo.domtypes.defs.reflectedAttrs.ReflectedHtmlAttrs
import com.raquo.domtypes.defs.tags._

class CanonicalDefGroups {

  val htmlTagsDefGroups: List[(String, List[TagDef])] = List(
    "Document Tags" -> DocumentTags.defs,
    "Embed Tags" -> EmbedTags.defs,
    "Section Tags" -> SectionTags.defs,
    "Text Tags" -> TextTags.defs,
    "Form Tags" -> FormTags.defs,
    "Grouping Tags" -> GroupingTags.defs,
    "Table Tags" -> TableTags.defs,
    "Misc Tags" -> MiscTags.defs,
  )

  val svgTagsDefGroups: List[(String, List[TagDef])] = List(
    "SVG Tags" -> SvgTags.defs,
  )

  val htmlAttrDefGroups: List[(String, List[AttrDef])] = List(
    "HTML Attrs" -> HtmlAttrs.defs
  )

  val svgAttrDefGroups: List[(String, List[AttrDef])] = List(
    "SVG Attrs" -> SvgAttrs.defs
  )

  val ariaAttrDefGroups: List[(String, List[AttrDef])] = List(
    "Aria Attrs" -> AriaAttrs.defs
  )

  val propDefGroups: List[(String, List[PropDef])] = List(
    "Props" -> Props.defs,
    "Reflected Attributes" -> ReflectedHtmlAttrs.defs.map(_.toPropDef)
  )

  val eventPropDefGroups: List[(String, List[EventPropDef])] = List(
    "Mouse Events" -> MouseEventProps.defs,
    "Pointer Events" -> PointerEventProps.defs,
    "Form Events" -> FormEventProps.defs,
    "Keyboard Events" -> KeyboardEventProps.defs,
    "Clipboard Events" -> ClipboardEventProps.defs,
    "Media Events" -> MediaEventProps.defs,
    "Misc Events" -> MiscellaneousEventProps.defs,
    "Document-only Events" -> DocumentOnlyEventProps.defs,
    "Window-only Events" -> WindowOnlyEventProps.defs,
    "Error Events" -> ErrorEventProps.defs,
  )
}
