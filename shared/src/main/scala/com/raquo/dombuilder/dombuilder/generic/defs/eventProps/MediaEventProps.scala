package com.raquo.dombuilder.dombuilder.generic.defs.eventProps

import com.raquo.dombuilder.dombuilder.generic.builders.SpecializedBuilder

/**
  * Media Events - triggered by media like videos, images and audio. These apply to
  * all HTML elements, but they are most common in media elements, like <audio>,
  * <embed>, <img>, <object>, and <video>.
  */
trait MediaEventProps[P[_], Ev] { this: SpecializedBuilder[P] =>

  /**
    * Script to be run on abort
    */
  lazy val onAbort: P[Ev] = build("abort")

  /**
    * Script to be run when a file is ready to start playing (when it has buffered enough to begin)
    */
  lazy val onCanPlay: P[Ev] = build("canplay")

  /**
    * Script to be run when a file can be played all the way to the end without pausing for buffering
    */
  lazy val onCanPlayThrough: P[Ev] = build("canplaythrough")

  /**
    * Script to be run when the cue changes in a <track> element
    */
  lazy val onCueChange: P[Ev] = build("cuechange")

  /**
    * Script to be run when the length of the media changes
    */
  lazy val onDurationChange: P[Ev] = build("durationchange")

  /**
    * Script to be run when something bad happens and the file is suddenly unavailable (like unexpectedly disconnects)
    */
  lazy val onEmptied: P[Ev] = build("emptied")

  /**
    * Script to be run when the media has reach the end (a useful event for messages like "thanks for listening")
    */
  lazy val onEnded: P[Ev] = build("ended")

  /**
    * Script to be run when media data is loaded
    */
  lazy val onLoadedData: P[Ev] = build("loadeddata")

  /**
    * Script to be run when meta data (like dimensions and duration) are loaded
    */
  lazy val onLoadedMetadata: P[Ev] = build("loadedmetadata")

  /**
    * Script to be run just as the file begins to load before anything is actually loaded
    */
  lazy val onLoadStart: P[Ev] = build("loadstart")

  /**
    * Script to be run when the media is paused either by the user or programmatically
    */
  lazy val onPause: P[Ev] = build("pause")

  /**
    * Script to be run when the media is ready to start playing
    */
  lazy val onPlay: P[Ev] = build("play")

  /**
    * Script to be run when the media actually has started playing
    */
  lazy val onPlaying: P[Ev] = build("playing")

  /**
    * Script to be run when the browser is in the process of getting the media data
    */
  lazy val onProgress: P[Ev] = build("progress")

  /**
    * Script to be run each time the playback rate changes (like when a user switches to a slow motion or fast forward mode)
    */
  lazy val onRateChange: P[Ev] = build("ratechange")

  /**
    * Script to be run when the seeking attribute is set to false indicating that seeking has ended
    */
  lazy val onSeeked: P[Ev] = build("seeked")

  /**
    * Script to be run when the seeking attribute is set to true indicating that seeking is active
    */
  lazy val onSeeking: P[Ev] = build("seeking")

  /**
    * Script to be run when the browser is unable to fetch the media data for whatever reason
    */
  lazy val onStalled: P[Ev] = build("stalled")

  /**
    * Script to be run when fetching the media data is stopped before it is completely loaded for whatever reason
    */
  lazy val onSuspend: P[Ev] = build("suspend")

  /**
    * Script to be run when the playing position has changed (like when the user fast forwards to a different point in the media)
    */
  lazy val onTimeUpdate: P[Ev] = build("timeupdate")

  /**
    * Script to be run each time the volume is changed which (includes setting the volume to "mute")
    */
  lazy val onVolumeChange: P[Ev] = build("volumechange")

  /**
    * Script to be run when the media has paused but is expected to resume (like when the media pauses to buffer more data)
    */
  lazy val onWaiting: P[Ev] = build("waiting")
}
