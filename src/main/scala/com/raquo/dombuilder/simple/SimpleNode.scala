package com.raquo.dombuilder.simple

import com.raquo.dombuilder.builders.{Builder, HasBuilder}
import com.raquo.dombuilder.simple

/** Base Node trait for the `simple` package, to be used as the N type param.
  * In a custom package you could have put some additional logic here shared by all your nodes.
  */
trait SimpleNode extends HasBuilder[SimpleNode] {

  override val builder: Builder[SimpleNode] = simple.builder
}
