package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.Post;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  List<Post> findAllBy();
  List<Post> findTop10ByOrderByCounterDesc();
  List<Post> findAllByOrderByCreatedDateDesc();
  List<Post> findAllByOrderByTitleDesc();
}
