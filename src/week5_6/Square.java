package week5_6;

import week5_6.graphical.DrawShape;

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

    public void randomProperties() {
        super.randomProperties();
        double randomX = (int) (Math.random() * DrawShape.WIDTH);
        double randomY = (int) (Math.random() * DrawShape.HEIGHT);
        double randomSide = (int) (Math.random() * 100);

        this.setCenter(new Point(randomX, randomY));
        this.setSide(randomSide);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + this.getSide() +
                "}";
    }
}
