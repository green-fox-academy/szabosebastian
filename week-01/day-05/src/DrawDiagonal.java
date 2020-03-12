import java.util.Scanner;

// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number:");
        int n = scanner.nextInt();

        for (int i = 0; i < n ; i++) {
        //    System.out.println("---------");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("%");
                }
                else if ( i == j){
                    System.out.print("%");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
