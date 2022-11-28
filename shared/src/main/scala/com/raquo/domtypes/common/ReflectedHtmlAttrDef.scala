package com.raquo.domtypes.common

/**
  * This type represents a reflected attribute – that is, a property of an HTML element
  * that is linked to a corresponding HTML attribute, such that their value matches, and
  * writing to one updates the other as well. Example: `id` property / "id" attribute.
  *
  * Your library can choose to operate on these keys using either the props DOM API
  * (element.id = "newId") or the attributes DOM API (element.setAttribute("id", "newId").
  * The former has better performance.
  *
  * @param scalaName        - Suggested name of this attribute in Scala.
  *                           The name is chosen to
  *                           - match Scala naming style (e.g. camelCase)
  *                           - avoid name collisions between different types of keys
  *                             (e.g. `title` tag vs `title` attribute)
  *                           - avoid using up popular names for unpopular keys
  * @param domAttrName      - Native attribute name in the DOM.
  * @param domPropName      - Native property name in the DOM.
  *                           Note: this can be different from domAttrName.
  *                           For example, `value` attribute matches `defaultValue` property.
  * @param scalaValueType   - Type of values you can write to this reflected attribute in Scala
  * @param domPropValueType - Type of values you can write to this property in the DOM
  *                           Note: in contrast to element properties, in the DOM, the attributes'
  *                           values are always of type `String`.
  * @param attrCodec        - Codec needed to convert between `scalaValueType` and String
  * @param propCodec        - Codec needed to convert between `scalaValueType` and `domPropValueType`
  * @param commentLines     - Scaladoc comment lines for this key
  * @param docUrls          - Scaladoc documentation URLs for this key
  */
case class ReflectedHtmlAttrDef(
  scalaName: String,
  domAttrName: String,
  domPropName: String,
  scalaValueType: String,
  domPropValueType: String,
  attrCodec: String,
  propCodec: String,
  commentLines: List[String],
  docUrls: List[String]
)
