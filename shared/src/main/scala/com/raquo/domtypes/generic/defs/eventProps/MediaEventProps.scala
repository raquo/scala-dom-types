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
  lazy val onAbort: EP[DomEvent] = build("abort")

  /**
    * Script to be run when a file is ready to start playing (when it has buffered enough to begin)
    */
  lazy val onCanPlay: EP[DomEvent] = build("canplay")

  /**
    * Script to be run when a file can be played all the way to the end without pausing for buffering
    */
  lazy val onCanPlayThrough: EP[DomEvent] = build("canplaythrough")

  /**
    * Script to be run when the cue changes in a <track> element
    */
  lazy val onCueChange: EP[DomEvent] = build("cuechange")

  /**
    * Script to be run when the length of the media changes
    */
  lazy val onDurationChange: EP[DomEvent] = build("durationchange")

  /**
    * Script to be run when something bad happens and the file is suddenly unavailable (like unexpectedly disconnects)
    */
  lazy val onEmptied: EP[DomEvent] = build("emptied")

  /**
    * Script to be run when the media has reach the end (a useful event for messages like "thanks for listening")
    */
  lazy val onEnded: EP[DomEvent] = build("ended")

  /**
    * Script to be run when media data is loaded
    */
  lazy val onLoadedData: EP[DomEvent] = build("loadeddata")

  /**
    * Script to be run when meta data (like dimensions and duration) are loaded
    */
  lazy val onLoadedMetadata: EP[DomEvent] = build("loadedmetadata")

  /**
    * Script to be run just as the file begins to load before anything is actually loaded
    */
  lazy val onLoadStart: EP[DomEvent] = build("loadstart")

  /**
    * Script to be run when the media is paused either by the user or programmatically
    */
  lazy val onPause: EP[DomEvent] = build("pause")

  /**
    * Script to be run when the media is ready to start playing
    */
  lazy val onPlay: EP[DomEvent] = build("play")

  /**
    * Script to be run when the media actually has started playing
    */
  lazy val onPlaying: EP[DomEvent] = build("playing")

  /**
    * Script to be run when the browser is in the process of getting the media data
    */
  lazy val onProgress: EP[DomEvent] = build("progress")

  /**
    * Script to be run each time the playback rate changes (like when a user switches to a slow motion or fast forward mode)
    */
  lazy val onRateChange: EP[DomEvent] = build("ratechange")

  /**
    * Script to be run when the seeking attribute is set to false indicating that seeking has ended
    */
  lazy val onSeeked: EP[DomEvent] = build("seeked")

  /**
    * Script to be run when the seeking attribute is set to true indicating that seeking is active
    */
  lazy val onSeeking: EP[DomEvent] = build("seeking")

  /**
    * Script to be run when the browser is unable to fetch the media data for whatever reason
    */
  lazy val onStalled: EP[DomEvent] = build("stalled")

  /**
    * Script to be run when fetching the media data is stopped before it is completely loaded for whatever reason
    */
  lazy val onSuspend: EP[DomEvent] = build("suspend")

  /**
    * Script to be run when the playing position has changed (like when the user fast forwards to a different point in the media)
    */
  lazy val onTimeUpdate: EP[DomEvent] = build("timeupdate")

  /**
    * Script to be run each time the volume is changed which (includes setting the volume to "mute")
    */
  lazy val onVolumeChange: EP[DomEvent] = build("volumechange")

  /**
    * Script to be run when the media has paused but is expected to resume (like when the media pauses to buffer more data)
    */
  lazy val onWaiting: EP[DomEvent] = build("waiting")
}
