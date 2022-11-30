package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait TextUnderlinePosition extends Auto { this: StyleProp[_] => 

  /**
    * This keyword allows the browser to use an algorithm to choose between
    * under and alphabetic.
    */
  override lazy val auto: StyleSetter[_] = super.auto

  /**
    * This keyword forces the line to be set below the alphabetic baseline, at
    * a position where it won't cross any descender. This is useful to prevent
    * chemical or mathematical formulas, which make a large use of subscripts,
    * to be illegible.
    */
  lazy val under: StyleSetter[_] = this := "under"

  /**
    * In vertical writing-modes, this keyword forces the line to be placed on
    * the left of the characters. In horizontal writing-modes, it is a synonym
    * of under.
    */
  lazy val left: StyleSetter[_] = this := "left"

  /**
    * In vertical writing-modes, this keyword forces the line to be placed on
    * the right of the characters. In horizontal writing-modes, it is a synonym
    * of under.
    */
  lazy val right: StyleSetter[_] = this := "right"

  lazy val underLeft: StyleSetter[_] = this := "under left"

  lazy val underRight: StyleSetter[_] = this := "under right"

}
