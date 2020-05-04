package com.greenfoxacademy.backend_api_exercise.models;

public class DoubleNumber {
  private Integer received;
  private Integer result;

  public DoubleNumber(Integer received) {
    this.received = received;
    this.result = received * 2;
  }

  public Integer getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
