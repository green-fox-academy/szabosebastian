import java.util.HashMap;
import java.util.Map;

public class map_introduction_1 {
  public static void main(String[] args) {
    HashMap<Integer, Character> myfirstMap = new HashMap<>();

    myfirstMap.put(97, 'a');
    myfirstMap.put(98, 'b');
    myfirstMap.put(99, 'c');
    myfirstMap.put(65, 'A');
    myfirstMap.put(66, 'B');
    myfirstMap.put(67, 'C');
    myfirstMap.put(68, 'D');

    //System.out.println(myfirstMap.keySet());

    for (Integer key : myfirstMap.keySet()) {
      //    System.out.println(key);
    }

    for (Character value : myfirstMap.values()) {
      //    System.out.println(value);
    }

    for (Map.Entry<Integer, Character> item : myfirstMap.entrySet()) {
      item.getKey();
      item.getValue();
    }

    System.out.println(myfirstMap.size());

    System.out.println(myfirstMap.get(99));

    myfirstMap.remove(97);

    System.out.println(myfirstMap.get(100));

    myfirstMap.clear();

    System.out.println(myfirstMap);
  }
}
