# Changelog

**Bolded items** in the log are breaking changes.

#### v0.14.3 – Apr 2021

* Build: Publish for Scala 3.0.0-RC3 
* Misc: Add `svg` namespace to SvgNamespaces (not used)

#### v0.14.2 – Apr 2021

* Build: Publish for Scala 3.0.0-RC2
* Fix: Specify correct namespace for `xmlns` SVG attribute

#### v0.14.1 – Mar 2021

* Build: Use `mapSourceURI` option to point source maps to github (thanks, [@ajablonski](https://github.com/ajablonski)!).
  * This should make source maps usable, I think.
* New: `AsIsCodec.apply` convenience method

#### v0.14.0 – Feb 2021

* **Build: Support Scala 3.0.0-RC1, bump Scala.js requirement to 1.5.0**

#### v0.13.0 – Feb 2021

* **API: CSS Styles now have a single `name` instead of `name` (camelCased) and `cssName` (kebab-cased).**
  * The new `name` is kebab-cased just like `cssName` before it. 
  * To migrate, first make sure you're not using the style's old `name`, then convert usages of the old `cssName` to `name`, and adjust various style-related overriden methods and constructor calls to only accept one `name` param.
  * As far as I can tell, the camelCased version of CSS property names is not actually used in native JS APIs, so you should have no use for the old `name`.

#### v0.12.1 – Feb 2021

* Build: Downgrade to Scala.js 1.1.0 to work around [this issue](https://github.com/scala-js/scala-js/issues/4416).
* Build: Temporarily drop Scala 3 (due to Scala.js downgrade)
* These changes will be undone in a future version. There is no reason to upgrade to 0.12.1 unless you are facing the same bug.

#### v0.12.0 – Jan 2021

* **API: Remove EventProp#domName**
  * Event names don't need lowercasing, which is what domName does. Event names are case sensitive, and this actually breaks custom Web Component events.
* **New: Add SVG `<a>` element, and `href` & `target` SVG attributes**
  * Same as HTML `<a>` element, but for SVGs.
  * Breaking because this adds a type param to `trait SvgTags`
* Build: Initial Scala 3.0.0-RC1-nightly support (thanks, [@yurique](https://github.com/yurique)!)

#### v0.11.0 – Jan 2021

* **New: CSS animation events (thanks, [@nghuuphuoc](https://github.com/nghuuphuoc)!)**
  * Breaking change: added type param to `MiscellaneousEventProps.scala`
* New: CSS transition events (thanks, [@ajaychandran](https://github.com/ajaychandran)!)
* New: fullscreen events (thanks, [@nghuuphuoc](https://github.com/nghuuphuoc)!)

#### v0.10.2 – Dec 2020

* New: `loadingAttr` reflected attribute (for images)
* Build: bump Scala and sbt versions

#### v0.10.1 – Aug 2020

* New: `slot` reflected attribute (for Web Components)

#### v0.10.0 – Mar 2020

* **Build: this release is Scala.js 1.x only**
* **Build: Upgrade to scala-js-dom 1.0.0**
  * This version removes types that were previously deprecated
  * Removed a couple type params from `GroupingTags` and `TableTags`, see diff
* **Naming: `id` -> `idAttr`, `min` -> `minAttr`, `max` -> `maxAttr`, `step` -> `stepAttr`, `offset` -> `offsetAttr`, `result` -> `resultAttr`**
* **Naming: `link` -> `linkTag`, `param` -> `paramTag`, `map` -> `mapTag`, `object` -> `objectTag`**

#### v0.9.7 – Mar 2020

* Build: Add Scala.js 1.0.0 support (thanks, [@lolgab](https://github.com/lolgab)!)
  * This is the last release that supports Scala.js 0.6.x

#### v0.9.6 – Nov 2019

* Fix: svg attribute typo: `mak` -> `mask` (thanks, [@weihsiu](https://github.com/weihsiu)!)

#### v0.9.5 – Aug 2019 

* Build: Add Scala 2.13 Support (thanks, [@zakpatterson](https://github.com/zakpatterson)!)

#### v0.9.4 – Feb 2019

* Fix: flexWrap.wrapReverse CSS name (thanks, [@fdietze](https://github.com/fdietze)!)

#### v0.9.3 – Jan 2019

* New: Pointer Events, TypedTargetPointerEvent (thanks, [@Busti](https://github.com/Busti)!)

#### v0.9.2 – Nov 2018

* Fix: `justifyContent.end`

#### v0.9.1 – Oct 2018

* New: Add `DOMContentLoaded` document event

#### v0.9 – Sep 2018

* **API: `AriaAttrs` now exposes attributes as members, without `aria` object**
* **API: Move `cls`, `className`, `rel`, `role`, and `styleAttr` into new `ComplexHtmlKeys` and `ComplexSvgKeys` traits, allowing for more freedom to define these keys in non-standard ways. Use `CanonicalComplexHtmlKeys` and `CanonicalComplexSvgKeys` to retain v0.8.1 functionality**
* **API: Remove `textContent` property. See discussion in [#41](https://github.com/raquo/scala-dom-types/issues/41) and [#43](https://github.com/raquo/scala-dom-types/pull/43)**
* **API: Remove `classNames` reflected attribute. You can define it locally or use the new `ComplexHtmlKeys` functionality to get the desired API**

#### v0.8.1 – Sep 2018

* **Fix: `span`, `fontSizeAdjust`, `listStyleImage.none` should be `lazy val`s, not `def`s**

#### v0.8 – Aug 2018

* **New: Add `namespace` param to `SvgAttr`**
* **Naming: `xlink` -> `xlinkRole` to match native attribute name**
* **Naming: Add `Html` to various traits that deal with HTML attributes**

#### v0.7.1 – Jul 2018

* **Fix: `autocomplete` is now a string attribute ([#33](https://github.com/raquo/scala-dom-types/pull/33))**

#### v0.7 – Apr 2018

* **API: Better separation of HTML/SVG tags and attributes**
* **Naming: el -> element in Modifier.apply**
* Upgrade Scala.js and other build dependencies

#### v0.6 – Apr 2018

* **New: SVG Support (see README). Some type params now require types `T <: dom.html.Element` instead of `T <: dom.Element`.** 
* **API: `Element` no longer has `tagName` and `void` members, instead it now has one `tag` member**
* **Naming: `tagName` -> `name` in `Tag`**
* **API: Make `Modifier.apply` non-abstract to prevent SAM sugar**

Includes SVG contributions from [@doofin](https://github.com/doofin). Thanks!

#### v0.5 – Dec 2017

* API: Introduce `TypedTargetMouseEvent` and `TypedTargetFocusEvent`
* **API: Change type params related to `TypedTargetEvent` in generic `MouseEventProps` and `FormEventProps` traits**

#### v0.4.2 – Dec 2017

* Build: Remove `-Xcheckinit` compiler option due to its [runtime overhead](https://docs.scala-lang.org/tutorials/FAQ/initialization-order.html)

#### v0.4.1 – Nov 2017

* New: Add missing `onMouseLeave` and `onMouseEnter` event props

Thanks, [@mariusmuja](https://github.com/mariusmuja)!

#### v0.4 – Nov 2017

Summary: More precise event types, especially for input and form events

* Docs: Explain the difficulty of properly typing input events in README
* **New: More specific types for `FormEventProps`, introduce `TypedTargetEvent`**
* **New: More specific event types: `DomFocusEvent`, `DomDragEvent`, `PageTransitionEvent`, etc.** 
* New: aggregated eventProp traits like `GlobalEventProps`
* **API: Protect builder methods like `AttrBuilder.attr`**
* **API: Make `Tag` a class, remove `Tag.build` method**
* Fix: A bunch of Error & Window events had incorrect JS string names ("onerror" vs "error") 
* **Naming: WindowEventProps -> WindowOnlyEventProps**
* Build: add Travis CI badge, improve build.sbt
* Misc: Bring back `cls` and `tpe` attribute aliases

Includes contributions from [@cornerman](https://github.com/cornerman). Thanks!

#### v0.3 – Nov 2017

Summary: API and documentation improvements, support usage from Outwatch 

* New: Add Changelog and Contribution guide
* New: Documentation and Design Goals sections in README, add detail to Scaladoc comments
* **New: Introduce Reflected Attributes**
* **New: Introduce Codecs (replace BooleanAttr)**
* New: Implement Canonical Builders
* New: Add CompileTest
* **New: Allow all listings to be joined in one bundle**
* **New: Provide improved API for `value`, `checked`, `selected` attributes**
* **Fix: Add, rename, reorganize & fix the types of many attributes / props / etc.**
* Fix: Properly mark void tags

#### v0.1, v0.1.1, v0.1.2, v0.1.3, v0.2, v0.2.1

Summary: Genesis. Archaeological adventurers, see git commit messages.
