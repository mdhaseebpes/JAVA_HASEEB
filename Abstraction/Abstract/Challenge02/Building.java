package Abstraction.Abstract.Challenge02;

enum UsageType{ENTERTAINMENT ,GOVERNMENT ,RESIDENTIAL ,SPORTS}

public class Building implements Mappable{

   private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {

        return name + "("+ usage + ")";
    }

    @Override
    public Geometry getMarker() {
        return null;
    }

    @Override
    public Geometry getShape() {

        return Geometry.POINT;
    }

  /*  @Override
    public String getMarker() {

        return switch (usage){
            case SPORTS -> Color.ORANGE + " " + PointMarkers.PUSH_PIN;
            case GOVERNMENT -> Color.RED + " " + PointMarkers.STAR;
            case RESIDENTIAL -> Color.ORANGE + " " + PointMarkers.SQUARE;
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarkers.TRIANGLE;
            default -> Color.BLACK + " " +PointMarkers.CIRCLE;
        };
    }*/
}
