import java.util.stream.*;

public class FindUppercaseChars {
  public static void main(String[] args) {
    String text = "aSbsFEsc!DW";

    String upperCases = text.chars()
        .filter(Character::isUpperCase)
        .mapToObj(c -> Character.toString((char) c))
        .collect(Collectors.joining());

    System.out.println(upperCases);
  }
}
