package week5_6;

public class Square extends Rectangle {
    public Square(String color, boolean filled, Point center, double side) {
        super(color, filled, center, side, side);
    }

    public Square(Point center, double side) {
        super(center, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square() {
        super(1.0, 1.0);
    }

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

    @Override
    public String toString() {
        return "Square{" +
                "side=" + this.getSide() +
                "}";
    }
}
