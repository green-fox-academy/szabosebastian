package randomwordcalc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomWordsCalc {
  public static void main(String[] args) {

    Path path = Paths.get("src\\randomwordcalc\\test");
    try (Stream<String> lines = Files.lines(path)) {
      lines
          .flatMap(line -> Arrays.stream(line.split(" ")))
          .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
          .filter(word -> word.length() > 0)
          .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
          .entrySet()
          .stream()
          .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
          .limit(100)
          .forEach(System.out::println);

    } catch (IOException ex) {
      // do something or re-throw...
    }
  }
}
