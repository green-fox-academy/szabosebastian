package com.greenfoxacademy.connect_with_mysql;

import com.greenfoxacademy.connect_with_mysql.models.Todo;
import com.greenfoxacademy.connect_with_mysql.repositiories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectWithMysqlApplication implements CommandLineRunner {

  private TodoRepository todoRepository;

  public ConnectWithMysqlApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectWithMysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    this.todoRepository.save(new Todo("I have to solve a task"));
    this.todoRepository.save(new Todo("Second task"));
    this.todoRepository.save(new Todo("Third task", true, false));
    this.todoRepository.save(new Todo("Fourth task", true, true));
  }
}
