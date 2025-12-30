package com.raquo.domtypes.defs.attrs

import com.raquo.domtypes.common.{AnyTagType, AttrDef}

/** These are simple (non-composite) attrs that are defined for all elements types (HTML, SVG, MathML).
  *
  * Note: These are a subset of [[https://developer.mozilla.org/en-US/docs/Web/HTML/Reference/Global_attributes HTML global attrs]],
  *       which are "global" within HTML only.
  *
  * Note: ARIA attrs and data-attrs are also Global, but they're defined in a separate trait.
  *
  * Note: some global attrs such as `style`, `class`, and data-attrs are defined manually
  *       in the consuming UI libraries because their names and definitions are typically
  *       too opinionated to abstract over across multiple UI libraries.
  *       In Laminar, they're called "complex" keys.
  */
object GlobalAttrDefs {

  val defs: List[AttrDef] = List(

    AttrDef(
      tagType = AnyTagType,
      scalaName = "idAttr",
      domName = "id",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None, // #nc it's actually reflected (id prop), but we don't support this here
      commentLines = List(
        "This attribute defines a unique identifier (ID) which must be unique in",
        "the whole document. Its purpose is to identify the element when linking",
        "(using a fragment identifier), scripting, or styling (with CSS).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/id",
      ),
    ),

    AttrDef(
      tagType = AnyTagType,
      scalaName = "tabIndex",
      domName = "tabindex",
      namespace = None,
      scalaValueType = "Int",
      codec = "IntAsString",
      reflectedProp = None, // #nc it's actually reflected (tabIndex prop), but we don't support this here
      commentLines = List(
        "This integer attribute indicates if the element can take input focus (is",
        "focusable), if it should participate to sequential keyboard navigation, and",
        "if so, at what position. It can takes several values:",
        "",
        " - a negative value means that the element should be focusable, but should",
        "   not be reachable via sequential keyboard navigation;",
        " - 0 means that the element should be focusable and reachable via sequential",
        "   keyboard navigation, but its relative order is defined by the platform",
        "   convention;",
        " - a positive value which means should be focusable and reachable via",
        "   sequential keyboard navigation; its relative order is defined by the value",
        "   of the attribute: the sequential follow the increasing number of the",
        "   tabindex. If several elements share the same tabindex, their relative order",
        "   follows their relative position in the document).",
        "",
        "An element with a 0 value, an invalid value, or no tabindex value should be placed after elements with a positive tabindex in the sequential keyboard navigation order.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/tabindex",
      ),
    ),

  )
}
