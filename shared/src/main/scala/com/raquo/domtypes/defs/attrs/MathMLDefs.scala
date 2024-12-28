package com.raquo.domtypes.defs.attrs

import com.raquo.domtypes.common.MathMlTagType
import com.raquo.domtypes.common.AttrDef

object MathMlAttrDefs {

  // @nikita: Wasn't this the part we concluded didn't work?
  /**
    * If you break open the browser tools and noodle around with mathml elements, you'll see that they have a bunch of attributes.,
    * you may find they have little effect or are "undefined" in the browser.
    *
    * This would appear to be because they aren't part of the browser API?
    *
    * We take a pass on these here.
    *
    */
val defs: List[AttrDef] = List(


  )
}