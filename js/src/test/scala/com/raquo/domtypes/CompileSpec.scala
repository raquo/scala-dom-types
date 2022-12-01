package com.raquo.domtypes

import com.thirdparty.defs._
import com.thirdparty.keys.{DerivedStyleProp, DerivedStylePropBuilder, StyleProp}
import com.thirdparty.setters.StyleSetter
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class CompileSpec extends AnyFunSpec with Matchers {

  object html
    extends tags.HtmlTags
    with attrs.HtmlAttrs
    with props.Props
    with eventProps.EventProps
    with styles.StyleProps

  object svg
    extends tags.SvgTags
    with attrs.SvgAttrs

  object aria
    extends attrs.AriaAttrs

  type StyleEncoder[A] = A => String

  object style
    extends styles.units.Url[StyleEncoder]
    with styles.units.Length[StyleEncoder, Int]
    with styles.units.Time[StyleEncoder]
    with styles.units.Calc[StyleEncoder]
    with DerivedStylePropBuilder[StyleEncoder] {

    override protected def derivedStyle[A](encode: A => String): StyleEncoder[A] = encode
  }

  it("standard features") {

    // This checks the typical usage of SDT.
    // - Aside from the asserts below, this also implicitly tests that
    //   GeneratorSpec produced valid source code, and that the key
    //   names don't have conflicts in them.

    // Simple types

    assert(html.div.domName == "div")
    assert(html.onClick.domName == "click")
    assert(html.value.domName == "value")
    assert(html.idAttr.domName == "id")
    assert(html.charset.domName == "charset")
    assert(html.display.domName == "display")

    // CSS keywords

    html.display.none: StyleSetter[_]
    html.display.none.value: String
    assert(html.display.none.value == "none")

    // Derived CSS props (units)

    html.padding: StyleProp[String]
    html.padding.px: DerivedStyleProp[Int]
    assert((html.padding.px := 12).value == "12px")

    html.maxHeight

    html.background.url: DerivedStyleProp[String]
    (html.background.url := "https://laminar.dev").value == """url("https://laminar.dev")"""

    assert(style.percent(55) == "55%")
    assert(style.calc("12px + 20em") == "calc(12px + 20em)")
  }
}
