import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        try {
            int dividedNumber = 0;
            System.out.println(divide(dividedNumber));
        } catch (ArithmeticException e){
            System.out.println("fail");
        }
    }

    public static int divide (int result){
        int i = 0;
        int a = 10;

        result = a / i;

        return result;
    }

}
