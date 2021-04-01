package com.raquo.domtypes.generic.defs

object SvgNamespaces {

  // @TODO[API]
  //  Currently we specify the namespace manually for SVG attributes.
  //  However, namespaces, for popular cases at least, can be derived from prefix, like this:
  //  - https://stackoverflow.com/q/52571125/2601788
  //  - https://github.com/angular/angular/commit/92084f2b6a7cc1c81e31b8f413424223e62806d8
  //  This would be a breaking change though, so save it for a bigger release

  val xlink: String = "http://www.w3.org/1999/xlink"

  val xml: String = "http://www.w3.org/XML/1998/namespace"

  val xmlns: String = "http://www.w3.org/2000/xmlns/"
}
