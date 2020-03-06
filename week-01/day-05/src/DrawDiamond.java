import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number:");
        int number = scanner.nextInt();

        for (int i = 1; i <= number/2; i++){
            for (int j = i; j < number; j++){
                System.out.print(" ");
            }
            for (int k = 1; k < (i*2); k++){
                System.out.print("*");
            }
            System.out.print("\n");

        }

        for (int l = number/2+1; l > 0; l--){
            for (int m = l; m < number; m++) {
                System.out.print(" ");
            }
            for (int n = 1; n < (l*2); n++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}
