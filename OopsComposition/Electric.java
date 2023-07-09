package OopsComposition;

public class Electric {

    private int bulbs;
    private int fans;
    private String  laptopName;

    public Electric(int bulbs, int fans, String laptopName) {
        this.bulbs = bulbs;
        this.fans = fans;
        this.laptopName = laptopName;
    }

    public int getBulbs() {
        return bulbs;
    }

    public int getFans() {
        return fans;
    }

    public String getLaptopName() {
        return laptopName;
    }
}
