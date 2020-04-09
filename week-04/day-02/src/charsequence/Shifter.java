package charsequence;

public class Shifter implements CharSequence {
  protected String text;
  protected int number;

  public Shifter(String text, int number){
    this.text= text;
    this.number = number;
  }

  @Override
  public int length() {
    return this.text.length();
  }

  @Override
  public char charAt(int index) {
    return this.text.charAt(index+number);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return this.text.subSequence(start+number,end+number);
  }
}
