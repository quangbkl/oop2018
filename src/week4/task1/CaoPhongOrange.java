package week4.task1;

public class CaoPhongOrange extends Orange {
    // Khởi tạo biến location cho CaoPhongOrange.
    private String location;

    // Constructor.
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

    // Setter, getter.
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
