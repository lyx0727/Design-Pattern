package com.lyx.structure.facade;

import com.lyx.structure.decorator.InputStream;

public class Scanner {
  private InputStream inputStream;

  public Scanner(InputStream inputStream) {
    this.inputStream = inputStream;
  }

  public Token scan() {
    inputStream.toString();
    return null;
  }
}
