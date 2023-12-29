package com.lyx.structure.decorator;

public class ASCII7Stream extends StreamDecorator {
  public ASCII7Stream(Stream component) {
    super(component);
  }

  @Override
  public void handleBufferFull() {
    System.out.println("Convert to ASCII...");
    super.handleBufferFull();
  }
}
