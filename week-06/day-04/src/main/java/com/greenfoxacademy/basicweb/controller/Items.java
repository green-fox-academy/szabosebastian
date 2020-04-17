package com.greenfoxacademy.basicweb.controller;

import java.util.ArrayList;
import java.util.List;

public class Items {
  protected List<ShopItems> emptyListOfItems = new ArrayList<>();
  protected ShopItems items = new ShopItems();

  public List<ShopItems> addingItemsToList() {
    emptyListOfItems.add(new ShopItems("Running shoes", "Clothes and Shoes", "Nike running shoes for every day sport", 1000.0, 5));
    emptyListOfItems.add(new ShopItems("Printer", "Electronics", "Some HP printer that will print pages", 3000.0, 2));
    emptyListOfItems.add(new ShopItems("Coca cola", "Beverages and Snacks", "0.5l standart coke", 25.0, 0));
    emptyListOfItems.add(new ShopItems("Wokin", "Beverages and Snacks", "Chicken with fired rice and WOKIN sauce", 119.0, 100));
    emptyListOfItems.add(new ShopItems("T-shirt", "Clothes and Shoes", "Blue with a corgi on a bike", 300.0, 1));

    return emptyListOfItems;
  }
}
