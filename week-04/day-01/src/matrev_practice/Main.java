package matrev_practice;

public class Main {
  public static void main(String[] args) {
    Animals animals = new Animals();

    System.out.println(animals.getName());
    System.out.println(animals.favFood);

    Cats morris = new Cats("Kira", "dogfood", "ball");

    System.out.println(morris.getName());

    Animals tabby = new Cats("Tabby", "Salmon", "Ball");

    acceptAnimal(tabby);
  }

  public static void acceptAnimal(Animals randAnimal) {
    System.out.println();
    System.out.println(randAnimal.getName());
    System.out.println(randAnimal.favFood);
    System.out.println();

    randAnimal.walkAround();

    Cats tempCat = (Cats) randAnimal;

    System.out.println(((Cats) randAnimal).favToy);

    if(randAnimal instanceof Animals) {
      System.out.println(randAnimal.getName() + " is a Cat");
    }
  }
}
