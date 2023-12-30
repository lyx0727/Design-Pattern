package com.lyx.behavior.visitor;

import com.lyx.structure.decorator.BytecodeStream;
import com.lyx.structure.facade.AssignmentNode;
import com.lyx.structure.facade.ExpressionNode;
import com.lyx.structure.facade.StatementNode;

public class RISCCodeGenerator extends CodeGenerator {

  public RISCCodeGenerator(BytecodeStream output) {
    super(output);
  }

  @Override
  public void visitExpressionNode(ExpressionNode expressionNode) {
    System.out.println("RISC: expression");
  }

  @Override
  public void visitStatementNode(StatementNode statementNode) {
    System.out.println("RISC: statement");
  }

  @Override
  public void visitAssignmentNode(AssignmentNode assignmentNode) {
    System.out.println("RISC: assignment");
  }
}
