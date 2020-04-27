package com.greenfoxacademy.connect_with_mysql.controller;

import com.greenfoxacademy.connect_with_mysql.models.Todo;
import com.greenfoxacademy.connect_with_mysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  private TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping( {"/", "/list", "/todo"})
  public String list(Model model) {
    model.addAttribute("todos", this.todoService.fullList());
    return "todolist";
  }

  @GetMapping("/todo/")
  public String activeList(@RequestParam(defaultValue = "", value = "isActive") boolean activeitem, Model model) {
    model.addAttribute("todos", this.todoService.showActiveTodos(activeitem));
    return "todolist";
  }

  @GetMapping("/todo/add")
  public String getNewTodo(Model model) {
    model.addAttribute("todo", new Todo());
    return "add";
  }

  @PostMapping("/todo/add")
  public String addNewTodo(@ModelAttribute Todo todo) {
    this.todoService.addTodo(todo);
    return "redirect:/todo";
  }

  @GetMapping("todo/{id}/delete")
  public String deleteTodo(@PathVariable("id") long id) {
    System.out.println(id);
    this.todoService.deleteTodo(id);
    return "redirect:/todo";
  }

  @GetMapping("todo/{id}/edit")
  public String editTodoView(@PathVariable("id") long id, Model model) {
    model.addAttribute("todo", this.todoService.editTodo(id));
    return "edit";
  }

  @PostMapping("todo/{id}/edit")
  public String editTodo(@ModelAttribute Todo todo) {
    this.todoService.addTodo(todo);
    return "redirect:/todo";
  }
}
