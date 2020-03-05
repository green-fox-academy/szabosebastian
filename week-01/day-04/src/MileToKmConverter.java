import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write a distance in mile:");
        double mile = scanner.nextDouble();

        double km = mile*1.609344;

        System.out.println("Your distance in km: "+ km);


    }
}
