package com.greenfoxacademy.backend_api_exercise.models;

public class NumberResultInArray {
  private int result[];

  public NumberResultInArray() {
  }

  public NumberResultInArray(What what) {
      int temp_result[] = new int[what.getNumbers().length];
      for (int i = 0; i < what.getNumbers().length ; i++) {
        temp_result[i] = what.getNumbers()[i] * 2;
      }
      this.result = temp_result;
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }
}
