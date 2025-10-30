package com.thirdparty.setters

import com.thirdparty.keys.StyleProp

// V is basically always either String, or A | String, and
// ThisV is supposed to be more specific in th latter case –
// typically ThisV is either A or String to give you a more
// precise type.
case class StyleSetter[V, ThisV](prop: StyleProp[V], value: ThisV)
