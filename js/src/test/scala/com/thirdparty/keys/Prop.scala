package com.thirdparty.keys

import com.thirdparty.codecs.Codec

case class Prop[Value, DomValue](
  domName: String,
  codec: Codec[Value, DomValue]
)
