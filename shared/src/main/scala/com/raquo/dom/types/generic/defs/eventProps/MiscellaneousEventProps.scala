package com.raquo.dom.types.generic.defs.eventProps

import com.raquo.dom.types.generic.builders.SpecializedBuilder

/**
  * Miscellaneous Events
  */
trait MiscellaneousEventProps[P[_], Ev] { this: SpecializedBuilder[P] =>

  /**
    * Fires when a <menu> element is shown as a context menu
    */
  lazy val onShow: P[Ev] = build("show")

  /**
    * Fires when the user opens or closes the <details> element
    */
  lazy val onToggle: P[Ev] = build("toggle")
}
