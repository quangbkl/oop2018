package week5_6.graphical;

import week5_6.*;

import java.util.ArrayList;

public class DrawTestDrive {
    public static void main(String[] args) {
        DrawShape drawShape = new DrawShape();
        Circle circle = new Circle(40, new Point(40, 40));
        circle.setColor("green");
        Rectangle rectangle = new Rectangle(new Point(100, 100), 40, 60);
        Triangle triangle = new Triangle(new Point(30, 90), new Point(40, 30), new Point(30, 20));
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);
        drawShape.drawShapes(shapes);
    }
}
