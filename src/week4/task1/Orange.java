package week4.task1;

public class Orange extends Fruit {
    private String radius;

    public Orange(String name, Double weight, Double price, String radius) {
        super(name, weight, price);
        this.radius = radius;
    }

    public Orange(String radius) {
        this.radius = radius;
    }

    public Orange() {
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }
}
