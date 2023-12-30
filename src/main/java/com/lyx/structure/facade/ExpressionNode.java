package com.lyx.structure.facade;

public class ExpressionNode extends ProgramNode {
  @Override
  public void traverse(CodeGenerator codeGenerator) {
    codeGenerator.visit(this);

    for (ProgramNode node : children) {
      node.traverse(codeGenerator);
    }
  }
}
