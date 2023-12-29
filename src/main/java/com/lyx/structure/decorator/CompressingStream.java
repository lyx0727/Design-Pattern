package com.lyx.structure.decorator;

public class CompressingStream extends StreamDecorator {

  public CompressingStream(Stream component) {
    super(component);
  }
  
  public void handleBufferFull() {
    System.out.println("Compress...");
    super.handleBufferFull();
  }
}
