package Arrays.Feb23.Arrays;

import java.util.Arrays;
import java.util.Random;

public class ReverseArray {

    public static void reverse(int[] arr){
        System.out.println("Before array is reverse " + Arrays.toString(arr));
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int maxIndex = arr.length-1;
        int halfLength = arr.length/2;
        int i=0;
         while(i<halfLength){
             int temp = arr[i];
             arr[i] = arr[maxIndex-i];
             arr[maxIndex-i] = temp;
             System.out.println(Arrays.toString(arr));
             i++;
         }

        System.out.println("After array is reverse " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        reverse(arr);

        Random random = new Random();
        int[] arr1  = new int[5];
        for(int i=0;i<arr1.length-1;i++){
            arr1[i] = random.nextInt(100);
        }

        System.out.println("Before");
        System.out.println(Arrays.toString(arr1));

        int i=0;
        int max = arr1.length-1;
        int half = arr1.length/2;

        while(i<half){
            int temp = arr1[i];
            arr1[i] = arr1[max-i];
            arr1[max-i] = temp;
            i++;
        }
        System.out.println("After");
        System.out.println(Arrays.toString(arr1));
    }
}
