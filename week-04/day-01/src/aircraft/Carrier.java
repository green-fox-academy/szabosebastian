package aircraft;

import java.util.ArrayList;

public class Carrier {

  ArrayList<Aircrafts> listOfAircrafts = new ArrayList<Aircrafts>();

  private int carrierAmmoStore;
  private int healthPoint;

  public Carrier(int carrierAmmoStore, int healthPoint) {
    this.carrierAmmoStore = carrierAmmoStore;
    this.healthPoint = healthPoint;
  }

  public void add(Aircrafts aircrafts) {
    this.listOfAircrafts.add(aircrafts);
  }

  public void fill() throws Exception {
    if (this.carrierAmmoStore == 0) {
      throw new Exception("No ammo");
    }

    for (Aircrafts aircraft : this.listOfAircrafts) {
      if (this.carrierAmmoStore == 0) {
        break;
      }
      if (aircraft.isPriority()) {
        this.carrierAmmoStore = aircraft.refill(this.carrierAmmoStore);
      }
    }

    for (Aircrafts aircraft : this.listOfAircrafts) {
      if (this.carrierAmmoStore == 0) {
        break;
      }
      if (!aircraft.isPriority()) {
        this.carrierAmmoStore = aircraft.refill(this.carrierAmmoStore);
      }
    }
  }

  public void fight(Carrier enemyCarrier) {
    for (Aircrafts aircraft : listOfAircrafts) {
      enemyCarrier.healthPoint -= aircraft.fight();
    }
  }

  private int totalDamage() {
    int damageSum = 0;
    for (Aircrafts aircraft : listOfAircrafts) {
      damageSum += aircraft.getAmmoStore() * aircraft.getBaseDamage();
    }
    return damageSum;
  }

  private String carrierStatus() {
    return "HP: " + this.healthPoint + " , Aircraft count: " + this.listOfAircrafts.size() + ", Ammo Storage: " + this.carrierAmmoStore + ", Total damage: " + this.totalDamage();
  }

  private String aircraftStatus() {
    String statuses = "";
    for (Aircrafts aircraft : listOfAircrafts) {
      statuses += "Type " + aircraft.getType() + ", Ammo: " + aircraft.getAmmoStore() + ", Base Damage: " + aircraft.getBaseDamage() + ", All Damage: " + aircraft.fight() + "\r\n";
    }

    return statuses;
  }

  public String getStatus() {
    return this.carrierStatus() + "\r\n" + this.aircraftStatus();
  }
}