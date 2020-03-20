package countletters;

import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Test;

public class CountLettersTest {

  @Test
  public void lettersAndOccurences() {
    CountLetters makeHashMap = new CountLetters();

    String text = "AABBCCC";

    HashMap<Character, Integer> testMap = new HashMap<Character, Integer>();

    testMap.put('A', 2);
    testMap.put('B', 2);
    testMap.put('C', 3);

    assertEquals(testMap,makeHashMap.lettersAndOccurences(text));
  }
}