package week4.task2;

public class Square extends Rectangle {
    // Constructor.
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square() {
        super();
    }

    // Setter, getter.
    public double getSide() {
        return this.getHeight();
    }

    public void setSide(double side) {
        this.setHeight(side);
        this.setWidth(side);
    }

    public void setWidth(double side) {
        this.setSide(side);
    }

    public void setHeight(double side) {
        this.setSide(side);
    }

    // Chuyển đổi các thuộc tính sang String.
    @Override
    public String toString() {
        return "Square{" +
                "side=" + this.getSide() +
                "}";
    }
}
