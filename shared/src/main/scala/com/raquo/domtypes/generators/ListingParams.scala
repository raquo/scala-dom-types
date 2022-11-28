package com.raquo.domtypes.generators

case class ListingParams(
  defType: DefType.type => String = _.LazyVal,
  keyKind: String = "T", // e.g. HtmlAttr
  valueTypeMap: String => String = identity,
  builderImplMap: String => String = identity,
  format: IndentationParams = IndentationParams(),
  prefix: List[String] = Nil,
  suffix: List[String] = Nil
) {

  def withIndentationLevel(mod: Int => Int): ListingParams = {
    copy(format = format.withLevel(mod))
  }
}
