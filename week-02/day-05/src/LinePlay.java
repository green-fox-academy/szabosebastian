
import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        int firstStartX = 0;
        int firstStartY = 20;
        int firstEndX = 10;
        int firstEndY = HEIGHT;

        int secondStartX = 20;
        int secondStartY = 0;
        int secondEndX = WIDTH;
        int secondEndY = 10;



        for (int i = 0; i < 15; i++) {
            drawLineFunctionGreen(firstStartX,firstStartY,firstEndX,firstEndY,graphics);
            firstStartY += 30;
            firstEndX += 30;
        }

        for (int j = 0; j < 15; j++) {
            drawLineFunctionPurple(secondStartX,secondStartY,secondEndX,secondEndY,graphics);
            secondStartX += 30;
            secondEndY += 30;
        }
    }

    public static void drawLineFunctionGreen(int sX, int sY, int eX, int eY, Graphics line) {

        line.setColor(Color.GREEN);
        line.drawLine(sX, sY, eX, eY);


    }    public static void drawLineFunctionPurple(int sX, int sY, int eX, int eY, Graphics line) {

        line.setColor(new Color(128,0,128));
        line.drawLine(sX, sY, eX, eY);
    }

/*    public static void whiteFunction(int size, int x, int y, Graphics graphics) {

        graphics.setColor(Color.WHITE);
        graphics.fillRect(x, y, size, size);
    }*/

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