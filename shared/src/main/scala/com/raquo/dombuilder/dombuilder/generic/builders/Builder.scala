package com.raquo.dombuilder.dombuilder.generic.builders

trait Builder[+N] {
  def build(): N
}
