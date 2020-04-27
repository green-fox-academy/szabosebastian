package com.greenfoxacademy.connect_with_mysql.services;

import com.greenfoxacademy.connect_with_mysql.models.Todo;
import com.greenfoxacademy.connect_with_mysql.repositiories.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  private TodoRepository todoRepository;

  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public Iterable<Todo> fullList() {
    List<Todo> fullList = this.todoRepository.findAll();
    return fullList;
  }

  public Iterable<Todo> showActiveTodos(boolean task) {
    List<Todo> activeList = new ArrayList<>();
    for (Todo t : fullList()) {
      if (t.isDone() != task) {
        activeList.add(t);
      }
    }
    return activeList;
  }

  public void addTodo(Todo todo) {
    this.todoRepository.save(todo);
  }

  public void deleteTodo(long id) {
    this.todoRepository.deleteById(id);
  }

  public Todo editTodo(long id) {
    Optional<Todo> currentTodo = this.todoRepository.findById(id);
    if (currentTodo.isPresent()) {
      return currentTodo.get();
    }
    return null;
  }
}
