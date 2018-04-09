package com.raquo.domtypes.generic.nodes

import com.raquo.domtypes.generic.builders.Tag

trait Element extends Node {

  val tag: Tag[Any]
}
