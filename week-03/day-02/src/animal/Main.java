package animal;

public class Main {
  public static void main(String[] args) {
    Animal dog = new Animal(50, 50);

    dog.setHunger();
    System.out.println(dog.hunger);

    dog.setThirts();
    System.out.println(dog.thirst);

    dog.setPlay();
    System.out.println(dog.thirst+ " " +dog.hunger);
  }
}
