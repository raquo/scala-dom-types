package com.raquo.dom.types.generic.builders

trait Builder[+N] {
  def build(): N
}
