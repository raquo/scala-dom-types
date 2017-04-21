package com.raquo.dombuilder.definitions.eventProps

import com.raquo.dombuilder.builders.EventPropBuilder
import com.raquo.dombuilder.keys.EventProp

/**
  * Media Events - triggered by media like videos, images and audio. These apply to
  * all HTML elements, but they are most common in media elements, like <audio>,
  * <embed>, <img>, <object>, and <video>.
  */
trait MediaEventProps[N, DomEvent, Fun1[-_, +_]] {
  this: SharedEventProps[N, _, DomEvent, Fun1] with EventPropBuilder[N, DomEvent, Fun1] =>

  /**
    * Script to be run on abort
    */
  lazy val onAbort: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("abort")

  /**
    * Script to be run when a file is ready to start playing (when it has buffered enough to begin)
    */
  lazy val onCanPlay: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("canplay")

  /**
    * Script to be run when a file can be played all the way to the end without pausing for buffering
    */
  lazy val onCanPlayThrough: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("canplaythrough")

  /**
    * Script to be run when the cue changes in a <track> element
    */
  lazy val onCueChange: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("cuechange")

  /**
    * Script to be run when the length of the media changes
    */
  lazy val onDurationChange: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("durationchange")

  /**
    * Script to be run when something bad happens and the file is suddenly unavailable (like unexpectedly disconnects)
    */
  lazy val onEmptied: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("emptied")

  /**
    * Script to be run when the media has reach the end (a useful event for messages like "thanks for listening")
    */
  lazy val onEnded: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("ended")

  /**
    * Script to be run when media data is loaded
    */
  lazy val onLoadedData: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("loadeddata")

  /**
    * Script to be run when meta data (like dimensions and duration) are loaded
    */
  lazy val onLoadedMetadata: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("loadedmetadata")

  /**
    * Script to be run just as the file begins to load before anything is actually loaded
    */
  lazy val onLoadStart: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("loadstart")

  /**
    * Script to be run when the media is paused either by the user or programmatically
    */
  lazy val onPause: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("pause")

  /**
    * Script to be run when the media is ready to start playing
    */
  lazy val onPlay: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("play")

  /**
    * Script to be run when the media actually has started playing
    */
  lazy val onPlaying: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("playing")

  /**
    * Script to be run when the browser is in the process of getting the media data
    */
  lazy val onProgress: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("progress")

  /**
    * Script to be run each time the playback rate changes (like when a user switches to a slow motion or fast forward mode)
    */
  lazy val onRateChange: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("ratechange")

  /**
    * Script to be run when the seeking attribute is set to false indicating that seeking has ended
    */
  lazy val onSeeked: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("seeked")

  /**
    * Script to be run when the seeking attribute is set to true indicating that seeking is active
    */
  lazy val onSeeking: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("seeking")

  /**
    * Script to be run when the browser is unable to fetch the media data for whatever reason
    */
  lazy val onStalled: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("stalled")

  /**
    * Script to be run when fetching the media data is stopped before it is completely loaded for whatever reason
    */
  lazy val onSuspend: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("suspend")

  /**
    * Script to be run when the playing position has changed (like when the user fast forwards to a different point in the media)
    */
  lazy val onTimeUpdate: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("timeupdate")

  /**
    * Script to be run each time the volume is changed which (includes setting the volume to "mute")
    */
  lazy val onVolumeChange: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("volumechange")

  /**
    * Script to be run when the media has paused but is expected to resume (like when the media pauses to buffer more data)
    */
  lazy val onWaiting: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("waiting")
}
