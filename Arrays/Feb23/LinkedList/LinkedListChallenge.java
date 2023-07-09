package Arrays.Feb23.LinkedList;


import java.util.LinkedList;


public class LinkedListChallenge {

  static class Place{
      String name;
      int distance;

      public Place(String name , int distance) {
          this.name=name;
          this.distance=distance;
      }

      @Override
      public String toString(){
          return String.format("%s (%d)" ,name ,distance);
      }
  }


    public static void main(String[] args) {

          LinkedList<Place> placesToVisit = new LinkedList<>();
        addPlace(placesToVisit,new Place("Adelaide", 1374));
          addPlace(placesToVisit,new Place("adelaide", 1374));
        addPlace(placesToVisit,new Place("Brisbane", 917));
        addPlace(placesToVisit,new Place("Perth", 3923));
        addPlace(placesToVisit,new Place("Darwin", 3972));
        addPlace(placesToVisit,new Place("Alice Springs", 2771));
        addPlace(placesToVisit,new Place("Melbourne", 877));
        placesToVisit.addFirst(new Place("Sydney",0));

        for(Place p : placesToVisit){
            System.out.println(p);
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place){
      if(list.contains(place)){
          System.out.println("Found duplicate  : " + place);
          return;
      }
      for(Place p: list){
          if(p.name.equalsIgnoreCase(place.name)){
              System.out.println("Found duplicate : " + place);
              return;
          }
      }
      int matchedIndex =0;
      for(Place p : list){
          if(place.distance < p.distance){
              list.add(matchedIndex,place);
              return;
          }
          matchedIndex++;
      }
      list.add(place);

    }
}
