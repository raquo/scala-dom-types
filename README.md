# Scala DOM Types
[![Build Status](https://travis-ci.org/raquo/scala-dom-types.svg?branch=master)](https://travis-ci.org/raquo/scala-dom-types)

This project provides listings and type definitions for Javascript HTML tags as well as their attributes, properties, and CSS styles. 

    "com.raquo" %%% "domtypes" % "0.4.1"    // scala.js
    "com.raquo" %% "domtypes" % "0.4.1"     // JVM

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

Of course, your API doesn't need to look anything like this, that's just an example. _Scala DOM Types_ doesn't actually provide the **`Tag.apply`** and **`:=`** methods that you'd need to make this example work.

If you do in fact want similar syntax, you could extend `Tag`, `Attr`, `Prop`, etc., or provide your own alternatives to those (_Scala DOM Types_ does not require you to use its own traits).

You can also extend the API of those classes with implicit conversions / implicit classes instead of subclassing. Or you might even use [Scala DOM Builder](https://github.com/raquo/scala-dom-builder) if that's what you need, or some of its individual classes (it's also very extensible and reusable).  

---

You don't need to be writing a whole library to benefit from _Scala DOM Types_, you can use it instead to make your application code more type-safe. For example, your imaginary method

```scala
setProperty(element: dom.Element, propName: String, propValue: Any)
```

could become
 
```scala
setProperty[Value](element: dom.Element, prop: Prop[Value], propValue: Value)
```

Now you can't pass just about any random string as `propName`, and even `propValue` is now type checked.

However, if all you want is more type safety in your application code, you might want to import tags / attrs / etc. from [Scala DOM Builder](https://github.com/raquo/scala-dom-builder)'s `simple` package instead because those don't require any boilerplate on your side. 


## What about ScalaTags

[ScalaTags](http://www.lihaoyi.com/scalatags/) is a popular Scala library that contains DOM type definitions similar to what we have here. However, _Scala DOM Types_ is different in a few ways:

- **More type safe**. For example, in _Scala DOM Types_ an `input` tag is linked to Scala.js `HTMLInputInput` class. This lets you provide exact types for the DOM nodes you create, so that you don't need to perform unsafe casts in your application code if you want to e.g. access the `value` property on an `input` you created. Similarly, all attributes, properties and styles are linked to the types that they accept to prevent you from assigning incorrect values.

- **More flexible**. _Scala DOM Types_ does not tell you how to compose your attributes / props / styles / tags together, and does not enforce any rendering paradigm, you are free to implement your own composition. I see that some projects fork ScalaTags basically to just get the type definitions, I'm hoping there would be no need for that with _Scala DOM Types_.

There are some other differences, for example _Scala DOM Types_ uses camelCase for attr / prop / style names because that is consistent with common Scala style.

## What about scala-js-dom

The [scala-js-dom](http://scala-js.github.io/scala-js-dom/) project serves a very different purpose – it provides typed Scala.js interfaces to native Javascript DOM classes such as `HTMLInputElement`. You can use those types when you already have instances of DOM elements, but you can not instantiate those types without using untyped methods like `document.createElement` because that is the only kind of API that Javascript provides for this.

On the other hand, _Scala DOM Types_ lets the consuming library create a type-safe _representation_ of real JS DOM nodes or trees, and it is up to your library's code to instantiate real JS nodes from the provided description. [Scala DOM Builder](https://github.com/raquo/scala-dom-builder) does that in the most straightforward way, but higher level libraries like React or [Snabbdom](https://github.com/raquo/Snabbdom.scala) could use _Scala DOM Types_ in their own way, e.g. to create _virtual_ DOM structures.

Oh and _Scala DOM Types_ **does** work on the JVM. Obviously you can't get native JS types there, but you can provide your own replacements for specific Scala.js types, or just not bother with such specificity (see [`defs.sameRefTags`](https://github.com/raquo/scala-dom-types/blob/master/shared/src/main/scala/com/raquo/domtypes/generic/defs/package.scala)).

## Design Goals

The purpose of _Scala DOM Types_ is to become a standard DOM types library used in Scala projects, both in Scala.js and the JVM.

#### Precise Types

The most important type information must be encoded as Scala types. For example, DOM properties that only accept integers should be typed as such.  

#### Reasonably Precise Types

The types we provide will never be perfect. For example, MDN has this to say about the `list` attribute (`listId` in our API):

> The value must be the id of a <datalist> element in the same document. [...] This attribute is ignored when the type attribute's value is hidden, checkbox, radio, file, or a button type.

A far as I know, encoding such constraints as Scala types would be very hard, if possible at all.

This is not to say that we are content with the level of type safety we currently have in _Scala DOM Types_. Improvements are welcome as long as they provide significantly more value than burden to the users of this library. This kind of thing is often subjective, so I suggest you open an issue for discussion first.

#### Flexibility

_Scala DOM Types_ is a low level library that is used by other libraries. As such, its API should be unopinionated and focused solely on providing useful data about DOM elements / attributes / etc. to consuming libraries in a way that is easy for them to implement.

#### Sanity Preservation Measures

We should provide a better API than the DOM if we can do that in a way that keeps usage discoverable and non-surprising.

Developers familiar with the DOM API should generally be able to discover the names of attributes / tags / etc. they need using IDE autocompletion (assuming they expect the names to match the DOM API). For example: `forId` is a good name for the `for` attribute. It avoids using a Scala reserved word, and it starts with `for` like the original attribute, so it's easy to find. It also implies what kind of string is expected for a value (an `id` of an element).

Within that constraint, we should also try to clean up the more insane corners of the DOM API.

* For example, the difference between `value` attribute vs `value` property trips up even experienced developers all the time. Scala DOM Types on the other hand has a `defaultValue` reflected attribute and a `value` property, which behave the way everyone would expect from the given names or from their knowledge of the DOM API.
* For another example, enumerated attributes like `contentEditable` that in the DOM accept "true" / "false" or "on" / "off" or "yes" / "no" should be boolean attributes in _Scala DOM Types_.

All naming differences with the DOM API should be documented in the README file (see below). Type differences are generally assumed to be self-documenting.

## Documentation

TODO:

* Write about general project structure, builders, etc.
* Provide links to specific implementation examples in other libraries (use my keys + implicits, or use your own keys) 

### Codecs

_Scala DOM Types_ provides some normalization of the native HTML / DOM API, which is crazy in places.

For example, there are a few ways to encode a boolean value into an HTML attribute:

1. As presence of the attribute – if attribute is present, `true`, else `false`.
2. As string "true" for true, or "false" for false
3. As string "yes" for true, or "no" for false.

Which one of those you need to use depends on the attribute. For example, attribute `disabled` needs option #1, but attribute `contenteditable` needs option #2. And then there are DOM Properties (as opposed to HTML Attributes) where booleans are encoded as actual booleans.

Similarly, numbers are encoded as strings in attributes, with no such conversion when working with properties.

_Scala DOM Types_ coalesces all these differences using codecs. When implementing a function that builds an attribute, you get provided with the attribute's name (key), datatype, and a codec that knows how to encode / decode that datatype into a value that should be passed to Javascript's native DOM API.

For example, the codecs for the three boolean options above are `BooleanAsPresenceCodec`, `BooleanAsTrueFalseStringCodec`, and `BooleanAsYesNoStringCodec`. They have concrete implementations of encode / decode methods but of course you don't have to use those.

### Reflected Attributes

HTML attributes and DOM properties are different things. As a prerequisite for this section, please read [this StackOverflow answer](https://stackoverflow.com/a/6004028/2601788) first. 

For more on this, read [Section 2.6.1 of this DOM spec](https://html.spec.whatwg.org/multipage/common-dom-interfaces.html#reflecting-content-attributes-in-idl-attributes). Note that it uses the term "IDL attributes" to refer to what we call "DOM properties", and "Content attributes" to refer to what we here call "HTML attributes".

So with that knowledge, `id` for example is a reflected attribute. Setting and reading it works exactly the same way regardless of whether you're using the HTML attribute `id`, or the DOM property `id`. Such reflected attributes live in `ReflectedAttrs` trait, which lets you build either attributes or properties depending on what implementation of `ReflectedAttrBuilder` you provide.

To keep you sane, _Scala DOM Types_ reflected attributes also normalize the DOM API a bit. For example, there is no `value` attribute in _Scala DOM Types_. There is only `defaultValue` reflected attribute, which uses either the `value` HTML attribute or the `defaultValue` DOM property depending on how you implement `ReflectedAttrBuilder`. This is because that attribute and that property behave the same even though they're named differently in the DOM, whereas the `value` DOM property has different behaviour (see the StackOverflow answer linked above). A corresponding HTML attribute with such behaviour does not exist, so in Scala DOM Types the `value` prop is defined in trait `Props`. It is not an attribute, nor is it a a reflected attribute.

Reflected attributes may behave slightly differently depending on whether you implement them as props or attributes. For example, in HTML5 the `cols` reflected attribute has a default value of `20`. If you read the `col` property fro man empty `<textarea>` element, you will get `20`. However, if you try to read the attribute `col`, you will get nothing because the attribute was never explicitly set.

Note that Javascript DOM performs better for reading/writing DOM props than reading/writing HTML attributes.

### DOM Events & `dom.Event.target`

When listening to `onChange`, `onSelect`, `onInput` events found in `FormEventProps`, you often need to access `event.target.value` to get the new value of the input element the event was fired on. However, `dom.Event.target` is an `EventTarget`, whereas the `value` property is only defined on `HTMLInputElement`, which `EventTarget` is not.

Properly typing `target` in JS events is hard because almost all events in which we care about it could fire not only on `HTMLInputElement`, but also `HTMLTextAreaElement`, and even `HTMLElement` in some cases (`onInput` on element with `contentEditable` set to `true`). 

_Scala DOM Types_ provides a few type params in `FormEventProps` to help deal with this mess, as well as the `TypedTargetEvent` type refinement trait. Ultimately, you simply can't safely use `.target` as something other than an `HTMLElement` for most events due to the underlying JS API being very dynamic.

For related discussion see [issue #13](https://github.com/raquo/scala-dom-types/issues/13) and [Outwatch issue #93](https://github.com/OutWatch/outwatch/issues/93), and some comments on [PR #9](https://github.com/raquo/scala-dom-types/pull/9).


### Naming Differences Compared To Native HTML & DOM

We try to make the native HTML & DOM API a bit saner to work with in Scala.

#### General

* All identifiers are camelCased, (e.g. `datalist` is `dataList`) for consistency with conventional Scala style.
* `data-<suffix>` attributes are created using `dataAttr(suffix: String)` factory
* `aria-<suffix>` attributes are renamed `aria.<suffix>`

#### Individual identifiers
* `value` **attribute** is renamed `defaultValue` because native naming is misleading and confusing ([example](https://stackoverflow.com/a/6004028/2601788))
  * Note that the `value` **property** retains its name
* `checked` **attribute** is renamed to `defaultChecked` for the same reason
  * Note that the `checked` **property** retains its name
* `selected` **attribute** is renamed to `defaultSelected` for the same reason
  * Note that the `selected` **property** retains its name
* `class` **attribute** is renamed to `className` for consistency with reflected property name, and to avoid Scala reserved word
* `for` attribute and `htmlFor` property are available as reflected attribute `forId` for consistency and to avoid Scala reserved word
* `style` attribute is renamed to `styleAttr` to let you implement a custom `style` attribute if you want.
* `style` tag is renamed to `styleTag` for the same reason, to avoid hogging a good name
* `title` tag is renamed to `titleTag` to avoid conflict with `title` reflected attribute
* `content` attribute is renamed to `contentAttr` to avoid conflict with `content` CSS property
* `form` attribute is renamed to `formId` to avoid conflict with `form` tag
* `height` attribute is renamed to `heightAttr` to avoid conflict with `height` CSS property
* `width` attribute is renamed to `widthAttr` to avoid conflict with `width` CSS property
* `list` attribute is renamed to `listId` for clarity and consistency
* `contextmenu` attribute is renamed to `contextMenuId` for clarity and consistency

#### Aliases
* Attribute `type` == `typ` == `tpe` to avoid Scala reserved word
* Attribute `className` == `cls` for consistency with Scala / ScalaTags


## My Related Projects

- [Scala DOM Builder](https://github.com/raquo/scala-dom-builder) – Low-level Scala & Scala.js library for building and manipulating DOM trees
- [Scala DOM TestUtils](https://github.com/raquo/scala-dom-testutils) – Test that your Javascript DOM nodes match your expectations
- [Laminar](https://github.com/raquo/laminar) – Reactive UI library based on _Scala DOM Builder_
- [Snabbdom.scala](https://github.com/raquo/Snabbdom.scala) – Scala.js interface to a popular JS virtual DOM library
- [XStream.scala](https://github.com/raquo/XStream.scala) – Scala.js interface to a simple JS reactive streams library
- [Cycle.scala](https://github.com/raquo/Cycle.scala) – Scala.js interface to a popular JS functional reactive library

## Author

Nikita Gazarov – [raquo.com](http://raquo.com)

## License and Credits

_Scala DOM Types_ is provided under the [MIT license](https://github.com/raquo/scala-dom-types/blob/master/LICENSE.md).

Files in [`defs`](https://github.com/raquo/scala-dom-types/tree/master/shared/src/main/scala/com/raquo/domtypes/generic/defs) directory contain listings of DOM attributes, props, styles, etc. – Those were adapted from Li Haoyi's [ScalaTags](http://www.lihaoyi.com/scalatags/#License), which is also MIT licensed.

Comments marked with "MDN" are taken or derived from content created by Mozilla Contributors and are licensed under Creative Commons Attribution-ShareAlike license (CC-BY-SA), v2.5.
