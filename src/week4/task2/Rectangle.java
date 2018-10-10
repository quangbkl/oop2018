package week4.task2;

public class Rectangle extends Shape {
    // Khai báo thuộc tính.
    private double width;
    private double height;

    // Constructor.
    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(1.0, 1.0);
    }

    // Setter, getter.
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

    // Tính diện tích.
    public double getArea() {
        return this.width * this.height;
    }

    // Tính chu vi.
    public double getPerimeter() {
        return 2 * (this.width * this.height);
    }

    // Chuyển đổi các thuộc tính sang String.
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
