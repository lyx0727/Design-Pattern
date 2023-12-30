package com.lyx.behavior.interpreter;

public class NotExp implements BooleanExp {
  private BooleanExp exp;

  public NotExp(BooleanExp exp) {
    this.exp = exp;
  }

  @Override
  public boolean evaluate(Context context) {
    return !exp.evaluate(context);
  }

  @Override
  public BooleanExp replace(String name, BooleanExp booleanExp) {
    return new NotExp(exp.replace(name, booleanExp));
  }

  @Override
  public BooleanExp copy() {
    return new NotExp(exp.copy());
  }
}
