package com.greenfoxacademy.basicweb.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OptionalShop extends Items {
  List<ShopItems> itemsList = addingItemsToList();

  @RequestMapping(value = "/optionalindex", method = RequestMethod.GET)
  public String displayAllItems(Model model) {
    model.addAttribute("items", itemsList);
    return "optionalindex";
  }

  @RequestMapping(value = "/filter-by-type/clothesandshoes", method = RequestMethod.GET)
  public String displayChlotesType(Model model) {
    List<ShopItems> chlotesList = itemsList.stream()
        .filter(s -> s.getType().matches("Clothes and Shoes"))
        .collect(Collectors.toList());
    model.addAttribute("items", chlotesList);
    return "optionalindex";
  }

  @RequestMapping(value = "/filter-by-type/electronics", method = RequestMethod.GET)
  public String displayElectonicsType(Model model) {
    List<ShopItems> electronicsList = itemsList.stream()
        .filter(s -> s.getType().matches("Electronics"))
        .collect(Collectors.toList());
    model.addAttribute("items", electronicsList);
    return "optionalindex";
  }

  @RequestMapping(value = "/filter-by-type/beveragesandsnacks", method = RequestMethod.GET)
  public String displayBeveragesType(Model model) {
    List<ShopItems> beveragesList = itemsList.stream()
        .filter(s -> s.getType().matches("Beverages and Snacks"))
        .collect(Collectors.toList());
    model.addAttribute("items", beveragesList);
    return "optionalindex";
  }

  @RequestMapping(value = "/price-in-eur", method = RequestMethod.GET)
  public String displayByEuro(Model model) {
    List<ShopItems> euroList = itemsList.stream()
        .map(x -> new ShopItems(x.getName(), x.getType(), x.getDescription(), x.getPriceInEuro(), x.getQuantityStock()))
        .collect(Collectors.toList());
    model.addAttribute("items", euroList);
    return "optionalindex";
  }
}
