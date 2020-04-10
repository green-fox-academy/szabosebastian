package gardenpractice;

public abstract class Plant {
  protected double currentWaterlevel;
  protected double maxWaterlevel;
  protected String color;
  protected String type;
  protected double waterAbsorb;

  public Plant() {
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setCurrentWaterlevel(double currentWaterlevel) {
    this.currentWaterlevel = currentWaterlevel;
  }

  public void statusInfo() {
    if (this.currentWaterlevel < this.maxWaterlevel) {
      System.out.println("The " + color + " " + type + " needs water.");
    } else {
      System.out.println("The " + color + " " + type + " doesnt need water.");
    }
  }

  public double getCurrentWaterlevel() {
    return currentWaterlevel;
  }

  public void water(double waterQuantity) {
    currentWaterlevel += waterAbsorb * waterQuantity;
  }
}