import java.util.Scanner;

public class Factorio {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Write a number");
    int number = input.nextInt();

    System.out.println(factorio(number));
  }

  public static int factorio(int fact) {
    int result = 1;

    for (int i = 1; i <= fact; i++) {
      result = result * i;

    }
    return result;
  }
}
