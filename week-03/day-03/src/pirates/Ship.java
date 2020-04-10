package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  //Pirate pirate = new Pirate("name");

  List<Pirate> listOfCrew = new ArrayList<>();
  String title = "the captain";

  public void fillShip(){
    Random random = new Random();
    int crew = random.nextInt(2);
    for (int i = 0; i < crew; i++) {
      listOfCrew.add(new Pirate("name"));
    }
  }
}
