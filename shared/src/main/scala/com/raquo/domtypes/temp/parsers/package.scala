package com.raquo.domtypes.temp

import scala.language.implicitConversions

package object parsers {

  implicit def stringToParsable(str: String): Parsable = new Parsable(str)

}
