package com.lyx.structure.facade;

import com.lyx.behavior.visitor.NodeVisitor;

public class ExpressionNode extends ProgramNode {

  @Override
  public void accept(NodeVisitor visitor) {
    visitor.visitExpressionNode(this);
  }
}
