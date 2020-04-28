package com.greenfoxacademy.connect_with_mysql.controller;

import com.greenfoxacademy.connect_with_mysql.models.Assignee;
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
    model.addAttribute("todos", this.todoService.fullListOfTodo());
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
    return "add_todo";
  }

  @PostMapping("/todo/add")
  public String addNewTodo(@ModelAttribute Todo todo) {
    this.todoService.addTodo(todo);
    return "redirect:/todo";
  }

  @GetMapping("todo/{id}/delete")
  public String deleteTodo(@PathVariable("id") long id) {
    this.todoService.deleteTodo(id);
    return "redirect:/todo";
  }

  @GetMapping("todo/{id}/edit")
  public String editTodoView(@PathVariable("id") long id, Model model) {
    model.addAttribute("todo", this.todoService.editTodo(id));
    model.addAttribute("assignee",this.todoService.fullListOfAssignee());
    return "edit_todo";
  }

  @PostMapping("todo/{id}/edit")
  public String editTodo(@ModelAttribute Todo todo) {
    this.todoService.addTodo(todo);
    return "redirect:/todo";
  }

  @GetMapping("todo/{id}/{title}")
  public String showInformation(@PathVariable("id") long id, Model model){
    model.addAttribute("todo",this.todoService.editTodo(id));
    return "info";
  }

  @PostMapping("/search")
  public String search(@RequestParam (value = "search") String searchbar, @RequestParam(value = "select") String selectValue, Model model){
    model.addAttribute("todos", this.todoService.searching(selectValue,searchbar));
    return "todolist";
  }

  @GetMapping("/assignee")
  public String showAssigneeList(Model model){
    model.addAttribute("assignee", this.todoService.fullListOfAssignee());
    return "assignee";
  }

  @GetMapping("assignee/{id}/edit")
  public String editAssigneView(@PathVariable("id") long id, Model model) {
    model.addAttribute("asg", this.todoService.editAssignee(id));
    return "edit_assignee";
  }

  @PostMapping("assignee/{id}/edit")
  public String editAssigne(@ModelAttribute Assignee assignee) {
    this.todoService.addAssignee(assignee);
    return "redirect:/assignee";
  }

  @GetMapping("assignee/{id}/delete")
  public String deleteAssignee(@PathVariable("id") long id) {
    this.todoService.deleteAssignee(id);
    return "redirect:/assignee";
  }

  @GetMapping("/assignee/add")
  public String getNewToAssigne(Model model) {
    model.addAttribute("assignee", new Assignee());
    return "add_assignee";
  }

  @PostMapping("/assignee/add")
  public String addNewAssigne(@ModelAttribute Assignee assignee) {
    this.todoService.addAssignee(assignee);
    return "redirect:/assignee";
  }

  @GetMapping("add-assignee-to-todo/{todoId}/{assigneeId}")
  public String addAssigneeToTodo(@PathVariable(name = "todoId") long todoId, @PathVariable(name = "assigneeId") long assigneeId){
    this.todoService.addTodoToAssignee(this.todoService.editAssignee(assigneeId), this.todoService.editTodo(todoId));
    return "redirect:/todo";
  }
}
