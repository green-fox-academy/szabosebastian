import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many lines will the triangle should be?");
        int n = scanner.nextInt();
        int i,j,k;
        //char j = 42;
        //String star = "*";

        for (i = 0; i < n; i++) {
     //       for (j = 0; j < n - i; j++) {
     //           System.out.print("");
     //           }

            for (k = 0;  k <= i ; k++) {
                System.out.print("* ");
            }

            System.out.println();
            }
        }
    }
