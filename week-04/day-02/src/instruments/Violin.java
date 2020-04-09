package instruments;

  public class Violin extends StringedInstrument {

    public Violin() {
      super.name = "Violin";
      super.numberOfStrings = 4;
    }

    public Violin(int inputNumber) {
      super.name = "Violin";
      super.numberOfStrings = inputNumber;
    }

    @Override
    public String sound() {
      String sound = "Screech";
      return sound;
    }
  }
