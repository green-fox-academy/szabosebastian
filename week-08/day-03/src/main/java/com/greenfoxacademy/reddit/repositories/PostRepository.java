package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.Post;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  List<Post> findAllByUser_Id(long id);

  @Query(value = "SELECT  * FROM post ORDER BY counter DESC LIMIT 10", nativeQuery = true)
  List<Post> findTop10ByOrderByCounterDescFirst10();

  @Query(value = "SELECT  * FROM post ORDER BY counter DESC LIMIT 10 OFFSET 10", nativeQuery = true)
  List<Post> findTop10ByOrderByCounterDescSecond10();

  @Query(value = "SELECT  * FROM post ORDER BY counter DESC LIMIT 10 OFFSET 20", nativeQuery = true)
  List<Post> findTop10ByOrderByCounterDescThird10();

  @Query(value = "SELECT  * FROM post ORDER BY counter DESC LIMIT 10 OFFSET 30", nativeQuery = true)
  List<Post> findTop10ByOrderByCounterDescFourth10();
}

