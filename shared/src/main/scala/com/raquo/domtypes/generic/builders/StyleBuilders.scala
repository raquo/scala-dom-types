package com.raquo.domtypes.generic.builders

import com.raquo.domtypes.generic.keys.Style

/**
  * This trait contains functionality for creating Styles and Style Setters.
  *
  * If extending or instantiating this trait, you will need to override implicit defs.
  * See the SimpleStyleBuilder trait in Scala DOM Builder project for an example of that.
  *
  * @tparam StyleSetter – represents an operation of setting a certain CSS style property to a certain value. Often a subtype of [[com.raquo.domtypes.generic.Modifier]]
  */
trait StyleBuilders[StyleSetter] {

  @inline protected def style[V](key: String): Style[V] = new Style(name = key)

  @inline protected def buildIntStyleSetter(style: Style[Int], value: Int): StyleSetter

  @inline protected def buildDoubleStyleSetter(style: Style[Double], value: Double): StyleSetter

  /**
    * Pretty much every CSS Style can be set to some string like "auto" or "inherit", so we provide this
    * as an escape hatch for all Style[_] objects even if they typically contain Int or Double values.
    *
    * We do not want to use Scala.js' `|` type operator because it is not supported on the JVM.
    */
  @inline protected def buildStringStyleSetter(style: Style[_], value: String): StyleSetter
}
