package com.raquo.domtypes.generic.builders

import com.raquo.domtypes.generic.keys.Attr

trait AttrBuilder extends SpecializedBuilder[Attr] {

  @inline override def build[V](key: String): Attr[V] = new Attr(key)
}
