package com.raquo.dombuilder.dombuilder.utils.testing.matching

import com.raquo.dombuilder.dombuilder.generic.builders.Builder
import com.raquo.dombuilder.dombuilder.generic.nodes.{Comment, Element, Text}
import com.raquo.dombuilder.dombuilder.utils.testing.UtilSpec.repr
// @TODO[SERVER]
import org.scalajs.dom

import scala.collection.mutable

// @TODO[API] Implement ExpectedNode as a custom Node[N] once it is generic enough
// @TODO[API] emptyNode is a clutch, what we really care about is its type (it's the `div` in `div like (...)` part)

class ExpectedNode[N](builder: Builder[N]) {

  import ExpectedNode._

  // @TODO[Integrity] Write tests for this test util; it's quite complicated.
  // @TODO[Integrity] assert that no attrs / props / eventprops / etc. are defined because those won't be tested ...what the hell does this mean, I forgot :(

  private val emptyNode: N = builder.build()

  private val checksBuffer: mutable.Buffer[Check] = mutable.Buffer()

  private val expectedChildrenBuffer: mutable.Buffer[ExpectedNode[N]] = mutable.Buffer()

  // @TODO[API] There's gotta be a better way to expose just the type N, not val emptyNode. ClassTag? Sealed trait?
  val nodeType: String = emptyNode match {
    case el: Element => "Element"
    case t: Text => "Text"
    case c: Comment => "Comment"
  }

  def checks: List[Check] = checksBuffer.toList

  def expectedChildren: List[ExpectedNode[N]] = expectedChildrenBuffer.toList

  def addCheck(check: Check): Unit = {
    checksBuffer.append(check)
  }

  def addExpectedChild(child: ExpectedNode[N]): Unit = {
    expectedChildrenBuffer.append(child)
  }

  def like(rules: Rule[N]*): ExpectedNode[N] = {
    rules.foreach(_.applyTo(this))
    this
  }

  def likeWhatever: ExpectedNode[N] = {
    new ExpectedNode[N](builder)
  }

  def checkNodeType(actualNode: dom.Node): MaybeError = {
    (actualNode, emptyNode) match {
      case (actualElement: dom.Element, emptyElement: Element) =>
        val actualTagName = actualElement.tagName.toLowerCase
        val expectedTagName = emptyElement.tagName
        if (actualTagName != expectedTagName) {
          Some(s"Element tag name is incorrect: actual ${repr(actualTagName)}, expected ${repr(expectedTagName)}")
        } else {
          None
        }
      case _ =>
        val actualNodeType = actualNode match {
          case el: dom.Element => "Element"
          case t: dom.Text => "Text"
          case c: dom.Comment => "Comment"
        }
        if (actualNodeType == nodeType) {
          None
        } else {
          Some(
            s"Node type mismatch: actual node is a ${repr(actualNodeType)}, expected an instance of ${repr(nodeType)}"
          )
        }
    }
  }

  def checkNode(node: dom.Node, clue: String): ErrorList = {
    val checksErrors: List[String] = checks
      .flatMap(check => check(node))
      .map(withClue(clue, _))
    val actualNumChildren = node.childNodes.length
    val expectedNumChildren = expectedChildren.length

    val childErrors = if (actualNumChildren != expectedNumChildren) {
      List(
        withClue(clue = clue, s"Child nodes length mismatch: actual ${repr(actualNumChildren)}, expected ${repr(expectedNumChildren)}"),
        withClue(clue = clue, s"- Detailed comparison:\n    actual - ${repr(nodeListToList(node.childNodes))},\n  expected - ${repr(expectedChildren)}")
      )
    } else {
      expectedChildren.zipWithIndex.flatMap {
        case (expectedChildElement, index) =>
          expectedChildElement.checkNode(
            node = node.childNodes(index),
            clue = s"$clue --- @$index"
          )
      }
    }

    checksErrors ++ childErrors
  }

  override def toString: String = {
    emptyNode match {
      case element: Element =>
        s"ExpectedNode[Element,tag=${repr(element.tagName)}]"
      case text: Text =>
        s"ExpectedNode[Text,text=${repr(text.text)}]"
      case comment: Comment =>
        s"ExpectedNode[Comment,text=${repr(comment.text)}]"
    }
  }
}

object ExpectedNode {

  def withClue(clue: String, message: String): String = {
    s"[$clue]: $message"
  }

  def checkText(expectedText: String)(node: dom.Node): MaybeError = {
    if (node.nodeType != dom.Node.TEXT_NODE) {
      Some(s"Node type mismatch: actual ${repr(node.nodeType)}, expected ${repr(dom.Node.TEXT_NODE)} (Text Node)")
    } else if (node.textContent != expectedText) {
      Some(s"Text node textContent mismatch: actual ${repr(node.textContent)}, expected ${repr(expectedText)}")
    } else {
      None
    }
  }

  def checkCommentText(expectedText: String)(node: dom.Node): MaybeError = {
    node match {
      case comment: dom.Comment =>
        if (comment.textContent == expectedText) {
          None
        } else {
          Some(s"Comment node text mismatch: actual ${repr(comment.textContent)}, expected ${repr(expectedText)}")
        }
      case _ =>
        Some(s"Node type mismatch [checkCommentText]: actual node ${repr(node)}, expected an instance of dom.Comment")
    }
  }

  def nodeListToList(nodeList: dom.NodeList): List[dom.Node] = {
    // @TODO[Polish] Move into JSUtils
    var result: List[dom.Node] = Nil
    var i = 0
    while (i < nodeList.length) {
      result = result :+ nodeList(i)
      i += 1
    }
    result
  }
}
