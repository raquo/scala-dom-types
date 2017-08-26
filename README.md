# Scala DOM Types

This project provides listings and type definitions for Javascript DOM HTML attributes, properties, CSS styles, and HTML tags.

Type definitions in this project are designed for easy integration into any kind of library. You can use this project to build your own DOM libraries like React or Snabbdom, but type-safe. For example, I use _Scala DOM Types_ in my other projects:

- [Scala DOM Builder](https://github.com/raquo/scala-dom-builder), a low level DOM manipulation and tree tracking library
- [Laminar](https://github.com/raquo/laminar), a high level, opinionated reactive UI library for Scala.js 
- [Scala DOM Test Utils](https://github.com/raquo/scala-dom-testutils), a library that verifies that your DOM node / tree matches provided description

## Why not ScalaTags

[ScalaTags](http://www.lihaoyi.com/scalatags/) is a popular Scala library that contains DOM type definitions similar to what we have here. However, _Scala DOM Types_ is different in a few ways:

- *More type safe*. For example, in _Scala DOM Types_ an `input` tag is linked to Scala.js `HTMLInputInput` class [1]. This lets you provide exact types for the DOM nodes you create, so that you don't need to perform unsafe casts in your application code if you want to e.g. access the `value` property on an `input` you created. Similarly, all attributes, properties and styles are linked to the types that they accept to prevent you from assigning incorrect values.

- *More flexible*. _Scala DOM Types_ does not tell you how to compose your attributes / props / styles / tags together, and does not enforce any rendering paradigm, you are free to implement your own composition. I see that some projects fork ScalaTags basically to just get the type definitions, I'm hoping there would be no need for that with _Scala DOM Types_. If you want ScalaTags-like the syntax: `a(href := "http://example.com", "Example link")`, [Scala DOM Builder](https://github.com/raquo/scala-dom-builder) provides exactly that.

There are some other differences, for example _Scala DOM Types_ uses camelCase for attr / prop / style names because that is consistent with common Scala style.

[1] You can still use _Scala DOM Types_ on the JVM, but obviously you can't get native JS types there. On the JVM you can provide your own replacements for specific Scala.js types, or just not bother with such specificity.

## Author

Nikita Gazarov – [raquo.com](http://raquo.com)

## License and Credits

_Scala DOM Types_ is provided under MIT license.

Files in `defs` directory contain listings of DOM attributes, props, styles, etc. – Those were adapted from Li Haoyi's [ScalaTags](http://www.lihaoyi.com/scalatags/#License).

Comments marked with "MDN" are taken or derived from content created by Mozilla Contributors and are licensed under Creative Commons Attribution-ShareAlike license (CC-BY-SA), v2.5.
