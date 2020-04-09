
package gardenpractice;

public class Flower extends Plant {
  public Flower(String color) {
    this.color = color;
    setType("Flower");
    this.currentWaterlevel = 0;
    this.maxWaterlevel = 5;
    this.waterAbsorb = 0.75;
  }
}