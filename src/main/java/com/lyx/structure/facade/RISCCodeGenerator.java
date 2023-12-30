package com.lyx.structure.facade;

import com.lyx.structure.decorator.BytecodeStream;

public class RISCCodeGenerator extends CodeGenerator {

  public RISCCodeGenerator(BytecodeStream output) {
    super(output);
  }

  @Override
  public void visit(ExpressionNode expressionNode) {
    System.out.println("RISC: expression");
  }

  @Override
  public void visit(StatementNode statementNode) {
    System.out.println("RISC: statement");
  }
}
