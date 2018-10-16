package week5_6;

import week5_6.graphical.ColorManager;

import java.util.Objects;

public abstract class Shape {
    private String color;
    private boolean filled;
    private double direction;

    public Shape(String color, boolean filled, double direction) {
        this.color = color;
        this.filled = filled;
        this.direction = direction;
    }

    public Shape(String color, boolean filled) {
        this(color, filled, 0);
    }

    public Shape() {
        this("red", true);
    }

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

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public void randomProperties() {
        boolean randomFilled = (int) (Math.random() * 2) == 0;
        double randomDirection = Math.random() * 360;

        this.setColor(ColorManager.randomColor());
        this.setFilled(randomFilled);
        this.setDirection(randomDirection);
    }

    public void moving() {
        System.out.println("Moving shape.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return isFilled() == shape.isFilled() &&
                Double.compare(shape.getDirection(), getDirection()) == 0 &&
                Objects.equals(getColor(), shape.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), isFilled(), getDirection());
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
