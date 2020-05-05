package com.greenfoxacademy.backend_api_exercise.models;

public class Text {
  private String text;

  public Text() {
  }

  public Text(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
