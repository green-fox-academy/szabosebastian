package animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
  private int freePlaces = 6;
  protected List<Animal> listofAnimals;

  public Farm() {
    this.listofAnimals = new ArrayList<>();
  }

  public void bleed(){
    while(this.freePlaces > this.listofAnimals.size()){
      this.listofAnimals.add(new Animal(50,50));
    }
  }

  public void slaughter() {
    int valueOfLastHungry = listofAnimals.get(0).getHunger();
    int indexOfLastHungry = 0;
    for (int i = 0; i < listofAnimals.size(); i++) {
      if(listofAnimals.get(i).getHunger() < valueOfLastHungry) {
        valueOfLastHungry = listofAnimals.get(i).getHunger();
        indexOfLastHungry = i;
      }
    }
    listofAnimals.remove(indexOfLastHungry);
  }

}
