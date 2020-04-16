package com.greenfoxacademy.springstart.Controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FizzBuzzWoof {
  AtomicLong atom = new AtomicLong();

  @RequestMapping(value = "/count/greeting", method = RequestMethod.GET)
  public String greeting(Model model) {

    String data = null;
    Integer number = (int) atom.incrementAndGet();
    int fontsize = 14;

    if (number % 7 == 0 && number % 5 == 0 && number % 3 == 0) {
      data = "FizzBuzzWoof";
      fontsize = 72;
    } else if (number % 7 == 0 && number % 5 == 0) {
      data = "BuzzWoof";
      fontsize = 48;
    } else if (number % 7 == 0 && number % 3 == 0) {
      data = "FizzWoof";
      fontsize = 48;
    } else if (number % 5 == 0 && number % 3 == 0) {
      data = "FizzBuzz";
      fontsize = 48;
    } else if (number % 3 == 0) {
      data = "Fizz";
      fontsize = 24;
    } else if (number % 5 == 0) {
      data = "Buzz";
      fontsize = 24;
    } else if (number % 7 == 0) {
      data = "Woof";
      fontsize = 24;
    } else {
      data = number.toString();
    }

    model.addAttribute("data", data);
    model.addAttribute("fontsize", "font-size: " + fontsize + "px");
    return "counter";
  }
}