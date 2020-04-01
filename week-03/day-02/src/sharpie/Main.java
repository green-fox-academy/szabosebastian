package sharpie;

public class Main {
  public static void main(String[] args) {
    Sharpie createSharpie = new Sharpie("Blue", 1.1f);
    createSharpie.use();

    System.out.println("After the use() method inkAmount: " +createSharpie.inkAmount);
  }
}
