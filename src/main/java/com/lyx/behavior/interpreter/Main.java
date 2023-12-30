package com.lyx.behavior.interpreter;

public class Main {
  public static void main(String[] args) {
    Context context = new Context();
    
    VariableExp x = new VariableExp("X");
    VariableExp y = new VariableExp("Y");

    // (1 && x) || (y && !x)
    BooleanExp exp = new OrExp(
      new AndExp(Constant.TRUE(), x), 
      new AndExp(y, new NotExp(x))
    );

    context.assign(x, false);
    context.assign(y, true);

    System.out.println(exp.evaluate(context));

    VariableExp z = new VariableExp("Z");
    NotExp notZ = new NotExp(z);

    // (1 && x) || (!z && !x)
    BooleanExp replace = exp.replace("Y", notZ);;

    context.assign(z, true);

    System.out.println(replace.evaluate(context));
  }
}
