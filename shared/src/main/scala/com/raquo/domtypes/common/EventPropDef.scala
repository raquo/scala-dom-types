package com.raquo.domtypes.common

/**
  * This type represent a specific type of DOM element events, e.g. "click" or "scroll".
  *
  * @param scalaName           - Suggested name of this prop in Scala.
  *                              The name is chosen to
  *                              - match Scala naming style (e.g. camelCase) and intended use
  *                                (event hook names in UI libraries)
  *                              - avoid name collisions between different types of keys
  *                                (e.g. `title` tag vs `title` attribute)
  *                              - avoid using up popular names for unpopular keys
  * @param scalaAliases        - Aliases that should be defined linking to the main `scalaName`
  * @param domName             - Native event name in the DOM, e.g. "click"
  * @param scalaJsEventType    - Type alias of corresponding event in scalajs-dom project
  *                              See [[fullScalaJsDomEventType]] for the full path
  * @param javascriptEventType - Type of corresponding event in raw Javascript
  * @param commentLines        - Scaladoc comment lines for this key
  * @param docUrls             - Scaladoc documentation URLs for this key
  */
case class EventPropDef(
  scalaName: String,
  scalaAliases: List[String] = Nil,
  domName: String,
  scalaJsEventType: String,
  javascriptEventType: String,
  override val commentLines: List[String],
  override val docUrls: List[String],
) extends KeyDef {

  def fullScalaJsDomEventType: String = s"org.scalajs.$scalaJsEventType"
}
