package com.greenfoxacademy.i_am_groot.models;

public class Arrow {
  private Float distance;
  private Float time;
  private Float speed;

  public Arrow() {
  }

  public Arrow(Float distance, Float time) {
    this.distance = distance;
    this.time = time;
    this.speed = distance/time;
  }

  public Float getDistance() {
    return distance;
  }

  public void setDistance(Float distance) {
    this.distance = distance;
  }

  public Float getTime() {
    return time;
  }

  public void setTime(Float time) {
    this.time = time;
  }

  public Float getSpeed() {
    return speed;
  }

  public void setSpeed(Float speed) {
    this.speed = speed;
  }
}
