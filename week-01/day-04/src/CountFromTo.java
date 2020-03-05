import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Second Number");
        int secondNumber = scanner.nextInt();

        if (secondNumber < firstNumber) {
            System.out.println("The second number should be bigger");
        }
        else{
            while (firstNumber < secondNumber) {
                System.out.println(firstNumber);
                firstNumber++;
            }
        }
    }
}
