package com.greenfoxacademy.using_dependencies.controller;

import com.greenfoxacademy.using_dependencies.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  private UtilityService utility;

  @Autowired
  public MainController(UtilityService utility) {
    this.utility = utility;
  }

  @GetMapping("/useful")
  public String useful(Model model) {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String changeColor(Model model) {
    model.addAttribute("style", utility.randomColor());
    return "useful";
  }

  @GetMapping("/useful/email")
  public String emailValidator(@RequestParam(defaultValue = "", value = "email") String email, Model model) {
    model.addAttribute("email", email);
    model.addAttribute("emailbackground", utility.validateEmail(email) ? "green" : "red");
    model.addAttribute("valid", utility.validateEmail(email) ? "is valid" : "is not valid");
    return "useful";
  }

  @GetMapping("useful/encode")
  public String encodeText(@RequestParam(defaultValue = "", value = "text") String text, @RequestParam(defaultValue = "", value = "number") int number, Model model) {
    System.out.println(number);
    model.addAttribute("encodedtext", number < 0 ? "query param is negative number" : utility.caesar(text, number));
    return "useful";
  }

  @GetMapping("useful/decode")
  public String decodeText(@RequestParam(defaultValue = "", value = "text") String text, @RequestParam(defaultValue = "", value = "number") int number, Model model) {

    model.addAttribute("decodetext", utility.caesar(text, number * -1));
    System.out.println(number);
    return "useful";
  }
}
