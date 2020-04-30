package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

  private PostService postService;

  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String index(Model model){
    model.addAttribute("post",this.postService.getListByCountOrder());
    return "index";
  }

  @GetMapping("/submit")
  public String addDataToSubmit(Model model){
    model.addAttribute("post", new Post());
    return "submit";
  }

  @PostMapping("/submit")
  public String getNewPost(@ModelAttribute Post post){
    this.postService.savePost(post);
    return "redirect:/";
  }

  @GetMapping("/plus/{id}")
  public String plusPointToPost(@PathVariable("id") long id){
    this.postService.savePost(this.postService.setCounterByPlus(this.postService.findPostById(id)));
    return "redirect:/";
  }

  @GetMapping("/minus/{id}")
  public String minusPointToPost(@PathVariable("id") long id){
    this.postService.savePost(this.postService.setCounterByMinus(this.postService.findPostById(id)));
    return "redirect:/";
  }

  @GetMapping("/orderbydate")
  public String getFullListOrderByDate(Model model){
    model.addAttribute("post",this.postService.getFullPostList());
    return "order_by_date";
  }

  @GetMapping("/orderbydesctitle")
  public String getFullListOrderDescTitle(Model model){
    model.addAttribute("post",this.postService.getFullListOrderByDescTitle());
    return "order_by_desc_title";
  }

}
