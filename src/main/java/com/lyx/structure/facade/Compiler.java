package com.lyx.structure.facade;

import com.lyx.behavior.visitor.CodeGenerator;
import com.lyx.behavior.visitor.TypeCheckingVisitor;
import com.lyx.structure.decorator.InputStream;

public class Compiler {
  public void compile(InputStream input, CodeGenerator generator) {
    Scanner scanner = new Scanner(input);
    ProgramNodeBuilder builder = new ProgramNodeBuilder(); 

    Parser parser = new Parser();
    parser.parse(scanner, builder);

    ProgramNode parseTree = builder.getRootNode();

    TypeCheckingVisitor typeChecker = new TypeCheckingVisitor();

    parseTree.traverse(typeChecker);

    parseTree.traverse(generator);
  }
}
