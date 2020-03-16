import java.util.ArrayList;
import java.util.Arrays;

public class Personal_finance {
  public static void main(String[] args) {
    int sum = 0;
    int max = 0;

    ArrayList<Integer> finance = new ArrayList<>();

    finance.addAll(Arrays.asList(500, 1000, 1250, 175, 800, 120));

    for (int i = 0; i < finance.size(); i++) {
      sum += finance.get(i);
    }
    System.out.println("Spent money:  " + sum);

    for (int j = 0; j < finance.size(); j++) {
      if (finance.get(j) > max) {
        max = finance.get(j);
      }
    }
    System.out.println("Greatest expense: " + max);

    int min = finance.get(0);

    for (int k = 0; k < finance.size(); k++) {
      if (finance.get(k) < min) {
        min = finance.get(k);
      }
    }
    System.out.println("Cheapest spending: " + min);

    System.out.println("Average amount of spending: " + (sum / finance.size()));
  }
}
