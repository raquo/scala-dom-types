package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.SpecializedBuilder

/**
  * Miscellaneous Events
  */
trait MiscellaneousEventProps[EP[_], Ev] { this: SpecializedBuilder[EP] =>

  /**
    * Fires when a <menu> element is shown as a context menu
    */
  lazy val onShow: EP[Ev] = build("show")

  /**
    * Fires when the user opens or closes the <details> element
    */
  lazy val onToggle: EP[Ev] = build("toggle")
}
