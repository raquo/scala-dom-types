package com.raquo.domtypes.generic.keys

class Style[V] (
  val name: String,
  val cssName: String // @TODO Do we need this? seems like cssName can be derived from name (except cssFloat vs float)
)
