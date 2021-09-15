package com.raquo.domtypes.generic.builders

/** SvgTagBuilder is a builder of SVG Tags, which themselves are builders of SVG Elements. #factoryfactory */
trait SvgTagBuilder[T[_ <: DomSvgElement], -DomSvgElement] {

  type TPure = T
  type TSvg = T
  type TForeignObject = T

  @inline protected def svgTag[Ref <: DomSvgElement](tagName: String, void: Boolean): TPure[Ref]

  @inline protected def svgTag[Ref <: DomSvgElement](tagName: String): TPure[Ref] = {
    svgTag(tagName, void = false)
  }

  @inline protected def svgForeignObjectTag[Ref <: DomSvgElement](tagName: String): TForeignObject[Ref] = {
    svgTag(tagName)
  }

  @inline protected def svgSvgTag[Ref <: DomSvgElement](tagName: String): TSvg[Ref] = {
    svgTag(tagName)
  }
}
