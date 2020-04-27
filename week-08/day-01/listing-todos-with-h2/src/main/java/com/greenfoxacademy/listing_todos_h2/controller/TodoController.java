package com.greenfoxacademy.listing_todos_h2.controller;

import com.greenfoxacademy.listing_todos_h2.repositiories.TodoRepository;
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
