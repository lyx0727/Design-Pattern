package com.lyx.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
  private Map<String, Boolean> variableMap;

  public Context() {
    variableMap = new HashMap<>();
  }

  public boolean lookup(String name) {
    return variableMap.get(name);
  }
  
  public void assign(VariableExp variableExp, boolean value) {
    variableMap.put(variableExp.getName(), value);
  }
}
