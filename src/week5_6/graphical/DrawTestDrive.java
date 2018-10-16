package week5_6.graphical;

import week5_6.Circle;
import week5_6.Point;
import week5_6.Rectangle;
import week5_6.Shape;

import java.util.ArrayList;

public class DrawTestDrive {
    public static void main(String[] args) {
        DrawShape drawShape = new DrawShape();
        Circle circle = new Circle(40, new Point(40, 40));
        circle.setColor("green");
        Rectangle rectangle = new Rectangle(new Point(100, 100), 40, 60);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        drawShape.drawShapes(shapes);
    }
}
