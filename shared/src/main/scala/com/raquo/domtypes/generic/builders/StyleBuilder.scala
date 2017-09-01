package com.raquo.domtypes.generic.builders

import com.raquo.domtypes.generic.keys.Style

/**
  * @tparam SS - Style setter, an class that represents an operation of setting a certain CSS style property to a certain value
  * @tparam SSS - String style setter. Similar to [[SS]], but lets you set a string value to any style
  *               This is an escape hatch that allows CSS props that accept both numbers and strings, such as font-weight,
  *               without requiring | from scala.js (it's not supported on the JVM)
  */
trait StyleBuilder[SS[_], SSS[V]] {

  @inline def build[V](key: String, cssKey: String): Style[V]

  def buildSetter[V](style: Style[V], value: V): SS[V]

  def buildStringSetter[V](style: Style[V], value: String): SSS[V]
}
