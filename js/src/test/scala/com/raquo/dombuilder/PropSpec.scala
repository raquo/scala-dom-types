package com.raquo.dombuilder

import com.raquo.dombuilder.jsdom.simple.tags.{div, input, span, td}
import com.raquo.dombuilder.jsdom.simple.props.{alt, colSpan, disabled, href, rel, rowSpan}

import scala.util.Random

class PropSpec extends UnitSpec {

  // @TODO[Integrity] For some reason, these tests fail when running them in node.js/jsdom. Prop values return as strings instead of numbers.

  it("sets props") {
    val expectedRel = randomString("rel_")
    val expectedHref = randomString("href_")
    val expectedAlt = randomString("alt_")

    mount("div", div(rel := expectedRel))
    expectNode(div like (rel is expectedRel))
    unmount()

    mount("td [colSpan, rowSpan]", td(
      href := expectedHref,
      alt := expectedAlt
    ))
    expectNode(
      td like(
        href is expectedHref,
        alt is expectedAlt,
        rel isEmpty
      )
    )
    unmount()
  }

  // @TODO[Test] In jsdom, this fails because of https://github.com/tmpvar/jsdom/issues/1745
  ignore("sets non-string props") {
    mount("input [disabled=false]", input(disabled := false))
    expectNode(input like(disabled is false, colSpan isEmpty))
    unmount()

    mount("input [disabled=true]", input(disabled := true))
    expectNode(input like(disabled is true, colSpan isEmpty))
    unmount()

    val expectedColSpan = Random.nextInt(10)
    mount("td [colSpan]", td(colSpan := expectedColSpan))
    expectNode(td like(colSpan is expectedColSpan, disabled isEmpty))
    unmount()
  }

  it("order of modifiers does not matter") {
    val expectedHref = randomString("href_")
    val expectedRel = randomString("rel_")
    val expectedText = randomString("text_")
    val expected = div like(
      href is expectedHref,
      rel is expectedRel,
      span like expectedText
    )

    val setHref = href := expectedHref
    val setRel = rel := expectedRel
    val addChild = span(expectedText)

    mount("[href], [rel], span", div(setHref, setRel, addChild))
    expectNode(expected)
    unmount()

    mount("[rel], [href], span", div(setRel, setHref, addChild))
    expectNode(expected)
    unmount()

    mount("[rel], span, [href]", div(setRel, addChild, setHref))
    expectNode(expected)
    unmount()

    mount("span, [rel], [href]", div(addChild, setRel, setHref))
    expectNode(expected)
    unmount()
  }

  // @TODO[Test] In jsdom, this fails because of https://github.com/tmpvar/jsdom/issues/1745
  ignore("sets props in nested elements") {
    val expectedRel1 = randomString("rel1_")
    val expectedRel2 = randomString("rel2_")
    val expectedText1 = randomString("text1_")
    val expectedText2 = randomString("text2_")
    val expectedColSpan = Random.nextInt(15)
    val expectedRowSpan = 15 + Random.nextInt(7)

    mount(
      td(
        colSpan := expectedColSpan,
        rowSpan := expectedRowSpan,
        span(
          rel := expectedRel1,
          expectedText1,
          span(
            expectedText2,
            rel := expectedRel2
          )
        ),
        span()
      )
    )

    expectNode(
      td like(
        colSpan is expectedColSpan,
        rowSpan is expectedRowSpan,
        rel isEmpty,
        span like(
          rel is expectedRel1,
          colSpan isEmpty,
          rowSpan isEmpty,
          expectedText1,
          span like(
            rel is expectedRel2,
            colSpan isEmpty,
            rowSpan isEmpty,
            expectedText2
          )
        ),
        span likeWhatever
      )
    )
  }
}
