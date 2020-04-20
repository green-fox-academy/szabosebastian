package com.greenfoxacademy.basicweb.controller;

import java.text.DecimalFormat;

public class ShopItems {
  private String name;
  private String description;
  private double price;
  private int quantityStock;
  private String type;

  public ShopItems() {

  }

  public ShopItems(String name, String type, String description, double price, int quantityStock) {
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

  public double getPrice() {
    return price;
  }

  public double getPriceInEuro() {
    int eur = 350;
    double euroPrice = getPrice() / eur;
    DecimalFormat f = new DecimalFormat("#.##");
    return Double.parseDouble(f.format(euroPrice).replace(",", "."));
  }

  public int getQuantityStock() {
    return quantityStock;
  }

  public String getType() {
    return type;
  }

}
