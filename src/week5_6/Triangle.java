package week5_6;

import java.util.Objects;

public class Triangle extends Shape {
    private Point point1, point2, point3;

    public Triangle(String color, boolean filled, Point point1, Point point2, Point point3) {
        super(color, filled);
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Triangle() {
        this.point1 = new Point(0, 0);
        this.point2 = new Point(1, 0);
        this.point3 = new Point(0, 1);
    }

    public void setAllPoint(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(getPoint1(), triangle.getPoint1()) &&
                Objects.equals(getPoint2(), triangle.getPoint2()) &&
                Objects.equals(getPoint3(), triangle.getPoint3());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoint1(), getPoint2(), getPoint3());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                '}';
    }
}