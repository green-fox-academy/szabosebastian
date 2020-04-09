package charsequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {

  String myString;

  public Gnirts(String string){
    this.myString = string;
  }

  @Override
  public int length() {
    return myString.length();
  }

  @Override
  public char charAt(int index) {
    return myString.charAt(myString.length()-1-index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {

    return this.myString.subSequence(start,end);
  }

  @Override
  public IntStream chars() {

    return this.myString.chars();
  }

  @Override
  public IntStream codePoints() {

    return this.myString.codePoints();
  }
}
