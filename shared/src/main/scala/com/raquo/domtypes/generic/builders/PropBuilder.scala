package com.raquo.domtypes.generic.builders

import com.raquo.domtypes.generic.keys.Prop

trait PropBuilder extends SpecializedBuilder[Prop] {

  @inline override def build[V](key: String): Prop[V] = new Prop(key)
}
