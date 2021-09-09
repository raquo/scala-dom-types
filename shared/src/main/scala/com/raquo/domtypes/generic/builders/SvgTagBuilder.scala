package com.raquo.domtypes.generic.builders

/** SvgTagBuilder is a builder of SVG Tags, which themselves are builders of SVG Elements. #factoryfactory */
trait SvgTagBuilder[T[_ <: DomSvgElement], -DomSvgElement] {

  @inline protected def svgToHtmlTag[Ref <: DomSvgElement](tagName: String): T[Ref] = {
    svgTag(tagName)
  }

  @inline protected def htmlToSvgTag[Ref <: DomSvgElement](tagName: String): T[Ref] = {
    svgTag(tagName)
  }

  @inline protected def svgTag[Ref <: DomSvgElement](tagName: String): T[Ref] = {
    svgTag(tagName, void = false)
  }

  @inline protected def svgTag[Ref <: DomSvgElement](tagName: String, void: Boolean): T[Ref]
}
