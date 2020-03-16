import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        System.out.println(sum(input));
    }

    public static int sum (int limit) {
        int result = 0;

        for (int i = 0; i <= limit; i++) {
            result += i;
        }
        return result;
    }
}
