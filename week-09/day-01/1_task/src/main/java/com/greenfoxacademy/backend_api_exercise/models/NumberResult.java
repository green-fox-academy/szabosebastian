package com.greenfoxacademy.backend_api_exercise.models;

public class NumberResult {
  private int result;

  public NumberResult(What what) {
    if(what.getWhat().equals("sum")){
      int temp_result = 0;
    for (int i:what.getNumbers()) {
      temp_result += i;
    }
    this.result = temp_result;
    }

    if(what.getWhat().equals("multiply")){
      int temp_result = 1;
      for (int i:what.getNumbers()) {
        temp_result *= i;
      }
      this.result = temp_result;
    }
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

}
