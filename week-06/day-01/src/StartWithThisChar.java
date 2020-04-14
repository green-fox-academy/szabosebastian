import java.util.Arrays;
import java.util.List;

public class StartWithThisChar {
  public static void main(String[] args) {
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

    char firstLetter = 'A';

    cities.stream()
        .forEach(
            x -> {
              if (x.charAt(0) == firstLetter) {
                System.out.println(x);
              }
            }
        );
  }
}
