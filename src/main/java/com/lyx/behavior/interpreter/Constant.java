package com.lyx.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Constant implements BooleanExp {
  private boolean value;

  private static Map<Boolean, Constant> constantPool = new HashMap<>();

  public static Constant getInstance(boolean value) {
    Constant constant = constantPool.get(value);
    if (constant == null) {
      constant = new Constant(value);
      constantPool.put(value, constant);
    }
    return constant;
  }

  public static Constant TRUE() {
    return getInstance(true);
  }

  public static Constant FALSE() {
    return getInstance(false);
  }

  private Constant(boolean value) {
    this.value = value;
  }

  @Override
  public boolean evaluate(Context context) {
    return value;
  }

  @Override
  public BooleanExp replace(String name, BooleanExp booleanExp) {
    return this;
  }

  @Override
  public BooleanExp copy() {
    return new Constant(value);
  }
}
