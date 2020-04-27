package com.greenfoxacademy.listing_todos_h2;

import com.greenfoxacademy.listing_todos_h2.models.Todo;
import com.greenfoxacademy.listing_todos_h2.repositiories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingTodosH2Application implements CommandLineRunner {

  private TodoRepository todoRepository;

  public ListingTodosH2Application(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ListingTodosH2Application.class, args);
  }


  @Override
  public void run(String... args) throws Exception {
    this.todoRepository.save(new Todo("I have to solve a task"));
    this.todoRepository.save(new Todo("Second task"));
  }
}
