package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class MainService {

  private PostRepository postRepository;
  private UserRepository userRepository;

  public MainService(PostRepository postRepository, UserRepository userRepository) {
    this.postRepository = postRepository;
    this.userRepository = userRepository;
  }

  public List<User> getFullUserList() {
    return this.userRepository.findAllBy();
  }

  public List<Post> getTop10PostList() {
    return this.postRepository.findTop10ByOrderByCounterDescFirst10();
  }

  public List<Post> getPostBetween10And20() {
    return this.postRepository.findTop10ByOrderByCounterDescSecond10();
  }

  public List<Post> getPostBetween20And30() {
    return this.postRepository.findTop10ByOrderByCounterDescThird10();
  }

  public void savePost(Post post) {
    this.postRepository.save(post);
  }

  public void saveUser(User user) {
    this.userRepository.save(user);
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
    System.out.println(post.getCounter());
    return post;
  }

  public Post setCounterByMinus(Post post) {
    long currentValue = post.getCounter();
    long incrementNum = 1;
    post.setCounter(currentValue - incrementNum);
    return post;
  }

  public void addPostToUser(User user, Post post) {
    post.setUser(user);
    List<Post> userPosts = user.getPosts();
    userPosts.add(post);
    user.setPosts(userPosts);
    this.postRepository.save(post);
    this.userRepository.save(user);
  }

  public User findUserByName(String name) {
    if (name.equals("")) {
      return null;
    }
    try {
      Optional<User> currentUser = this.userRepository.findAllBy().stream().filter(x -> x.getName().equals(name)).findFirst();
      return currentUser.get();
    } catch (Exception e) {
      User newUser = new User(name);
      this.saveUser(newUser);
      return newUser;
    }
  }

  public List<Post> findPostsByUserId(long id) {
    return this.postRepository.findAllByUser_Id(id);
  }
}
