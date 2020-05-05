package com.greenfoxacademy.backend_api_exercise.models;

public class SpecificNumber {

  private Integer until;

  public SpecificNumber(Integer until) {
    this.until = until;
  }

  public SpecificNumber() {
  }

  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }
}
