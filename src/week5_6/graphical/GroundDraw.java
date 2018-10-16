package week5_6.graphical;

import week5_6.*;
import week5_6.Point;
import week5_6.Rectangle;
import week5_6.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GroundDraw extends JPanel {
    private ArrayList<Shape> shapes;

    public GroundDraw() {
        this.shapes = new ArrayList<>();
    }

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

    public void paintTriangle(Triangle triangle, Graphics g) {
        Point point1 = triangle.getPoint1();
        Point point2 = triangle.getPoint2();
        Point point3 = triangle.getPoint3();
        int x[] = {(int) point1.getX(), (int) point2.getX(), (int) point3.getX()};
        int y[] = {(int) point1.getY(), (int) point2.getY(), (int) point3.getY()};

        Color color = ColorManager.getColor(triangle.getColor());
        g.setColor(color);
        if (triangle.isFilled()) {
            g.fillPolygon(x, y, 3);
        } else {
            g.fillPolygon(x, y, 3);
        }
    }

    public void paintHexagon(Hexagon hexagon, Graphics g) {
        int side = (int) hexagon.getSide();
        Point point = hexagon.getCenter();
        int x = (int) point.getX();
        int y = (int) point.getY();
        double sqrt32 = Math.sqrt(3) / 2;
        int xPoints[] = {x, (int) (x + sqrt32 * side), (int) (x + sqrt32 * side), x, (int) (x - sqrt32 * side), (int) (x - sqrt32 * side)};
        int yPoints[] = {y - side, y - side / 2, y + side / 2, y + side, y + side / 2, y - side / 2};
        Color color = ColorManager.getColor(hexagon.getColor());

        g.setColor(color);
        if (hexagon.isFilled()) {
            g.fillPolygon(xPoints, yPoints, 6);
        } else {
            g.drawPolygon(xPoints, yPoints, 6);
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
            if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                this.paintTriangle(triangle, g);
            }
            if (shape instanceof Hexagon) {
                Hexagon hexagon = (Hexagon) shape;
                this.paintHexagon(hexagon, g);
            }
        }
    }
}
