import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CounterLinesFixed {
  public static void main(String[] args) {

    String fileName = "my-file.txt";

    System.out.println(lineCounter(fileName));

  }

  public static int lineCounter(String fileName) {

    int numberOfLines = 0;
    Path path = Paths.get(fileName);

    try {
      numberOfLines = Files.readAllLines(path).size();
      return numberOfLines;
    } catch (IOException e) {
      return 0;
    }
  }
}
