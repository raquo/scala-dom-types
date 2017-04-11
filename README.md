# Scala DOM Builder

Scala DOM Builder provides three things:

* **Type definitions** for creating objects representing HTML DOM Nodes –– see `/definitions` directory
* A minimal **library** for building and manipulating DOM trees
* A **testing framework** to verify real DOM nodes (and trees) against desired state

This project is primarily intended to be used from Scala.js.

## TODO

* Revise the README
* Publish to Maven Central

## Example Component

A very dumb example component using our low-level API:

```scala
class Counter extends SimpleElement("div") { // specify this component's HTML tag name
 
  private var count = 0    // Declare this component's internal state
 
  // Create node to represent the "increment" button
  private val incButton = button(
    events.onClick := increment _,    // Add event listener to the button node
    "[ + ]"    // Add a child to the button node, which happens to be a text node
  )
 
  // Create node to represent the caption that shows the current count
  private val captionNode = simple.nodeBuilder.textNode(count.toString)
 
  // Apply some modifiers to this node:
  this(
    attrs.cls := "Counter",    // Add a CSS class name to this node (not used here, just an example)
    styles.display.inlineBlock,    // Set CSS display property to "inline-block" (just because)
    incButton,    // Add button as a child node
    captionNode    // Add caption as a child node
  )
 
  // Callback that updates the component's state and DOM
  def increment(): Unit = {
    count += 1
    captionNode.setText(count.toString)
  }
}
```

While this direct usage of Scala DOM Builder's API is acceptable for certain use cases, you typically wouldn't use this library like that, you would build a reactive library on top of Scala DOM Builder. Read more below.

## Rationale

### Type Definitions

This project's type definitions are similar to ScalaTags. In fact, all the listings of DOM elements / attributes / etc. I borrowed from there. So why create a new set of these definitions instead of using ScalaTags?

Mostly this is because we strive to be more type-safe than ScalaTags. For example, in ScalaTags you can give an integer attribute a string value (@TODO: Double-check this particular claim). The compiler won't let you do that with Scala DOM builder.

In time I will try to add even better types, perhaps even tie "input" elements to `HTMLInputElement`.

You can use Scala DOM Builder's type definitions without using the rest of the library. ~~For example, this is what Snabbdom.scala does.~~ (not yet)

### DOM Tree Building Library

Our `Node` trait lets you build a tree of `Node` objects that map one-to-one (for now) to real DOM objects. `Node`'s API allows you to manipulate the underlying DOM effectively from Scala.

Some of your Nodes could in fact be stateful components that manage themselves and their children. This is trivially achievable by extending `Node` or by any other means, really. This library has no opinion on how you should structure your application.

The DOM tree represents DOM as it is – a bunch of mutable state. There is no virtual DOM, no reactive streams, observables, monads or anything like that. THis library is deliberately low-level and unopinionated. It has no paradigms or ideology to push on you.

#### A. Foundation For Other DOM Manipulation Libraries

If you are building a DOM manipulation library in Scala, you will most probably want to represent either the DOM tree itself or the Component tree, whatever a Component is in your library. Scala DOM Builder's API was designed specifically for his use case – to serve as a low level foundation for other libraries.

This is similar to how Snabbdom is the foundation for many popular Javascript libraries, except Snabbdom gives you a virtual DOM solution. Scala DOM Builder does not use virtual DOM, we do not keep track of the DOM state other than the parent/child relationship of nodes. You could trivially do that in your own library code of course.

Scala DOM Builder is particularly well suited for building libraries on top of because it's so unopinionated. It basically represents the mutable state of the DOM – your fancy functional reactive / monadic library will have to deal with that mutable state either way, but at least with Scala DOM Tree you can do it with a more convenient API.

@TODO: Add Laminar as an example.

#### B. Direct Usage

Even though the DOM Builder API is pretty low-level, you can still use it directly, without building a DOM manipulation library on top of it. It is actually remarkably simple, akin to old-school Javascript development from the days when jQuery was a cool application development framework.

If you want to do this, check out the `simple` package. See `example/components` directory for examples.

However, be cautioned that without a thought-out framework on top, your code will soon become an incomprehensible mess. It is fine for small components, e.g. when you need to add a bit of Javascript functionality to an otherwise static HTML page, but for any significant application development you should not be using Scala DOM Builder directly.

This is because Scala DOM Builder deliberately does not have a mechanism for declarative UI programming. All you can do without building a library on top of Scala DOM Builder is to write code that mutates the DOM. This goes against the last few years of UI development best practices. The current generally accepted UI development paradigm is to represent your DOM as a function of the UI state as opposed to writing callbacks that perform DOM state transitions.

@TODO: Mention Laminar as example of declarative programming

