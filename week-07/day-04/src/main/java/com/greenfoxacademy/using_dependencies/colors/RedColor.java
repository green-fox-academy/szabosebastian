package com.greenfoxacademy.using_dependencies.colors;

import com.greenfoxacademy.using_dependencies.interfaces.MyColor;
import com.greenfoxacademy.using_dependencies.services.Printer;
import org.springframework.stereotype.Service;

public class RedColor implements MyColor {
  private Printer printer;

  public RedColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("Its Red");
  }
}
