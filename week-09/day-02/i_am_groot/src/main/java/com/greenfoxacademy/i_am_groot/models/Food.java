package com.greenfoxacademy.i_am_groot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;
  private int amount;
  private int calorie;

  public Food() {
  }

  public Food(String name, int amount, int calorie) {
    this.name = name;
    this.amount = amount;
    this.calorie = calorie;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getCalorie() {
    return calorie;
  }

  public void setCalorie(int calorie) {
    this.calorie = calorie;
  }
}

