package Arrays.Feb23.ArrayList;

import java.util.*;

public class MoreLists {

    public static void main(String[] args) {

        String[] list  = {"apple" , "milk","meat"};

        ArrayList<String> grocery = new ArrayList<>(Arrays.asList(list));
        grocery.add("curd");
        System.out.println(grocery);

        ArrayList<String>  nextList = new ArrayList<>(Arrays.asList("pickles" ,"cheese"));
        System.out.println(nextList);

        grocery.addAll(nextList);
        System.out.println(grocery);
        System.out.println(nextList);
        grocery.add("meat");
        System.out.println(grocery);
        grocery.removeAll(Collections.singletonList("meat"));
        System.out.println(grocery);

        grocery.retainAll(Arrays.asList("apple","milk","pickles"));
        System.out.println(grocery);
        grocery.addAll(Arrays.asList("curd","eggs","banana", "yogurt"));
        System.out.println(grocery);

        //sort and reverse
        System.out.println("---------------");
        grocery.sort(Comparator.naturalOrder());
        System.out.println(grocery);

        System.out.println("-----------");
        grocery.sort(Comparator.reverseOrder());
        System.out.println(grocery);

         Object[] ar = grocery.toArray();
        System.out.println("Arrays -----");
        System.out.println(Arrays.toString(ar));


    }
}
