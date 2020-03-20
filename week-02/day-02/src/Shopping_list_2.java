import java.util.HashMap;

public class Shopping_list_2 {
  public static void main(String[] args) {

    Double bobPayment = 0.0;
    Double alicePayment = 0.0;

    Integer bob_sum = 0;
    Integer alice_sum = 0;


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


    for (String main_value : product_price.keySet()) {
      for (String bob_value : bob_list.keySet()) {
        if (main_value == bob_value) {
          bobPayment += product_price.get(main_value) * bob_list.get(bob_value);

        }
      }
    }

    System.out.println("Bob pays: " + bobPayment);

    for (String main_value : product_price.keySet()) {
      for (String alice_value : alice_list.keySet()) {
        if (main_value == alice_value) {
          alicePayment += product_price.get(main_value) * alice_list.get(alice_value);
        }
      }
    }

    System.out.println("Alice pays: " + alicePayment);


    for (String bob_value : bob_list.keySet()) {
      if (bob_value == "Rice") {
        for (String alice_value : alice_list.keySet()) {
          if (alice_value == "Rice") {
            if (bob_list.get(bob_value) > alice_list.get(alice_value)) {
              System.out.println("Bob buys more rice");
            } else {
              System.out.println("Alice buys more rice");
            }
          }
        }
      }
    }

     int alicePotato = alice_list.getOrDefault("Potato", 0);
     int bobPotato = bob_list.getOrDefault("Potato", 0);

    if (bobPotato > alicePotato) {
      System.out.println("Bob has more potato");
    } else {
      System.out.println("Alice has more potato");
    }

    if (bob_list.size() > alice_list.size()) {
      System.out.println("Bob buys more different product");
    } else {
      System.out.println("Alice buys more different product");
    }

    for (String value: bob_list.keySet()) {
      bob_sum += bob_list.get(value);
    }

    for (String value: alice_list.keySet()) {
      alice_sum += alice_list.get(value);
    }

    if(bob_sum > alice_sum) {
      System.out.println("Bob buys more piece of product");
    } else {
      System.out.println("Alice buys more piece of product");
    }

  }
}
