package com.raquo.domtypes.defs.tags

import com.raquo.domtypes.common.{HtmlTagType, TagDef}

object EmbedTagDefs {
  
  val defs: List[TagDef] = List(
    
    TagDef(
      tagType = HtmlTagType,
      scalaName = "img",
      domName = "img",
      isVoid = true,
      scalaJsElementTypeAlias = "dom.html.Image",
      javascriptElementType = "HTMLImageElement",
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
      scalaJsElementTypeAlias = "dom.html.IFrame",
      javascriptElementType = "HTMLIFrameElement",
      commentLines = List(
        "Represents a nested browsing context, that is an embedded HTML document.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "embedTag",
      domName = "embed",
      isVoid = true,
      scalaJsElementTypeAlias = "dom.html.Embed",
      javascriptElementType = "HTMLEmbedElement",
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
      scalaJsElementTypeAlias = "dom.html.Object",
      javascriptElementType = "HTMLObjectElement",
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
      scalaJsElementTypeAlias = "dom.html.Param",
      javascriptElementType = "HTMLParamElement",
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
      scalaName = "videoTag",
      domName = "video",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Video",
      javascriptElementType = "HTMLVideoElement",
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
      scalaName = "audioTag",
      domName = "audio",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Audio",
      javascriptElementType = "HTMLAudioElement",
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
      scalaName = "sourceTag",
      domName = "source",
      isVoid = true,
      scalaJsElementTypeAlias = "dom.html.Source",
      javascriptElementType = "HTMLSourceElement",
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
      scalaName = "trackTag",
      domName = "track",
      isVoid = true,
      scalaJsElementTypeAlias = "dom.html.Track",
      javascriptElementType = "HTMLTrackElement",
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
      scalaName = "canvasTag",
      domName = "canvas",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Canvas",
      javascriptElementType = "HTMLCanvasElement",
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
      scalaJsElementTypeAlias = "dom.html.Map",
      javascriptElementType = "HTMLMapElement",
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
      scalaName = "areaTag",
      domName = "area",
      isVoid = true,
      scalaJsElementTypeAlias = "dom.html.Area",
      javascriptElementType = "HTMLAreaElement",
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
