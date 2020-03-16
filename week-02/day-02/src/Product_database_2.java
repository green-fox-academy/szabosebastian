import java.util.HashMap;

public class Product_database_2 {
  public static void main(String[] args) {
    HashMap<String, Integer> productDatabase = new HashMap<String, Integer>() {{
      put("Eggs", 200);
      put("Milk", 200);
      put("Fish", 400);
      put("Apples", 150);
      put("Bread", 50);
      put("Chicken", 550);
    }};

    String moreThan = "";

    for (String product : productDatabase.keySet()) {
      if (productDatabase.get(product) < 201) {
        System.out.println(product);
      }
    }

    System.out.println();

    for (String more : productDatabase.keySet()) {
      if (productDatabase.get(more) > 150) {
        System.out.println(more + " " + productDatabase.get(more));
      }
    }
  }
}
