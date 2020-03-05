import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Girls number: ");
        int girls = scanner.nextInt();

        System.out.println("Boys number: ");
        int boys = scanner.nextInt();

        if (girls == boys && girls+boys > 19) {
            System.out.println("Party is excellent!");
        }
        else if (girls+boys > 19) {
            System.out.println("Quite cool party!");
        }
        else if (girls+boys < 20 && girls > 0) {
            System.out.println("Average part...");
        }
        else if (girls == 0) {
            System.out.println("Sausage party");
        }
    }
}
