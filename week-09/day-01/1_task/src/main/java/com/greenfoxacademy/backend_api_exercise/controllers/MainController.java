package com.greenfoxacademy.backend_api_exercise.controllers;

import com.greenfoxacademy.backend_api_exercise.models.AllLogs;
import com.greenfoxacademy.backend_api_exercise.models.DoUntil;
import com.greenfoxacademy.backend_api_exercise.models.NumberResult;
import com.greenfoxacademy.backend_api_exercise.models.SpecificNumber;
import com.greenfoxacademy.backend_api_exercise.models.What;
import com.greenfoxacademy.backend_api_exercise.services.MainService;
import java.io.IOException;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
  public ResponseEntity<?> doubling(@RequestParam(name = "input", defaultValue = "0") int input, HttpServletRequest inputValue) {
    if (input == 0) {
      return ResponseEntity.ok().body(this.mainService.doublingError());
    } else {
      this.mainService.saveLog(this.mainService.createLog(inputValue.getServletPath(), inputValue.getQueryString()));
      return ResponseEntity.ok().body(this.mainService.receiveDoubleNumber(input));
    }
  }

  @ResponseBody
  @GetMapping("/greeter")
  public ResponseEntity<?> greeting(@RequestParam(name = "name", required = false) String name,
                                    @RequestParam(name = "title", required = false) String title, HttpServletRequest inputValue) {
    if (name == null || title == null) {
      return new ResponseEntity<>(this.mainService.greeterError(name, title), HttpStatus.BAD_REQUEST);
    }
    this.mainService.saveLog(this.mainService.createLog(inputValue.getServletPath(), inputValue.getQueryString()));
    return ResponseEntity.ok().body(this.mainService.greeting_new_member(name, title));
  }

  @ResponseBody
  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> appenda(@PathVariable("appendable") String appendValue, HttpServletRequest inputValue) {
    this.mainService.saveLog(this.mainService.createLog(inputValue.getServletPath(), "appended: " + this.mainService.appendAChar(appendValue).getAppended()));
    return ResponseEntity.ok().body(this.mainService.appendAChar(appendValue));
  }

  @ResponseBody
  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> doUntil(@PathVariable("action") String action, @RequestBody SpecificNumber specificNumber, HttpServletRequest inputValue) {
    if (specificNumber.getUntil() == null) {
      return ResponseEntity.ok().body(this.mainService.doublingError());
    }
    this.mainService.saveLog(this.mainService.createLog(inputValue.getServletPath(), "until: " + specificNumber.getUntil()));
    return ResponseEntity.ok().body(new DoUntil(action, specificNumber.getUntil()));
  }

  @ResponseBody
  @PostMapping("/arrays")
  public ResponseEntity<?> arrays(@RequestBody What what, HttpServletRequest inputValue) throws IOException {
    this.mainService.saveLog(this.mainService.createLog(inputValue.getServletPath(), body));
    return ResponseEntity.ok().body(this.mainService.arraysCalc(what));
  }

  @ResponseBody
  @GetMapping("/log")
  public ResponseEntity<?> showDataFromDatabase() {
    return ResponseEntity.ok().body(this.mainService.listFullLogs());
  }
}
