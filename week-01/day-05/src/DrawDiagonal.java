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
            for (int j = 1; j < n+1; j++) {
                if (i == 0) {
                    System.out.print("%");
                }
                else if (i == n-1){
                    System.out.print("%");
                }
                else if (j % 2 == 0){
                    System.out.print(" ");
                }
                else {
                    System.out.print("%");
                }
            }
            System.out.println();
        }
    }
}
