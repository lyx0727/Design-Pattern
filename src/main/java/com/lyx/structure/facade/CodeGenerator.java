package com.lyx.structure.facade;

import com.lyx.structure.decorator.BytecodeStream;

public class CodeGenerator {
  protected BytecodeStream output;

  protected CodeGenerator(BytecodeStream output) {
    this.output = output;
  }

  public void visit(StatementNode statementNode) {};
  public void visit(ExpressionNode expressionNode) {};
}
