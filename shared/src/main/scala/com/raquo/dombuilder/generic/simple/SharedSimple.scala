package com.raquo.dombuilder.generic.simple

import com.raquo.dombuilder.generic.builders.SpecializedBuilder
import com.raquo.dombuilder.generic.definitions.attrs.{Attrs, GlobalAttrs, InputAttrs}
import com.raquo.dombuilder.generic.definitions.props.{NodeProps, Props}
import com.raquo.dombuilder.generic.keys.{Attr, Prop}

trait SharedSimple {

  object attrs
    extends Attrs[Attr]
    with InputAttrs[Attr]
    with GlobalAttrs[Attr]
    with SpecializedBuilder[Attr]
  {
    override def build[V](key: String): Attr[V] = {
      new Attr[V](key)
    }
  }

  object props
    extends Props[Prop]
      with NodeProps[Prop]
      with SpecializedBuilder[Prop]
  {
    override def build[V](key: String): Prop[V] = {
      new Prop(key)
    }
  }

}
