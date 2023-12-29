package com.lyx.structure.decorator;

public class FileStream implements Stream {
  private String fileName;

  public FileStream(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void putInt(int i) {}

  @Override
  public void putString(String s) {}

  @Override
  public void handleBufferFull() {
    System.out.println("Write to " + fileName);
  }
}
