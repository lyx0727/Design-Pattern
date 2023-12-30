package com.lyx.behavior.visitor;

import com.lyx.structure.facade.AssignmentNode;
import com.lyx.structure.facade.ExpressionNode;
import com.lyx.structure.facade.StatementNode;

public class TypeCheckingVisitor implements NodeVisitor {

  @Override
  public void visitStatementNode(StatementNode statementNode) {
    System.out.println("Type checking: statement");
  }

  @Override
  public void visitAssignmentNode(AssignmentNode assignmentNode) {
    System.out.println("Type checking: assignment");
  }

  @Override
  public void visitExpressionNode(ExpressionNode expressionNode) {
    System.out.println("Type checking: expression");
  }
}
