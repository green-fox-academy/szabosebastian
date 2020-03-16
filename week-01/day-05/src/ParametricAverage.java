import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

    Scanner in = new Scanner(System.in);
    int sum = 0;

    System.out.println("Enter the number: ");
    int num = Integer.parseInt(in.nextLine());

    int counter = num;
    while (counter > 0) {
      System.out.println("Enter the number: ");
      sum += Integer.parseInt(in.nextLine());
      counter--;
    }

    System.out.println("Sum: " + sum + ", Average: " + (double) sum / num);
  }
}
