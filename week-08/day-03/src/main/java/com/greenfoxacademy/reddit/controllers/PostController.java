package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

  private MainService mainService;
  private String loginname;
  private User currentUser = new User("Guest");

  @Autowired
  public PostController(MainService mainService) {
    this.mainService = mainService;
  }

  @GetMapping("/")
  public String index(Model model) {
    this.mainService.saveUser(currentUser);
    model.addAttribute("users", this.mainService.getFullUserList());
    model.addAttribute("post", this.mainService.getTop10PostList());
    model.addAttribute("user", this.currentUser);
    return "index";
  }

  @PostMapping("/")
  public String filterByUser(Model model, @RequestParam(name = "selectuser") long id) {
    model.addAttribute("users", this.mainService.getFullUserList());
    model.addAttribute("post", this.mainService.findPostsByUserId(id));
    return "index";
  }

  @GetMapping("/submit")
  public String addDataToSubmit(Model model) {
    model.addAttribute("post", new Post());
    return "submit";
  }

  @PostMapping("/submit")
  public String getNewPost(@ModelAttribute Post post) {
    this.mainService.addPostToUser(this.currentUser, post);
    return "redirect:/";
  }

  @GetMapping("/plus/{id}")
  public String plusPointToPost(@PathVariable("id") long id) {
    System.out.println(id);
    this.mainService.savePost(this.mainService.setCounterByPlus(this.mainService.findPostById(id)));
    return "redirect:/";
  }

  @GetMapping("/minus/{id}")
  public String minusPointToPost(@PathVariable("id") long id) {
    this.mainService.savePost(this.mainService.setCounterByMinus(this.mainService.findPostById(id)));
    return "redirect:/";
  }

  @GetMapping("/1")
  public String getPostBetween0And10(Model model) {
    model.addAttribute("post", this.mainService.getTop10PostList());
    return "index";
  }

  @GetMapping("/2")
  public String getPostBetween10And20(Model model) {
    model.addAttribute("post", this.mainService.getPostBetween10And20());
    return "index";
  }

  @GetMapping("/3")
  public String getPostBetween20And30(Model model) {
    model.addAttribute("post", this.mainService.getPostBetween20And30());
    return "index";
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  public String redirectWithLoginName(@RequestParam(name = "loginname") String loginname) {
    this.loginname = loginname;
    this.currentUser = this.mainService.findUserByName(loginname);
    return "redirect:/";
  }

  @GetMapping("/logout")
  public String logout(){
    this.currentUser = this.mainService.findUserByName("Guest");
    return "redirect:/";
  }
}
