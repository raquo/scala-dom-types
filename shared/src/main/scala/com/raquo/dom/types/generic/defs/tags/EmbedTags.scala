package com.raquo.dom.types.generic.defs.tags

import com.raquo.dom.types.generic.builders.TagBuilder

trait EmbedTags[T[_ <: DomElement], DomElement, HtmlImage <: DomElement, HtmlIframe <: DomElement, HtmlEmbed <: DomElement, HtmlObject <: DomElement, HtmlParam <: DomElement, HtmlVideo <: DomElement, HtmlAudio <: DomElement, HtmlSource <: DomElement, HtmlTrack <: DomElement, HtmlCanvas <: DomElement, HtmlMap <: DomElement, HtmlArea <: DomElement] {
  this: TagBuilder[T, DomElement] =>

  // @TODO[Docs] add links to canonical ScalaJS types in comments

  /**
    * Represents an image.
    *
    *  MDN
    */
  lazy val img: T[HtmlImage] = build("img")

  /**
    * Represents a nested browsing context, that is an embedded HTML document.
    *
    *  MDN
    */
  lazy val iframe: T[HtmlIframe] = build("iframe")

  /**
    * Represents a integration point for an external, often non-HTML, application
    * or interactive content.
    *
    *  MDN
    */
  lazy val embed: T[HtmlEmbed] = build("embed")

  /**
    * Represents an external resource, which is treated as an image, an HTML
    * sub-document, or an external resource to be processed by a plug-in.
    *
    *  MDN
    */
  lazy val `object`: T[HtmlObject] = build("object")

  /**
    * Defines parameters for use by plug-ins invoked by object elements.
    *
    *  MDN
    */
  lazy val param: T[HtmlParam] = build("param")

  /**
    * Represents a video, and its associated audio files and captions, with the
    * necessary interface to play it.
    *
    *  MDN
    */
  lazy val video: T[HtmlVideo] = build("video")

  /**
    * Represents a sound or an audio stream.
    *
    *  MDN
    */
  lazy val audio: T[HtmlAudio] = build("audio")

  /**
    * Allows the authors to specify alternate media resources for media elements
    * like video or audio
    *
    *  MDN
    */
  lazy val source: T[HtmlSource] = build("source")

  /**
    * Allows authors to specify timed text track for media elements like video or
    * audio
    *
    *  MDN
    */
  lazy val track: T[HtmlTrack] = build("track")

  /**
    * Represents a bitmap area that scripts can use to render graphics like graphs,
    * games or any visual images on the fly.
    *
    *  MDN
    */
  lazy val canvas: T[HtmlCanvas] = build("canvas")

  /**
    * In conjunction with area, defines an image map.
    *
    *  MDN
    */
  lazy val map: T[HtmlMap] = build("map")

  /**
    * In conjunction with map, defines an image map
    *
    *  MDN
    */
  lazy val area: T[HtmlArea] = build("area")
}
