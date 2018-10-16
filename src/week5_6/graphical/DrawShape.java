package week5_6.graphical;

import week5_6.Shape;

import javax.swing.*;
import java.util.ArrayList;

public class DrawShape {
    private JFrame jFrame;
    private JPanel jPanel;
    public static int WIDTH = 720;
    public static int HEIGHT = 480;

    public DrawShape() {
        jFrame = new JFrame();
        jPanel = new GroundDraw();
        jFrame.setTitle("Draw Circle.");
        jFrame.setSize(WIDTH, HEIGHT);
        jFrame.getContentPane().add(jPanel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
    }

    public void drawShapes(ArrayList<Shape> shapes) {
        ((GroundDraw) jPanel).setShapes(shapes);
        jPanel.repaint();
    }
}
