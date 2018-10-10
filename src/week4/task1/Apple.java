package week4.task1;

public class Apple extends Fruit {
    // Khai báo thuộc tính màu Apple.
    private String color;

    // Tạo constructor Apple.
    public Apple(String name, Double weight, Double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public Apple(String color) {
        this.color = color;
    }

    public Apple() {
    }

    // Setter, getter apple.
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
