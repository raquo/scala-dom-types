package com.raquo.domtypes.common

// #TODO

// e.g. "black", "hidden", "inherit"
case class StyleKeywordDef(
  scalaOverride: Boolean = false,
  scalaName: String,
  domName: String,
  commentLines: List[String],
  docUrls: List[String]
)
