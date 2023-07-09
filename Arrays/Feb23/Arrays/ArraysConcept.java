package Arrays.Feb23.Arrays;

import java.lang.ref.SoftReference;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class ArraysConcept {

    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] arr = new int[len];
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<len;i++){
            arr[i] = random.nextInt(100);
        }

         return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,7,9,7,3,12};
        System.out.println(Arrays.toString(arr));

        getRandomArray(6);

        int[] secondArray = new int[8];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,6);
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(secondArray));
        Arrays.sort(secondArray);
        System.out.println(Arrays.toString(secondArray));

        System.out.println();
        int[] thirdArray =  getRandomArray(7);
        int[] fourthArray = Arrays.copyOf(thirdArray,thirdArray.length);

        System.out.println(Arrays.toString(fourthArray));
         Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));
        System.out.println(Arrays.toString(thirdArray));

       int[] smallerArray =  Arrays.copyOf(thirdArray,4);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray,15);
        System.out.println(Arrays.toString(largerArray));

    }
}
