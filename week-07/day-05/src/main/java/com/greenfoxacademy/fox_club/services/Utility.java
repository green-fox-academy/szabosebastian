package com.greenfoxacademy.fox_club.services;

import com.greenfoxacademy.fox_club.models.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class Utility extends Fox {
  private List<Fox> foxes;
  public Fox currentFox;

  public Utility() {
    this.foxes = new ArrayList<>();
  }

  public void addFox(Fox fox) {
    this.foxes.add(fox);
    this.currentFox = fox;
  }

  public List<Fox> getFoxes() {
    return this.foxes;
  }

  public boolean searchInTheList(String name) {
    for (Fox actualName : foxes) {
      if (actualName.getName().contains(name)) {
        return true;
      }
    }
    return false;
  }

  public void setCurrentFox(String name) {
    for (Fox searchFox : foxes) {
      if (searchFox.getName().equals(name)) {
        this.currentFox = searchFox;
      }
    }
  }

  public void addTrick(String trick) {
    for (String s : currentFox.getCurrentTricks()) {
      if (!s.equals(trick)) {
        this.currentFox.getCurrentTricks().add(trick);
      }
    }
  }
}
