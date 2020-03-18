package dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...


    List<Domino> dominoesSnake = new ArrayList<>();

    dominoesSnake.add(dominoes.get(0));


    for (int i = 0; i < dominoesSnake.size(); i++) {

      for (int j = 1; j < dominoes.size(); j++) {

        if (dominoesSnake.get(i).getRightSide() == dominoes.get(j).getLeftSide()) {
          dominoesSnake.add(dominoes.get(j));
          dominoes.remove(dominoes.get(j));
          break;
        }
      }
    }

    dominoes = dominoesSnake;

    System.out.println(dominoes);

  }
  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}