import java.util.HashMap;

public class Shopping_list_2 {
  public static void main(String[] args) {
    HashMap<String, Double> product_price = new HashMap<String, Double>() {{
      put("Milk", 1.07);
      put("Rice", 1.59);
      put("Eggs", 3.14);
      put("Cheese", 12.60);
      put("Chicken Breasts", 9.40);
      put("Apples", 2.31);
      put("Tomato", 2.58);
      put("Potato", 1.75);
      put("Onion", 1.10);
    }};

    HashMap<String, Integer> bob_list = new HashMap<String, Integer>() {{
      put("Milk", 3);
      put("Rice", 2);
      put("Eggs", 2);
      put("Cheese", 1);
      put("Chicken Breasts", 4);
      put("Apples", 1);
      put("Tomato", 2);
      put("Potato", 1);
    }};

    HashMap<String, Integer> alice_list = new HashMap<String, Integer>() {{
      put("Rice", 1);
      put("Eggs", 5);
      put("Chicken Breasts", 2);
      put("Apples", 1);
      put("Tomato", 10);
    }};

    for (String value:product_price.keySet()) {
      Double price = product_price.get(value);
    }

    for (String bob_count: bob_list.keySet()) {
      Integer bob_value = bob_list.get(bob_count);
    }

    for (String alice_count: alice_list.keySet()) {
      Integer alice_value = alice_list.get(alice_count);
    }
  }
}
