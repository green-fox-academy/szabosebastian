package aircraft;

public abstract class Aircrafts {

  private int maxAmmo;
  private int ammoStore;
  private int baseDamage;

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getAmmoStore() {
    return ammoStore;
  }

  public void setAmmoStore(int ammoStore) {
    this.ammoStore = ammoStore;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public int fight() {
    int storedAmmo = ammoStore;
    this.ammoStore = 0;

    return storedAmmo * this.baseDamage;
  }

  public int refill(int ammoToFill) {
    if (ammoToFill > this.maxAmmo) {
      this.ammoStore = this.maxAmmo;
      return ammoToFill - this.maxAmmo;
    } else if (this.ammoStore + ammoToFill <= this.maxAmmo && this.ammoStore + ammoToFill > 0) {
      this.ammoStore += ammoToFill;
      return 0;
    } else {
      // if(this.ammoStore + ammoToFill >= this.maxAmmo)
      int ammoStoreBeforeChange = this.ammoStore;
      this.ammoStore = this.maxAmmo;
      return (ammoStoreBeforeChange + ammoToFill) - this.maxAmmo;
    }
  }

  public String getType() {
    return this.getClass().getSimpleName();
  }

  public String getStatus() {
    return "Type " + this.getType() + " , Ammo: " + this.getAmmoStore() + ", Base Damage: " + this.getBaseDamage() + ", All Damage: " + this.getAmmoStore() * this.getBaseDamage();
  }

  public boolean isPriority() {
    String type = "F35";
    if (this.getType().equals(type)) {
      return true;
    }
    return false;
  }

}
