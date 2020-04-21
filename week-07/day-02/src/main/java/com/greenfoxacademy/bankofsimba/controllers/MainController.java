package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  List<BankAccount> bankAccountList = new ArrayList<>();
  BankAccount account = new BankAccount("Simba", 2000, "lion", true, false);

  public MainController() {
    bankAccountList.add(new BankAccount("Timon", 3000, "cheetah", false, false));
    bankAccountList.add(new BankAccount("Pumbaa", 4000, "warthog", false, true));
    bankAccountList.add(new BankAccount("Simba", 2000, "lion", true, true));
    bankAccountList.add(new BankAccount("Rafiki", 5000, "mandrill", false, false));
    bankAccountList.add(new BankAccount("Shenzi", 6000, "hyena", false, true));
  }

  @GetMapping("/show")
  public String showData(Model model) {
    model.addAttribute("name", account.getName());
    model.addAttribute("balance", account.getBalance());
    model.addAttribute("type", account.getAnimalType());
    return "index";
  }

  @GetMapping("/string")
  public String displayString(Model model) {
    model.addAttribute("myString", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "index";
  }

  @GetMapping("/list")
  public String showList(Model model) {
    model.addAttribute("data", bankAccountList);
    return "index";
  }

  //@RequestMapping(value = "/list", method = RequestMethod.POST)
  @PostMapping("/list")
  public String addBalance(@RequestParam("button") String buttonAction, Model model) {

    if (buttonAction.equals("submit")) {
      List<BankAccount> balancedList = bankAccountList.stream()
          .map(x -> new BankAccount(x.getName(), x.getBalance() + 10, x.getAnimalType(), x.isKing(), x.isBehavior()))
          .collect(Collectors.toList());
      model.addAttribute("data", balancedList);
    }
    return "index";
  }
}
