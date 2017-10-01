package com.raquo.domtypes.generic.nodes

trait Element extends Node {

  val tagName: String

  val void: Boolean
}
