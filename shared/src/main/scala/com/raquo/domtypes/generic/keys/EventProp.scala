package com.raquo.domtypes.generic.keys

class EventProp[Ev](val name: String) {

  @inline def domName: String = name.toLowerCase
}
