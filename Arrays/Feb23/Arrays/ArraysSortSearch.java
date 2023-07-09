package Arrays.Feb23.Arrays;

import java.util.Arrays;

public class ArraysSortSearch {

    public static void main(String[] args) {
        String[] sArray = {"Apple" , "Mark" ,"Object", "Java",""};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray,"Object")>=0){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }

        int[] s1 = {4,5,6,7,8};
        int[] s2 = {4,5,6,7,8,0};

        if(Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }

    }
}
