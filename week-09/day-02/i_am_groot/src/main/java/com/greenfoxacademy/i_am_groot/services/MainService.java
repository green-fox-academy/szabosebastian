package com.greenfoxacademy.i_am_groot.services;

import com.greenfoxacademy.i_am_groot.models.Arrow;
import com.greenfoxacademy.i_am_groot.models.Groot;
import com.greenfoxacademy.i_am_groot.models.MyError;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MainService {

  public ResponseEntity<?> iAmGroot(String text){
    System.out.println(text);
    if(text == ""){
      return ResponseEntity.badRequest().body(new MyError("I am Groot!"));
    }
    return ResponseEntity.ok().body(new Groot(text));
  }

  public ResponseEntity<?> yonduArrow(Float distance, Float time){
    if(distance == null || time == null){
      return ResponseEntity.badRequest().body(new MyError("Paramater required!"));
    }
    return ResponseEntity.ok().body(new Arrow(distance, time));
  }
}
