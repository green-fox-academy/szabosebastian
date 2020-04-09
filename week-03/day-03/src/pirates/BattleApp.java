package pirates;

public class BattleApp {
  public static void main(String[] args) {
    Pirate pirate1 = new Pirate("BigBeard");
    Pirate pirate2 = new Pirate("Lil Rat");

    Ship crew = new Ship();


    crew.fillShip();
    System.out.println(crew.listOfCrew.get(1));


  }
}