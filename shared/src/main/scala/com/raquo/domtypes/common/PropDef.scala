package com.raquo.domtypes.common

/**
  * This type represents an HTML element property.
  *
  * @param scalaName      - Suggested name of this prop in Scala.
  *                         The name is chosen to
  *                         - match Scala naming style (e.g. camelCase)
  *                         - avoid name collisions between different types of keys
  *                           (e.g. `title` tag vs `title` attribute)
  *                         - avoid using up popular names for unpopular keys
  * @param scalaAliases   - Aliases that should be defined linking to the main `scalaName`
  * @param domName        - Native attribute name in the DOM.
  * @param scalaValueType - Type of values you can write to this attribute in Scala
  * @param domValueType   - Type of values that this property holds in the DOM
  * @param codec          - Codec needed to convert between `scalaValueType` and `domValueType`
  * @param commentLines   - Scaladoc comment lines for this key
  * @param docUrls        - Scaladoc documentation URLs for this key
  */
case class PropDef(
  scalaName: String,
  scalaAliases: List[String] = Nil,
  domName: String,
  scalaValueType: String,
  domValueType: String,
  codec: String,
  override val commentLines: List[String],
  override val docUrls: List[String]
) extends KeyDef
