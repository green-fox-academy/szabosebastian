package instruments;

  public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
      super.name = "Bass Guitar";
      super.numberOfStrings = 4;
    }

    public BassGuitar(int inputNumber) {
      super.name = "Bass Guitar";
      super.numberOfStrings = inputNumber;
    }

    @Override
    public String sound() {
      String sound = "Duum-duum-duum";
      return sound;
    }
  }