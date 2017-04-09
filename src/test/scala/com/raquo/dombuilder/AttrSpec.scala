package com.raquo.dombuilder

import com.raquo.dombuilder.tags.{div, input, span, td}

import scala.util.Random

class AttrSpec extends UnitSpec {

  it("sets attrs") {
    val expectedTitle = randomString("title_")
    val expectedColSpan = Random.nextInt(15)
    val expectedRowSpan = 15 + Random.nextInt(7)

    mount("div", div(title := expectedTitle))
    expectNode(div like (title is expectedTitle))
    unmount()

    mount("td [colSpan, rowSpan]", td(
      colSpan := expectedColSpan,
      rowSpan := expectedRowSpan
    ))
    expectNode(
      td like(
        colSpan is expectedColSpan,
        rowSpan is expectedRowSpan,
        title isEmpty
      )
    )
    unmount()
  }

  it("sets boolean attrs") {
    mount("input [selected=false]", input(selected := false))
    expectNode(input like(selected is false, colSpan isEmpty))
    unmount()

    mount("input [selected=true]", input(selected := true))
    expectNode(input like(selected is true, colSpan isEmpty))
    unmount()
  }

  it("sets integer attrs") {
    val expectedColSpan = Random.nextInt(10)
    mount("td [colSpan]", td(colSpan := expectedColSpan))
    expectNode(td like(colSpan is expectedColSpan, selected isEmpty))
    unmount()
  }

  it("order of modifiers does not matter") {
    val expectedHref = randomString("href_")
    val expectedTitle = randomString("title_")
    val expectedText = randomString("text_")
    val expected = div like(
      href is expectedHref,
      title is expectedTitle,
      span like expectedText
    )

    val setHref = href := expectedHref
    val setTitle = title := expectedTitle
    val addChild = span(expectedText)

    mount("[href], [title], span", div(setHref, setTitle, addChild))
    expectNode(expected)
    unmount()

    mount("[title], [href], span", div(setTitle, setHref, addChild))
    expectNode(expected)
    unmount()

    mount("[title], span, [href]", div(setTitle, addChild, setHref))
    expectNode(expected)
    unmount()

    mount("span, [title], [href]", div(addChild, setTitle, setHref))
    expectNode(expected)
    unmount()
  }

  it("sets attrs in nested elements") {
    val expectedTitle1 = randomString("title1_")
    val expectedTitle2 = randomString("title2_")
    val expectedText1 = randomString("text1_")
    val expectedText2 = randomString("text2_")
    val expectedColSpan = Random.nextInt(15)
    val expectedRowSpan = 15 + Random.nextInt(7)

    mount(
      td(
        colSpan := expectedColSpan,
        rowSpan := expectedRowSpan,
        span(
          title := expectedTitle1,
          expectedText1,
          span(
            expectedText2,
            title := expectedTitle2
          )
        ),
        span()
      )
    )
    expectNode(
      td like(
        colSpan is expectedColSpan,
        rowSpan is expectedRowSpan,
        title isEmpty,
        span like(
          title is expectedTitle1,
          colSpan isEmpty,
          rowSpan isEmpty,
          expectedText1,
          span like(
            title is expectedTitle2,
            colSpan isEmpty,
            rowSpan isEmpty,
            expectedText2
          )
        ),
        span likeEmpty
      )
    )
  }
}
