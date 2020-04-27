package com.greenfoxacademy.fox_club.controller;

import com.greenfoxacademy.fox_club.models.Fox;
import com.greenfoxacademy.fox_club.services.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  private Utility utility;

  @Autowired
  public MainController(Utility utility) {
    this.utility = utility;
  }

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/login")
  public String getLogin() {
    return "login";
  }

  String query_name;

  @PostMapping("/login")
  public String postLogin(@RequestParam(defaultValue = "", value = "name") String name, @ModelAttribute Fox fox) {
    this.query_name = name;
    if (!this.utility.searchInTheList(name)) {
      this.utility.addFox(new Fox(name));
    } else {
      this.utility.setCurrentFox(name);
    }
    return "redirect:/fox?name=" + query_name;
  }

  @GetMapping("/fox")
  public String showFox(Model model) {
    model.addAttribute("fox", this.utility.getCurrentFox());
    model.addAttribute("foxlist", this.utility.getFoxes().size());
    return "fox";
  }

  @GetMapping("/nutritionstore")
  public String getNutrition(Model model) {
    model.addAttribute("foodlist", this.utility.getFoodlist());
    model.addAttribute("drinklist", this.utility.getDrinklist());
    return "nutritionstore";
  }

  @PostMapping("/nutritionstore")
  public String postNutrition(@RequestParam("foodselect") String foodselect,
                              @RequestParam("drinkselect") String drinkselect,
                              Model model) {
    this.utility.getCurrentFox().setDrink(drinkselect);
    this.utility.getCurrentFox().setFood(foodselect);
    return "redirect:/fox?name=" + query_name;
  }

  @GetMapping("/tricks")
  public String getTricks(Model model) {
    model.addAttribute("tricklist", this.utility.getTricks());
    return "tricks";
  }

  @PostMapping("/tricks")
  public String postTricks(@RequestParam("trickselect") String trick) {
    System.out.println(this.utility.getCurrentFox().getCurrentTricks());
    if (this.utility.getCurrentFox().getCurrentTricks().isEmpty()) {
      this.utility.getCurrentFox().getCurrentTricks().add(trick);
    }

    if (!this.utility.getCurrentFox().getCurrentTricks().contains(trick)) {
      this.utility.getCurrentFox().getCurrentTricks().add(trick);
    }
    return "redirect:/fox?name=" + query_name;
  }
}
