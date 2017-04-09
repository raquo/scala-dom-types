package com.raquo.dombuilder

import com.raquo.dombuilder.allTags.{article, comment, div, hr, p, span}

class ElementSpec extends UnitSpec {

  val text1 = randomString("text1_")
  val text2 = randomString("text2_")
  val text3 = randomString("text3_")

  it("renders empty elements") {
    mount("empty <div>", div())
    expectNode(div likeEmpty)
    unmount()

    mount("empty <span>", span())
    expectNode(span likeEmpty)
    unmount()

    mount("empty <p>", p)
    expectNode(p likeEmpty)
    unmount()

    mount("empty <hr>", hr)
    expectNode(hr likeEmpty)
    unmount()
  }

  it("renders a comment") {
    mount(div(comment()))
    expectNode(div like (comment likeEmpty))
    unmount()
  }

  it("renders elements with text Content") {
    mount("span", span(text1))
    expectNode(span like text1)
    unmount()

    mount("article (fancy element from Tags2)", article(text1))
    expectNode(article like text1)
    unmount()
  }

  it("renders two text nodes") {
    mount(div(text1, text2))
    expectNode(article like (text1, text2))
  }

  it("renders nested elements") {
    mount("div > span", div(span(text1)))
    expectNode(div like (span like text1))
    unmount()

    mount(
      "div > span, p",
      div(span(text1), p(text2))
    )
    expectNode(div like(span like text1, p like text2))
    unmount()

    mount(
      "div > span, p, p",
      div(span(text1), p(text2), p(text3))
    )
    expectNode(div like(span like text1, p like text2, p like text3))
    unmount()

    mount(
      "div > span, (p > #text, span, span), hr",
      div(
        span(text1),
        p(text2, span(text2), span(text3)),
        hr
      )
    )

    expectNode(div like(
      span like text1,
      p like (text2, span like text2, span like text3),
      hr likeEmpty
    ))
    unmount()
  }

  /** Node.text requires too many manipulations to deal with given the way we construct
    * nodes by adding modifiers. It's just easier to create text nodes instead.
    */
  it("creates child nodes instead of populating .text") {
    mount(div(text1))
    mountedNode.text.isDefined shouldBe false
  }
}
