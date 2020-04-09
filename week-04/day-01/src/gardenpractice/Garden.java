package gardenpractice;

import java.util.ArrayList;
import java.util.List;

//is able to hold unlimited amount of flowers or trees
//when watering it should only water those what needs water with equally divided amount amongst them
//eg. watering with 40 and 4 of them need water then each gets watered with 10
public class Garden {
  private List<Plant> listOfPlants = new ArrayList<>();

  public Garden() {
  }

  public void addPlants(Plant plant) {
    listOfPlants.add(plant);
  }

  public void watering(double waterAmount) {
    double sharedWater = waterAmount / listOfPlants.size();
    System.out.println("Watering with " + (int) waterAmount);
    for (Plant plant : listOfPlants) {
      plant.water(sharedWater);
      plant.statusInfo();
    }
  }

}