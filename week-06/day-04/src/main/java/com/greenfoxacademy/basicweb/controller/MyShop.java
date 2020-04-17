package com.greenfoxacademy.basicweb.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyShop {

  ShopItems items = new ShopItems();
  List<ShopItems> emptyListOfItems = new ArrayList<>();

  public List<ShopItems> addingItemsToList() {
    emptyListOfItems.add(new ShopItems("Running shoes", "Best nike shoes", 1000.0, 5));
    emptyListOfItems.add(new ShopItems("Printer", "Some HP", 3000.0, 2));
    emptyListOfItems.add(new ShopItems("Coca cola", "0.5l", 23.0, 0));
    emptyListOfItems.add(new ShopItems("Wokin", "ChickNIKEen Nike with rice", 119.0, 3));
    emptyListOfItems.add(new ShopItems("NIke", "ChickNIKEen Nike with rice", 119.0, 3));

    return emptyListOfItems;
  }

  List<ShopItems> itemsList = addingItemsToList();

  @RequestMapping(value = "/index", method = RequestMethod.GET)
  public String displayAllItems(Model model) {
    model.addAttribute("items", itemsList);
    return "index";
  }

  @RequestMapping(value = "/only-available", method = RequestMethod.GET)
  public String displayOnlyAvailableItems(Model model) {
    List<ShopItems> availableItems = itemsList.stream()
        .filter(x -> x.getQuantityStock() != 0)
        .collect(Collectors.toList());
    model.addAttribute("items", availableItems);
    return "index";
  }

  @RequestMapping(value = "/cheapest-first", method = RequestMethod.GET)
  public String displayByMaximumValue(Model model) {
    List<ShopItems> sortedByMaxList = itemsList.stream()
        .sorted(Comparator.comparing(ShopItems::getPrice))
        .collect(Collectors.toList());
    model.addAttribute("items", sortedByMaxList);
    return "index";
  }

  @RequestMapping(value = "/contains-nike", method = RequestMethod.GET)
  public String displayIfItIsNike(Model model) {
    List<ShopItems> nikeList = itemsList.stream()
        .filter(s -> s.getDescription().toLowerCase().contains("nike") || s.getName().toLowerCase().contains("nike"))
        .collect(Collectors.toList());
    model.addAttribute("items", nikeList);
    return "index";
  }


}
