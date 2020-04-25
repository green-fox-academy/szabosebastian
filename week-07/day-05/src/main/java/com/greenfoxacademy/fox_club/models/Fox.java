package com.greenfoxacademy.fox_club.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fox {

  private String name;
  private String food;
  private String drink;
  private List<String> currentTricks = new ArrayList<>();
  private List<String> tricks = Arrays.asList("jumping", "running", "swimming");
  private List<String> foodlist = Arrays.asList("pizza", "hamburger", "chicken");
  private List<String> drinklist = Arrays.asList("water", "cola", "lemonade");

  public Fox() {

  }

  public Fox(String name) {
    this.name = name;
    this.food = "pizza";
    this.drink = "water";
  }

  public Fox(List<String> currentTricks, String name, String food, String drink) {
    this.currentTricks = currentTricks;
    this.name = name;
    this.food = food;
    this.drink = drink;
  }

  public List<String> getCurrentTricks() {
    return currentTricks;
  }

  public void setCurrentTricks(List<String> currentTricks) {
    this.currentTricks = currentTricks;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public List<String> getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }

  public List<String> getFoodlist() {
    return foodlist;
  }

  public void setFoodlist(List<String> foodlist) {
    this.foodlist = foodlist;
  }

  public List<String> getDrinklist() {
    return drinklist;
  }

  public void setDrinklist(List<String> drinklist) {
    this.drinklist = drinklist;
  }
}
