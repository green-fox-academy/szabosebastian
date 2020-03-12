import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int size = 320/7;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j % 2 != 0){
                    whiteFunction(size,x,y,graphics);
                    x += size;
                } else {
                    blackFunction(size, x, y, graphics);
                    x += size;
                }
            }
           x = 0;
           y += size;
            if (i % 2 != 0){
                whiteFunction(size,x,y,graphics);
              //  y += size;
                x += size;
            } else {
                blackFunction(size, x, y, graphics);
             //   y += size;
                x += size;
            }

        }

}

    public static void blackFunction(int size, int x, int y, Graphics graphics){

        graphics.setColor(Color.BLACK);
        graphics.fillRect(x, y, size, size);
    }

    public static void whiteFunction(int size, int x, int y, Graphics graphics){

        graphics.setColor(Color.GREEN);
        graphics.fillRect(x, y, size, size);
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