However, direct usage of Scala DOM Tree still provides a significant advantage over using plain jQuery. Typical jQuery usage involves querying the DOM all the time. That is a very fragile operation because you're relying on a particular DOM structure including particular nesting and CSS styles.

In contrast, if you were to write components using raw Scala DOM Builder you would always have direct references to all the elements that you care about (see example components).

### Testing framework

We have a testing framework that lets you assert that a real DOM node matches a certain description. You can use without using Scala DOM Builder. For example:

```scala
mount(
  div(
    rel := "yolo"
    span(text1),
    p(text2, span(text2), span(text3)),
    hr
  )
)

expectNode(div like(
  rel is "yolo",
  span like text1,
  p like (text2, span like text2, span like text3),
  hr likeWhatever
))
```

Yes, `likeWhatever` is our actual API. It could have been called `exists`, but where's the fun in that?

## Why Not Virtual DOM?

### How Scala DOM Builder Works

Scala DOM Builder only keeps track of the tree structure: parents, children, references to real DOM nodes. That's it. It does not keep track of all the attributes / props / etc. that you set on those nodes. If you need to read those values (which you typically don't), you can easily get them from the real DOM since we give you handy references to all your DOM elements.

Scala DOM Builder makes minimal, precision DOM updates without spending the cycles to figure out what needs to be done. When you need to update the DOM, e.g. set a node's attribute to the new value, Scala DOM Builder does just that – fires off a method that calls `setAttribute` on the real DOM node. No need for querying the DOM, no need to re-render the whole component, no more work to be done.

### Why Virtual DOM Is A Thing

Virtual DOM operates on a different principle. Virtual DOM library keeps track not only of the DOM tree it manages, but also of all the attributes and props that you have set on all the nodes.

When you want to update the DOM, you need to provide the virtual DOM library with an updated version of the virtual node that you want to update. So if you want to update an attribute, it needs to be the same as before (with all the other attributes and props and children), but with one attribute updated to the new value. Then you ask the virtual DOM library to update the old virtual node to the state of the new virtual node.

The library will then compare the two virtual nodes and make a list of changes that need to be applied to the real DOM. Depending on how exactly the whole thing is implemented, it will probably need to go and recursively compare the children as well. This is a lot of work, and for what – to just update one attribute, in this case.

So if virtual DOM is so inefficient, then why is that concept so popular? This goes back to what I've said above about writing your UI in a declarative manner. Some libraries like React.js give you a way to declare your desired DOM state as a function of the component's state (and props). Then, when the component's state/props change, React just re-runs the whole component, generating a new representation of the desired DOM tree.

Within such a framework, virtual DOM makes total sense – you have previous virtual DOM state, next virtual DOM state, and you don't know what changed in between, so you need to do the math to figure it out. Your only other alternative within that paradigm would be to scrap the old DOM tree (the real one, not virtual) and re-create the real DOM elements from the new description. However, that would be painfully slow as you would need to potentially re-create the entire application's DOM Tree if the update happens high up in the DOM tree hierarchy.

### Reactive Streams – Alternative For Declarative UI Programming

However, React's way is this is not the only way to write UI declaratively. Reactive streams (observables) is another paradigm. Using this approach you don't necessarily need a virtual DOM.

For example, you could represent an attribute's value as a stream of values to declare that it changes over time. Whenever you post a new value to that stream, the library would make a precision update to the DOM to update that one attribute, no virtual DOM needed, no further work required. Sounds familiar?

Oh yes, that's exactly what Scala DOM Builder does, except that it's unaware of the whole concept of reactive streams. So in other words, Scala DOM Builder doesn't do what is arguably the most interesting part in this story, the reactive part. This is because how exactly reactive programming should be done is pretty subjective. Scala DOM Builder exists to facilitate experimentation and evolution in that direction, not to provide opinions.
   
@TODO Mention Laminar as an example of this.

## Server Side Rendering

Scala DOM Builder does not readily support server side (JVM) rendering because it assumes existence of certain types in the `org.scalajs.dom` namespace (`dom.Element`, `dom.Event`, etc.). Knowledge of these types is not fundamental to Scala DOM Builder, however we use them to provide a convenient API to Scala.js users. This convenience is a priority goal for this project, and server side rendering is a somewhat conflicting goal.

That said, it is not impossible to resolve this conflict, we just need to spend the time and effort to come up with a good solution (more type params? stub types? dependent types? (somehow)). It is a bit too early right now to jump into this. I welcome any feedback and suggestions in this regard.

## Author

Nikita Gazarov – [raquo.com](http://raquo.com)

## License and Credits

Scala DOM Builder is provided under MIT license.

Comments marked with "MDN" are taken or derived from content created by Mozilla Contributors and are licensed under Creative Commons Attribution-ShareAlike license (CC-BY-SA), v2.5.

Files in `definitions` directory contain listings of DOM attributes, props, styles, etc. – Those were adapted from ScalaTags.
