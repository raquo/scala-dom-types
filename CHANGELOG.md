# Changelog

**Bolded items** in the log are breaking changes.

The following allowances for breaking changes exist _for now_:
* Minor version bump: breaking changes requiring changes in the code of consuming libraries
* Patch version bump: breaking changes not requiring changes in the consuming libraries (e.g. renaming an attribute would be allowed here – that should only break end user code).

TODO: Adopt more mature versioning, eventually. Read about eviction, binary compatibility, etc.

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
