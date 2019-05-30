package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

/**
  * Media Events - triggered by media like videos, images and audio. These apply to
  * all HTML elements, but they are most common in media elements, like <audio>,
  * <embed>, <img>, <object>, and <video>.
  *
  * For type param docs see [[EventPropBuilder]]
  */
trait MediaEventProps[EP[_ <: DomEvent], DomEvent] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * Script to be run on abort
    */
  @inline def onAbort: EP[DomEvent] = eventProp("abort")

  /**
    * Script to be run when a file is ready to start playing (when it has buffered enough to begin)
    */
  @inline def onCanPlay: EP[DomEvent] = eventProp("canplay")

  /**
    * Script to be run when a file can be played all the way to the end without pausing for buffering
    */
  @inline def onCanPlayThrough: EP[DomEvent] = eventProp("canplaythrough")

  /**
    * Script to be run when the cue changes in a <track> element
    */
  @inline def onCueChange: EP[DomEvent] = eventProp("cuechange")

  /**
    * Script to be run when the length of the media changes
    */
  @inline def onDurationChange: EP[DomEvent] = eventProp("durationchange")

  /**
    * Script to be run when something bad happens and the file is suddenly unavailable (like unexpectedly disconnects)
    */
  @inline def onEmptied: EP[DomEvent] = eventProp("emptied")

  /**
    * Script to be run when the media has reach the end (a useful event for messages like "thanks for listening")
    */
  @inline def onEnded: EP[DomEvent] = eventProp("ended")

  /**
    * Script to be run when media data is loaded
    */
  @inline def onLoadedData: EP[DomEvent] = eventProp("loadeddata")

  /**
    * Script to be run when meta data (like dimensions and duration) are loaded
    */
  @inline def onLoadedMetadata: EP[DomEvent] = eventProp("loadedmetadata")

  /**
    * Script to be run just as the file begins to load before anything is actually loaded
    */
  @inline def onLoadStart: EP[DomEvent] = eventProp("loadstart")

  /**
    * Script to be run when the media is paused either by the user or programmatically
    */
  @inline def onPause: EP[DomEvent] = eventProp("pause")

  /**
    * Script to be run when the media is ready to start playing
    */
  @inline def onPlay: EP[DomEvent] = eventProp("play")

  /**
    * Script to be run when the media actually has started playing
    */
  @inline def onPlaying: EP[DomEvent] = eventProp("playing")

  /**
    * Script to be run when the browser is in the process of getting the media data
    */
  @inline def onProgress: EP[DomEvent] = eventProp("progress")

  /**
    * Script to be run each time the playback rate changes (like when a user switches to a slow motion or fast forward mode)
    */
  @inline def onRateChange: EP[DomEvent] = eventProp("ratechange")

  /**
    * Script to be run when the seeking attribute is set to false indicating that seeking has ended
    */
  @inline def onSeeked: EP[DomEvent] = eventProp("seeked")

  /**
    * Script to be run when the seeking attribute is set to true indicating that seeking is active
    */
  @inline def onSeeking: EP[DomEvent] = eventProp("seeking")

  /**
    * Script to be run when the browser is unable to fetch the media data for whatever reason
    */
  @inline def onStalled: EP[DomEvent] = eventProp("stalled")

  /**
    * Script to be run when fetching the media data is stopped before it is completely loaded for whatever reason
    */
  @inline def onSuspend: EP[DomEvent] = eventProp("suspend")

  /**
    * Script to be run when the playing position has changed (like when the user fast forwards to a different point in the media)
    */
  @inline def onTimeUpdate: EP[DomEvent] = eventProp("timeupdate")

  /**
    * Script to be run each time the volume is changed which (includes setting the volume to "mute")
    */
  @inline def onVolumeChange: EP[DomEvent] = eventProp("volumechange")

  /**
    * Script to be run when the media has paused but is expected to resume (like when the media pauses to buffer more data)
    */
  @inline def onWaiting: EP[DomEvent] = eventProp("waiting")
}
