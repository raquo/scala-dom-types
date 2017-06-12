package com.raquo.dombuilder.example.components

import com.raquo.dombuilder.simple.{attrs, events, styles}
import com.raquo.dombuilder.simple.nodes.{SimpleElement, SimpleText}
import com.raquo.dombuilder.simple.tags._

class Counter { // This doesn't need to be a class, could be anything

  private var count = 0    // Declare this component's internal state

  private val captionNode: SimpleText = count.toString    // Create node to represent the caption that shows the current count

  private val incButton: SimpleElement = button(    // Create a node to represent the "increment" button
    events.onClick := increment _,                  // Add event listener to the button node
    "[ + ]"                                         // Add a child node (which happens to be a text node) to the button node
  )

  val element: SimpleElement = div(    // Create a node that will be either mounted as a root node or added as a child to another node.
    attrs.cls := "CounterClassBlah",   // Add a CSS class name to this node (not used here, just an example)
    styles.display.inlineBlock,        // Set CSS display property to "inline-block" (just because)
    h1("Counter"),                     // Create an h1 HTML node and add it as a child
    incButton,                         // Add the "increment" button as a child node
    captionNode                        // Add the caption as a child node
  )

  def increment(): Unit = {                // Callback that will fire on every button click
    count += 1                             // Update internal component state
    captionNode.setText(count.toString)    // Update the DOM
  }
}
