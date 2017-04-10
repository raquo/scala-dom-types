package com.raquo.dombuilder.utils.testing.matching

class EmptyNodeOps[N](
  val emptyNode: N
) extends AnyVal {

  def like(rules: Rule[N]*): ExpectedNode[N] = {
    new ExpectedNode[N](emptyNode).like(rules: _*)
  }

  def likeWhatever: ExpectedNode[N] = {
    new ExpectedNode[N](emptyNode)
  }
}
