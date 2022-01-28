package com.raquo.domtypes.generic.defs.styles.units

trait LengthUnits[T[_], Num] extends CalcUnits[T] {


  // -- Most common units --

  /** Pixels */
  lazy val px: T[Num] = derivedStyle(n => s"${n}px")

  /** 1 pt is 4/3 of a pixel. */
  lazy val pt: T[Num] = derivedStyle(n => s"${n}pt")

  lazy val percent: T[Num] = derivedStyle(n => s"${n}%")




  // -- Font-relative lengths --

  /**
    * `em` represents the calculated font-size of the element. If used on the
    * font-size property itself, it represents the inherited font-size of the
    * element.  --MDN
    */
  lazy val em: T[Num] = derivedStyle(n => s"${n}em")

  /**
    * `rem` represents the font-size of the root element (typically <html>).
    * When used within the root element font-size, it represents its initial
    * value (a common browser default is 16px, but user-defined preferences
    * may modify this).  --MDN
    */
  lazy val rem: T[Num] = derivedStyle(n => s"${n}rem")

  /**
    * `ch` represents the width, or more precisely the advance measure, of the
    * glyph "0" (zero, the Unicode character U+0030) in the element's font.  --MDN
    */
  lazy val ch: T[Num] = derivedStyle(n => s"${n}ch")




  // -- Viewport-percentage lengths --

  /** 1 vh is equal to 1% of the height of the viewport's initial containing block  --MDN */
  lazy val vh: T[Num] = derivedStyle(n => s"${n}vh")

  /** 1 vw is equal to 1% of the width of the viewport's initial containing block  --MDN */
  lazy val vw: T[Num] = derivedStyle(n => s"${n}vw")

  /** 1 vmax is equal to the larger of 1 vw and 1 vh  --MDN */
  lazy val vmax: T[Num] = derivedStyle(n => s"${n}vmax")

  /** 1 vmin is equal to the smaller of 1 vw and 1 vh  --MDN */
  lazy val vmin: T[Num] = derivedStyle(n => s"${n}vmin")

}
