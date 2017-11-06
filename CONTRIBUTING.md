# Contribution Guide

We welcome any contributions that help further this project's design goals (see README.md)).

Feel free to open an issue before spending the time to implement your changes.

I can help you understand how to integrate Scala DOM Types into your library, and update our API to be more accommodating if needed. Opening an issue is the preferred way, so that others can also benefit from our discussion.

_Scala DOM Types_ is not v1.0 yet, so we're generally open to breaking changes that provide commensurate improvements.

Breaking changes and new features should be documented in CHANGELOG.md

## Contribution FAQ

**Q: I want to add an element / attribute / prop / etc.**

**A:** Awesome! We don't have a clear set of rules yet about which props / attributes / etc. we want to include in _Scala DOM Types_, so for now, open an issue and we'll see how to best deal with that on a case by case basis.

So far we are focused on HTML5 attributes and read-writeable DOM props, but it doesn't have to stay that way. There is value in providing listings for popular non-standard attributes as well (e.g. `autoCapitalize`, `unSelectable`) but we haven't decided how to deal with those yet. Don't hesitate to trigger this discussion though.

As a workaround, you can always create custom attributes / props / etc. in your project, or publish e.g. a collection of attributes as a separate project.
