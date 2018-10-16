package week5_6.graphical;

import week5_6.Shape;

import javax.swing.*;
import java.util.ArrayList;

public class DrawShape {
    private JFrame jFrame;
    private JPanel jPanel;

    public DrawShape() {
        jFrame = new JFrame();
        jPanel = new GroundDraw();
        jFrame.setTitle("Draw Circle.");
        jFrame.setSize(720, 480);
        jFrame.getContentPane().add(jPanel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
    }

    public void drawShapes(ArrayList<Shape> shapes) {
        ((GroundDraw) jPanel).setShapes(shapes);
    }
}
