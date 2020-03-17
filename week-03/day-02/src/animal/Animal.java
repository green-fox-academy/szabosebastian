package animal;

public class Animal {
  int hunger;
  int thirst;

  public Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public void setHunger() {
    hunger--;
  }

  public void setThirts() {
    thirst--;
  }

  public void setPlay() {
    hunger++;
    thirst++;
  }
}
