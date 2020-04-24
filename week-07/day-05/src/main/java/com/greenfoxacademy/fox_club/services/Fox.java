package com.greenfoxacademy.fox_club.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class Fox {

  private List<String> tricks = new ArrayList<>();
  private String name;
  private String food;
  private String drink;

  public Fox() {
    this.food = "pizza";
    this.drink = "water";
  }

  public Fox(List<String> tricks, String name, String food, String drink) {
    this.tricks = tricks;
    this.name = name;
    this.food = food;
    this.drink = drink;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
