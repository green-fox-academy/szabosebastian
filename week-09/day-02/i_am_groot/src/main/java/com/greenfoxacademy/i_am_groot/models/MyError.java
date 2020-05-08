package com.greenfoxacademy.i_am_groot.models;

public class MyError {
  private String error;

  public MyError(String error) {
    this.error = error;
  }

  public MyError() {
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
