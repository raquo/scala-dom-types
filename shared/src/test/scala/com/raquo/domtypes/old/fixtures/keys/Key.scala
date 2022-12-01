package com.raquo.domtypes.old.fixtures.keys

/**
  * This class represents a Key typically found on the left hand side of the key-value pair `key := value`
  *
  * Example would be a particular Attribute or a Property (without the corresponding value), e.g. "href"
  */
abstract class Key {
  val name: String
}
