import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write two number: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = a*10;
        int d = b*10;

        System.out.println("10x bigger number than the original two number: " + c + " " + d);
    }
}
