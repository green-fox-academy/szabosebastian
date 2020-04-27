package com.greenfoxacademy.listing_todos_h2.repositiories;

import com.greenfoxacademy.listing_todos_h2.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
