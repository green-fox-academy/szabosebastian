package com.greenfoxacademy.fox_club.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoxList extends Fox{
  private List<Fox> foxes;
  List<String> tricks = Arrays.asList("ugras");

  public FoxList() {
     foxes= new ArrayList<>();
     foxes.add(new Fox(tricks,"asd","asd","asd"));
  }

  public List<Fox> getFoxes() {
    return foxes;
  }

  public void setFoxes(List<Fox> foxes) {
    this.foxes = foxes;
  }
}
