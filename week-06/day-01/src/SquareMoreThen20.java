import java.util.Arrays;
import java.util.List;

public class SquareMoreThen20 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

    numbers.stream()
        .forEach(
            x -> {
              if (x * x > 20) {
                System.out.println(x);
              }
            }
        );
  }
}
