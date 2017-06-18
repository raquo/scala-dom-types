package com.raquo.dombuilder.generic.builders

trait Builder[+N] {
  def build(): N
}
