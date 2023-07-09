package OopsComposition;

public class BathRoom {

    private String utensilsBrand;
    private int washBasin;
    private int showerTub;

    public BathRoom(String utensilsBrand, int washBasin, int showerTub) {
        this.utensilsBrand = utensilsBrand;
        this.washBasin = washBasin;
        this.showerTub = showerTub;
    }

    public void brandDetails(){
        System.out.println(getUtensilsBrand());
        System.out.println("Italian marbles");

    }
    private String getUtensilsBrand() {
        return utensilsBrand;
    }

    public int getWashBasin() {
        return washBasin;
    }

    public int getShowerTub() {
        return showerTub;
    }
}
