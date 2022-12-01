package com.thirdparty.setters

import com.thirdparty.keys.StyleProp

case class StyleSetter[V](prop: StyleProp[V], value: String)
