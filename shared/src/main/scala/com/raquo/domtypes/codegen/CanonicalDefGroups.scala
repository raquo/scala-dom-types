package com.raquo.domtypes.codegen

import com.raquo.domtypes.common._
import com.raquo.domtypes.defs.attrs._
import com.raquo.domtypes.defs.eventProps._
import com.raquo.domtypes.defs.props.PropDefs
import com.raquo.domtypes.defs.reflectedAttrs.ReflectedHtmlAttrDefs
import com.raquo.domtypes.defs.styles._
import com.raquo.domtypes.defs.tags._

class CanonicalDefGroups {

  val htmlTagsDefGroups: List[(String, List[TagDef])] = List(
    "Document Tags" -> DocumentTagDefs.defs,
    "Embed Tags" -> EmbedTagDefs.defs,
    "Section Tags" -> SectionTagDefs.defs,
    "Text Tags" -> TextTagDefs.defs,
    "Form Tags" -> FormTagDefs.defs,
    "Grouping Tags" -> GroupingTagDefs.defs,
    "Table Tags" -> TableTagDefs.defs,
    "Misc Tags" -> MiscTagDefs.defs,
  )

  val svgTagsDefGroups: List[(String, List[TagDef])] = List(
    "SVG Tags" -> SvgTagDefs.defs,
  )

  val mathMlTagsDefGroups: List[(String, List[TagDef])] = List(
    "MathMl Tags" -> MathMlTagDefs.defs,
  )

  val htmlAttrDefGroups: List[(String, List[AttrDef])] = List(
    "HTML Attrs" -> HtmlAttrDefs.defs
  )

  val svgAttrDefGroups: List[(String, List[AttrDef])] = List(
    "SVG Attrs" -> SvgAttrDefs.defs
  )

  val ariaAttrDefGroups: List[(String, List[AttrDef])] = List(
    "Aria Attrs" -> AriaAttrDefs.defs
  )

  val propDefGroups: List[(String, List[PropDef])] = List(
    "Props" -> PropDefs.defs,
    "Reflected Attributes" -> ReflectedHtmlAttrDefs.defs.map(_.toPropDef)
  )

  val globalEventPropDefGroups: List[(String, List[EventPropDef])] = List(
    "Mouse Events" -> MouseEventPropDefs.defs,
    "Pointer Events" -> PointerEventPropDefs.defs,
    "Touch Events" -> TouchEventPropDefs.defs,
    "Form Events" -> FormEventPropDefs.defs,
    "Keyboard Events" -> KeyboardEventPropDefs.defs,
    "Clipboard Events" -> ClipboardEventPropDefs.defs,
    "Media Events" -> MediaEventPropDefs.defs,
    "Animation Events" -> AnimationEventPropDefs.defs,
    "Misc Events" -> MiscellaneousEventPropDefs.defs,
    "Error Events" -> ErrorEventPropDefs.defs,
  )

  val documentEventPropDefGroups: List[(String, List[EventPropDef])] = List(
    "Document-only Events" -> DocumentOnlyEventPropDefs.defs
  )

  val windowEventPropDefGroups: List[(String, List[EventPropDef])] = List(
    "Window-only Events" -> WindowOnlyEventPropDefs.defs
  )

  val stylePropDefGroups: List[(String, List[StylePropDef])] = List(
    "Style Props" -> StylePropDefs.defs
  )
}
