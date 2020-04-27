package com.greenfoxacademy.connect_with_mysql.controller;

import com.greenfoxacademy.connect_with_mysql.repositiories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {


  private TodoRepository todoRepository;

  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping("/todo")
  public String controller() {
    return "todo";
  }

  @GetMapping({"/", "/list"})
  public String list(Model model){
    model.addAttribute("todos", this.todoRepository.findAll());
    return "todolist";
  }


}
