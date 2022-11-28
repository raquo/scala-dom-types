package com.raquo.domtypes.common

/**
  * This type represents an HTML element property.
  *
  * @param scalaName      - Suggested name of this prop in Scala.
  *                         The name is chosen to
  *                         - match Scala naming style (e.g. camelCase)
  *                         - avoid name collisions between different types of keys
  *                           (e.g. `title` tag vs `title` attribute)
  *                         - avoid using up popular names for unpopular keys*
  * @param domName        - Native attribute name in the DOM.
  *                         Note: Does not include SVG namespace. See [[namespaceQualifiedDomName]]
  * @param scalaValueType - Type of values you can write to this attribute in Scala
  * @param domValueType   - Type of values that this property holds in the DOM
  * @param implName       - Method name used to create this key from the old SDT codebase
  * @param codec          - Codec needed to convert between `scalaValueType` and `domValueType`
  * @param commentLines   - Scaladoc comment lines for this key
  * @param docUrls        - Scaladoc documentation URLs for this key
  */
case class PropDef(
  scalaName: String,
  domName: String,
  scalaValueType: String,
  domValueType: String,
  implName: String,
  codec: String,
  commentLines: List[String],
  docUrls: List[String]
)
