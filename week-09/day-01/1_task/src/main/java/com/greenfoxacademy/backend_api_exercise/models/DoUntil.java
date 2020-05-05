package com.greenfoxacademy.backend_api_exercise.models;

public class DoUntil {
  private Integer result;

  public DoUntil(String action, Integer specificNumber) {
    if (action.equals("sum")) {
      Integer sumResult = 0;
      for (int i = 0; i <= specificNumber; i++) {
        sumResult = sumResult + i;
      }
      this.result = sumResult;
    }
    if (action.equals("factor")) {
      Integer factResult = 1;
      for (int i = 1; i <= specificNumber; i++) {
        factResult = factResult * i;
      }
      this.result = factResult;
    }
  }

  public DoUntil() {
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
