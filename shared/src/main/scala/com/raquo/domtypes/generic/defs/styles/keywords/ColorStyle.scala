package com.raquo.domtypes.generic.defs.styles.keywords

import com.raquo.domtypes.generic.builders.StyleStringValueBuilder

trait ColorStyle[T] extends StyleStringValueBuilder[T] {

  /** @see https://developer.mozilla.org/en-US/docs/Web/CSS/color_value/rgb() */
  def rgb(red: Int, green: Int, blue: Int): T =
    buildStringValue(s"rgb($red, $green, $blue)")

  /** @param alpha fraction from 0 to 1 indicating opacity
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/color_value/rgba()
    */
  def rgba(red: Int, green: Int, blue: Int, alpha: Float): T =
    buildStringValue(s"rgba($red, $green, $blue, $alpha)")

  /** @param hue in degrees
    * @param saturation in percent
    * @param lightness in percent
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/color_value/hsl()
    */
  def hsl(hue: Float, saturation: Float, lightness: Float): T =
    buildStringValue(s"hsl($hue, $saturation%, $lightness%)")

  /** @param hue in degrees
    * @param saturation in percent
    * @param lightness in percent
    * @param alpha fraction from 0 to 1 indicating opacity
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/color_value/hsla()
    */
  def hsla(hue: Float, saturation: Float, lightness: Float, alpha: Float): T =
    buildStringValue(s"hsla($hue, $saturation%, $lightness%, $alpha)")



  // -- Some primary colors --

  lazy val black: T = buildStringValue("black")

  lazy val blue: T = buildStringValue("blue")

  lazy val cyan: T = buildStringValue("cyan")

  lazy val gray: T = buildStringValue("gray")

  lazy val green: T = buildStringValue("green")

  lazy val purple: T = buildStringValue("purple")

  lazy val silver: T = buildStringValue("silver")

  lazy val red: T = buildStringValue("red")

  lazy val white: T = buildStringValue("white")

  lazy val yellow: T = buildStringValue("yellow")

}
