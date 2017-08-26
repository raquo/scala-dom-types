package com.raquo.domtypes.generic.builders

trait Builder[+N] {
  def build(): N
}
