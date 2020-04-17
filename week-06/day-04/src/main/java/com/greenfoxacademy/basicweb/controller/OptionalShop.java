package com.greenfoxacademy.basicweb.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OptionalShop extends Items {
  private List<ShopItems> itemsList = addingItemsToList();
  private String moneysign = "HUF";

  @RequestMapping(value = "/optionalindex", method = RequestMethod.GET)
  public String displayAllItems(Model model) {
    model.addAttribute("items", itemsList);
    model.addAttribute("moneysign", moneysign);
    return "optionalindex";
  }

  @RequestMapping(value = "/filter-by-type/clothesandshoes", method = RequestMethod.GET)
  public String displayChlotesType(Model model) {
    List<ShopItems> chlotesList = itemsList.stream()
        .filter(s -> s.getType().matches("Clothes and Shoes"))
        .collect(Collectors.toList());
    model.addAttribute("items", chlotesList);
    model.addAttribute("moneysign", moneysign);
    return "optionalindex";
  }

  @RequestMapping(value = "/filter-by-type/electronics", method = RequestMethod.GET)
  public String displayElectonicsType(Model model) {
    List<ShopItems> electronicsList = itemsList.stream()
        .filter(s -> s.getType().matches("Electronics"))
        .collect(Collectors.toList());
    model.addAttribute("items", electronicsList);
    model.addAttribute("moneysign", moneysign);
    return "optionalindex";
  }

  @RequestMapping(value = "/filter-by-type/beveragesandsnacks", method = RequestMethod.GET)
  public String displayBeveragesType(Model model) {
    List<ShopItems> beveragesList = itemsList.stream()
        .filter(s -> s.getType().matches("Beverages and Snacks"))
        .collect(Collectors.toList());
    model.addAttribute("items", beveragesList);
    model.addAttribute("moneysign", moneysign);
    return "optionalindex";
  }

  @RequestMapping(value = "/price-in-eur", method = RequestMethod.GET)
  public String displayByEuro(Model model) {
    List<ShopItems> euroList = itemsList.stream()
        .map(x -> new ShopItems(x.getName(), x.getType(), x.getDescription(), x.getPriceInEuro(), x.getQuantityStock()))
        .collect(Collectors.toList());
    model.addAttribute("items", euroList);
    model.addAttribute("moneysign", "€");
    return "optionalindex";
  }

  @RequestMapping(value = "/price-in-original", method = RequestMethod.GET)
  public String displayAllItemsOriginalCurrency(Model model) {
    model.addAttribute("items", itemsList);
    model.addAttribute("moneysign", moneysign);
    return "optionalindex";
  }

  @RequestMapping(value = "/filter-by-price", method = RequestMethod.POST)
  public String displayFilterByPriceAbove(@RequestParam("searchButton") String buttonValue, @RequestParam(value = "search") Double searchValue, Model model) {
    if (searchValue == null) {
      return "optionalindex";
    }

    switch (buttonValue) {
      case "above":
        List<ShopItems> priceAboveList = itemsList.stream()
            .filter(x -> x.getPrice() > searchValue)
            .collect(Collectors.toList());
        model.addAttribute("items", priceAboveList);
        model.addAttribute("moneysign", moneysign);
        break;
      case "below":
        List<ShopItems> priceBelowList = itemsList.stream()
            .filter(x -> x.getPrice() < searchValue)
            .collect(Collectors.toList());
        model.addAttribute("items", priceBelowList);
        model.addAttribute("moneysign", moneysign);
        break;
      case "exactly":
        List<ShopItems> priceExactList = itemsList.stream()
            .filter(x -> x.getPrice() == searchValue)
            .collect(Collectors.toList());
        model.addAttribute("items", priceExactList);
        model.addAttribute("moneysign", moneysign);
        break;
    }
    return "optionalindex";
  }
}
