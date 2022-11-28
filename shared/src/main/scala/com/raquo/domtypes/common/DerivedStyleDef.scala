package com.raquo.domtypes.common

// #TODO
// "px", "calc()", etc.
case class DerivedStyleDef(
  scalaName: String,
  scalaInputType: String,
  encodeFn: String,
  commentLines: List[String],
  docUrls: List[String]
)
