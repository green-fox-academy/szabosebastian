package com.greenfoxacademy.fox_club.controller;

import com.greenfoxacademy.fox_club.services.Fox;
import com.greenfoxacademy.fox_club.services.Utility;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private Fox fox;
  private Utility utility;

  @Autowired
  public MainController(Fox fox, Utility utility) {
    this.utility = utility;
    this.fox = fox;
  }

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/login")
  public String getLogin() {
    return "login";
  }

  boolean foxSwitcher = true;
  String temp_name;

  @PostMapping("/login")
  public String postLogin(@RequestParam(defaultValue = "", value = "name") String name, @ModelAttribute Fox fox) {
    temp_name = name;
    if (utility.searchInTheList(name)) {
      foxSwitcher = true;
    } else {
      utility.getFoxes().add(new Fox(name));
      foxSwitcher = false;
    }
    return "redirect:/login/?name=" + name;
  }

  @GetMapping("/login/")
  public String showFox(Model model) {
    model.addAttribute("fox", utility.getFoxes().stream().filter(x -> x.getName().contains(temp_name)).findFirst());
    model.addAttribute("foxlist", utility.getFoxes().size());
    return "index";
  }
}
