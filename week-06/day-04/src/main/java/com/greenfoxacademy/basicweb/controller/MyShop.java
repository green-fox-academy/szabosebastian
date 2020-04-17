package com.greenfoxacademy.basicweb.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyShop extends Items {


  private List<ShopItems> itemsList = addingItemsToList();
  private String moneysign = "HUF";

  @RequestMapping(value = "/index", method = RequestMethod.GET)
  public String displayAllItems(Model model) {
    model.addAttribute("items", itemsList);
    model.addAttribute("moneysign", moneysign);
    return "index";
  }

  @RequestMapping(value = "/only-available", method = RequestMethod.GET)
  public String displayOnlyAvailableItems(Model model) {
    List<ShopItems> availableItems = itemsList.stream()
        .filter(x -> x.getQuantityStock() != 0)
        .collect(Collectors.toList());
    model.addAttribute("items", availableItems);
    model.addAttribute("moneysign", moneysign);
    return "index";
  }

  @RequestMapping(value = "/cheapest-first", method = RequestMethod.GET)
  public String displayByMaximumValue(Model model) {
    List<ShopItems> sortedByMaxList = itemsList.stream()
        .sorted(Comparator.comparing(ShopItems::getPrice))
        .collect(Collectors.toList());
    model.addAttribute("items", sortedByMaxList);
    model.addAttribute("moneysign", moneysign);
    return "index";
  }

  @RequestMapping(value = "/contains-nike", method = RequestMethod.GET)
  public String displayIfItIsNike(Model model) {
    List<ShopItems> nikeList = itemsList.stream()
        .filter(s -> s.getDescription().toLowerCase().contains("nike") || s.getName().toLowerCase().contains("nike"))
        .collect(Collectors.toList());
    model.addAttribute("items", nikeList);
    model.addAttribute("moneysign", moneysign);
    return "index";
  }

  @RequestMapping(value = "/average-stock", method = RequestMethod.GET)
  public String displayAvgOfStock(Model model) {
    Double averageOfStock = itemsList.stream()
        .filter(x -> x.getQuantityStock() != 0)
        .map(stock -> stock.getQuantityStock())
        .mapToDouble(Double::valueOf)
        .average()
        .getAsDouble();

    String cuttedAvg = String.valueOf(averageOfStock);
    int indexOfDecimal = cuttedAvg.indexOf(".");

    model.addAttribute("average", cuttedAvg.substring(0, indexOfDecimal + 2));
    model.addAttribute("moneysign", moneysign);
    return "index";
  }

  @RequestMapping(value = "/most-expensive", method = RequestMethod.GET)
  public String displayMostExpensive(Model model) {
    String mostExpensive = itemsList.stream()
        .sorted(Comparator.comparing(ShopItems::getPrice).reversed())
        .findFirst()
        .get().getName();

    model.addAttribute("mostexpensive", mostExpensive);
    model.addAttribute("moneysign", moneysign);
    return "index";
  }

  @RequestMapping(value = "/search", method = RequestMethod.POST)
  public String searchAction(@RequestParam("search") String word, Model model) {
    List<ShopItems> searchedList = itemsList.stream()
        .filter(s -> s.getDescription().toLowerCase().contains(word.toLowerCase()) || s.getName().toLowerCase().contains(word.toLowerCase()))
        .collect(Collectors.toList());
    model.addAttribute("items", searchedList);
    model.addAttribute("moneysign", moneysign);
    return "index";
  }

}
