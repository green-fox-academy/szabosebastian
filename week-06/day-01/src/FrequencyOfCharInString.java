import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfCharInString {
  public static void main(String[] args) {
    String text = "Szia teszt szöveg";

    Character[] chars = new Character[text.length()];

    for (int i = 0; i < text.length(); i++) {
      chars[i] = text.charAt(i);
    }

    Map<Character, Long> frequency = Stream.of(chars)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    System.out.println(frequency);
  }
}
