package com.raquo.dombuilder.definitions.eventProps

import com.raquo.dombuilder.builders.EventPropBuilder
import com.raquo.dombuilder.keys.EventProp
import org.scalajs.dom

/**
  * Media Events - triggered by media like videos, images and audio. These apply to
  * all HTML elements, but they are most common in media elements, like <audio>,
  * <embed>, <img>, <object>, and <video>.
  */
trait MediaEventProps[N] {
  this: SharedEventProps[N] with EventPropBuilder[N] =>

  /**
    * Script to be run on abort
    */
  lazy val onAbort: EventProp[dom.Event, N] = eventProp("abort")

  /**
    * Script to be run when a file is ready to start playing (when it has buffered enough to begin)
    */
  lazy val onCanPlay: EventProp[dom.Event, N] = eventProp("canplay")

  /**
    * Script to be run when a file can be played all the way to the end without pausing for buffering
    */
  lazy val onCanPlayThrough: EventProp[dom.Event, N] = eventProp("canplaythrough")

  /**
    * Script to be run when the cue changes in a <track> element
    */
  lazy val onCueChange: EventProp[dom.Event, N] = eventProp("cuechange")

  /**
    * Script to be run when the length of the media changes
    */
  lazy val onDurationChange: EventProp[dom.Event, N] = eventProp("durationchange")

  /**
    * Script to be run when something bad happens and the file is suddenly unavailable (like unexpectedly disconnects)
    */
  lazy val onEmptied: EventProp[dom.Event, N] = eventProp("emptied")

  /**
    * Script to be run when the media has reach the end (a useful event for messages like "thanks for listening")
    */
  lazy val onEnded: EventProp[dom.Event, N] = eventProp("ended")

  /**
    * Script to be run when media data is loaded
    */
  lazy val onLoadedData: EventProp[dom.Event, N] = eventProp("loadeddata")

  /**
    * Script to be run when meta data (like dimensions and duration) are loaded
    */
  lazy val onLoadedMetadata: EventProp[dom.Event, N] = eventProp("loadedmetadata")

  /**
    * Script to be run just as the file begins to load before anything is actually loaded
    */
  lazy val onLoadStart: EventProp[dom.Event, N] = eventProp("loadstart")

  /**
    * Script to be run when the media is paused either by the user or programmatically
    */
  lazy val onPause: EventProp[dom.Event, N] = eventProp("pause")

  /**
    * Script to be run when the media is ready to start playing
    */
  lazy val onPlay: EventProp[dom.Event, N] = eventProp("play")

  /**
    * Script to be run when the media actually has started playing
    */
  lazy val onPlaying: EventProp[dom.Event, N] = eventProp("playing")

  /**
    * Script to be run when the browser is in the process of getting the media data
    */
  lazy val onProgress: EventProp[dom.Event, N] = eventProp("progress")

  /**
    * Script to be run each time the playback rate changes (like when a user switches to a slow motion or fast forward mode)
    */
  lazy val onRateChange: EventProp[dom.Event, N] = eventProp("ratechange")

  /**
    * Script to be run when the seeking attribute is set to false indicating that seeking has ended
    */
  lazy val onSeeked: EventProp[dom.Event, N] = eventProp("seeked")

  /**
    * Script to be run when the seeking attribute is set to true indicating that seeking is active
    */
  lazy val onSeeking: EventProp[dom.Event, N] = eventProp("seeking")

  /**
    * Script to be run when the browser is unable to fetch the media data for whatever reason
    */
  lazy val onStalled: EventProp[dom.Event, N] = eventProp("stalled")

  /**
    * Script to be run when fetching the media data is stopped before it is completely loaded for whatever reason
    */
  lazy val onSuspend: EventProp[dom.Event, N] = eventProp("suspend")

  /**
    * Script to be run when the playing position has changed (like when the user fast forwards to a different point in the media)
    */
  lazy val onTimeUpdate: EventProp[dom.Event, N] = eventProp("timeupdate")

  /**
    * Script to be run each time the volume is changed which (includes setting the volume to "mute")
    */
  lazy val onVolumeChange: EventProp[dom.Event, N] = eventProp("volumechange")

  /**
    * Script to be run when the media has paused but is expected to resume (like when the media pauses to buffer more data)
    */
  lazy val onWaiting: EventProp[dom.Event, N] = eventProp("waiting")
}
