package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.HtmlTagBuilder

trait EmbedTags[T[_ <: DomHtmlElement], DomHtmlElement, HtmlImage <: DomHtmlElement, HtmlIframe <: DomHtmlElement, HtmlEmbed <: DomHtmlElement, HtmlObject <: DomHtmlElement, HtmlParam <: DomHtmlElement, HtmlVideo <: DomHtmlElement, HtmlAudio <: DomHtmlElement, HtmlSource <: DomHtmlElement, HtmlTrack <: DomHtmlElement, HtmlCanvas <: DomHtmlElement, HtmlMap <: DomHtmlElement, HtmlArea <: DomHtmlElement] {
  this: HtmlTagBuilder[T, DomHtmlElement] =>

  // @TODO[Docs] add links to canonical ScalaJS types in comments

  /**
    * Represents an image.
    *
    *  MDN
    */
  @inline def img: T[HtmlImage] = htmlTag("img", void = true)

  /**
    * Represents a nested browsing context, that is an embedded HTML document.
    *
    *  MDN
    */
  @inline def iframe: T[HtmlIframe] = htmlTag("iframe")

  /**
    * Represents a integration point for an external, often non-HTML, application
    * or interactive content.
    *
    *  MDN
    */
  @inline def embed: T[HtmlEmbed] = htmlTag("embed", void = true)

  /**
    * Represents an external resource, which is treated as an image, an HTML
    * sub-document, or an external resource to be processed by a plug-in.
    *
    *  MDN
    */
  @inline def `object`: T[HtmlObject] = htmlTag("object")

  /**
    * Defines parameters for use by plug-ins invoked by object elements.
    *
    *  MDN
    */
  @inline def param: T[HtmlParam] = htmlTag("param", void = true)

  /**
    * Represents a video, and its associated audio files and captions, with the
    * necessary interface to play it.
    *
    *  MDN
    */
  @inline def video: T[HtmlVideo] = htmlTag("video")

  /**
    * Represents a sound or an audio stream.
    *
    *  MDN
    */
  @inline def audio: T[HtmlAudio] = htmlTag("audio")

  /**
    * Allows the authors to specify alternate media resources for media elements
    * like video or audio
    *
    *  MDN
    */
  @inline def source: T[HtmlSource] = htmlTag("source", void = true)

  /**
    * Allows authors to specify timed text track for media elements like video or
    * audio
    *
    *  MDN
    */
  @inline def track: T[HtmlTrack] = htmlTag("track", void = true)

  /**
    * Represents a bitmap area that scripts can use to render graphics like graphs,
    * games or any visual images on the fly.
    *
    *  MDN
    */
  @inline def canvas: T[HtmlCanvas] = htmlTag("canvas")

  /**
    * In conjunction with area, defines an image map.
    *
    *  MDN
    */
  @inline def map: T[HtmlMap] = htmlTag("map")

  /**
    * In conjunction with map, defines an image map
    *
    *  MDN
    */
  @inline def area: T[HtmlArea] = htmlTag("area", void = true)
}
