
import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

class EnveloperStar {
    public static void mainDraw(Graphics graphics) {

        int firstStartX = WIDTH/2;
        int firstStartY = 0;
        int firstEndX = WIDTH/2;
        int firstEndY = HEIGHT/2;

        int secondStartX = WIDTH/2;
        int secondStartY = 0;
        int secondEndX = WIDTH/2;
        int secondEndY = HEIGHT/2;

        int thirdStartX = WIDTH/2;
        int thirdStartY = HEIGHT;
        int thirdEndX = WIDTH/2;
        int thirdEndY = HEIGHT/2;

        int fourthStartX = WIDTH/2;
        int fourthStartY = HEIGHT;
        int fourthEndX = WIDTH/2;
        int fourthEndY = HEIGHT/2;



        for (int i = 0; i < WIDTH/2/10; i++) {
            drawLineFunctionGreen(firstStartX,firstStartY,firstEndX,firstEndY,graphics);
            firstStartY += 10;
            firstEndX -= 10;
        }

        for (int j = 0; j < WIDTH/2/10; j++) {
            drawLineFunctionGreen(secondStartX,secondStartY,secondEndX,secondEndY,graphics);
            secondStartY += 10;
            secondEndX += 10;
        }

        for (int k = 0; k < WIDTH/2/10; k++) {
            drawLineFunctionGreen(thirdStartX,thirdStartY,thirdEndX,thirdEndY,graphics);
            thirdStartY -= 10;
            thirdEndX -= 10;
        }

        for (int l = 0; l < WIDTH/2/10; l++) {
            drawLineFunctionGreen(fourthStartX,fourthStartY,fourthEndX,fourthEndY,graphics);
            fourthStartY -= 10;
            fourthEndX += 10;
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