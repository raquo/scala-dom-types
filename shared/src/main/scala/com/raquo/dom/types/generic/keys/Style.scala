package com.raquo.dom.types.generic.keys

class Style[V] (
  val jsName: String,
  val cssName: String // @TODO Do we need this? seems like cssName can be derived from jsName (except cssFloat vs float)
)
