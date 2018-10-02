package week4.task1;

public class CaoPhongOrange extends Orange {
    private String location;

    public CaoPhongOrange(String name, Double weight, Double price, String radius, String location) {
        super(name, weight, price, radius);
        this.location = location;
    }

    public CaoPhongOrange(String radius, String location) {
        super(radius);
        this.location = location;
    }

    public CaoPhongOrange(String location) {
        this.location = location;
    }

    public CaoPhongOrange() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
