package com.greenfoxacademy.backend_api_exercise.services;

import com.greenfoxacademy.backend_api_exercise.models.AllLogs;
import com.greenfoxacademy.backend_api_exercise.models.AppendA;
import com.greenfoxacademy.backend_api_exercise.models.Log;
import com.greenfoxacademy.backend_api_exercise.models.MyError;
import com.greenfoxacademy.backend_api_exercise.models.DoubleNumber;
import com.greenfoxacademy.backend_api_exercise.models.Greeting;
import com.greenfoxacademy.backend_api_exercise.models.NewText;
import com.greenfoxacademy.backend_api_exercise.models.NumberResult;
import com.greenfoxacademy.backend_api_exercise.models.NumberResultInArray;
import com.greenfoxacademy.backend_api_exercise.models.Text;
import com.greenfoxacademy.backend_api_exercise.models.What;
import com.greenfoxacademy.backend_api_exercise.repositories.LogRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

  private LogRepository logRepository;

  @Autowired
  public MainService(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  public DoubleNumber receiveDoubleNumber(Integer value) {
    return new DoubleNumber(value);
  }

  public MyError doublingError() {
    return new MyError("Please provide an input!");
  }

  public Greeting greeting_new_member(String name, String title) {
    return new Greeting(name, title);
  }

  public MyError greeterError(String name, String title) {
    if (name == null && title == null) {
      return new MyError("Please provide a name and a title!");
    } else if (title == null) {
      return new MyError("Please provide a title!");
    } else if (name == null) {
      return new MyError("Please provide a name");
    }
    return new MyError("Missing input");
  }

  public AppendA appendAChar(String value) {
    return new AppendA(value);
  }

  public Object arraysCalc(What what) {
    if (what.getNumbers() == null || what.getWhat() == null) {
      return new MyError("Please provide an input!");
    }
    if (what.getWhat().equals("sum") || what.getWhat().equals("multiply")) {
      return new NumberResult(what);
    }
    if (what.getWhat().equals("double")) {
      return new NumberResultInArray(what);
    }
    return null;
  }

  public Log createLog(String mapping_name, String data){
    return new Log(mapping_name, data);
  }

  public void saveLog(Log log){
    this.logRepository.save(log);
  }

  public AllLogs listFullLogs(){
    List<Log> allLogs = new ArrayList<>();
    for (Log g:this.logRepository.findAll()) {
      allLogs.add(g);
    }
    return new AllLogs(allLogs);
  }

  public NewText editingText(Text text){
    String result = null;
    String[] sentenceArray = text.getText().split(".");
    for (int i = 0; i < sentenceArray.length; i++) {
      String[] textArray = sentenceArray[i].split(" ");
      for (int j = 0; j < textArray.length - 1; j = j + 2) {
        String hold = textArray[j];
        textArray[j] = textArray[j+1];
        textArray[j+1] = hold;
      }
      for (String asd:textArray) {
        System.out.print(asd+" ");
      }
      for (String asd:sentenceArray) {
        System.out.print(asd+" ");
      }
    }
    return new NewText(sentenceArray.toString());
  }
}
