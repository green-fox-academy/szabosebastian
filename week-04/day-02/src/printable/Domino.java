package printable;

public class Domino implements Printable{
  private int dominoLeft;
  private int dominoRight;

  public Domino(int left, int right) {
    this.dominoLeft = left;
    this.dominoRight = right;
  }

  @Override
  public void printAllFields() {
    System.out.println("Domino A side: " + this.dominoLeft + ", B side: " + this.dominoRight);
  }
}
