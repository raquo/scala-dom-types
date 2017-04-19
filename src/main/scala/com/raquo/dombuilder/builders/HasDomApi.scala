package com.raquo.dombuilder.builders

import com.raquo.dombuilder.domapi.JsDomApi

// @TODO[API] Deprecate/kill

trait HasDomApi[N] {
  val domapi: JsDomApi.type = JsDomApi
}
