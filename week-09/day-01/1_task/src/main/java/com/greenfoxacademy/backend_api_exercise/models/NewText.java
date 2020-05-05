package com.greenfoxacademy.backend_api_exercise.models;

public class NewText {
  private String text;

  public NewText() {
  }

  public NewText(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
