package postit;

import java.awt.Color;

public class PostIt {

  Color backgroundColor;
  String text;
  Color textColor;

  public PostIt (Color backgroundColor, String text, Color textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }
}
