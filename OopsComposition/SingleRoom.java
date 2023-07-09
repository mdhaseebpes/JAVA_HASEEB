package OopsComposition;

public class SingleRoom {

    private String name;
    private Furniture theFurniture;
    private Electric theElectric;
    private BathRoom theBathRoom;




    public SingleRoom(String name , Furniture theFurniture , Electric theElectric , BathRoom theBathRoom){
        this.name=name;
        this.theFurniture = theFurniture;
        this.theElectric = theElectric;
        this.theBathRoom = theBathRoom;
    }

    public String getName() {
         System.out.println("name of bedroom " + name);
         return name;
    }
    public Furniture getTheFurniture() {
        return theFurniture;
    }

    public Electric getTheElectric() {
        return theElectric;
    }

    public BathRoom getTheBathRoom() {
        return theBathRoom;
    }


}
