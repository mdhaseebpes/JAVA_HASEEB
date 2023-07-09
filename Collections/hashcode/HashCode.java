package Collections.hashcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashCode {

    public static void main(String[] args) {

        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l","He","lo");
        String dText = "He".concat("llo");
        String eText = "hello";


        List<String> hellos = Arrays.asList(aText,bText,cText,dText,eText);

        hellos.forEach(s-> System.out.println(s + ":" + s.hashCode()));

        Set<String> setList = new HashSet<>(hellos);

        System.out.println("set = " + setList + "\n" + "# of elements =" +setList.size());
        setList.forEach(s-> System.out.println( s + ": " + s.hashCode()));

    }
}
