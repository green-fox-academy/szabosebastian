package com.greenfoxacademy.using_dependencies;

import com.greenfoxacademy.using_dependencies.interfaces.MyColor;
import com.greenfoxacademy.using_dependencies.services.Printer;
import com.greenfoxacademy.using_dependencies.services.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsingDependenciesApplication implements CommandLineRunner {

  private SpellChecker checker;
  private Printer printer;
  private MyColor color;

  @Autowired
  public UsingDependenciesApplication(SpellChecker checker, Printer printer, MyColor color) {
    this.color = color;
    this.printer = printer;
    this.checker = checker;
  }

  public static void main(String[] args) {
    SpringApplication.run(UsingDependenciesApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    color.printColor();
  }
}
