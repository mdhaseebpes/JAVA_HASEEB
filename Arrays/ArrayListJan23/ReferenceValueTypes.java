package Arrays.ArrayListJan23;

import java.util.Arrays;

public class ReferenceValueTypes {

    public static void main(String[] args) {

        // Value types
        int myIntValue =10;
        int anotherIntValue = myIntValue;

        System.out.println("Before myIntValue " + myIntValue);
        System.out.println("Before anotherIntValue " + anotherIntValue);

        anotherIntValue++;

        System.out.println("After myIntValue " + myIntValue);
        System.out.println("After anotherIntValue " + anotherIntValue);

        //Reference types
        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        System.out.println("Before myIntArray " + Arrays.toString(myIntArray));
        System.out.println("Before anotherIntArray " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] =1;

        System.out.println("After myIntArray " + Arrays.toString(myIntArray));
        System.out.println("After anotherIntArray " + Arrays.toString(anotherIntArray));

        anotherIntArray = new int[] {1,2,3,4,5};
        modifyArray(myIntArray);
        System.out.println("Modify myIntArray " + Arrays.toString(myIntArray));
        System.out.println("Modify anotherIntArray " + Arrays.toString(anotherIntArray));
    }

    public static void modifyArray(int[] array){
        array[0] =2;
    }
}
