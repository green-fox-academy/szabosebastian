package gardenpractice;

public class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree("purple");
    Tree tree2 = new Tree("orange");
    Flower flower = new Flower("blue");
    Flower flower2 = new Flower("pink");
    Garden gardenOfPlants = new Garden();

    gardenOfPlants.addPlants(flower);
    gardenOfPlants.addPlants(flower2);
    gardenOfPlants.addPlants(tree1);
    gardenOfPlants.addPlants(tree2);
    gardenOfPlants.watering(0);
    gardenOfPlants.watering(40);
    gardenOfPlants.watering(70);


  }
}