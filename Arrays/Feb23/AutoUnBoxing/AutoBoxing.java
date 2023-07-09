package Arrays.Feb23.AutoUnBoxing;

import java.util.ArrayList;

public class AutoBoxing {

    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15); //Preferred but unnecessary
        Integer deprecated  = new Integer(15); //since JDK 9
        int unBox = boxedInt.intValue();

        //Automatic
        Integer autoBoxed = 15;
        int autoUnBoxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
       // System.out.println(autoUnBoxed.getClass().getSimpleName());

       ArrayList<Integer> ourList = getList(2,4,7,32);
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList(Integer... varargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i: varargs){
            aList.add(i);
        }

        return aList;
    }

    private static int returnAnInt(Integer i){
        return i;
    }

    private static Integer returnAnInteger(int i){
        return i;
    }
}
