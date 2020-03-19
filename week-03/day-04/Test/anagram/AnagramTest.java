package anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

  @Test
  public void isThisAnagram() {
    Anagram equalStrings = new Anagram();

    String firstString = "szabad lexikon";
    String secondString = "szexi lakodban";

    assertEquals(true, equalStrings.isThisAnagram(firstString,secondString));
  }
}
