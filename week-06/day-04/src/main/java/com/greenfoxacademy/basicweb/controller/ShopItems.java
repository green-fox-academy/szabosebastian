package com.greenfoxacademy.basicweb.controller;

public class ShopItems {
  private String name;
  private String description;
  private Double price;
  private int quantityStock;

  public ShopItems() {

  }

  public ShopItems(String name, String description, Double price, int quantityStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityStock = quantityStock;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public int getQuantityStock() {
    return quantityStock;
  }

  public void setQuantityStock(int quantityStock) {
    this.quantityStock = quantityStock;
  }
}
