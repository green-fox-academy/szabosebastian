package printable;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(2,3));
    dominoes.add(new Domino(6,2));

    for (Domino d : dominoes) {
      d.printAllFields();
    }


  List<Todo> todos = new ArrayList<Todo>();
  todos.add(new Todo("Buy milk","medium",true));
  todos.add(new Todo("Buy bread","low",false));

  for (Todo t : todos) {
    t.printAllFields();
  }
  }
}
