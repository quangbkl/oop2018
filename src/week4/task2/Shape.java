package week4.task2;

public class Shape {
    // Khai báo thuộc tính.
    private String color;
    private boolean filled;

    // Constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
        this("red", true);
    }

    // Setter, getter.
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Chuyển đổi các thuộc tính sang String.
    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
