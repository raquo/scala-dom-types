package com.raquo.domtypes.defs.tags

import com.raquo.domtypes.common.{HtmlTagType, TagDef}

object EmbedTags {
  
  val defs: List[TagDef] = List(
    
    TagDef(
      tagType = HtmlTagType,
      scalaName = "img",
      domName = "img",
      isVoid = true,
      scalaJsElementType = "dom.html.Image",
      javascriptElementType = "HTMLImageElement",
      implName = "htmlTag",
      commentLines = List(
        "Represents an image.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "iframe",
      domName = "iframe",
      isVoid = false,
      scalaJsElementType = "dom.html.Iframe",
      javascriptElementType = "HTMLIframeElement",
      implName = "htmlTag",
      commentLines = List(
        "Represents a nested browsing context, that is an embedded HTML document.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLIframeElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "embed",
      domName = "embed",
      isVoid = true,
      scalaJsElementType = "dom.html.Embed",
      javascriptElementType = "HTMLEmbedElement",
      implName = "htmlTag",
      commentLines = List(
        "Represents a integration point for an external, often non-HTML, application",
        "or interactive content.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/embed",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLEmbedElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "objectTag",
      domName = "object",
      isVoid = false,
      scalaJsElementType = "dom.html.Object",
      javascriptElementType = "HTMLObjectElement",
      implName = "htmlTag",
      commentLines = List(
        "Represents an external resource, which is treated as an image, an HTML",
        "sub-document, or an external resource to be processed by a plug-in.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/object",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLObjectElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "paramTag",
      domName = "param",
      isVoid = true,
      scalaJsElementType = "dom.html.Param",
      javascriptElementType = "HTMLParamElement",
      implName = "htmlTag",
      commentLines = List(
        "Defines parameters for use by plug-ins invoked by object elements.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/param",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLParamElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "video",
      domName = "video",
      isVoid = false,
      scalaJsElementType = "dom.html.Video",
      javascriptElementType = "HTMLVideoElement",
      implName = "htmlTag",
      commentLines = List(
        "Represents a video, and its associated audio files and captions, with the",
        "necessary interface to play it.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/video",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLVideoElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "audio",
      domName = "audio",
      isVoid = false,
      scalaJsElementType = "dom.html.Audio",
      javascriptElementType = "HTMLAudioElement",
      implName = "htmlTag",
      commentLines = List(
        "Represents a sound or an audio stream.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/audio",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLAudioElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "source",
      domName = "source",
      isVoid = true,
      scalaJsElementType = "dom.html.Source",
      javascriptElementType = "HTMLSourceElement",
      implName = "htmlTag",
      commentLines = List(
        "Allows the authors to specify alternate media resources for media elements",
        "like video or audio",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/source",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLSourceElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "track",
      domName = "track",
      isVoid = true,
      scalaJsElementType = "dom.html.Track",
      javascriptElementType = "HTMLTrackElement",
      implName = "htmlTag",
      commentLines = List(
        "Allows authors to specify timed text track for media elements like video or",
        "audio",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/track",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLTrackElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "canvas",
      domName = "canvas",
      isVoid = false,
      scalaJsElementType = "dom.html.Canvas",
      javascriptElementType = "HTMLCanvasElement",
      implName = "htmlTag",
      commentLines = List(
        "Represents a bitmap area that scripts can use to render graphics like graphs,",
        "games or any visual images on the fly.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/canvas",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "mapTag",
      domName = "map",
      isVoid = false,
      scalaJsElementType = "dom.html.Map",
      javascriptElementType = "HTMLMapElement",
      implName = "htmlTag",
      commentLines = List(
        "In conjunction with area, defines an image map.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/map",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMapElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "area",
      domName = "area",
      isVoid = true,
      scalaJsElementType = "dom.html.Area",
      javascriptElementType = "HTMLAreaElement",
      implName = "htmlTag",
      commentLines = List(
        "In conjunction with map, defines an image map",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/area",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement",
      ),
    ),

  )
  
}
