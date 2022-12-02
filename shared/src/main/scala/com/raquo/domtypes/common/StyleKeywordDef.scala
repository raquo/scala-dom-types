package com.raquo.domtypes.common

// #TODO

// e.g. "black", "hidden", "inherit"
case class StyleKeywordDef(
  scalaOverride: Boolean = false,
  scalaName: String,
  scalaAliases: List[String] = Nil,
  domName: String,
  isOverride: Boolean,
  override val commentLines: List[String],
  override val docUrls: List[String]
) extends KeyDef
