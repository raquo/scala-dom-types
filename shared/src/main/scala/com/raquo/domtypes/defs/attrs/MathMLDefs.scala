package com.raquo.domtypes.defs.attrs

import com.raquo.domtypes.common.{AttrDef, MathMlTagType}

object MathMLDefs {
  
  val defs: List[AttrDef] = List(

    // Alphabetical order following MDN MathML Reference Attribute table
    // https://developer.mozilla.org/en-US/docs/Web/MathML/Reference/Attribute

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "accent",
      domName = "accent",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsAttrPresence",
      commentLines = List(
        "A Boolean indicating whether the operator should be treated as an accent",
        "when used as an under- or over-script.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#accent",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "accentunder",
      domName = "accentunder",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsAttrPresence",
      commentLines = List(
        "A Boolean indicating whether the under script should be treated as an accent.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/munder#accentunder",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "align",
      domName = "align",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Specifies vertical alignment of the table with respect to its environment.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#align",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "columnalign",
      domName = "columnalign",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Specifies the horizontal alignment of table cells.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#columnalign",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "columnlines",
      domName = "columnlines",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Specifies table column borders.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#columnlines",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "columnspacing",
      domName = "columnspacing",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Specifies the space between table columns.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#columnspacing",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "columnspan",
      domName = "columnspan",
      namespace = None,
      scalaValueType = "Int",
      codec = "IntAsString",
      commentLines = List(
        "A non-negative integer value that indicates over how many table columns the cell extends.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtd#columnspan",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "depth",
      domName = "depth",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "A length-percentage indicating the desired depth (below the baseline).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mpadded#depth",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "dir",
      domName = "dir",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "The text direction. Possible values are either ltr (left to right) or rtl (right to left).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/dir",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "display",
      domName = "display",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Specifies the rendering mode. The values block and inline are allowed.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/math#display",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "displaystyle",
      domName = "displaystyle",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsAttrPresence",
      commentLines = List(
        "A Boolean specifying whether to set the math-style to normal (if true) or compact (otherwise).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/displaystyle",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "fence",
      domName = "fence",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsAttrPresence",
      commentLines = List(
        "A Boolean specifying whether the operator is a fence (such as parentheses).",
        "There is no visual effect for this attribute.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#fence",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "frame",
      domName = "frame",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Specifies borders of an entire mtable. Possible values are: none (default), solid and dashed.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#frame",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "framespacing",
      domName = "framespacing",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Specifies additional space added between the table and frame.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#framespacing",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "height",
      domName = "height",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "A length-percentage indicating the desired height (above the baseline).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mpadded#height",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "href",
      domName = "href",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Used to set a hyperlink to a specified URI.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/href",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "id",
      domName = "id",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Sets up a unique identifier associated with the element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/id",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "linethickness",
      domName = "linethickness",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "A length-percentage indicating the thickness of the horizontal fraction line.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac#linethickness",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "lspace",
      domName = "lspace",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "A length-percentage indicating amount of space before the operator.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#lspace",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "mathbackground",
      domName = "mathbackground",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "A background-color for the element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathbackground",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "mathcolor",
      domName = "mathcolor",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "A color for the element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathcolor",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "mathsize",
      domName = "mathsize",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "A length-percentage used as a font-size for the element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathsize",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "mathvariant",
      domName = "mathvariant",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "The logical class of token elements, which varies in typography.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathvariant",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "maxsize",
      domName = "maxsize",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "A length-percentage indicating the maximum size of the operator when it is stretchy.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#maxsize",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "minsize",
      domName = "minsize",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "A length-percentage indicating the minimum size of the operator when it is stretchy.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#minsize",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "movablelimits",
      domName = "movablelimits",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsAttrPresence",
      commentLines = List(
        "A Boolean indicating whether attached under- and overscripts move to sub-",
        "and superscript positions when math-style is set to compact.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#movablelimits",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "notation",
      domName = "notation",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "A list of notations, separated by white space, to apply to the child elements.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/menclose#notation",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "rowalign",
      domName = "rowalign",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Specifies the vertical alignment of table cells.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#rowalign",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "rowlines",
      domName = "rowlines",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Specifies table row borders.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#rowlines",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "rowspacing",
      domName = "rowspacing",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Specifies the space between table rows.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#rowspacing",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "rowspan",
      domName = "rowspan",
      namespace = None,
      scalaValueType = "Int",
      codec = "IntAsString",
      commentLines = List(
        "A non-negative integer value that indicates on how many rows does the cell extend.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtd#rowspan",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "rspace",
      domName = "rspace",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "A length-percentage indicating the amount of space after the operator.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#rspace",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "scriptlevel",
      domName = "scriptlevel",
      namespace = None,
      scalaValueType = "Int",
      codec = "IntAsString",
      commentLines = List(
        "Specifies a math-depth for the element. See the scriptlevel page for accepted values and mapping.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/scriptlevel",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "separator",
      domName = "separator",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsAttrPresence",
      commentLines = List(
        "A Boolean specifying whether the operator is a separator (such as commas).",
        "There is no visual effect for this attribute.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#separator",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "stretchy",
      domName = "stretchy",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsAttrPresence",
      commentLines = List(
        "A Boolean indicating whether the operator stretches to the size of the adjacent element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#stretchy",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "symmetric",
      domName = "symmetric",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsAttrPresence",
      commentLines = List(
        "A Boolean indicating whether a stretchy operator should be vertically symmetric",
        "around the imaginary math axis (centered fraction line).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#symmetric",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "voffset",
      domName = "voffset",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "A length-percentage indicating the vertical location of the positioning point",
        "of the child content with respect to the positioning point of the element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mpadded#voffset",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "width",
      domName = "width",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "A length-percentage indicating the desired width.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mpadded#width",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "xmlns",
      domName = "xmlns",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Specifies the URI for the MathML namespace (http://www.w3.org/1998/Math/MathML).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/math#xmlns",
      ),
    ),

  )
  
}