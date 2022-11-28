package com.raquo.domtypes.defs.props

import com.raquo.domtypes.common.PropDef

object Props {

  val defs: List[PropDef] = List(

    PropDef(
      scalaName = "indeterminate",
      domName = "indeterminate",
      scalaValueType = "Boolean",
      domValueType = "Boolean",
      implName = "prop",
      codec = "BooleanAsIs",
      commentLines = List(
        "In addition to the checked and unchecked states, there is a third state",
        "a checkbox can be in: indeterminate. This is a state in which it's",
        "impossible to say whether the item is toggled on or off.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes"
      ),
    ),

    PropDef(
      scalaName = "checked",
      domName = "checked",
      scalaValueType = "Boolean",
      domValueType = "Boolean",
      implName = "prop",
      codec = "BooleanAsIs",
      commentLines = List(
        "When the value of the type attribute is \"radio\" or \"checkbox\", this property",
        "determines whether it is checked or not.",
        "This is different from `checked` _attribute_,",
        "which contains the _initial_ checked status of the element.",
        "More info: https://stackoverflow.com/a/6004028/2601788 (`checked` behaves similar to `value`)",
        "",
        "See also: defaultChecked prop / attribute" // #nc link to my docs?
      ),
      docUrls = List(
      ),
    ),

    PropDef(
      scalaName = "selected",
      domName = "selected",
      scalaValueType = "Boolean",
      domValueType = "Boolean",
      implName = "prop",
      codec = "BooleanAsIs",
      commentLines = List(
        "Indicates whether an <option> element is _currently_ selected.",
        "This is different from `selected` _attribute_,",
        "which contains the _initial_ selected status of the element.",
        "More info: https://stackoverflow.com/a/6004028/2601788 (`selected` behaves similar to `value`)",
        "",
        "See also: defaultSelected prop / attribute" // #nc link to my docs?
      ),
      docUrls = List(
      ),
    ),

    PropDef(
      scalaName = "value",
      domName = "value",
      scalaValueType = "String",
      domValueType = "String",
      implName = "prop",
      codec = "StringAsIs",
      commentLines = List(
        "Current value of the element. This is different from `value` _attribute_,",
        "which contains the _initial_ value of the element.",
        "More info: https://stackoverflow.com/a/6004028/2601788",
        "",
        "See also: defaultValue prop / attribute" // #nc link to my docs?
      ),
      docUrls = List(
      ),
    ),

  )

}
