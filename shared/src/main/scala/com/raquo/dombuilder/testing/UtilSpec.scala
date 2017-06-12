package com.raquo.dombuilder.utils.testing

import scala.util.Random

trait UtilSpec {

  def randomString(prefix: String = "", length: Int = 5): String = {
    prefix + Random.nextString(length)
  }

  def repr(value: Any): String = {
    value match {
      case str: String => "\"" + str + "\""
      case _ => value.toString
    }
  }
}

object UtilSpec extends UtilSpec
