import java.util.Random;

public class test {
  public static void main(String[] args) {
    Random rand = new Random();

    for (int i = 0; i < 10; i++) {
      int black = rand.nextInt(255 - 128) + 128;
      System.out.println(black);

    }

  }
}
