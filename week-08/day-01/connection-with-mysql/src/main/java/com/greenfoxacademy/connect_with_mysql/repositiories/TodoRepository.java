package com.greenfoxacademy.connect_with_mysql.repositiories;

import com.greenfoxacademy.connect_with_mysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
