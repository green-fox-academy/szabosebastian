import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Write a number: ");
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        while (i != j) {
            System.out.println("Guess the number");
            j = scanner.nextInt();
        }
        System.out.println("Success");
    }
}
