package com.greenfoxacademy.using_dependencies.interfaces;

import org.springframework.beans.factory.annotation.Autowired;

public interface MyColor {

  @Autowired
  void printColor();

}