package com.greenfoxacademy.i_am_groot.controllers;

import com.greenfoxacademy.i_am_groot.services.MainService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  private MainService service;

  public MainController(MainService service) {
    this.service = service;
  }

  @GetMapping("/groot")
  public ResponseEntity<?> getMessage(@RequestParam(value = "message") String text) {
    return service.iAmGroot(text);
  }

  @GetMapping("/yondu")
  public ResponseEntity<?> staticsOfArrow(@RequestParam(value = "distance", required = false) Float distance, @RequestParam(value = "time", required = false) Float time){
    return service.yonduArrow(distance,time);
  }
}