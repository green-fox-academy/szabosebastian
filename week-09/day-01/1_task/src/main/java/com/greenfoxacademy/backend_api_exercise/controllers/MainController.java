package com.greenfoxacademy.backend_api_exercise.controllers;

import com.greenfoxacademy.backend_api_exercise.models.DoUntil;
import com.greenfoxacademy.backend_api_exercise.models.SpecificNumber;
import com.greenfoxacademy.backend_api_exercise.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  private MainService mainService;

  @Autowired
  public MainController(MainService mainService) {
    this.mainService = mainService;
  }

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @ResponseBody
  @GetMapping("/doubling")
  public ResponseEntity<?> doubling(@RequestParam(name = "input", defaultValue = "0") int input) {
    if (input == 0) {
      return ResponseEntity.ok().body(this.mainService.doublingError());
    } else {
      return ResponseEntity.ok().body(this.mainService.receiveDoubleNumber(input));
    }
  }

  @ResponseBody
  @GetMapping("/greeter")
  public ResponseEntity<?> greeting(@RequestParam(name = "name", required = false) String name,
                                    @RequestParam(name = "title", required = false) String title) {
    if(name == null || title == null){
      return new ResponseEntity<>(this.mainService.greeterError(name,title), HttpStatus.BAD_REQUEST);
    }
    return ResponseEntity.ok().body(this.mainService.greeting_new_member(name, title));
  }

  @ResponseBody
  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> appenda(@PathVariable("appendable") String appendValue){
    return ResponseEntity.ok().body(this.mainService.appendAChar(appendValue));
  }

  @ResponseBody
  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> doUntil(@PathVariable("action") String action, @RequestBody SpecificNumber specificNumber){
    return ResponseEntity.ok().body(this.mainService.factUntil(action,specificNumber));
  }
}
