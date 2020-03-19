package anagram;

import java.util.Arrays;

public class Anagram {
  public boolean isThisAnagram(String firstText, String secondText) {
    char [] first = firstText.toCharArray();
    char [] second = secondText.toCharArray();
    Arrays.sort(first);
    Arrays.sort(second);

    return Arrays.equals(first,second);
  }
}
