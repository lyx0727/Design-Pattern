package com.lyx.behavior.interpreter;

public interface BooleanExp {

  public boolean evaluate(Context context);

  public BooleanExp replace(String name, BooleanExp booleanExp);

  public BooleanExp copy();
}
