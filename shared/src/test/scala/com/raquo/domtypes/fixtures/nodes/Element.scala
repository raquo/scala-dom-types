package com.raquo.domtypes.fixtures.nodes

import com.raquo.domtypes.fixtures.tags.Tag

trait Element extends Node {

  val tag: Tag[Any]
}
