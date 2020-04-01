package animal;

public class Main {
  public static void main(String[] args) {
    Animal dog = new Animal(51, 51);
    Animal cat = new Animal(50, 50);
    Animal bird = new Animal(50, 50);
    Farm farm = new Farm();

    farm.bleed();
    System.out.println(farm.listofAnimals.size());
    farm.slaughter();
    System.out.println(farm.listofAnimals.size());

/*    dog.setHunger();
    System.out.println(dog.hunger);

    dog.setThirts();
    System.out.println(dog.thirst);

    dog.setPlay();
    System.out.println(dog.thirst+ " " +dog.hunger);*/
  }
}
