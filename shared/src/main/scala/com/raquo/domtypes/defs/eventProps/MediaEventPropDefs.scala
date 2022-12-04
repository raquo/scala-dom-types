package com.raquo.domtypes.defs.eventProps

import com.raquo.domtypes.common.EventPropDef

/**
  * Media Events - triggered by media like videos, images and audio. These apply to
  * all HTML elements, but they are most common in media elements, like <audio>,
  * <embed>, <img>, <object>, and <video>.
  */
object MediaEventPropDefs {
  
  val defs: List[EventPropDef] = List(
    
    EventPropDef(
      scalaName = "onAbort",
      domName = "abort",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run on abort",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/abort_event",
      ),
    ),

    EventPropDef(
      scalaName = "onCanPlay",
      domName = "canplay",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when a file is ready to start playing (when it has buffered enough to begin)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/canplay_event",
      ),
    ),

    EventPropDef(
      scalaName = "onCanPlayThrough",
      domName = "canplaythrough",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when a file can be played all the way to the end without pausing for buffering",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/canplaythrough_event",
      ),
    ),

    EventPropDef(
      scalaName = "onCueChange",
      domName = "cuechange",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when the cue changes in a <track> element",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/TextTrack/cuechange_event",
      ),
    ),

    EventPropDef(
      scalaName = "onDurationChange",
      domName = "durationchange",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when the length of the media changes",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/durationchange_event",
      ),
    ),

    EventPropDef(
      scalaName = "onEmptied",
      domName = "emptied",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when something bad happens and the file is suddenly unavailable (like unexpectedly disconnects)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/emptied_event",
      ),
    ),

    EventPropDef(
      scalaName = "onEnded",
      domName = "ended",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when the media has reach the end (a useful event for messages like \"thanks for listening\")",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/ended_event",
      ),
    ),

    EventPropDef(
      scalaName = "onLoadedData",
      domName = "loadeddata",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when media data is loaded",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/loadeddata_event",
      ),
    ),

    EventPropDef(
      scalaName = "onLoadedMetadata",
      domName = "loadedmetadata",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when meta data (like dimensions and duration) are loaded",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/loadedmetadata_event",
      ),
    ),

    EventPropDef(
      scalaName = "onLoadStart",
      domName = "loadstart",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run just as the file begins to load before anything is actually loaded",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/loadstart_event",
      ),
    ),

    EventPropDef(
      scalaName = "onPause",
      domName = "pause",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when the media is paused either by the user or programmatically",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/pause_event",
      ),
    ),

    EventPropDef(
      scalaName = "onPlay",
      domName = "play",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when the media is ready to start playing",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/play_event",
      ),
    ),

    EventPropDef(
      scalaName = "onPlaying",
      domName = "playing",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when the media actually has started playing",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/playing_event",
      ),
    ),

    EventPropDef(
      scalaName = "onProgress",
      domName = "progress",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when the browser is in the process of getting the media data",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/progress_event",
      ),
    ),

    EventPropDef(
      scalaName = "onRateChange",
      domName = "ratechange",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run each time the playback rate changes (like when a user switches to a slow motion or fast forward mode)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/ratechange_event",
      ),
    ),

    EventPropDef(
      scalaName = "onSeeked",
      domName = "seeked",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when the seeking attribute is set to false indicating that seeking has ended",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/seeked_event",
      ),
    ),

    EventPropDef(
      scalaName = "onSeeking",
      domName = "seeking",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when the seeking attribute is set to true indicating that seeking is active",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/seeking_event",
      ),
    ),

    EventPropDef(
      scalaName = "onStalled",
      domName = "stalled",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when the browser is unable to fetch the media data for whatever reason",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/stalled_event",
      ),
    ),

    EventPropDef(
      scalaName = "onSuspend",
      domName = "suspend",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when fetching the media data is stopped before it is completely loaded for whatever reason",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/suspend_event",
      ),
    ),

    EventPropDef(
      scalaName = "onTimeUpdate",
      domName = "timeupdate",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when the playing position has changed (like when the user fast forwards to a different point in the media)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/timeupdate_event",
      ),
    ),

    EventPropDef(
      scalaName = "onVolumeChange",
      domName = "volumechange",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run each time the volume is changed which (includes setting the volume to \"mute\")",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/volumechange_event",
      ),
    ),

    EventPropDef(
      scalaName = "onWaiting",
      domName = "waiting",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when the media has paused but is expected to resume (like when the media pauses to buffer more data)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/waiting_event",
      ),
    ),

  )
  
}
