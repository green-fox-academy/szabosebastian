package charsequence;

public class Main {
  public static void main(String[] args) {
    Gnirts g = new Gnirts("example");
    Shifter s = new Shifter("FirstString", 2);

    System.out.println(s.charAt(0));
    System.out.println(s.subSequence(0,3));

/*    System.out.println(g.charAt(1));
    System.out.println(g.subSequence(3,5));
    System.out.println(g.subSequence(3,5));
    System.out.println(g.chars());
    System.out.println(g.codePoints());*/
  }
}
