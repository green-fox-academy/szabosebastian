package petrol_station;

public class Station {
  int gasAmount;

  public Station(int incomingGas){
    this.gasAmount = incomingGas;
  }

  public void refill(Car car){
    this.gasAmount -= car.capacity;
    car.gasAmount += car.capacity;
  }
}
