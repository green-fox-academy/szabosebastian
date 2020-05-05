package com.greenfoxacademy.backend_api_exercise.repositories;

import com.greenfoxacademy.backend_api_exercise.models.Log;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

  List<Log> findAll();
}
