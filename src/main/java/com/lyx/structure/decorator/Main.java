package com.lyx.structure.decorator;

public class Main {
  public static void main(String[] args) {
    CompressingStream compressingStream = new CompressingStream(new ASCII7Stream(new FileStream("input.txt")));;
    compressingStream.handleBufferFull();
  }
}
