package com.lyx.behavior.visitor;

import com.lyx.structure.facade.AssignmentNode;
import com.lyx.structure.facade.ExpressionNode;
import com.lyx.structure.facade.StatementNode;

public interface NodeVisitor {
  void visitStatementNode(StatementNode statementNode);
  void visitAssignmentNode(AssignmentNode assignmentNode);
  void visitExpressionNode(ExpressionNode expressionNode);
}
