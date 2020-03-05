import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a number:");
        int myNumber = scanner.nextInt();

        if (myNumber <= 0) {
            System.out.println("Not enough");
        }
        else if (myNumber == 1) {
            System.out.println("One");
        }
        else if (myNumber == 2) {
            System.out.println("Two");
        }
        else if (myNumber > 2) {
            System.out.println("A lot");
        }
    }
}
