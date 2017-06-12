package com.raquo

package object dombuilder {

  trait DNode
  trait DElement extends DNode
  trait DText extends DNode
  trait DComment extends DNode
}
