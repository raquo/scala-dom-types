package com.raquo.dombuilder.utils.testing.matching

import com.raquo.dombuilder.generic.builders.Builder

class NodeOps[N](
  val builder: Builder[N]
) extends AnyVal {

  def like(rules: Rule[N]*): ExpectedNode[N] = {
    new ExpectedNode[N](builder).like(rules: _*)
  }

  def likeWhatever: ExpectedNode[N] = {
    new ExpectedNode[N](builder)
  }
}
