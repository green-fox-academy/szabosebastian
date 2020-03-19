package Sum;

import java.util.ArrayList;

public class Sum {

  public int sumMethod(ArrayList<Integer> sumArray) {

    ArrayList<Integer> resultArray = new ArrayList<Integer>();
    int result = 0;
    try {

      for (int i = 0; i < sumArray.size(); i++) {
        result += sumArray.get(i);
      }
    } catch (NullPointerException e) {

    }
    return result;
  }
}
