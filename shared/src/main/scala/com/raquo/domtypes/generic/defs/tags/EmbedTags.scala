package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.TagBuilder

trait EmbedTags[T[_ <: DomHtmlElement], DomHtmlElement, HtmlImage <: DomHtmlElement, HtmlIframe <: DomHtmlElement, HtmlEmbed <: DomHtmlElement, HtmlObject <: DomHtmlElement, HtmlParam <: DomHtmlElement, HtmlVideo <: DomHtmlElement, HtmlAudio <: DomHtmlElement, HtmlSource <: DomHtmlElement, HtmlTrack <: DomHtmlElement, HtmlCanvas <: DomHtmlElement, HtmlMap <: DomHtmlElement, HtmlArea <: DomHtmlElement] {
  this: TagBuilder[T, DomHtmlElement] =>

  // @TODO[Docs] add links to canonical ScalaJS types in comments

  /**
    * Represents an image.
    *
    *  MDN
    */
  lazy val img: T[HtmlImage] = tag("img", void = true)

  /**
    * Represents a nested browsing context, that is an embedded HTML document.
    *
    *  MDN
    */
  lazy val iframe: T[HtmlIframe] = tag("iframe")

  /**
    * Represents a integration point for an external, often non-HTML, application
    * or interactive content.
    *
    *  MDN
    */
  lazy val embed: T[HtmlEmbed] = tag("embed", void = true)

  /**
    * Represents an external resource, which is treated as an image, an HTML
    * sub-document, or an external resource to be processed by a plug-in.
    *
    *  MDN
    */
  lazy val `object`: T[HtmlObject] = tag("object")

  /**
    * Defines parameters for use by plug-ins invoked by object elements.
    *
    *  MDN
    */
  lazy val param: T[HtmlParam] = tag("param", void = true)

  /**
    * Represents a video, and its associated audio files and captions, with the
    * necessary interface to play it.
    *
    *  MDN
    */
  lazy val video: T[HtmlVideo] = tag("video")

  /**
    * Represents a sound or an audio stream.
    *
    *  MDN
    */
  lazy val audio: T[HtmlAudio] = tag("audio")

  /**
    * Allows the authors to specify alternate media resources for media elements
    * like video or audio
    *
    *  MDN
    */
  lazy val source: T[HtmlSource] = tag("source", void = true)

  /**
    * Allows authors to specify timed text track for media elements like video or
    * audio
    *
    *  MDN
    */
  lazy val track: T[HtmlTrack] = tag("track", void = true)

  /**
    * Represents a bitmap area that scripts can use to render graphics like graphs,
    * games or any visual images on the fly.
    *
    *  MDN
    */
  lazy val canvas: T[HtmlCanvas] = tag("canvas")

  /**
    * In conjunction with area, defines an image map.
    *
    *  MDN
    */
  lazy val map: T[HtmlMap] = tag("map")

  /**
    * In conjunction with map, defines an image map
    *
    *  MDN
    */
  lazy val area: T[HtmlArea] = tag("area", void = true)
}
