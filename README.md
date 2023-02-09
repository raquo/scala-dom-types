# Scala DOM Types
[![Build status](https://github.com/raquo/scala-dom-types/actions/workflows/test.yml/badge.svg)](https://github.com/raquo/scala-dom-types/actions/workflows/test.yml)
[![Chat on https://discord.gg/JTrUxhq7sj](https://img.shields.io/badge/chat-on%20discord-7289da.svg)](https://discord.gg/JTrUxhq7sj)
[![Maven Central](https://img.shields.io/maven-central/v/com.raquo/domtypes_sjs1_3.svg)](https://search.maven.org/artifact/com.raquo/domtypes_sjs1_3)

_Scala DOM Types_ provides listings of Javascript HTML and SVG tags as well as their attributes, DOM properties, and CSS styles, including the corresponding type information.

    "com.raquo" %% "domtypes" % "<version>"     // JVM & SBT
    "com.raquo" %%% "domtypes" % "<version>"    // Scala.js 1.9.0+

_Scala DOM Types_ is used by the following Scala.js UI libraries:

* [Laminar](https://github.com/raquo/Laminar)
* [Outwatch](https://github.com/OutWatch/outwatch)
* [Calico](https://github.com/armanbilge/calico)
* Add your own here.

As well as by:

* [Scala DOM Test Utils](https://github.com/raquo/scala-dom-testutils), a library that verifies that your DOM node / tree matches the spec


## Table of Contents

* [Community](#community)
* [Contributing](#contributing)
* [Why use _Scala DOM Types_](#why-use-scala-dom-types)
* [What about ScalaTags](#what-about-scalatags)
* [What about scala-js-dom](#what-about-scala-js-dom)
* [Design Goals](#design-goals)
* [Documentation](#documentation)
  * [How to Use _Scala DOM Types_ in Your Library](#how-to-use-scala-dom-types-in-your-library) 
  * [Migrating from an older version of _Scala DOM Types_](#migrating-to-code-generation-from-an-older-version-of-scala-dom-types)
  * [Codecs](#codecs)
  * [Reflected Attributes](#reflected-attributes)
  * [Complex Keys](#complex-keys)
  * [CSS](#css)
  * [Naming Differences Compared To Native HTML & DOM](#naming-differences-compared-to-native-html--dom)
* [Related Projects](#my-related-projects)



## Community

Please use [Github issues](https://github.com/raquo/scala-dom-types/issues) for bugs, feature requests, as well as all kinds of discussions, including questions on usage and integrations. You can _watch_ this project on Github to get issue updates if you're interested in following discussions.


## Contributing

**Q: I want to add an element tag / attribute / prop / etc.**

**A:** Awesome! Please open an issue, and we will either ask you to PR it, add it ourselves, or discuss why adding this particular key might not be a good idea.

So far we are focused on HTML5 attributes and read-writeable DOM props, but it doesn't have to stay that way. There is value in providing listings for popular non-standard attributes as well (e.g. `autoCapitalize`, `unSelectable`) but we haven't decided how to deal with those yet. Don't hesitate to trigger this discussion though.

The raw definitions that you need to update are found in the [shared/main/.../defs](#TODO) folder. The sample code generated from those definitions is found in [js/test/.../defs](#TODO).

If making a PR, please make sure to run the `GeneratorSpec` test locally, so that the sample generated code is updated before you commit.


## Why use _Scala DOM Types_

Canonical use case: you're writing a Scala or Scala.js library that does HTML / DOM construction / manipulation and want to provide a type-safe API like this:

```scala
div(
  zIndex := 9000,
  h1(rel := "title", "Hello world"),
  p(
    backgroundColor := "red",
    "Welcome to my fancy page!",
    span(draggable := true, "Fancyness is important.")
  ),
  button(onClick := doFancyThing, "Do Fancy Thing"),
  a(href := "http://example.com", title := "foo", "Example")
)
```

Of course, your API doesn't need to look anything like this, that's just an example. _Scala DOM Types_ doesn't actually provide the **`Tag.apply`** and **`:=`** methods that you'd need to make this example work.

If you do in fact want to create similar syntax, see guidelines for library authors below.


## What about ScalaTags

[ScalaTags](http://www.lihaoyi.com/scalatags/) is a popular Scala library that contains DOM type definitions similar to what we have here. However, _Scala DOM Types_ is different in a few ways:

- **More type safe**. For example, in _Scala DOM Types_ an `input` tag is linked to Scala.js `HTMLInputElement` class. This lets you provide exact types for the DOM nodes you create, so that you don't need to perform unsafe casts in your application code if you want to e.g. access the `value` property on an `input` you created. Similarly, all attributes, properties and styles are linked to the types that they accept to prevent you from assigning incorrect values.

- **More flexible**. _Scala DOM Types_ does not tell you how to define your attributes / props / styles / tags, or how to compose them together, and does not enforce any rendering paradigm. You are free to implement your own composition. I see that some projects fork ScalaTags just to get the type definitions without everything else. _Scala DOM Types_ does not get in your way, eliminating the need for such forking.

- **Better representation of native DOM types**. _Scala DOM Types_ handles Reflected Attributes consistently, and uses Codecs to properly encode/decode DOM values.


There are some other differences, for example _Scala DOM Types_ uses camelCase for attr / prop / style names because that is consistent with common Scala style.



## What about scala-js-dom

The [scala-js-dom](http://scala-js.github.io/scala-js-dom/) project serves a very different purpose – it provides typed Scala.js interfaces to native Javascript DOM classes such as `HTMLInputElement`. You can use those types when you already have instances of DOM elements, but you can not instantiate those types without using untyped methods like `document.createElement` because that is the only kind of API that Javascript provides for this.

On the other hand, _Scala DOM Types_ lets the consuming library create a type-safe _representation_ of real JS DOM nodes or trees, and it is up to your library's code to instantiate real JS nodes from the provided description.

Oh, and _Scala DOM Types_ **does** work on the JVM. Obviously you can't get native JS types there, but you can provide your own replacements for specific Scala.js types, or just not bother with such specificity at all.



## Design Goals

The purpose of _Scala DOM Types_ is to become a standard DOM types library used in Scala.js projects.


#### Precise Types

The most important type information must be encoded as Scala types. For example, DOM properties that only accept integers should be typed as such.  


#### Reasonably Precise Types

The types we provide will never be perfect. For example, MDN has this to say about the `list` attribute:

> The value must be the id of a <datalist> element in the same document. [...] This attribute is ignored when the type attribute's value is hidden, checkbox, radio, file, or a button type.

A far as I know, encoding such constraints as Scala types would be very hard, if it's even possible at all.

This is not to say that we are content with the level of type safety we currently have in _Scala DOM Types_. Improvements are welcome as long as they provide significantly more value than burden to users of this library. This kind of thing is often subjective, so I suggest you open an issue for discussion first.


#### Flexibility

_Scala DOM Types_ is a low level library that is used by other libraries. As such, its API should be unopinionated and focused solely on providing useful data about DOM elements / attributes / etc. to consuming libraries in a way that is easy for them to implement.

We achieve this with a code generation approach. Instead of providing Scala traits in a predefined format, we give you tools to generate such traits in your own library, with your desired data structures, types, naming conventions, etc.

You can also use the raw element / attribute / etc. data contained _Scala DOM Types_ yourself, whether at compile time or at runtime.


#### Sanity Preservation Measures

We should provide a better API than the DOM if we can do that in a way that keeps usage discoverable and unsurprising.

Developers familiar with the DOM API should generally be able to discover the names of attributes / tags / etc. they need using IDE autocompletion (assuming they expect the names to match the DOM API). For example: `forId` is a good name for the `for` attribute. It avoids using a Scala reserved word, and it starts with `for` like the original attribute, so it's easy to find. It also implies what kind of string is expected for a value (an `id` of an element).

Within that constraint, we should also try to clean up the more insane corners of the DOM API.

* For example, the difference between `value` attribute vs `value` property trips up even experienced developers all the time. Scala DOM Types on the other hand has a `defaultValue` reflected attribute and a `value` property, which behave the way everyone would expect from the given names or from their knowledge of the DOM API.
* For another example, enumerated attributes like `contentEditable` that in the DOM accept "true" / "false" or "on" / "off" or "yes" / "no" should be boolean attributes in _Scala DOM Types_.

All naming differences with the DOM API should be documented in the README file (see below). Type differences are generally assumed to be self-documenting.



## Documentation

[API doc](https://javadoc.io/doc/com.raquo/domtypes_sjs1_2.13/latest/com/raquo/domtypes/index.html)




### How to Use _Scala DOM Types_ in Your Library 

You generally don't want to use _Scala DOM Types_ directly as the end-user. If you just want to generate some HTML on the backend or something similarly simple, you might want to use [ScalaTags](https://github.com/com-lihaoyi/scalatags) instead, or create a new library for that based on _Scala DOM Types_ using the guide below.

So, you're building a DOM manipulation library such as [Laminar](https://github.com/raquo/Laminar), [Outwatch](https://github.com/OutWatch/outwatch) or [ScalaJS-React](https://github.com/japgolly/scalajs-react) (the former two use _Scala DOM Types_, the latter doesn't). This guide focuses on the Scala.js use case. _Scala DOM Types_ is perfectly usable from the backend as well, but it will need more customization. 

First off, if you're building such a library, you need to know quite a few things about how JS DOM works. _Scala DOM Types_ is just a collection of type information, it's not an abstraction layer for the DOM. _You're_ building the abstraction layer. We can't cover everything about JS DOM here, but we will touch on some of the nastier parts in the following sections.

1. Look at [MouseEventPropDefs](#TODO) in _Scala DOM Types_ – several of such listings contain all the data that this library offers. This particular file lists all the mouse-related events that you can handle in the DOM. We create such listings manually. See discussion in [#87](https://github.com/raquo/scala-dom-types/issues/87#issuecomment-1330332298) and [#47](https://github.com/raquo/scala-dom-types/issues/47) for why we don't generate these listings from some official source.

2. The data in `MouseEventPropDefs` can be used as-is in certain cases, but typically we want to transform it into well typed Scala traits that look like [GlobalEventProps](#TODO). In fact, prior to [#87](https://github.com/raquo/scala-dom-types/issues/87), such typed traits were the only format in which _Scala DOM Types_ offered its data. For example, here's the old [MouseEventProps](https://github.com/raquo/scala-dom-types/blob/v0.16.0-RC3/shared/src/main/scala/com/raquo/domtypes/generic/defs/eventProps/MouseEventProps.scala) from _Scala DOM Types_ version 0.16.0-RC3. As you can see, to make such a trait flexible enough for different libraries and runtimes, we had to use a lot of type params – not ideal, especially for end users who just want to see e.g. the type of events a certain key produces.

3. The new version of _Scala DOM Types_ relies on **code generation** to produce simple abstraction-free traits like [GlobalEventProps](#TODO), tailored for a specific UI library like Laminar. That `GlobalEventProps` file was in fact produced by this code generator as part of _Scala DOM Types_ [GeneratorSpec](#TODO) test, and its output is verified in [CompileSpec](#TODO).

    Previously, _Scala DOM Types_ offered highly abstracted traits as a runtime dependency of libraries like Laminar. Now, Laminar uses _Scala DOM Types_ at compile time only, generating similar traits at compile time. 
 
    In Laminar, the code generation is done in [DomDefsGenerator](#TODO). As you see, the generator is customized with the names of Laminar's own types, package names, and desired folder structure. See Laminar's [build.sbt](#TODO) and [project/build.sbt](#TODO) for the compile-time generator build setup.

    You will need to create a similar generator setup for your library.

4. There are several ways to customize _Scala DOM Types_ code generation. Simpler ones first:

   1. Provide different params to `CanonicalGenerator`'s constructor
   
   2. Provide different params to `CanonicalGenerator`'s `generate*Trait` methods

      (Including by transforming the list of defs that you pass to them)
   
   3. Instantiate `TraitGenerator` subclasses manually instead of calling `generate*Trait` methods
   
   4. Override `CanonicalGenerator`'s methods
   
   5. Extend individual `*TraitGenerator` classes, and override their methods
   
   6. Create your own generator, perhaps by extending `TraitGenerator` or `SourceGenerator`
   
   Typical usage of _Scala DOM Types_ should not require overly-involved customization effort. If your Scala.js use case seems unnecessarily hard to achieve, please let me know.

5. Provide the keys that are deliberately missing from _Scala DOM Types_

    We deliberately do not include a small set of "complex" keys that UI libraries tend to have different opinions about, such as the `class` and `style` HTML attributes. See the full list below. Your library needs to provide such keys itself, for example see [ComplexHtmlKeys](#TODO) and [ComplexSvgKeys](#TODO) in Laminar – those are not generated, but manually created.

6. Provide the Codecs. These are used to translate between Scala values and DOM values. See [codecs](#TODO) in Laminar. Your implementation will be almost identical, depending on whether you talk to the DOM directly or via some virtual DOM library with special needs. See below for more info on the codecs.

7. Provide concrete types for Tags, Attributes, etc., as well as their functionality (`apply` and `:=` methods, etc.). The type representing StyleProp should extend the `GlobalKeywords` generated style trait, or provide those keywords in some other way.

8. Finally, create "the bundle". You've generated a bunch of well typed traits and created concrete types – now you need to instantiate a single object that will extend all those traits to expose all the keys like `div`, `onClick`, etc. The actual implementation of this might vary based on your preferences and on how you configured the generator, but you can refer to the top of the [Laminar.scala](#TODO) file. As you see, I separate HTML keys from SVG keys and ARIA keys to avoid name collisions and reduce IDE autocomplete pollution. You can choose to do this differently, but that will require some customization on your part.

9. With the generator, you're adding comments derived from MDN content into your project – those comments are licensed under CC-BY-SA, so you need to add a corresponding notice to your project file (or customize code generation to not include the comments for every key). See the bottom of this README.


### Migrating to code generation from an older version of _Scala DOM Types_

1. Follow the guide above to set up a generator in your project as explained above

2. There is no built-in support for `TypeTargetEvent` anymore – just native JS types.

    You can implement / customize that in your project if you wish, but this isn't useful enough IMO.

3. CSS styles now have support for unit helpers – e.g. extensions like `paddingTop.px` or `width.calc("20px + 10%")`, however you need to implement all that behaviour, and copy-paste the unit traits into your code – see the [units](#TODO) in Laminar for example.  


### Reflected Attributes

HTML attributes and DOM properties are different things. As a prerequisite for this section, please read [this StackOverflow answer](https://stackoverflow.com/a/6004028/2601788) first. 

For more on this, read [Section 2.6.1 of this DOM spec](https://html.spec.whatwg.org/multipage/common-dom-interfaces.html#reflecting-content-attributes-in-idl-attributes). Note that it uses the term "IDL attributes" to refer to what we call "DOM properties", and "Content attributes" to refer to what we here call "HTML attributes".

So with that knowledge, `id` for example is a reflected attribute. Setting and reading it works exactly the same way regardless of whether you're using the HTML attribute `id`, or the DOM property `id`. Such reflected attributes live in `ReflectedHtmlAttrs` trait, which lets you build either attributes or properties depending on what implementation of `ReflectedHtmlAttrBuilder` you provide.

To keep you sane, _Scala DOM Types_ reflected attributes also normalize the DOM API a bit. For example, there is no `value` attribute in _Scala DOM Types_. There is only `defaultValue` reflected attribute, which uses either the `value` HTML attribute or the `defaultValue` DOM property depending on how you implement `ReflectedHtmlAttrBuilder`. This is because that attribute and that property behave the same even though they're named differently in the DOM, whereas the `value` DOM property has different behaviour (see the StackOverflow answer linked above). A corresponding HTML attribute with such behaviour does not exist, so in Scala DOM Types the `value` prop is defined in trait `Props`. It is not an attribute, nor is it a reflected attribute.

Reflected attributes may behave slightly differently depending on whether you implement them as props or attributes. For example, in HTML5 the `cols` reflected attribute has a default value of `20`. If you read the `col` property from an empty `<textarea>` element, you will get `20`. However, if you try to read the attribute `col`, you will get nothing because the attribute was never explicitly set.

Note that Javascript DOM performs better for reading/writing DOM props than reading/writing HTML attributes.


### Codecs

_Scala DOM Types_ provides some normalization of the native HTML / DOM API, which is crazy in places.

For example, there are a few ways to encode a boolean value into an HTML attribute:

1. As presence of the attribute – if attribute is present, `true`, else `false`.
2. As string "true" for true, or "false" for false
3. As string "yes" for true, or "no" for false.

Which one of those you need to use depends on the attribute. For example, attribute `disabled` needs option #1, but attribute `contenteditable` needs option #2. And then there are DOM Properties (as opposed to HTML Attributes) where booleans are encoded as actual booleans.

Similarly, numbers are encoded as strings in attributes, with no such conversion when working with properties.

_Scala DOM Types_ coalesces all these differences using codecs. When implementing a function that builds an attribute, you get provided with the attribute's name (key), datatype, and a codec that knows how to encode / decode that datatype into a value that should be passed to Javascript's native DOM API.

For example, the codecs for the three boolean options above are `BooleanAsPresence`, `BooleanAsTrueFalseString`, and `BooleanAsYesNoString`.

_Scala DOM Types_ provides a reference implementation of the codecs. Since you only use _Scala DOM Types_ at _compile time_, you should copy-paste that implementation into your own library, instead of trying to load _Scala DOM Types_ as a _runtime_ dependency.


### Complex Keys

Properties like `className` often require special handling in consuming libraries. For example, instead of a `String` based interface, you might want to offer a `Seq[String]` based one for `className`. Because there is little to standardize on, _Scala DOM Types_ deliberately does not provide those keys anymore. You need to add them to your library manually.

List of complex keys:

* `class`, `role`, `rel`, `style` HTML attributes
* `data-*` HTML attributes
* `class` and `rel` SVG attributes


### Naming Differences Compared To Native HTML & DOM

Although each library using _Scala DOM Types_ is free to generate whatever code it wants, we provide a canonical `scalaName` for every key that we recommend using. It is sometimes different from the native DOM name (`domName`).

Here is what the DOM attributes / props / etc. are called in `scalaName`:

#### General

* All `scalaName` identifiers are camelCased for consistency with conventional Scala style, e.g. `datalist` domName translates to `dataList` scalaName.

#### Attributes & Props
* `value` **attribute** is named `defaultValue` because native HTML naming is misleading and confusing ([example](https://stackoverflow.com/a/6004028/2601788))
  * Note that the `value` **property** retains its name
* `checked` **attribute** is named `defaultChecked` for the same reason
  * Note that the `checked` **property** retains its name
* `selected` **attribute** is named `defaultSelected` for the same reason
  * Note that the `selected` **property** retains its name
* `for` attribute and `htmlFor` property are available as reflected attribute `forId` for consistency and to avoid Scala reserved word
* `id` reflected attribute is named `idAttr`, `max` attribute is `maxAttr`, `min` is `minAttr`, and `step` is `stepAttr` to free up good names for end user code
* `name` attribute is named `nameAttr` to free up a good name
* `offset` and `result` SVG attributes are named `offsetAttr` and `resultAttr` respectively to free up good names for end user code
* `loading` reflected HTML attribute is named `loadingAttr` to avoid using a good name
* `content` attribute is named `contentAttr` to avoid using a common name
* `form` attribute is named `formId` to avoid conflict with `form` tag
* `label` attribute is named `labelAttr` to avoid conflict with `label` tag
* `height` attribute is named `heightAttr` to avoid conflict with `height` CSS property
* `width` attribute is named `widthAttr` to avoid conflict with `width` CSS property
* `list` attribute is named `listId` for clarity and consistency
* `contextmenu` attribute is named `contextMenuId` for clarity and consistency

#### CSS Style Props

* `content` prop is named `contentCss` to avoid using a common name

#### Tags
* Many tag names have a "Tag" suffix, usually to free up good names for end user code, or avoid some conflict, e.g.:
  * `style` -> `styleTag`, `link` -> `linkTag`, `param` -> `paramTag`, `map` -> `mapTag`, `title` -> `titleTag`, etc.

#### Aliases
* Attribute `type` == `typ` == `tpe` to avoid Scala reserved word

#### Special keys

Certain special keys are not defined in _Scala DOM Types_, and are left for the consuming library to define. Of those, typically:

* `class` attribute is named `className` and aliased as `cls`
* the `style` attribute is named `styleAttr`




## My Related Projects

- [Laminar](https://github.com/raquo/Laminar) – Reactive UI library based on _Scala DOM Types_
- [Scala DOM TestUtils](https://github.com/raquo/scala-dom-testutils) – Test that your Javascript DOM nodes match your expectations



## Author

Nikita Gazarov – [@raquo](https://twitter.com/raquo)



## License and Credits

_Scala DOM Types_ is provided under the [MIT license](https://github.com/raquo/scala-dom-types/blob/master/LICENSE.md).

Files in the [`defs`](https://github.com/raquo/scala-dom-types/tree/master/shared/src/main/scala/com/raquo/domtypes/defs) directory contain listings of DOM element tags, attributes, props, styles, etc. – Those were originally adapted from Li Haoyi's [ScalaTags](http://www.lihaoyi.com/scalatags/#License), which is also MIT licensed.

Comments pertaining to individual DOM element tags, attributes, properties and event properties, as well as CSS properties and their special values / keywords, are taken or derived from content created by Mozilla Contributors and are licensed under Creative Commons Attribution-ShareAlike license (CC-BY-SA), v2.5.
