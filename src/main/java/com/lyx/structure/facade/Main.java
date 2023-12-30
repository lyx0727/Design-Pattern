package com.lyx.structure.facade;

import com.lyx.structure.decorator.BytecodeStream;
import com.lyx.structure.decorator.FileStream;
import com.lyx.structure.decorator.InputStream;

public class Main {
  public static void main(String[] args) {
    InputStream input = new InputStream(new FileStream("test.c"));
    BytecodeStream output = new BytecodeStream();
    RISCCodeGenerator generator = new RISCCodeGenerator(output);

    Compiler compiler = new Compiler();
    compiler.compile(input, generator);
  }
}
