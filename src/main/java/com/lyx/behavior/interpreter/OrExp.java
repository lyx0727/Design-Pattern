package com.lyx.behavior.interpreter;

public class OrExp implements BooleanExp {
  private BooleanExp left, right;

  public OrExp(BooleanExp left, BooleanExp right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public boolean evaluate(Context context) {
    return left.evaluate(context) || right.evaluate(context);
  }

  @Override
  public BooleanExp replace(String name, BooleanExp booleanExp) {
    return new OrExp(left.replace(name, booleanExp), right.replace(name, booleanExp));
  }

  @Override
  public BooleanExp copy() {
    return new OrExp(left.copy(), right.copy());
  }
}
