package com.raquo.domtypes.common

// #TODO

// e.g. "black", "hidden", "inherit"
case class StyleKeywordDef(
  scalaOverride: Boolean = false,
  scalaName: String,
  domName: String,
  override val commentLines: List[String],
  override val docUrls: List[String]
) extends KeyDef
