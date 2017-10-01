# Scala DOM Types

This project provides listings and type definitions for Javascript HTML tags as well as their attributes, properties, and CSS styles. 

    "com.raquo" %%% "domtypes" % "0.2"    // scala.js
    "com.raquo" %% "domtypes" % "0.2"     // JVM

Type definitions in this project are designed for easy integration into any kind of library. You can use this project to build your own DOM libraries like React or Snabbdom, but type-safe. For example, I use _Scala DOM Types_ in my other projects:

- [Scala DOM Builder](https://github.com/raquo/scala-dom-builder), a low level DOM manipulation and tree tracking library
- [Laminar](https://github.com/raquo/laminar), a high level, opinionated reactive UI library for Scala.js 
- [Scala DOM Test Utils](https://github.com/raquo/scala-dom-testutils), a library that verifies that your DOM node / tree matches provided description

`DOM` stands [Document Object Model](https://developer.mozilla.org/en-US/docs/Web/API/Document_Object_Model/Introduction), in our context it's an object that represents an HTML document along with its HTML elements and their attributes, props and styles.

## Why use _Scala DOM Types_

Canonical use case: you're writing a Scala library that does HTML / DOM construction / manipulation and want to provide a type-safe API like this:

```scala
div(
  h1(rel := "title", "Hello world"),
  p(
    backgroundColor := "red",
    "Welcome to my fancy page!",
    b("Fancyness is important.")
  ),
  button(onClick := doFancyThing, "Do Fancy Thing"),
  a(href := "http://example.com", title := "foo", "Example")
)
```

Of course, your API doesn't need to look anything like this, that's just an example. _Scala DOM Types_ doesn't actually provide the `Tag.apply` and `:=` methods that you'd need to make this example work. If you do in fact want similar syntax, consider using [Scala DOM Builder](https://github.com/raquo/scala-dom-builder) or some of its classes (it's also very extensible and reusable).  

You also don't need to be writing a whole library to benefit from _Scala DOM Types_, you can use it instead to make your application code more type-safe. For example, your imaginary method

```scala
getProperty(element: dom.Element, propName: String, propValue: Any)
```

could become
 
```scala
getProperty[Value](element: dom.Element, prop: Prop[Value], propValue: Value)
```

Now you can't pass just about any random string as `propName`, and even `propValue` is now type checked.

However, if all you want is more type safety in your application code, you might want to import tags / attrs / etc. from Scala DOM Builder's `simple` package instead because those don't require any boilerplate on your side. 


## Why not ScalaTags

[ScalaTags](http://www.lihaoyi.com/scalatags/) is a popular Scala library that contains DOM type definitions similar to what we have here. However, _Scala DOM Types_ is different in a few ways:

- **More type safe**. For example, in _Scala DOM Types_ an `input` tag is linked to Scala.js `HTMLInputInput` class. This lets you provide exact types for the DOM nodes you create, so that you don't need to perform unsafe casts in your application code if you want to e.g. access the `value` property on an `input` you created. Similarly, all attributes, properties and styles are linked to the types that they accept to prevent you from assigning incorrect values.

- **More flexible**. _Scala DOM Types_ does not tell you how to compose your attributes / props / styles / tags together, and does not enforce any rendering paradigm, you are free to implement your own composition. I see that some projects fork ScalaTags basically to just get the type definitions, I'm hoping there would be no need for that with _Scala DOM Types_. If you want ScalaTags-like the syntax: `a(href := "http://example.com", "Example link")`, [Scala DOM Builder](https://github.com/raquo/scala-dom-builder) provides exactly that.

There are some other differences, for example _Scala DOM Types_ uses camelCase for attr / prop / style names because that is consistent with common Scala style.

## What about scala-js-dom

The [scala-js-dom](http://scala-js.github.io/scala-js-dom/) project serves a very different purpose – it provides typed Scala.js interfaces to native Javascript DOM classes such as `HTMLInputElement`. You can use those types when you already have instances of DOM elements, but you can not instantiate those types without using untyped methods like `document.createElement` because that is the only kind of API that Javascript provides for this.

On the other hand, _Scala DOM Types_ lets the consuming library create a type-safe _representation_ of real JS DOM nodes or trees, and it is up to your library's code to instantiate real JS nodes from the provided description. [Scala DOM Builder](https://github.com/raquo/scala-dom-builder) does it in the most straightforward way, but higher level libraries like React or [Snabbdom](https://github.com/raquo/Snabbdom.scala) could use those representations in their own ways, e.g. to create virtual DOM structures.

Oh and _Scala DOM Types_ **does** work on the JVM. Obviously you can't get native JS types there, but you can provide your own replacements for specific Scala.js types, or just not bother with such specificity.

## Author

Nikita Gazarov – [raquo.com](http://raquo.com)

## License and Credits

_Scala DOM Types_ is provided under MIT license.

Files in `defs` directory contain listings of DOM attributes, props, styles, etc. – Those were adapted from Li Haoyi's [ScalaTags](http://www.lihaoyi.com/scalatags/#License).

Comments marked with "MDN" are taken or derived from content created by Mozilla Contributors and are licensed under Creative Commons Attribution-ShareAlike license (CC-BY-SA), v2.5.
