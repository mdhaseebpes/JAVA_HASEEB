package Abstraction.Abstract.Challenge02;

public interface Mappable {

   /*  String JSON_PROPERTY= """
             "properties" : {%s} """;*/

   String getLabel();

   Geometry getMarker();

   Geometry getShape();

/*   default String toJSON(){
       return """
               "type" : "%s", "label" : "%s","marker" : "%s" """
               .concat(getShape(),getLabel(),getMarker());

   }

   static  void mapIt(Mappable mappable){
       System.out.println(String.format(JSON_PROPERTY, mappable.toJSON()));
   }*/

}
