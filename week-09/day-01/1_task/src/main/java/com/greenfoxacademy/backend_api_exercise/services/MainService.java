package com.greenfoxacademy.backend_api_exercise.services;

import com.greenfoxacademy.backend_api_exercise.models.AppendA;
import com.greenfoxacademy.backend_api_exercise.models.DoUntil;
import com.greenfoxacademy.backend_api_exercise.models.MyError;
import com.greenfoxacademy.backend_api_exercise.models.DoubleNumber;
import com.greenfoxacademy.backend_api_exercise.models.Greeting;
import com.greenfoxacademy.backend_api_exercise.models.SpecificNumber;
import org.springframework.stereotype.Service;

@Service
public class MainService{

  public DoubleNumber receiveDoubleNumber(Integer value) {
    return new DoubleNumber(value);
  }

  public MyError doublingError() {
    return new MyError("Please provide an input!");
  }

  public Greeting greeting_new_member(String name, String title) {
    return new Greeting(name,title);
  }

  public MyError greeterError(String name, String title){
    if(name == null && title == null){
      return new MyError("Please provide a name and a title!");
    } else if (title == null) {
      return new MyError("Please provide a title!");
    } else if (name == null) {
      return new MyError("Please provide a name");
    }
    return new MyError("Missing input");
  }

  public AppendA appendAChar(String value){
    return new AppendA(value);
  }

  public Integer sumUntil(String action, SpecificNumber specificNumber){
    DoUntil sumUntil = new DoUntil();
    return sumUntil.doUntilLogic(action,specificNumber);
  }

  public Integer factUntil(String action, SpecificNumber specificNumber){
    DoUntil factUntil = new DoUntil();
    return factUntil.doUntilLogic(action,specificNumber);
  }

}
