package com.greenfoxacademy.backend_api_exercise;

import com.greenfoxacademy.backend_api_exercise.models.NumberResult;
import com.greenfoxacademy.backend_api_exercise.models.NumberResultInArray;
import com.greenfoxacademy.backend_api_exercise.models.What;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ResultArrayTest {

  @Test
  public void sumElementsInArray() {
    int ArrayTest[] = {1, 2, 5, 10};

    What what = new What();
    what.setNumbers(ArrayTest);
    what.setWhat("sum");

    NumberResult sumOrMultiResult = new NumberResult(what);

    Assertions.assertEquals(18, sumOrMultiResult.getResult());
  }

  @Test
  public void doubleElementsInArray() {
    int ArrayTest[] = {2, 2, 2, 2};
    int ResultArrayTest[] = {4, 4, 4, 4};

    What what = new What();
    what.setNumbers(ArrayTest);
    what.setWhat("double");

    NumberResultInArray doubleTheArray = new NumberResultInArray(what);

    Assertions.assertArrayEquals(ResultArrayTest, doubleTheArray.getResult());
  }
}
