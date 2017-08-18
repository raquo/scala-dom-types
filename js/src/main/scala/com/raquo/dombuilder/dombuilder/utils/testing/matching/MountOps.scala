package com.raquo.dombuilder.dombuilder.utils.testing.matching

import com.raquo.dombuilder.dombuilder.generic.nodes.{RefNode, Root}
import com.raquo.dombuilder.dombuilder.jsdom.nodes.ChildNode
// @TODO[SERVER]
import org.scalajs.dom

// @TODO[API] Should we be testing against the mounted element? We could just test against the node's ref

trait MountOps[N] {

  // `maybeContainer` and `maybeRoot` are private because otherwise it would be too easy to
  // forget to handle the `None` case when mapping or foreach-ing over them. We'd rather have
  // an exception from Option.get than an assertion that you don't realize isn't running.

  private[this] var maybeContainer: Option[dom.Element] = None

  private[this] var maybeRoot: Option[Root[N, N with ChildNode[N, dom.Element], dom.Element, dom.Node]] = None

  def container: dom.Element = maybeContainer.get

  def root: Root[N, N with ChildNode[N, dom.Element], dom.Element, dom.Node] = maybeRoot.get

  // @TODO[API] We shouldn't need this, but we don't have a generic Root :(
  def makeRoot(
    container: dom.Element,
    child: N with ChildNode[N, dom.Element]
  ): Root[N, N with ChildNode[N, dom.Element], dom.Element, dom.Node]

  val defaultMountedElementClue = "root"

  var mountedElementClue: String = defaultMountedElementClue

  // @TODO[API] improve names - we use `do` prefix because `assert` and `fail` are taken by ScalaTest
  // @TODO[API] the errors printed out by these functions don't show the original line numbers. How can we fix that?

  def doAssert(condition: Boolean, message: String): Unit

  def doFail(message: String): Nothing

  def expectNode(expectedNode: ExpectedNode[N]): Unit = {
    maybeRoot match {
      case Some(root) =>
        val errors = expectedNode.checkNode(
          root.child.ref,
          clue = mountedElementClue
        )
        if (errors.nonEmpty) {
          doFail(s"Rendered element does not match expectations:\n${errors.mkString("\n")}")
        }
      case None =>
        doFail(s"ASSERT FAIL [expectNode]: Root not found. Did you forget to mount()")
    }
  }

  def clearDocument(): Unit = {
    unmount()
    maybeContainer = None
    mountedElementClue = defaultMountedElementClue
    dom.document.body.textContent = "" // remove children
  }

  def resetDocument(): Unit = {
    clearDocument()
    val newContainer = createContainer()
    maybeContainer = Some(newContainer)
    dom.document.body.appendChild(newContainer)
  }

  def mount(clue: String, node: N with ChildNode[N, dom.Element]): Unit = {
    mount(node, clue)
  }

  def mount(node: N with ChildNode[N, dom.Element], clue: String = defaultMountedElementClue): Unit = {
    maybeContainer match {
      case Some(container) =>
        doAssert(
          container.parentNode == dom.document.body,
          "ASSERT FAIL [mount]: Container is not mounted to <body> (what did you do!?)."
        )
        assert(
          container.firstChild == null,
          "ASSERT FAIL [mount]: Unexpected children in container. Call unmount() before mounting again."
        )
        mountedElementClue = clue
        maybeRoot = Some(makeRoot(container, node))
      case None =>
        doFail("ASSERT FAIL [mount]: Container not found. resetDocument() usually does this in beforeEach().")
    }
  }

  def unmount(): Unit = {
    maybeRoot match {
      case Some(root) =>
        val unmounted = root.unmount()
        if (!unmounted) {
          doFail("ASSERT FAIL [clearDocument]: Failed to unmount root")
        }
        maybeRoot = None
      case None => ()
    }
  }

  private def createContainer(): dom.Element = {
    val container = dom.document.createElement("div")
    container.setAttribute("id", "app-container")
    container
  }
}
