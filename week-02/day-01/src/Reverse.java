import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int [] numbers = {3,4,5,6,7};

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
