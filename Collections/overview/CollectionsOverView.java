package Collections.overview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsOverView {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();

        String[] names = {"Aliza", "Waiz" ,"Ziad","Zaina"};
        list.addAll(Arrays.asList(names));

        list.add("Hafsa");
        list.addAll(Arrays.asList("Heba","Hamiz","xx"));

        System.out.println(list);
        System.out.println("Hafsa is in list " + list.contains("Hafsa"));

        list.removeIf(s->s.charAt(0)=='x');
        System.out.println(list);
        System.out.println("x is in list " + list.contains("x"));

    }
}
