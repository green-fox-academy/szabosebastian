public class SumAll {
    public static void main(String[] args) {
        int [] numbers = {4,5,6,7};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
