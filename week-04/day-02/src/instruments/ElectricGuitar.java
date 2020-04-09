package instruments;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    super.name = "Electronic Guitar";
    super.numberOfStrings = 6;
  }

  public ElectricGuitar(int inputNumber) {
    super.name = "Electronic Guitar";
    super.numberOfStrings = inputNumber;
  }

  @Override
  public String sound() {
    String sound = "Twang";
    return sound;
  }
}
