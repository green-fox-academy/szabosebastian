package com.greenfoxacademy.connect_with_mysql.repositiories;

import com.greenfoxacademy.connect_with_mysql.models.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAll();

  List<Todo> findAllByTitleContains(String title);

  List<Todo> findAllByContentContains(String content);

  List<Todo> findAllByDescriptionContains(String description);

  List<Todo> findAllByDueDate(String dueDate);

  List<Todo> findAllByCreatedDate(String creationDate);

  List<Todo> findAllByAssigneeName(String assignee);

}
