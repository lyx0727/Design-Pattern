package com.lyx.behavior.visitor;

import com.lyx.structure.decorator.BytecodeStream;
import com.lyx.structure.facade.AssignmentNode;
import com.lyx.structure.facade.ExpressionNode;
import com.lyx.structure.facade.StatementNode;

public class CodeGenerator implements NodeVisitor {
  protected BytecodeStream output;

  protected CodeGenerator(BytecodeStream output) {
    this.output = output;
  }

  @Override
  public void visitStatementNode(StatementNode statementNode) {}

  @Override
  public void visitAssignmentNode(AssignmentNode assignmentNode) {}

  @Override
  public void visitExpressionNode(ExpressionNode expressionNode) {};
}
