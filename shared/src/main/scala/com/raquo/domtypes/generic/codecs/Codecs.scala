package com.raquo.domtypes.generic.codecs

// @TODO[Performance] Which of those methods could benefit from @inline annotation? We typically use those values typed as just `Codec`

// String Codecs

object StringAsIsCodec extends Codec[String, String] {
  @inline override def decode(domValue: String): String = domValue
  @inline override def encode(scalaValue: String): String = scalaValue
}

// Int Codecs

object IntAsIsCodec extends Codec[Int, Int] {
  @inline override def decode(domValue: Int): Int = domValue
  @inline override def encode(scalaValue: Int): Int = scalaValue
}

object IntAsStringCodec extends Codec[Int, String] {
  @inline override def decode(domValue: String): Int = domValue.toInt // @TODO this can throw exception. How do we handle this?
  @inline override def encode(scalaValue: Int): String = scalaValue.toString
}

// Double Codecs

object DoubleAsIsCodec extends Codec[Double,Double] {
  @inline override def decode(domValue: Double): Double = domValue
  @inline override def encode(scalaValue: Double): Double = scalaValue
}

object DoubleAsStringCodec extends Codec[Double, String] {
  @inline override def decode(domValue: String): Double = domValue.toDouble// @TODO this can throw exception. How do we handle this?
  @inline override def encode(scalaValue: Double): String = scalaValue.toString
}

// Boolean Codecs

object BooleanAsIsCodec extends Codec[Boolean, Boolean] {
  @inline override def decode(domValue: Boolean): Boolean = domValue
  @inline override def encode(scalaValue: Boolean): Boolean = scalaValue
}

object BooleanAsAttrPresenceCodec extends Codec[Boolean, String] {
  @inline override def decode(domValue: String): Boolean = domValue != null
  @inline override def encode(scalaValue: Boolean): String = if (scalaValue) "" else null
}

object BooleanAsTrueFalseStringCodec extends Codec[Boolean, String] {
  @inline override def decode(domValue: String): Boolean = domValue == "true"
  @inline override def encode(scalaValue: Boolean): String = if (scalaValue) "true" else "false"
}

object BooleanAsYesNoStringCodec extends Codec[Boolean, String] {
  @inline override def decode(domValue: String): Boolean = domValue == "yes"
  @inline override def encode(scalaValue: Boolean): String = if (scalaValue) "yes" else "no"
}

object BooleanAsOnOffStringCodec extends Codec[Boolean, String] {
  @inline override def decode(domValue: String): Boolean = domValue == "on"
  @inline override def encode(scalaValue: Boolean): String = if (scalaValue) "on" else "off"
}

// Iterable Codecs

object IterableAsSpaceSeparatedStringCodec extends Codec[Iterable[String], String] { // use for e.g. className
  @inline override def decode(domValue: String): Iterable[String] = if (domValue == "") Nil else domValue.split(' ')
  @inline override def encode(scalaValue: Iterable[String]): String = scalaValue.mkString(" ")
}

object IterableAsCommaSeparatedStringCodec extends Codec[Iterable[String], String] { // use for lists of IDs
  @inline override def decode(domValue: String): Iterable[String] = if (domValue == "") Nil else domValue.split(',')
  @inline override def encode(scalaValue: Iterable[String]): String = scalaValue.mkString(",")
}
