package week4.task2;

public class Circle extends Shape {
    // Khai báo thuộc tính.
    private double radius;
    private final double PI = Math.PI;

    // Constructor.
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(1.0);
    }

    // Setter, getter.
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Tính chu vi.
    public double getArea() {
        return this.radius * this.radius * this.PI;
    }

    // Tính diện tích.
    public double getPerimeter() {
        return this.radius * 2 * this.PI;
    }

    // Chuyển đổi các thuộc tính sang String.
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
