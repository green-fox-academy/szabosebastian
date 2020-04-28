package com.greenfoxacademy.connect_with_mysql;

import com.greenfoxacademy.connect_with_mysql.models.Assignee;
import com.greenfoxacademy.connect_with_mysql.models.Todo;
import com.greenfoxacademy.connect_with_mysql.repositiories.AssigneeRepository;
import com.greenfoxacademy.connect_with_mysql.repositiories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectWithMysqlApplication implements CommandLineRunner {

  private TodoRepository todoRepository;
  private AssigneeRepository assigneeRepository;

  public ConnectWithMysqlApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
    this.todoRepository = todoRepository;
    this.assigneeRepository = assigneeRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectWithMysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    this.todoRepository.save(new Todo("First task"));
    this.todoRepository.save(new Todo("Second task"));
    this.todoRepository.save(new Todo("Third task", true, false));
    this.todoRepository.save(new Todo("Fourth task", true, true));
    this.todoRepository.save(new Todo("Fifth task", true, true));
    this.todoRepository.save(new Todo("Sixth task","asdasdasdsadasdasd","asdasdasd2sadsad", true, true));
    this.todoRepository.save(new Todo("Seventh task","23423wdd23dd","234sd13123", true, true));
    this.assigneeRepository.save(new Assignee("Szebi","szebi@szebi.com"));
    this.assigneeRepository.save(new Assignee("Bence","bence@bence.com"));
  }
}
