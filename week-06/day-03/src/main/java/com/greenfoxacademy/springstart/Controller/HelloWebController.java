/*
package com.greenfoxacademy.springstart.Controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {
  AtomicLong atom = new AtomicLong();

  @RequestMapping(value = "/web/greeting", method = RequestMethod.GET)
  public String greeting(@RequestParam(value = "name") String getName, Model model) {
    model.addAttribute("name", "Hello, " + getName + "! This site was loaded " + atom.incrementAndGet() + " times since last server start.\n");
    return "greeting";
  }
}
*/
