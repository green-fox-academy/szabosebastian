import java.util.HashMap;

public class Product_database {
  public static void main(String[] args) {
    HashMap<String, Integer> productDatabase = new HashMap<String, Integer>() {{
      put("Eggs", 200);
      put("Milk", 200);
      put("Fish", 400);
      put("Apples", 150);
      put("Bread", 50);
      put("Chicken", 550);
    }};

    int max = 0;
    int min = productDatabase.get(productDatabase.keySet().toArray()[0]);
    int sum = 0;
    int productBelow = 0;
    boolean exactly = false;
    String mostExpensive = "";
    String cheapest = "";


    System.out.println("Fish cost is: " + productDatabase.get("Fish"));


    for (String product : productDatabase.keySet()) {
      if (max < productDatabase.get(product)) {
        mostExpensive = product;
        max = productDatabase.get(product);
      }
      if (min > productDatabase.get(product)) {
        cheapest = product;
        min = productDatabase.get(product);
      }
      if (productDatabase.get(product) < 300) {
        productBelow++;
      }
      if (productDatabase.get(product) == 125) {
        exactly = true;
      }
      sum += productDatabase.get(product);
    }
    System.out.println("Most expensive product: " + mostExpensive);
    System.out.println("Average price is: " + sum / productDatabase.size());
    System.out.println("How many products' price is below 300? " + productBelow);
    System.out.println("Is there anything we can buy for exactly 125? " + exactly);
    System.out.println("Cheapest product: " + cheapest);
  }
}
