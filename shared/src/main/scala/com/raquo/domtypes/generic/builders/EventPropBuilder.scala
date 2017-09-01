package com.raquo.domtypes.generic.builders

import com.raquo.domtypes.generic.keys.EventProp

trait EventPropBuilder extends SpecializedBuilder[EventProp] {

  @inline override def build[Ev](key: String): EventProp[Ev] = {
    new EventProp[Ev](name = key)
  }
}
