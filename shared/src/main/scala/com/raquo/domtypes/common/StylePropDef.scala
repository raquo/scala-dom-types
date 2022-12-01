package com.raquo.domtypes.common

/**
  * This type represents a CSS style property, such as "background" or "border-color"
  *
  * @param scalaName      - Suggested name of this prop in Scala.
  *                         The name is chosen to
  *                         - match Scala naming style (e.g. camelCase)
  *                         - avoid name collisions between different types of keys
  *                           (e.g. `title` tag vs `title` attribute)
  *                         - avoid using up popular names for unpopular keys*
  * @param domName        - Native style property name in the DOM.
  * @param valueType      - Type of values you can write to this attribute in Scala
  *                         Note: in addition to this type, you can always write `String`
  *                         into any style prop
  * @param valueTraits    - List of style traits that provide additional information about
  *                         keywords and units that can be used for this property.
  *                         See [[StyleTraitDef]]
  * @param implName       - Method name used to create this key from the old SDT codebase
  * @param commentLines   - Scaladoc comment lines for this key
  * @param docUrls        - Scaladoc documentation URLs for this key
  */
case class StylePropDef(
  scalaName: String,
  domName: String,
  valueType: String,
  valueTraits: List[String], // Normal, Calc, TextTransform, Base, etc.
  valueUnits: List[String],
  implName: String,
  override val commentLines: List[String],
  override val docUrls: List[String]
) extends KeyDef
