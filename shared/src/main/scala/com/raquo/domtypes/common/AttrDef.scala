package com.raquo.domtypes.common

/**
  * This type represents an HTML or SVG element attribute.
  *
  * @param tagType        - HTML or SVG
  * @param scalaName      - Suggested name of this attribute in Scala.
  *                         The name is chosen to
  *                         - match Scala naming style (e.g. camelCase)
  *                         - avoid name collisions between different types of keys
  *                           (e.g. `title` tag vs `title` attribute)
  *                         - avoid using up popular names for unpopular keys
  * @param domName        - Native attribute name in the DOM.
  *                         Note: Does not include SVG namespace. See [[namespaceQualifiedDomName]]
  * @param namespace      - Defined for certain SVG attributes
  * @param scalaValueType - Type of values you can write to this attribute in Scala
  *                         Note: in the DOM, the attribute's value is always `String`.
  * @param implName       - Method name used to create this key from the old SDT codebase
  * @param codec          - Codec needed to convert between `scalaValueType` and String
  * @param commentLines   - Scaladoc comment lines for this key
  * @param docUrls        - Scaladoc documentation URLs for this key
  */
case class AttrDef(
  tagType: TagType,
  scalaName: String,
  domName: String,
  namespace: Option[String],
  scalaValueType: String,
  implName: String,
  codec: String,
  commentLines: List[String],
  docUrls: List[String]
) {

  def namespaceQualifiedDomName: String = {
    namespace match {
      case Some(ns) => s"$ns:$domName"
      case None => domName
    }
  }
}
