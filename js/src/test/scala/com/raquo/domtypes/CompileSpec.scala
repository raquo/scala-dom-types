package com.raquo.domtypes

import com.thirdparty.defs._
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class CompileSpec extends AnyFunSpec with Matchers {

  object html
    extends HtmlTags
    with HtmlAttrs
    with Props
    with EventProps

  object svg
    extends SvgTags
    with SvgAttrs

  object aria
    extends AriaAttrs

  it("compiles standard bundle") {
    assert(html.div.domName == "div")
    assert(html.onClick.domName == "click")
    assert(html.value.domName == "value")
    assert(html.idAttr.domName == "id")
    assert(html.charset.domName == "charset")

    println("All good!")
  }
}
