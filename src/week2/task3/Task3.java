package week2.task3;

public class Task3 {
}

// khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class Girl {
    private String name;
    int age, height, weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Girl(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void talk() {
        System.out.println("Girl.");
    }

    public boolean isFat() {
        return this.weight > 50;
    }

    public boolean isTeen() {
        return this.age > 12 && this.age < 20;
    }
}

class Dog {
    String name;
    int price, speed;

    public Dog(String name, int price, int speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean rich() {
        return price > 100;
    }

    public int solo(Dog newDog) {
        if (this.speed == newDog.speed) return 0;
        if (this.speed <= newDog.speed) return -1;
        return 1;
    }

    public void go() {
        System.out.println("Go Go");
    }
}

class Monney {
    int value;
    String material;
    boolean isReal;

    public Monney(int value, String material, boolean isReal) {
        this.value = value;
        this.material = material;
        this.isReal = isReal;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isReal() {
        return isReal;
    }

    public void setReal(boolean real) {
        isReal = real;
    }

    public boolean canPepper() {
        return isReal && value > 0;
    }

    public void foreclosure() {
        if (this.value > 100) {
            System.out.println("Foreclosure.");
        } else {
            System.out.println("Not foreclosure.");
        }
    }

    public boolean paperMoney() {
        return value < 10;
    }
}