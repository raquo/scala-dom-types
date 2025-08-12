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
    * This enumerated attribute specifies how the enclosed MathML markup should be rendered.
    * It can have one of the following values:
    * - block, which means that this element will be displayed in its own block outside the current span of text
    * - inline, which means that this element will be displayed inside the current span of text
    * 
    * If not present, its default value is inline.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Reference/Attribute Attribute @ MDN]]
    */
  lazy val display: MathMLAttr[String] = stringMathMLAttr("display")


  /**
    * This attribute specifies the logical class of the identifier, which varies
    * in typography. That is, although the names suggest the typographic style for
    * the class, semantically, items with the same class are treated "the same"
    * within an expression, which might or might not involve displaying them with
    * the same typography.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Reference/Attribute Attribute @ MDN]]
    */
  lazy val mathvariant: MathMLAttr[String] = stringMathMLAttr("mathvariant")


  /**
    * This Boolean attribute specifies whether more vertical space is used
    * for displayed equations or, if set to false, a more compact layout
    * is used to display formulas.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/displaystyle displaystyle @ MDN]]
    */
  lazy val displaystyle: MathMLAttr[Boolean] = boolAsPresenceMathMLAttr("displaystyle")


  /**
    * This attribute specifies a scriptlevel for the element. Larger values
    * mean smaller font sizes. The scriptlevel is used to control the font size
    * in a context-dependent way.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/scriptlevel scriptlevel @ MDN]]
    */
  lazy val scriptlevel: MathMLAttr[Int] = intMathMLAttr("scriptlevel")


  /**
    * This attribute specifies the thickness of the horizontal fraction line.
    * Possible values: a length value like '2px', 'thin', 'medium', 'thick', or 0 for no line.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac#linethickness mfrac#linethickness @ MDN]]
    */
  lazy val linethickness: MathMLAttr[String] = stringMathMLAttr("linethickness")


  /**
    * This attribute specifies the alignment of the numerator over the fraction line.
    * Possible values are: left, center (default), and right.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac#numalign mfrac#numalign @ MDN]]
    */
  lazy val numalign: MathMLAttr[String] = stringMathMLAttr("numalign")


  /**
    * This attribute specifies the alignment of the denominator under the fraction line.
    * Possible values are: left, center (default), and right.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac#denomalign mfrac#denomalign @ MDN]]
    */
  lazy val denomalign: MathMLAttr[String] = stringMathMLAttr("denomalign")


  /**
    * This Boolean attribute specifies whether the operator is a separator
    * (such as commas). There is no visual effect for this attribute.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#separator mo#separator @ MDN]]
    */
  lazy val separator: MathMLAttr[Boolean] = boolAsPresenceMathMLAttr("separator")


  /**
    * This Boolean attribute specifies whether the operator is a fence
    * (such as parentheses). There is no visual effect for this attribute.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#fence mo#fence @ MDN]]
    */
  lazy val fence: MathMLAttr[Boolean] = boolAsPresenceMathMLAttr("fence")


  /**
    * This Boolean attribute specifies whether the operator stretches to the
    * size of the adjacent element.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#stretchy mo#stretchy @ MDN]]
    */
  lazy val stretchy: MathMLAttr[Boolean] = boolAsPresenceMathMLAttr("stretchy")


  /**
    * This Boolean attribute specifies whether a stretchy operator should be
    * vertically symmetric around the imaginary math axis (centered fraction line).
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#symmetric mo#symmetric @ MDN]]
    */
  lazy val symmetric: MathMLAttr[Boolean] = boolAsPresenceMathMLAttr("symmetric")


  /**
    * This Boolean attribute specifies whether the operator should be drawn larger
    * than normal when displaystyle is true.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#largeop mo#largeop @ MDN]]
    */
  lazy val largeop: MathMLAttr[Boolean] = boolAsPresenceMathMLAttr("largeop")


  /**
    * This Boolean attribute specifies whether attached under- and overscripts
    * move to sub- and superscript positions when displaystyle is false.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#movablelimits mo#movablelimits @ MDN]]
    */
  lazy val movablelimits: MathMLAttr[Boolean] = boolAsPresenceMathMLAttr("movablelimits")


  /**
    * This attribute specifies the amount of space before the operator.
    * Values can be length values or named space constants like 'thickmathspace'.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#lspace mo#lspace @ MDN]]
    */
  lazy val lspace: MathMLAttr[String] = stringMathMLAttr("lspace")


  /**
    * This attribute specifies the amount of space after the operator.
    * Values can be length values or named space constants like 'thickmathspace'.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#rspace mo#rspace @ MDN]]
    */
  lazy val rspace: MathMLAttr[String] = stringMathMLAttr("rspace")


  /**
    * This attribute specifies the desired width. See length for possible values.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mspace#width mspace#width @ MDN]]
    */
  lazy val width: MathMLAttr[String] = stringMathMLAttr("width")


  /**
    * This attribute specifies the desired height above the baseline.
    * See length for possible values.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mspace#height mspace#height @ MDN]]
    */
  lazy val height: MathMLAttr[String] = stringMathMLAttr("height")


  /**
    * This attribute specifies the desired depth below the baseline.
    * See length for possible values.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mspace#depth mspace#depth @ MDN]]
    */
  lazy val depth: MathMLAttr[String] = stringMathMLAttr("depth")


  /**
    * The xmlns attribute specifies the XML namespace for the MathML element.
    * For MathML, this should typically be 'http://www.w3.org/1998/Math/MathML'.
    * 
    * [[https://www.w3schools.com/tags/att_html_xmlns.asp]]
    */
  lazy val xmlns: MathMLAttr[String] = stringMathMLAttr("xmlns")


}
