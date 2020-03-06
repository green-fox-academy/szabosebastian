import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (i*2)+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
