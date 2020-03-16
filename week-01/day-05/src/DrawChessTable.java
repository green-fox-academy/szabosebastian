import java.util.Scanner;

public class DrawChessTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a number:");
    int number = scanner.nextInt();

    for (int i = 0; i < number; i++) {
      for (int j = 0; j < number; j++) {
        if (i % 2 != 0 || j % number != 0) {
          System.out.print(" ");
        }
        System.out.print("%");
      }
      System.out.println();
    }
  }
}
