package com.raquo.domtypes.common

/**
  * This type represents an HTML or SVG tag, such as `div` or `input`.
  *
  * @param tagType                 - HTML or SVG
  * @param scalaName               - Suggested name of this tag in Scala.
  *                                  The name is chosen to
  *                                  - match Scala naming style (e.g. camelCase)
  *                                  - avoid name collisions between different types of keys
  *                                    (e.g. `title` tag vs `title` attribute)
  *                                  - avoid using up popular names for unpopular keys
  * @param scalaAliases            - Aliases that should be defined linking to the main `scalaName`
  * @param domName                 - Native tag name in the DOM
  * @param isVoid                  - If true, elements of this type can have no children
  * @param scalaJsElementTypeAlias - Type of corresponding elements in scalajs-dom project
  *                                  See [[fullScalaJsDomElementType]] for the full path
  * @param javascriptElementType   - Type of corresponding elements in raw Javascript
  * @param commentLines            - Scaladoc comment lines for this key
  * @param docUrls                 - Scaladoc documentation URLs for this key
  */
case class TagDef(
  tagType: TagType,
  scalaName: String,
  scalaAliases: List[String] = Nil,
  domName: String,
  isVoid: Boolean,
  scalaJsElementTypeAlias: String,
  javascriptElementType: String,
  override val commentLines: List[String],
  override val docUrls: List[String]
) extends KeyDef {

  def scalaJsElementType: String = s"dom.$javascriptElementType"

  def fullScalaJsDomElementType: String = s"org.scalajs.$scalaJsElementTypeAlias"
}
