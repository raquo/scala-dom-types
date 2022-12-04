package com.raquo.domtypes.common

// #TODO

// e.g. "black", "hidden", "inherit"
case class StyleKeywordDef(
  scalaName: String,
  scalaAliases: List[String] = Nil,
  domName: String,
  isOverride: Boolean = false,
  override val commentLines: List[String],
  override val docUrls: List[String]
) extends KeyDef
