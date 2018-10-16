package week5_6.graphical;

import week5_6.Circle;
import week5_6.Point;
import week5_6.Rectangle;
import week5_6.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GroundDraw extends JPanel {
    private ArrayList<Shape> shapes;

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    private boolean isDraw = true;

    public void setDraw(boolean draw) {
        isDraw = draw;
    }

    public void paintCircle(Circle circle, Graphics g) {
        int radius = (int) circle.getRadius();
        Point point = circle.getCenter();
        int x = (int) point.getX() - radius;
        int y = (int) point.getY() - radius;
        Color color = ColorManager.getColor(circle.getColor());

        g.setColor(color);
        if (circle.isFilled()) {
            g.fillOval(x, y, radius * 2, radius * 2);
        } else {
            g.drawOval(x, y, radius * 2, radius * 2);
        }
    }

    public void paintRectangle(Rectangle rectangle, Graphics g) {
        Point point = rectangle.getCenter();
        int width = (int) rectangle.getWidth();
        int height = (int) rectangle.getHeight();
        int x = (int) point.getX() - width / 2;
        int y = (int) point.getY() - height / 2;
        Color color = ColorManager.getColor(rectangle.getColor());

        g.setColor(color);
        if (rectangle.isFilled()) {
            g.fillRect(x, y, width, height);
        } else {
            g.drawRect(x, y, width, height);
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                this.paintCircle(circle, g);
            }
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                this.paintRectangle(rectangle, g);
            }

        }
    }
}
