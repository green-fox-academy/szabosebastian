package com.greenfoxacademy.basicweb.controller;

import java.text.DecimalFormat;

public class ShopItems {
  private String name;
  private String description;
  private Double price;
  private int quantityStock;
  private String type;

  public ShopItems() {

  }

  public ShopItems(String name, String type, String description, Double price, int quantityStock) {
    this.name = name;
    this.type = type;
    this.description = description;
    this.price = price;
    this.quantityStock = quantityStock;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Double getPrice() {
    return price;
  }

  public int getQuantityStock() {
    return quantityStock;
  }

  public String getType() {
    return type;
  }

  public double getPriceInEuro() {
    int eur = 360;
    double euroPrice = getPrice() / eur;
    DecimalFormat df = new DecimalFormat("0.00");
    return Double.parseDouble(df.format(euroPrice));
  }
}
