package postit;

import java.awt.Color;

public class Main {
  public static void main(String[] args) {
    PostIt textOne = new PostIt(Color.ORANGE, "Idea 1", Color.BLUE);
    PostIt textTwo = new PostIt(Color.PINK, "Awesome", Color.BLACK);
    PostIt textThree = new PostIt(Color.YELLOW, "Superb", Color.GREEN);

    System.out.println(textTwo);
  }
}
