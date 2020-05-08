package com.greenfoxacademy.i_am_groot.unit;

import com.greenfoxacademy.i_am_groot.models.Cargo;
import com.greenfoxacademy.i_am_groot.models.FillCargo;
import com.greenfoxacademy.i_am_groot.services.MainService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CargoServiceUnitTest {

  @Test
  public void testCargoStartStatus(){
    Cargo testCargo;
    MainService testService = new MainService();

    testCargo = testService.statusOfCargo();

    Assertions.assertEquals(0,testCargo.getCaliber25());
    Assertions.assertEquals(0,testCargo.getCaliber30());
    Assertions.assertEquals(0,testCargo.getCaliber50());
    Assertions.assertEquals("empty",testCargo.getShipstatus());
    Assertions.assertEquals(false,testCargo.isReady());
  }

  @Test
  public void testFillCargoMethod(){
    FillCargo testFillCargo;
    MainService testService = new MainService();

    testFillCargo = testService.fillUpTheCargoByAmountOf(".50",5000);

    Assertions.assertEquals(".50",testFillCargo.getReceived());
    Assertions.assertEquals(5000,testFillCargo.getAmount());
    Assertions.assertEquals("40.0%",testFillCargo.getShipstatus());
    Assertions.assertEquals(false,testFillCargo.isReady());
  }

  @Test
  public void testShipstatusWhenEmpty(){
    FillCargo testFillCargo;
    MainService testService = new MainService();

    testFillCargo = testService.fillUpTheCargoByAmountOf(".50",0);
    Assertions.assertEquals("empty",testFillCargo.getShipstatus());
  }

  @Test
  public void testShipstatusWhenNotEmpty(){
    FillCargo testFillCargo;
    MainService testService = new MainService();

    testFillCargo = testService.fillUpTheCargoByAmountOf(".50",5000);
    Assertions.assertEquals("40.0%",testFillCargo.getShipstatus());
  }

  @Test
  public void testShipstatusWhenFull(){
    FillCargo testFillCargo;
    MainService testService = new MainService();

    testFillCargo = testService.fillUpTheCargoByAmountOf(".50",12500);
    Assertions.assertEquals("full",testFillCargo.getShipstatus());
  }

  @Test
  public void testShipstatusWhenOverloaded(){
    FillCargo testFillCargo;
    MainService testService = new MainService();

    testFillCargo = testService.fillUpTheCargoByAmountOf(".50",140000);
    Assertions.assertEquals("overloaded",testFillCargo.getShipstatus());
  }
}
