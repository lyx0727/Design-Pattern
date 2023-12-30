package com.lyx.structure.facade;

import java.util.ArrayList;
import java.util.List;

import com.lyx.behavior.visitor.NodeVisitor;

public class ProgramNode {
  protected List<ProgramNode> children;

  protected ProgramNode() {
    children = new ArrayList<>();
  }

  public void add(ProgramNode node) {}
  
  public void remove(ProgramNode node) {}

  public void traverse(NodeVisitor visitor) {
    accept(visitor);

    for (ProgramNode node : children) {
      node.traverse(visitor);
    }
  }

  public void accept(NodeVisitor visitor) {}
}
