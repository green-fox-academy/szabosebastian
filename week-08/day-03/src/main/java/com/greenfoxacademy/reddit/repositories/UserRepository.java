package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  List<User> findAllBy();
}
