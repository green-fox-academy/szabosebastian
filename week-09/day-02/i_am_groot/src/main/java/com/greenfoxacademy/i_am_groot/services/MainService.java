package com.greenfoxacademy.i_am_groot.services;

import com.greenfoxacademy.i_am_groot.models.Arrow;
import com.greenfoxacademy.i_am_groot.models.Cargo;
import com.greenfoxacademy.i_am_groot.models.FillCargo;
import com.greenfoxacademy.i_am_groot.models.Food;
import com.greenfoxacademy.i_am_groot.models.Groot;
import com.greenfoxacademy.i_am_groot.models.MyError;
import com.greenfoxacademy.i_am_groot.repositories.FoodRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MainService {

  private FoodRepository foodRepository;

  public MainService(FoodRepository foodRepository) {
    this.foodRepository = foodRepository;
  }

  public ResponseEntity<?> iAmGroot(String text) {
    System.out.println(text);
    if (text == "") {
      return ResponseEntity.badRequest().body(new MyError("I am Groot!"));
    }
    return ResponseEntity.ok().body(new Groot(text));
  }

  public ResponseEntity<?> yonduArrow(Float distance, Float time) {
    if (distance == null || time == null) {
      return ResponseEntity.badRequest().body(new MyError("Paramater required!"));
    }
    return ResponseEntity.ok().body(new Arrow(distance, time));
  }

  public Cargo statusOfCargo() {
    return new Cargo();
  }

  public FillCargo fillUpTheCargoByAmountOf(String caliber, int amount) {
    double maxValue = 12500;
    Double tempValueOfAmountOfCargo;
    Double resultStatusInInteger;
    String cargoStatusResult;

    FillCargo cargo = new FillCargo(caliber);

    switch (caliber) {
      case ".50":
        cargo.setAmount(amount);
        break;
      case ".30":
        cargo.setAmount(amount);
        break;
      case ".25":
        cargo.setAmount(amount);
        break;
    }

    tempValueOfAmountOfCargo = Double.valueOf(cargo.getAmount());
    resultStatusInInteger = (tempValueOfAmountOfCargo / maxValue) * 100;
    cargoStatusResult = resultStatusInInteger.toString() + "%";

    if (amount == 12500) {
      cargo.setShipstatus("full");
    } else if (amount == 0) {
      cargo.setShipstatus("empty");
    } else if (amount > 12500) {
      cargo.setShipstatus("overloaded");
    } else {
      cargo.setShipstatus(cargoStatusResult);
    }

    if (maxValue == tempValueOfAmountOfCargo) {
      cargo.setReady(true);
    } else {
      cargo.setReady(false);
    }

    return cargo;
  }

  public List<Food> listOfDraxStats() {
    return foodRepository.findAllBy();
  }

  public void saveFoodToFoodList(Food food) {
    foodRepository.save(food);
  }

  public void deleteFoodItemFromDraxFoodTable(long id) {
    foodRepository.deleteById(id);
  }

  public Food searchItemByIdAndChangeTheAmountValue(long id, int amount) {
    Optional<Food> currentFood = foodRepository.findById(id);
    if (currentFood.isPresent()) {
      return currentFood.get();
    }
    return null;
  }
}

