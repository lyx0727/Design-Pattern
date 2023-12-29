package com.lyx.structure.decorator;

public interface Stream {
  void putInt(int i);

  void putString(String s);

  void handleBufferFull();
}
