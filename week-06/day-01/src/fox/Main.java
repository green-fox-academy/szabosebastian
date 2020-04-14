package fox;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Fox foxClass = new Fox();

    List<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("Viktor", "green", 30));
    foxes.add(new Fox("Zsombor", "green", 2));
    foxes.add(new Fox("Ági", "purple", 25));

    foxes.stream()
        .filter(fox -> fox.getColor() == "green")
        .forEach(fox -> System.out.println(fox.getName()));

    foxes.stream()
        .filter(fox -> fox.getColor() == "green" && fox.getAge() < 5)
        .forEach(fox -> System.out.println(fox.getName()));

    System.out.println(foxes.stream().collect(Collectors.groupingBy(fox -> fox.getColor(), Collectors.counting())));
  }
}
