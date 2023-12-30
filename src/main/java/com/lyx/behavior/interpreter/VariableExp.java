package com.lyx.behavior.interpreter;

public class VariableExp implements BooleanExp {
  private String name;

  public VariableExp(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean evaluate(Context context) {
    return context.lookup(name);
  }

  @Override
  public BooleanExp replace(String name, BooleanExp exp) {
    if (this.name == name) {
      return exp.copy();
    } else {
      return copy();
    }
  }

  @Override
  public BooleanExp copy() {
    return new VariableExp(name);
  }
}
