package com.raquo.dombuilder.utils.testing.matching

import com.raquo.dombuilder.builders.nodes.NodeBuilder

class NodeOps[N](
  val nodeBuilder: NodeBuilder[_, N, _]
) extends AnyVal {

  def like(rules: Rule[N]*): ExpectedNode[N] = {
    new ExpectedNode[N](nodeBuilder).like(rules: _*)
  }

  def likeWhatever: ExpectedNode[N] = {
    new ExpectedNode[N](nodeBuilder)
  }
}
