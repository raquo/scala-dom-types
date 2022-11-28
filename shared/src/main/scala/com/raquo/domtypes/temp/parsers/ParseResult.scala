package com.raquo.domtypes.temp.parsers

sealed trait ParseResult

case class ParseExtracted(
  rest: String,
  extracted: String
) extends ParseResult

case class ParseFailed(
  originalRest: String,
  errorMessage: String
) extends ParseResult
