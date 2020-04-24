package com.greenfoxacademy.fox_club.controller;

import com.greenfoxacademy.fox_club.services.Fox;
import com.greenfoxacademy.fox_club.services.FoxList;
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
  private FoxList foxList;

  @Autowired
  public MainController(Fox fox, FoxList foxList) {
    this.fox = fox;
    this.foxList = foxList;
  }

  @GetMapping("/")
  public String index(){
    return "index";
  }

  @GetMapping("/login")
  public String getLogin(){
    return "login";
  }

  @PostMapping("/login")
  public String postLogin(@RequestParam(defaultValue = "" , value = "name") String name, @ModelAttribute Fox fox){
    return "redirect:/login/?name="+name;
  }

  @GetMapping("/login/")
  public String showFox(Model model){
    model.addAttribute("foxlist",foxList.getFoxes());
    return "index";
  }
}
