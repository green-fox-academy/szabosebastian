package com.greenfoxacademy.connect_with_mysql.services;

import com.greenfoxacademy.connect_with_mysql.models.Assignee;
import com.greenfoxacademy.connect_with_mysql.models.Todo;
import com.greenfoxacademy.connect_with_mysql.repositiories.AssigneeRepository;
import com.greenfoxacademy.connect_with_mysql.repositiories.TodoRepository;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  private TodoRepository todoRepository;
  private AssigneeRepository assigneeRepository;

  public TodoService(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
    this.todoRepository = todoRepository;
  }

  public Iterable<Todo> fullListOfTodo() {
    List<Todo> fullList = this.todoRepository.findAll();
    return fullList;
  }

  public Iterable<Assignee> fullListOfAssignee() {
    List<Assignee> fullList = this.assigneeRepository.findAll();
    return fullList;
  }

  public Iterable<Todo> showActiveTodos(boolean task) {
    List<Todo> activeList = new ArrayList<>();
    for (Todo t : fullListOfTodo()) {
      if (t.isDone() != task) {
        activeList.add(t);
      }
    }
    return activeList;
  }

  public void addTodo(Todo todo) {
    this.todoRepository.save(todo);
  }

  public void addAssignee(Assignee assignee) {
    this.assigneeRepository.save(assignee);
  }

  public void deleteTodo(long id) {
    this.todoRepository.deleteById(id);
  }

  public void deleteAssignee(long id) {
    this.assigneeRepository.deleteById(id);
  }

  public Todo editTodo(long id) {
    Optional<Todo> currentTodo = this.todoRepository.findById(id);
    if (currentTodo.isPresent()) {
      return currentTodo.get();
    }
    return null;
  }

  public Assignee editAssignee(long id) {
    Optional<Assignee> currentAssignee = this.assigneeRepository.findById(id);
    if (currentAssignee.isPresent()) {
      return currentAssignee.get();
    }
    return null;
  }

  public List<Todo> searching(String type, String content) {
    if (type.equals("title")) {
      return this.todoRepository.findAllByTitleContains(content);
    }
    if (type.equals("content")) {
      return this.todoRepository.findAllByContentContains(content);
    }
    if (type.equals("description")) {
      return this.todoRepository.findAllByDescriptionContains(content);
    }
    if (type.equals("dueDate")) {
      return this.todoRepository.findAllByDueDate(content);
    }
    if (type.equals("creationDate")) {
      return this.todoRepository.findAllByCreatedDate(content);
    }
    if (type.equals("assignee")) {
      return this.todoRepository.findAllByAssigneeName(content);
    }
    return this.todoRepository.findAll();
  }

  public void addTodoToAssignee(Assignee assignee, Todo todo) {
    todo.setAssignee(assignee);
    todo.setCreatedDate(new Date());
    List<Todo> assigneeTodos = assignee.getTodos();
    assigneeTodos.add(todo);
    assignee.setTodos(assigneeTodos);
    this.assigneeRepository.save(assignee);
    this.todoRepository.save(todo);
  }
}
