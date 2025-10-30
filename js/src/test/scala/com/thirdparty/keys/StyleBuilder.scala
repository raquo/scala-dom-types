package com.thirdparty.keys

trait StyleBuilder[SSS] {

  protected def styleSetter(value: String): SSS
}
