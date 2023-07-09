package Arrays.ArrayListJan23;

import java.util.Arrays;

public class ReverseArray {

    //solution --01
    public static void reverse(int[] array){
        int temp = 0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                 if(array[i]>array[j]){
                     temp = array[i];
                     array[i] = array[j];
                     array[j] = temp;
                 }
            }
        }
        System.out.println("reverse array");
        for(int c:array){
            System.out.print(c + " ");
        }
    }

    //solution 2
    public static void reverse1(int[] arr){
        int maxIndex = arr.length-1;
        int halfLength = arr.length/2;
        for(int i=0;i<halfLength;i++){
            int temp = arr[i];
            arr[i]= arr[maxIndex-i];
            arr[maxIndex-i] = temp;
        }

    }

    public static void main(String[] args) {
       //solution 1
        int[] arr = {1,6,8,4,5};
        reverse(arr);
        System.out.println();
        //solution2
        int[] arr1 = {1,5,3,7,11,9,15};
        System.out.println("Array = " + Arrays.toString(arr1));
        reverse1(arr1);
        System.out.println("Reversed = " + Arrays.toString(arr1));

    }
}
