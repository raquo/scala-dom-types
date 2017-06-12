package com.raquo.dombuilder.utils.testing.matching

import com.raquo.dombuilder.builders.NodeBuilder

class NodeOps[N](
  val nodeBuilder: NodeBuilder[_, N, _, _]
) extends AnyVal {

  def like(rules: Rule[N]*): ExpectedNode[N] = {
    new ExpectedNode[N](nodeBuilder).like(rules: _*)
  }

  def likeWhatever: ExpectedNode[N] = {
    new ExpectedNode[N](nodeBuilder)
  }
}
