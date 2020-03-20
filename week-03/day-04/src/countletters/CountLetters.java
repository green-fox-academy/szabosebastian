package countletters;

import java.util.HashMap;

public class CountLetters {

  public HashMap<Character, Integer> lettersAndOccurences(String text) {

    HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();

    for (int i = 0; i < text.length(); i++) {
      if (!myMap.containsKey(text.charAt(i))) {
        myMap.put(text.charAt(i), 1);
      } else {
        myMap.replace(text.charAt(i), myMap.get(text.charAt(i)) + 1);
      }
    }
    return myMap;
  }
}
