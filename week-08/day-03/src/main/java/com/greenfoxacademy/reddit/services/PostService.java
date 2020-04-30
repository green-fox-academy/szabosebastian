package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  private PostRepository postRepository;

  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public List<Post> getFullPostList() {
    return this.postRepository.findAllBy();
  }

  public List<Post> getFullPostListOrderByDate() {
    return this.postRepository.findAllByOrderByCreatedDateDesc();
  }

  public List<Post> getFullListOrderByDescTitle() {
    return this.postRepository.findAllByOrderByTitleDesc();
  }

  public void savePost(Post post) {
    this.postRepository.save(post);
  }

  public Post findPostById(long id) {
    Optional<Post> currentPost = this.postRepository.findById(id);
    if (currentPost.isPresent()) {
      return currentPost.get();
    }
    return null;
  }

  public Post setCounterByPlus(Post post) {
    long currentValue = post.getCounter();
    long incrementNum = 1;
    post.setCounter(currentValue + incrementNum);
    return post;
  }

  public Post setCounterByMinus(Post post) {
    long currentValue = post.getCounter();
    long incrementNum = 1;
    post.setCounter(currentValue - incrementNum);
    return post;
  }

  public List<Post> getListByCountOrder() {
    return postRepository.findTop10ByOrderByCounterDesc();
  }
}
