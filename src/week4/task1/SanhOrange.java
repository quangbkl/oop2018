package week4.task1;

public class SanhOrange extends Orange {
    private String sweetness;

    public SanhOrange(String name, Double weight, Double price, String radius, String sweetness) {
        super(name, weight, price, radius);
        this.sweetness = sweetness;
    }

    public SanhOrange(String radius, String sweetness) {
        super(radius);
        this.sweetness = sweetness;
    }

    public SanhOrange(String sweetness) {
        this.sweetness = sweetness;
    }

    public SanhOrange() {
    }

    public String getSweetness() {
        return sweetness;
    }

    public void setSweetness(String sweetness) {
        this.sweetness = sweetness;
    }
}
