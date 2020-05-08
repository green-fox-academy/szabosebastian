package com.greenfoxacademy.i_am_groot.repositories;

import com.greenfoxacademy.i_am_groot.models.Food;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food, Long> {

  List<Food> findAllBy();
}
