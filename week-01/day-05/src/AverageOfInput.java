import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write 5 number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int summ = (a+b+c+d+e);
        int average = ((a+b+c+d+e)/5);

        System.out.println("The 5 numbers summ is: " + summ + " and the average is: " + average);
    }
}
