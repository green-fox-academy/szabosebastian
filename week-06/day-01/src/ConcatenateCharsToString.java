import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ConcatenateCharsToString {
  public static void main(String[] args) {
    List<Character> characterList = Arrays.asList('s', 'z', 'e', 'b', 'i');

    String text = characterList.stream()
        .map(Objects::toString)
        .collect(Collectors.joining());

    System.out.println(text);
  }
}
