package com.raquo.domtypes.temp.parsers

class Parsable(val from: String) extends AnyVal {

  def takeParams: ParseResult = {
    if (from.startsWith("(")) {
      val from2 = from.substring(1)
      val ix = from2.indexOf(")")
      if (ix == -1) {
        ParseFailed(from, "takeParams: ) not found")
      } else {
        ParseExtracted(
          rest = from2.substring(ix + 1),
          extracted = from2.substring(0, ix)
        )
      }
    } else {
      ParseFailed(from, "takeParams: ( not found")
    }
  }

  def takeTypeParams: ParseResult = {
    if (from.startsWith("[")) {
      val from2 = from.substring(1)
      val ix = from2.indexOf("]")
      if (ix == -1) {
        ParseFailed(from, "takeTypeParams: ] not found")
      } else {
        ParseExtracted(
          rest = from2.substring(ix + 1),
          extracted = from2.substring(0, ix)
        )
      }
    } else {
      ParseFailed(from, "takeTypeParams: [ not found")
    }
  }

  def takeStringLiteral: ParseResult = {
    if (from.startsWith(""""""")) {
      val from2 = from.substring(1)
      val ix = from2.indexOf(""""""")
      if (ix == -1) {
        ParseFailed(from, "takeStringLiteral: closing quote not found")
      } else {
        ParseExtracted(
          rest = from2.substring(ix + 1),
          extracted = from2.substring(0, ix)
        )
      }
    } else {
      ParseFailed(from, "takeStringLiteral: opening quote not found")
    }
  }

  def takeCallableName: ParseResult = {
    val ix = from.indexOf("(")
    if (ix == -1) {
      ParseFailed(from, "takeCallableName: ( not found")
    } else {
      ParseExtracted(
        rest = from.substring(ix),
        extracted = from.substring(0, ix)
      )
    }
  }

  def takeDefName: ParseResult = {
    val ix = from.indexOf(":")
    if (ix == -1) {
      ParseFailed(from, "takeCallableName: : not found")
    } else {
      ParseExtracted(
        rest = from.substring(ix),
        extracted = from.substring(0, ix)
      )
    }
  }

  def takePrefix(what: String): ParseResult = {
    if (from.startsWith(what)) {
      ParseExtracted(
        rest = from.substring(what.length),
        extracted = what
      )
    } else {
      ParseFailed(from, s"takePrefix(${what}): prefix not found")
    }
  }

  def takeAnyOnePrefix(whats: String*): ParseResult = {
    whats.foldLeft(
      ParseFailed(from, s"takeAnyOnePrefix(${whats.mkString(", ")}): none of the prefixes was found"): ParseResult
    )((prevResult, prefix) => {
      if (prevResult.isInstanceOf[ParseFailed] && from.startsWith(prefix)) {
        ParseExtracted(
          rest = from.substring(prefix.length),
          extracted = prefix
        )
      } else {
        prevResult
      }
    })
  }

  /** @return (remainingFrom, whatTaken) */
  def takeSuffix(what: String): ParseResult = {
    if (from.endsWith(what)) {
      ParseExtracted(
        rest = from.substring(0, from.length - what.length),
        extracted = what
      )
    } else {
      ParseFailed(from, s"takeSuffix(${what}): prefix not found")
    }
  }

  def takeUntil(what: String): ParseResult = {
    val ix = from.indexOf(what)
    if (ix == -1) {
      ParseFailed(from, s"takeUntil(${what}): string not found")
    } else {
      ParseExtracted(
        rest = from.substring(ix),
        extracted = from.substring(0, ix)
      )
    }
  }
}
