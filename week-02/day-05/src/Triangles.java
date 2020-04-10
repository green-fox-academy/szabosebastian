import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics){
    // draw a red horizontal line to the canvas' middle.
    // draw a green vertical line to the canvas' middle.
    int rows = 16;
    int rows2 = 42;
    int x = WIDTH;
    int y = HEIGHT;
    int xend = WIDTH/2;
    int yend = HEIGHT-280;

    for (int i = 0; i <= WIDTH/rows; i++) {
      drawLineRight(x,y,xend,yend,graphics);
      x -= rows;
      xend -= rows/2;
      yend += rows;
    }

    int leftx = 0;
    int lefty = HEIGHT;
    int leftxend = WIDTH/2;
    int leftyend = HEIGHT-280;

    for (int i = 0; i <= WIDTH/rows; i++) {
      drawLineRight(leftx,lefty,leftxend,leftyend,graphics);
      leftx += rows;
      leftxend += rows/2;
      leftyend += rows;
    }


  }

  public static void drawLineRight(int xstart, int ystart, int xend, int yend, Graphics graphics) {
    graphics.setColor(Color.BLACK);
    graphics.drawLine(xstart,ystart,xend,yend);
  }

  public static void drawLineLeft(int xstart, int ystart, int xend, int yend, Graphics graphics) {
    graphics.setColor(Color.BLACK);
    graphics.drawLine(xstart,ystart,xend,yend);
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