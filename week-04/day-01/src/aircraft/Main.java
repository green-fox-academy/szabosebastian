package aircraft;

public class Main {
  public static void main(String[] args) {
    Aircrafts repcsi = new F16();
    Aircrafts repcsi2 = new F35();
    Aircrafts repcsi3 = new F16();
    Aircrafts repcsi4 = new F35();
    Aircrafts repcsi5 = new F35();
    Aircrafts repcsi6 = new F35();
    Aircrafts repcsi7 = new F35();

    Carrier carrier = new Carrier(50, 200);
    Carrier enemyCarrier = new Carrier(5, 10000);

    System.out.println(carrier.getStatus());
    System.out.println(enemyCarrier.getStatus());

    carrier.add(repcsi4);
    carrier.add(repcsi5);
    carrier.add(repcsi6);
    carrier.add(repcsi7);
    carrier.add(repcsi);
    carrier.add(repcsi3);
    enemyCarrier.add(repcsi2);

    try {
      carrier.fill();
      enemyCarrier.fill();
    } catch (Exception e) {
      System.err.println(e);
    }
    //carrier.fight(enemyCarrier);
    //enemyCarrier.fight(carrier);

    System.out.println(carrier.getStatus());
    System.out.println(enemyCarrier.getStatus());

  }
}
