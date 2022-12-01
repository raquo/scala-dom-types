package com.raquo.domtypes.old.fixtures.nodes

import com.raquo.domtypes.old.fixtures.tags.Tag

trait Element extends Node {

  val tag: Tag[Any]
}
