package week5_6;

import java.util.Objects;

public class Circle extends Shape {
    private double radius;
    private Point center;
    private final static double PI = Math.PI;

    public Circle(String color, boolean filled, double radius, Point center) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.center = new Point();
    }

    public Circle() {
        this(1.0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public static double getPI() {
        return PI;
    }

    public double getArea() {
        return this.radius * this.radius * this.PI;
    }

    public double getPerimeter() {
        return 0;
        // TODO: handle get perimeter.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0 &&
                Objects.equals(getCenter(), circle.getCenter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius(), getCenter());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
