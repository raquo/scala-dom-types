package com.raquo.domtypes.defs.complex

import com.raquo.domtypes.common.{ComplexKeyDef, HtmlTagType, SvgTagType}

object ComplexKeys {

  val defs: List[ComplexKeyDef] = List(

    // #nc we need to define a `cls` alias for `className`
    //  - and for SVG too!
    //  - and type / tpe / typ!
    //  - How?

    ComplexKeyDef(
      tagType = HtmlTagType,
      scalaName = "className",
      domAttrName = "class",
      domPropName = Some("className"),
      commentLines = List(
        "This attribute is a space-separated list of the classes of the element.",
        "Classes allows CSS and Javascript to select and access specific elements",
        "via the class selectors or functions like the DOM method",
        "document.getElementsByClassName.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/className"
      ),
    ),

    ComplexKeyDef(
      tagType = SvgTagType,
      scalaName = "className",
      domAttrName = "class",
      domPropName = Some("className"),
      commentLines = List(
        "This attribute is a space-separated list of the classes of the element.",
        "Classes allows CSS and Javascript to select and access specific elements",
        "via the class selectors or functions like the DOM method",
        "document.getElementsByClassName.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/class"
      ),
    ),

    ComplexKeyDef(
      tagType = HtmlTagType,
      scalaName = "rel",
      domAttrName = "rel",
      domPropName = Some("rel"),
      commentLines = List(
        "This attribute names a relationship of the linked document to the current",
        "document. The attribute must be a space-separated list of the link types",
        "values. The most common use of this attribute is to specify a link to an",
        "external style sheet: the rel attribute is set to stylesheet, and the href",
        "attribute is set to the URL of an external style sheet to format the page.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/rel"
      ),
    ),

    ComplexKeyDef(
      tagType = HtmlTagType,
      scalaName = "role",
      domAttrName = "role",
      domPropName = Some("role"),
      commentLines = List(
        "The attribute describes the role(s) the current element plays in the",
        "context of the document. This can be used, for example,",
        "by applications and assistive technologies to determine the purpose of",
        "an element. This could allow a user to make informed decisions on which",
        "actions may be taken on an element and activate the selected action in a",
        "device independent way. It could also be used as a mechanism for",
        "annotating portions of a document in a domain specific way (e.g.,",
        "a legal term taxonomy). Although the role attribute may be used to add",
        "semantics to an element, authors should use elements with inherent",
        "semantics, such as p, rather than layering semantics on semantically",
        "neutral elements, such as div role=\"paragraph\".",
      ),
      docUrls = List(
        "http://www.w3.org/TR/role-attribute/#s_role_module_attributes"
      ),
    ),

    ComplexKeyDef(
      tagType = HtmlTagType,
      scalaName = "styleAttr",
      domAttrName = "style",
      domPropName = None,
      commentLines = List(
        "This attribute contains CSS styling declarations to be applied to the",
        "element. Note that it is recommended for styles to be defined in a separate",
        "file or files. This attribute and the style element have mainly the",
        "purpose of allowing for quick styling, for example for testing purposes.",
      ),
      docUrls = List(
      ),
    ),

  )

}
