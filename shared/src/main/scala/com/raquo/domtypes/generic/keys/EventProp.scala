package com.raquo.domtypes.generic.keys

/**
  * This class represents an HTML Element Event Property. Meaning the key that can be set, not a key-value pair.
  *
  * An example would be an "onclick" property.
  *
  * @tparam Ev type of DOM Events that the event handler callback for this event prop accepts
  */
class EventProp[Ev](override val name: String) extends Key {

  @inline def domName: String = name.toLowerCase
}
