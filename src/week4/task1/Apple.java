package week4.task1;

public class Apple extends Fruit {
    private String color;

    public Apple(String name, Double weight, Double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public Apple(String color) {
        this.color = color;
    }

    public Apple() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
