package com.greenfoxacademy.i_am_groot.integration;

import com.greenfoxacademy.i_am_groot.models.Food;
import com.greenfoxacademy.i_am_groot.models.MyError;
import com.greenfoxacademy.i_am_groot.services.MainService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  private MainService service;

  public GuardianController(MainService service) {
    this.service = service;
  }

  @GetMapping("/groot")
  public ResponseEntity<?> getMessage(@RequestParam(value = "message") String text) {
    return service.iAmGroot(text);
  }

  @GetMapping("/yondu")
  public ResponseEntity<?> staticsOfArrow(@RequestParam(value = "distance", required = false) Float distance, @RequestParam(value = "time", required = false) Float time){
    return service.yonduArrow(distance,time);
  }

  @GetMapping("/rocket")
  public ResponseEntity<?> staticsOfCargo(){
    return ResponseEntity.ok().body(service.statusOfCargo());
  }

  @GetMapping("/rocket/fill")
  public ResponseEntity<?> fillUpTheCargo(@RequestParam(value = "caliber", required = false) String caliber, @RequestParam(value = "amount", required = false) int amount){
    if(caliber == null || amount == 0){
      return ResponseEntity.badRequest().body(new MyError("Paramater required!"));
    }
    return ResponseEntity.ok().body(service.fillUpTheCargoByAmountOf(caliber,amount));
  }

  @GetMapping("/drax")
  public ResponseEntity<?> showDraxCalorieTable(){
    return ResponseEntity.ok().body(service.listOfDraxStats());
  }

  @PostMapping("/drax/add")
  public void addFoodToDraxFoodTable(@RequestBody Food food){
    service.saveFoodToFoodList(food);
   }

   @GetMapping("/drax/delete/{id}")
   public void deleteItemFromDraxFoodTable(@PathVariable("id") long id){
    service.deleteFoodItemFromDraxFoodTable(id);
  }

  @GetMapping("/{id}/amount/{amount}")
  public void changeAmountByName(@RequestParam(name = "id") long id, @RequestParam(name = "amount") int amount){

  }

}