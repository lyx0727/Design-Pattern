package com.lyx.structure.facade;

import com.lyx.behavior.visitor.NodeVisitor;

public class StatementNode extends ProgramNode {
  @Override
  public void accept(NodeVisitor visitor) {
    visitor.visitStatementNode(this);
  }
}
