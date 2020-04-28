package com.greenfoxacademy.connect_with_mysql.repositiories;

import com.greenfoxacademy.connect_with_mysql.models.Assignee;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

  List<Assignee> findAll();
}
