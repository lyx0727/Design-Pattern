package com.lyx.structure.facade;

import com.lyx.behavior.visitor.NodeVisitor;

public class AssignmentNode extends ProgramNode {
  @Override
  public void accept(NodeVisitor visitor) {
    visitor.visitAssignmentNode(this);
  }
}
