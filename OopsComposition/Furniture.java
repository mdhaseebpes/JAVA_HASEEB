package OopsComposition;

public class Furniture {
    private String bed;
    private String wardrobe;
    private int doors;

    public Furniture(String bed, String wardrobe, int doors) {
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.doors = doors;
    }

    public String getBed() {
        return bed;
    }

    public String getWardrobe() {
        return wardrobe;
    }

    public int getDoors() {
        return doors;
    }
}
