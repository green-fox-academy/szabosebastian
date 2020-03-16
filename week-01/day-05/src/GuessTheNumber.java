import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Store a number: ");
    int i = scanner.nextInt();
    System.out.println("Guess a number");
    int j = scanner.nextInt();

    while (i != j) {
      // j = scanner.nextInt();
      if (i > j) {
        System.out.println("The stored number is higher, guess again:");
        j = scanner.nextInt();
      } else {
        System.out.println("The stored number is lower, guess again:");
        j = scanner.nextInt();
      }
    }
    System.out.println("You found the number:" + i);
  }
}
