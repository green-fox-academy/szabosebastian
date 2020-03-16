import java.util.ArrayList;
import java.util.Arrays;

public class Shopping_list {
  public static void main(String[] args) {

   // String comparative ="";

    ArrayList<String> shoppingList = new ArrayList<>();

    shoppingList.addAll(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));


    System.out.println("Do we have milk on the list? " + shoppingList.contains("milk"));
    System.out.println("Do we have banana on the list? " + shoppingList.contains("banana"));
  }
}
