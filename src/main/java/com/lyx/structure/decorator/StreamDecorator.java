package com.lyx.structure.decorator;

public class StreamDecorator implements Stream {
  private Stream component;

  public StreamDecorator(Stream component) {
    this.component = component;
  }

  @Override
  public void putInt(int i) {}

  @Override
  public void putString(String s) {}

  @Override
  public void handleBufferFull() {
    component.handleBufferFull();
  }
  
}
