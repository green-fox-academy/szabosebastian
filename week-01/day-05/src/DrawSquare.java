import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {
    System.out.println("Write a number:");
    Scanner scannerInput = new Scanner(System.in);

    int number = scannerInput.nextInt();

    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= number; j++) {
        if (i == 1 || j == 1 || i == number || j == number) {
          System.out.print("#");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
