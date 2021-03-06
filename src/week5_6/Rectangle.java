package week5_6;

import week5_6.graphical.DrawShape;

import java.util.Objects;

public class Rectangle extends Shape {
    private Point center;
    private double width;
    private double height;

    public Rectangle(String color, boolean filled, Point center, double width, double height) {
        super(color, filled);
        this.center = center;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point center, double width, double height) {
        this.center = center;
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.center = new Point();
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 0;
        // TODO: handle get perimeter.
    }

    public void randomProperties() {
        super.randomProperties();
        double randomX = (int) (Math.random() * DrawShape.WIDTH);
        double randomY = (int) (Math.random() * DrawShape.HEIGHT);
        double randomWidth = (int) (Math.random() * 100);
        double randomHeight = (int) (Math.random() * 100);

        this.setCenter(new Point(randomX, randomY));
        this.setWidth(randomWidth);
        this.setHeight(randomHeight);
    }

    public void moving() {
        this.getCenter().moving(this.getDirection());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.getWidth(), getWidth()) == 0 &&
                Double.compare(rectangle.getHeight(), getHeight()) == 0 &&
                super.equals(o) &&
                Objects.equals(getCenter(), rectangle.getCenter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCenter(), getWidth(), getHeight());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "center=" + center +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
