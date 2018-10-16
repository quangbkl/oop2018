package week5_6;

import week5_6.graphical.DrawShape;

import java.util.Objects;

public class Hexagon extends Shape {
    private double side;
    private Point center;

    public Hexagon(String color, boolean filled, double direction, double side, Point center) {
        super(color, filled, direction);
        this.side = side;
        this.center = center;
    }

    public Hexagon(String color, boolean filled, double side, Point center) {
        super(color, filled);
        this.side = side;
        this.center = center;
    }

    public Hexagon(double side, Point center) {
        this.side = side;
        this.center = center;
    }

    public Hexagon() {
        this(1.0, new Point(0, 0));
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void randomProperties() {
        super.randomProperties();
        double randomRadius = (int) (Math.random() * 100);
        double randomX = (int) (Math.random() * DrawShape.WIDTH);
        double randomY = (int) (Math.random() * DrawShape.HEIGHT);

        this.setSide(randomRadius);
        this.setCenter(new Point(randomX, randomY));
    }

    public void moving() {
        this.getCenter().moving(this.getDirection());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hexagon)) return false;
        if (!super.equals(o)) return false;
        Hexagon hexagon = (Hexagon) o;
        return Double.compare(hexagon.getSide(), getSide()) == 0 &&
                Objects.equals(getCenter(), hexagon.getCenter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSide(), getCenter());
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "side=" + side +
                ", center=" + center +
                '}';
    }
}
