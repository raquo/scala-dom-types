# Contribution Guide

We welcome any contributions that help further this project's design goals (see README.md)).

Feel free to open an issue before spending the time to implement your changes.

I can help you understand how to integrate Scala DOM Types into your library, and update our API to be more accommodating if needed. Opening an issue is the preferred way, so that others can also benefit from our discussion.

_Scala DOM Types_ is not v1.0 yet, so we're generally open to breaking changes that provide commensurate improvements.


## Workflow

We don't need many rules for now – just make a PR for your proposed change. Please don't push to master directly as I would like a chance to review things going there.

Breaking changes and new features should be documented in CHANGELOG.md


## Commit Messages

Please prefix commit messages with one of the following prefixes:

* `New` (new features or improved functionality)
* `API` (changes in the API)
* `Refactor` (change how things work under the hood, or a major rearrangement of things)
* `Fix` (bug fix, or a fixed test)
* `Naming` (for changes that are primarily just renaming)
* `Docs` (for documentation or comments)
* `Build` (for everything sbt-related)
* `Test` (new or updated tests)
* `Misc` (other things, or changes of no significant consequence such as formatting)

Commit messages should explain the main changes using imperative mood. For example:

* New: Add missing `onMouseLeave` and `onMouseEnter` event props
* Docs: Explain the difficulty of properly typing input events in README
* Build: Add Travis CI badge, improve build.sbt
* API: Make `Tag` a class, remove `Tag.build` method
* Fix: Properly mark void tags

These guidelines are for commit messages going into master. I think going forward we will be squash & merging PRs that have too many commits, or commits that don't follow this naming scheme.


## Contribution FAQ

**Q: I want to add an element / attribute / prop / etc.**

**A:** Awesome! We don't have a clear set of rules yet about which props / attributes / etc. we want to include in _Scala DOM Types_, so for now, open an issue and we'll see how to best deal with that on a case by case basis.

So far we are focused on HTML5 attributes and read-writeable DOM props, but it doesn't have to stay that way. There is value in providing listings for popular non-standard attributes as well (e.g. `autoCapitalize`, `unSelectable`) but we haven't decided how to deal with those yet. Don't hesitate to trigger this discussion though.

As a workaround, you can always create custom attributes / props / etc. in your project, or publish e.g. a collection of attributes as a separate project.
