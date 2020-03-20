import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void mainDraw(Graphics graphics) {
    // Draw the night sky:
    //  - The background should be black
    //  - The stars can be small squares
    //  - The stars should have random positions on the canvas
    //  - The stars should have random color (some shade of grey)

    Random rand = new Random();

    graphics.setColor(Color.BLACK);
    graphics.fillRect(0,0, WIDTH, HEIGHT);

    for (int i = 0; i < 100; i++) {
      int black = rand.nextInt(255 - 100) + 100;
      Color randomColor = new Color(black, black, black);

      int x = rand.nextInt( 320);
      int y = rand.nextInt( 320);

      graphics.setColor(randomColor);
      graphics.fillRect(x,y,8,8);

    }



  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}