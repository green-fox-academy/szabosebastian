package com.greenfoxacademy.backend_api_exercise.models;

public class DoUntil {
  private Integer until;

  public DoUntil() {
    this.until = until;
  }

  public Integer doUntilLogic(String action, SpecificNumber specificNumber) {
    if (action.equals("sum")) {
      Integer sumResult = 0;
      for (int i = 0; i < specificNumber.getNumber(); i++) {
        sumResult = this.until += i;
      }
      return sumResult;
    } else if (action.equals("factor")) {
      Integer factResult = 0;
      for (int i = specificNumber.getNumber(); i >= 1; i--) {
         factResult = this.until *= i;
      }
      return factResult;
    }
    return null;
  }
}
