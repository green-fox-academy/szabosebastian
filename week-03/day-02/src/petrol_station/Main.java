package petrol_station;

public class Main {
  public static void main(String[] args) {
    Station myStation = new Station(300);
    Car mycar = new Car();
    myStation.refill(mycar);

    System.out.println(myStation.gasAmount);
    System.out.println(mycar.gasAmount);
  }
}
