package com.raquo.domtypes.defs.attrs

import com.raquo.domtypes.common.{AttrDef, MathMlTagType}

object MathMLDefs {
  
  val defs: List[AttrDef] = List(
    
    AttrDef(
      tagType = MathMlTagType,
      scalaName = "display",
      domName = "display",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "This enumerated attribute specifies how the enclosed MathML markup should be rendered.",
        "It can have one of the following values:",
        "- block, which means that this element will be displayed in its own block outside the current span of text",
        "- inline, which means that this element will be displayed inside the current span of text",
        "",
        "If not present, its default value is inline.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/display",
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
        "This attribute specifies the logical class of the identifier, which varies",
        "in typography. That is, although the names suggest the typographic style for",
        "the class, semantically, items with the same class are treated \"the same\"",
        "within an expression, which might or might not involve displaying them with",
        "the same typography.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathvariant",
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
        "This attribute specifies the size of the content. Possible values are:",
        "- small: The content is rendered smaller than the surrounding text.",
        "- normal: The content is rendered at the same size as the surrounding text.",
        "- big: The content is rendered larger than the surrounding text.",
        "- A length value like '12pt', '2em', etc.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathsize",
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
        "This attribute sets the text color and also the fraction line color.",
        "You can use named colors or RGB format like #rgb, #rrggbb and CSS color names.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathcolor",
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
        "This attribute sets the background color. You can use named colors",
        "or RGB format like #rgb, #rrggbb and CSS color names.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathbackground",
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
        "This Boolean attribute specifies whether more vertical space is used",
        "for displayed equations or, if set to false, a more compact layout",
        "is used to display formulas.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/displaystyle",
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
        "This attribute specifies a scriptlevel for the element. Larger values",
        "mean smaller font sizes. The scriptlevel is used to control the font size",
        "in a context-dependent way.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/scriptlevel",
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
        "This attribute specifies the thickness of the horizontal fraction line.",
        "Possible values: a length value like '2px', 'thin', 'medium', 'thick', or 0 for no line.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac#linethickness",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "numalign",
      domName = "numalign",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "This attribute specifies the alignment of the numerator over the fraction line.",
        "Possible values are: left, center (default), and right.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac#numalign",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "denomalign",
      domName = "denomalign",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "This attribute specifies the alignment of the denominator under the fraction line.",
        "Possible values are: left, center (default), and right.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac#denomalign",
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
        "This Boolean attribute specifies whether the operator is a separator",
        "(such as commas). There is no visual effect for this attribute.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#separator",
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
        "This Boolean attribute specifies whether the operator is a fence",
        "(such as parentheses). There is no visual effect for this attribute.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#fence",
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
        "This Boolean attribute specifies whether the operator stretches to the",
        "size of the adjacent element.",
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
        "This Boolean attribute specifies whether a stretchy operator should be",
        "vertically symmetric around the imaginary math axis (centered fraction line).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#symmetric",
      ),
    ),

    AttrDef(
      tagType = MathMlTagType,
      scalaName = "largeop",
      domName = "largeop",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsAttrPresence",
      commentLines = List(
        "This Boolean attribute specifies whether the operator should be drawn larger",
        "than normal when displaystyle is true.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#largeop",
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
        "This Boolean attribute specifies whether attached under- and overscripts",
        "move to sub- and superscript positions when displaystyle is false.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#movablelimits",
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
        "This attribute specifies the amount of space before the operator.",
        "Values can be length values or named space constants like 'thickmathspace'.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#lspace",
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
        "This attribute specifies the amount of space after the operator.",
        "Values can be length values or named space constants like 'thickmathspace'.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#rspace",
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
        "This attribute specifies the desired width. See length for possible values.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mspace#width",
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
        "This attribute specifies the desired height above the baseline.",
        "See length for possible values.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mspace#height",
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
        "This attribute specifies the desired depth below the baseline.",
        "See length for possible values.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mspace#depth",
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
        "The xmlns attribute specifies the XML namespace for the MathML element.",
        "For MathML, this should typically be 'http://www.w3.org/1998/Math/MathML'.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/math#xmlns",
      ),
    ),

  )
  
}