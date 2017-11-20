# Changelog

**Bolded items** in the log are breaking changes.

The following allowances for breaking changes exist _for now_:
* Minor version bump: breaking changes requiring changes in the code of consuming libraries
* Patch version bump: breaking changes not requiring changes in the consuming libraries (e.g. renaming an attribute would be allowed here – that should only break end user code).

TODO: Adopt more mature versioning, eventually. Read about eviction, binary compatibility, etc.

#### v0.4 (pending release) – Nov 2017

Summary: More precise event types, especially for input events

* Docs: Explain the difficulty of properly typing input events in README
* **New: More specific types for `FormEventProps`, introduce `TypedTargetEvent`**
* **New: More specific types: DomFocusEvent, DomDragEvent** 
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
