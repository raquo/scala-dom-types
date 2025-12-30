package com.thirdparty.defs.attrs

import com.thirdparty.keys.GlobalAttr
import com.thirdparty.codecs.Codec

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait GlobalAttrs {


  def globalAttr[V](name: String, codec: Codec[V, String]): GlobalAttr[V] = new GlobalAttr(name, codec)


  @inline protected def intGlobalAttr(name: String): GlobalAttr[Int] = globalAttr(name, Codec.intAsString)

  @inline protected def stringGlobalAttr(name: String): GlobalAttr[String] = globalAttr(name, Codec.stringAsIs)



  /**
    * This attribute defines a unique identifier (ID) which must be unique in
    * the whole document. Its purpose is to identify the element when linking
    * (using a fragment identifier), scripting, or styling (with CSS).
    *
    * [[https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/id id @ MDN]]
    */
  lazy val idAttr: GlobalAttr[String] = stringGlobalAttr("id")


  /**
    * This integer attribute indicates if the element can take input focus (is
    * focusable), if it should participate to sequential keyboard navigation, and
    * if so, at what position. It can takes several values:
    *
    *  - a negative value means that the element should be focusable, but should
    *    not be reachable via sequential keyboard navigation;
    *  - 0 means that the element should be focusable and reachable via sequential
    *    keyboard navigation, but its relative order is defined by the platform
    *    convention;
    *  - a positive value which means should be focusable and reachable via
    *    sequential keyboard navigation; its relative order is defined by the value
    *    of the attribute: the sequential follow the increasing number of the
    *    tabindex. If several elements share the same tabindex, their relative order
    *    follows their relative position in the document).
    *
    * An element with a 0 value, an invalid value, or no tabindex value should be placed after elements with a positive tabindex in the sequential keyboard navigation order.
    *
    * [[https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/tabindex tabindex @ MDN]]
    */
  lazy val tabIndex: GlobalAttr[Int] = intGlobalAttr("tabindex")


}
