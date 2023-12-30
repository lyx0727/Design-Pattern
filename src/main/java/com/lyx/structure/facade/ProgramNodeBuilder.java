package com.lyx.structure.facade;

public class ProgramNodeBuilder {
  private ProgramNode node;

  public ProgramNodeBuilder() {
    node = new ProgramNode();
  }

  public ProgramNode getRootNode() { return node; }

  public ProgramNode newVariable(String variableName) { 
    return null;
  }

  public ProgramNode newAssignment(ProgramNode variable, ProgramNode expression) { 
    return null;
  }

  public ProgramNode newReturnStatement(ProgramNode value) {
    return null;
  }

  public ProgramNode newCondition(ProgramNode condition, ProgramNode truePart, ProgramNode falsePart) {
    return null;
  }
}
