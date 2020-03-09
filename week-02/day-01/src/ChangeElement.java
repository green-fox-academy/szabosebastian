import java.util.Arrays;

public class ChangeElement {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,8,5,6};
        int n = 4;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 8){
                numbers[i] = n;
                System.out.println(Arrays.toString(numbers));
            }
        }
    }
}

// Change with a loop