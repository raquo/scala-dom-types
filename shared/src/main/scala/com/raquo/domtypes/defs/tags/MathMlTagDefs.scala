package com.raquo.domtypes.defs.attrs

import com.raquo.domtypes.common.{MathMlTagType, TagDef}


object MathMlTagDefs {

  val defs: List[TagDef] = List(

    TagDef(
      tagType = MathMlTagType,
      scalaName = "annotation",
      domName = "annotation",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
      "The <annotation> MathML element is used to include annotations for a MathML expression.",
      ),
      docUrls = List(
      "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/annotation",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "mathTag",
      domName = "math",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "The top-level element in MathML, representing a mathematical expression.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/math",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "merror",
      domName = "merror",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "The <merror> MathML element is used to display an error message in a mathematical expression.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/merror",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "mfrac",
      domName = "mfrac",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "Represents a fraction.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "mi",
      domName = "mi",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "Represents a mathematical identifier, such as a variable name.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mi",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "mmultiscripts",
      domName = "mmultiscripts",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "The <mmultiscripts> MathML element allows the specification of prescripts and postscripts to a base.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mmultiscripts",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "mn",
      domName = "mn",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "Represents a number in a mathematical expression.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mn",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "mo",
      domName = "mo",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "Represents a mathematical operator.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo",
      ),
    ),


    TagDef(
      tagType = MathMlTagType,
      scalaName = "mover",
      domName = "mover",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
      "The <mover> MathML element is used to attach an accent or a limit over an expression. It uses the following syntax: <mover> base overscript </mover>",
      ),
      docUrls = List(
      "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mover",
      ),
    ),


    TagDef(
      tagType = MathMlTagType,
      scalaName = "mphantom",
      domName = "mphantom",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "The <mphantom> MathML element is used to hide its content, while still affecting the layout of the expression.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mphantom",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "mprescripts",
      domName = "mprescripts",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
      "The <mprescripts> MathML element is used to specify prescripts in a <mmultiscripts> element.",
      ),
      docUrls = List(
      "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mprescripts",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "mroot",
      domName = "mroot",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "Represents a root expression with a specified degree.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mroot",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "mrow",
      domName = "mrow",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "The <mrow> MathML element is used to group sub-expressions, representing them horizontally.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mrow",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "ms",
      domName = "ms",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "Represents a string literal.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/ms",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "mspace",
      domName = "mspace",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "The <mspace> MathML element is used to display a blank space, whose size is set by its attributes.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mspace",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "msqrt",
      domName = "msqrt",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "Represents a square root expression.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msqrt",
      ),
    ),


    TagDef(
      tagType = MathMlTagType,
      scalaName = "mstyle",
      domName = "mstyle",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "The <mstyle> MathML element is used to change the style of its contents. It is similar to the <style> element in HTML.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mstyle",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "msub",
      domName = "msub",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "Represents a subscript expression.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msub",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "msubsup",
      domName = "msubsup",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "Represents a base with both a subscript and a superscript.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msubsup",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "msup",
      domName = "msup",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "Represents a superscript expression.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msup",
      ),
    ),


    TagDef(
      tagType = MathMlTagType,
      scalaName = "mtable",
      domName = "mtable",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "The <mtable> MathML element allows you to create tables or matrices. Its children are <mtr> elements (representing rows), each of them having <mtd> elements as its children (representing cells). These elements are similar to <table>, <tr> and <td> elements of HTML.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "mtd",
      domName = "mtd",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "The <mtd> MathML element represents a cell in a table or a matrix. It may only appear in an <mtr> element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtd",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "mtext",
      domName = "mtext",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "Represents text within a mathematical expression.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtext",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "mtr",
      domName = "mtr",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "The <mtr> MathML element represents a row in a table or a matrix. It may only appear in a <mtable> element and its children are <mtd> elements representing cells. This element is similar to the <tr> element of HTML.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtr",
      ),
    ),


    TagDef(
      tagType = MathMlTagType,
      scalaName = "munder",
      domName = "munder",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
      "The <munder> MathML element is used to attach an accent or a limit under an expression. It uses the following syntax: <munder> base underscript </munder>",
      ),
      docUrls = List(
      "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/munder",
      ),
    ),

    TagDef(
      tagType = MathMlTagType,
      scalaName = "munderover",
      domName = "munderover",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
        "The <munder> MathML element is used to attach an accent or a limit under an expression. It uses the following syntax: <munder> base underscript </munder>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/munderover",
      ),
    ),



    TagDef(
      tagType = MathMlTagType,
      scalaName = "semantics",
      domName = "semantics",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.MathMLElement",
      javascriptElementType = "MathMLElement",
      commentLines = List(
      "The <semantics> MathML element is used to annotate a MathML expression with additional information, such as its meaning or its presentation.",
      ),
      docUrls = List(
      "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/semantics",
      ),
    )
  )

  }