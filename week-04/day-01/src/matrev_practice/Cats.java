package matrev_practice;

public class Cats extends Animals {
  public String favToy = "Yarn";

  public void playWith() {
    System.out.println("YEAH " + favToy);
  }

  public void walkAround() {
    System.out.println(this.getName() + " stalks around");
  }

  public String getToy() {
    return this.favToy;
  }

  public Cats () {

  }

  public Cats (String name, String favFood, String favToy) {
    super(name, favFood);
    this.favToy = favToy;
  }
}
