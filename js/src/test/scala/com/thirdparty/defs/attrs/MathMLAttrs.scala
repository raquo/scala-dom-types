package com.thirdparty.defs.attrs

import com.thirdparty.keys.MathMLAttr
import com.thirdparty.codecs._

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait MathMLAttrs {


  def mathMLAttr[V](name: String, codec: Codec[V, String]): MathMLAttr[V] = new MathMLAttr(name, codec)


  @inline protected def boolAsPresenceMathMLAttr(name: String): MathMLAttr[Boolean] = mathMLAttr(name, BooleanAsAttrPresenceCodec)

  @inline protected def intMathMLAttr(name: String): MathMLAttr[Int] = mathMLAttr(name, IntAsStringCodec)

  @inline protected def stringMathMLAttr(name: String): MathMLAttr[String] = mathMLAttr(name, StringAsIsCodec)



  /**
    * A Boolean indicating whether the operator should be treated as an accent
    * when used as an under- or over-script.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#accent mo#accent @ MDN]]
    */
  lazy val accent: MathMLAttr[Boolean] = boolAsPresenceMathMLAttr("accent")


  /**
    * A Boolean indicating whether the under script should be treated as an accent.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/munder#accentunder munder#accentunder @ MDN]]
    */
  lazy val accentunder: MathMLAttr[Boolean] = boolAsPresenceMathMLAttr("accentunder")


  /**
    * Specifies vertical alignment of the table with respect to its environment.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#align mtable#align @ MDN]]
    */
  lazy val align: MathMLAttr[String] = stringMathMLAttr("align")


  /**
    * Specifies the horizontal alignment of table cells.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#columnalign mtable#columnalign @ MDN]]
    */
  lazy val columnalign: MathMLAttr[String] = stringMathMLAttr("columnalign")


  /**
    * Specifies table column borders.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#columnlines mtable#columnlines @ MDN]]
    */
  lazy val columnlines: MathMLAttr[String] = stringMathMLAttr("columnlines")


  /**
    * Specifies the space between table columns.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#columnspacing mtable#columnspacing @ MDN]]
    */
  lazy val columnspacing: MathMLAttr[String] = stringMathMLAttr("columnspacing")


  /**
    * A non-negative integer value that indicates over how many table columns the cell extends.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtd#columnspan mtd#columnspan @ MDN]]
    */
  lazy val columnspan: MathMLAttr[Int] = intMathMLAttr("columnspan")


  /**
    * A length-percentage indicating the desired depth (below the baseline).
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mpadded#depth mpadded#depth @ MDN]]
    */
  lazy val depth: MathMLAttr[String] = stringMathMLAttr("depth")


  /**
    * The text direction. Possible values are either ltr (left to right) or rtl (right to left).
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/dir dir @ MDN]]
    */
  lazy val dir: MathMLAttr[String] = stringMathMLAttr("dir")


  /**
    * Specifies the rendering mode. The values block and inline are allowed.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/math#display math#display @ MDN]]
    */
  lazy val display: MathMLAttr[String] = stringMathMLAttr("display")


  /**
    * A Boolean specifying whether to set the math-style to normal (if true) or compact (otherwise).
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/displaystyle displaystyle @ MDN]]
    */
  lazy val displaystyle: MathMLAttr[Boolean] = boolAsPresenceMathMLAttr("displaystyle")


  /**
    * A Boolean specifying whether the operator is a fence (such as parentheses).
    * There is no visual effect for this attribute.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#fence mo#fence @ MDN]]
    */
  lazy val fence: MathMLAttr[Boolean] = boolAsPresenceMathMLAttr("fence")


  /**
    * Specifies borders of an entire mtable. Possible values are: none (default), solid and dashed.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#frame mtable#frame @ MDN]]
    */
  lazy val frame: MathMLAttr[String] = stringMathMLAttr("frame")


  /**
    * Specifies additional space added between the table and frame.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#framespacing mtable#framespacing @ MDN]]
    */
  lazy val framespacing: MathMLAttr[String] = stringMathMLAttr("framespacing")


  /**
    * A length-percentage indicating the desired height (above the baseline).
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mpadded#height mpadded#height @ MDN]]
    */
  lazy val height: MathMLAttr[String] = stringMathMLAttr("height")


  /**
    * Used to set a hyperlink to a specified URI.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/href href @ MDN]]
    */
  lazy val href: MathMLAttr[String] = stringMathMLAttr("href")


  /**
    * Sets up a unique identifier associated with the element.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/id id @ MDN]]
    */
  lazy val id: MathMLAttr[String] = stringMathMLAttr("id")


  /**
    * A length-percentage indicating the thickness of the horizontal fraction line.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac#linethickness mfrac#linethickness @ MDN]]
    */
  lazy val linethickness: MathMLAttr[String] = stringMathMLAttr("linethickness")


  /**
    * A length-percentage indicating amount of space before the operator.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#lspace mo#lspace @ MDN]]
    */
  lazy val lspace: MathMLAttr[String] = stringMathMLAttr("lspace")


  /**
    * A background-color for the element.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathbackground mathbackground @ MDN]]
    */
  lazy val mathbackground: MathMLAttr[String] = stringMathMLAttr("mathbackground")


  /**
    * A color for the element.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathcolor mathcolor @ MDN]]
    */
  lazy val mathcolor: MathMLAttr[String] = stringMathMLAttr("mathcolor")


  /**
    * A length-percentage used as a font-size for the element.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathsize mathsize @ MDN]]
    */
  lazy val mathsize: MathMLAttr[String] = stringMathMLAttr("mathsize")


  /**
    * The logical class of token elements, which varies in typography.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathvariant mathvariant @ MDN]]
    */
  lazy val mathvariant: MathMLAttr[String] = stringMathMLAttr("mathvariant")


  /**
    * A length-percentage indicating the maximum size of the operator when it is stretchy.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#maxsize mo#maxsize @ MDN]]
    */
  lazy val maxsize: MathMLAttr[String] = stringMathMLAttr("maxsize")


  /**
    * A length-percentage indicating the minimum size of the operator when it is stretchy.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#minsize mo#minsize @ MDN]]
    */
  lazy val minsize: MathMLAttr[String] = stringMathMLAttr("minsize")


  /**
    * A Boolean indicating whether attached under- and overscripts move to sub-
    * and superscript positions when math-style is set to compact.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#movablelimits mo#movablelimits @ MDN]]
    */
  lazy val movablelimits: MathMLAttr[Boolean] = boolAsPresenceMathMLAttr("movablelimits")


  /**
    * A list of notations, separated by white space, to apply to the child elements.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/menclose#notation menclose#notation @ MDN]]
    */
  lazy val notation: MathMLAttr[String] = stringMathMLAttr("notation")


  /**
    * Specifies the vertical alignment of table cells.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#rowalign mtable#rowalign @ MDN]]
    */
  lazy val rowalign: MathMLAttr[String] = stringMathMLAttr("rowalign")


  /**
    * Specifies table row borders.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#rowlines mtable#rowlines @ MDN]]
    */
  lazy val rowlines: MathMLAttr[String] = stringMathMLAttr("rowlines")


  /**
    * Specifies the space between table rows.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#rowspacing mtable#rowspacing @ MDN]]
    */
  lazy val rowspacing: MathMLAttr[String] = stringMathMLAttr("rowspacing")


  /**
    * A non-negative integer value that indicates on how many rows does the cell extend.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtd#rowspan mtd#rowspan @ MDN]]
    */
  lazy val rowspan: MathMLAttr[Int] = intMathMLAttr("rowspan")


  /**
    * A length-percentage indicating the amount of space after the operator.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#rspace mo#rspace @ MDN]]
    */
  lazy val rspace: MathMLAttr[String] = stringMathMLAttr("rspace")


  /**
    * Specifies a math-depth for the element. See the scriptlevel page for accepted values and mapping.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/scriptlevel scriptlevel @ MDN]]
    */
  lazy val scriptlevel: MathMLAttr[Int] = intMathMLAttr("scriptlevel")


  /**
    * A Boolean specifying whether the operator is a separator (such as commas).
    * There is no visual effect for this attribute.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#separator mo#separator @ MDN]]
    */
  lazy val separator: MathMLAttr[Boolean] = boolAsPresenceMathMLAttr("separator")


  /**
    * A Boolean indicating whether the operator stretches to the size of the adjacent element.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#stretchy mo#stretchy @ MDN]]
    */
  lazy val stretchy: MathMLAttr[Boolean] = boolAsPresenceMathMLAttr("stretchy")


  /**
    * A Boolean indicating whether a stretchy operator should be vertically symmetric
    * around the imaginary math axis (centered fraction line).
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#symmetric mo#symmetric @ MDN]]
    */
  lazy val symmetric: MathMLAttr[Boolean] = boolAsPresenceMathMLAttr("symmetric")


  /**
    * A length-percentage indicating the vertical location of the positioning point
    * of the child content with respect to the positioning point of the element.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mpadded#voffset mpadded#voffset @ MDN]]
    */
  lazy val voffset: MathMLAttr[String] = stringMathMLAttr("voffset")


  /**
    * A length-percentage indicating the desired width.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mpadded#width mpadded#width @ MDN]]
    */
  lazy val width: MathMLAttr[String] = stringMathMLAttr("width")


  /**
    * Specifies the URI for the MathML namespace (http://www.w3.org/1998/Math/MathML).
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/math#xmlns math#xmlns @ MDN]]
    */
  lazy val xmlns: MathMLAttr[String] = stringMathMLAttr("xmlns")


}
