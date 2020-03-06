import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenLegs,pigLegs,i,j;

        System.out.println("Numbers of chickens?");
        i = scanner.nextInt();

        System.out.println("Numbers of pigs?");
        j = scanner.nextInt();

        chickenLegs = i*2;
        pigLegs = j*4;

        System.out.println("Chicken + pigs legs: " + (pigLegs+chickenLegs));
    }
}
