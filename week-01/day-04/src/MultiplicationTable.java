import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please write a number:");
        int myNumber = scanner.nextInt();

        for (int i = 0; i <= myNumber ; i++) {
            System.out.println(i +" * "+ 15 +" = "+i*15);

        }
    }
}
