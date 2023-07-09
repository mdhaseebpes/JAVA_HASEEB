package Arrays.Feb23.Arrays;

import java.util.Arrays;
import java.util.Random;

public class ChallengeArray01 {

    public static int[] getRandomIntegers(int len){
        Random random = new Random();
        int[] firstArray = new int[len];
        for(int i=0;i<firstArray.length;i++){
           firstArray[i]= random.nextInt(100);
        }
        return firstArray;
    }

    public static void descOrderArrays(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        boolean flag = true;
        while(flag){
            flag=false;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]<arr[i+1]){
                    int temp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1] = temp;
                    flag= true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

     public static void bubbleSort(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }

         System.out.println(Arrays.toString(arr));

    }

    //{13,46,24,52,20,9};
   static int select(int arr[] , int n){

        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min= j;
                }
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i]= temp;
            }
        }
        System.out.println("----------------");
        System.out.println(Arrays.toString(arr));
        return 0;
    }

    public static void main(String[] args) {

      int[] secondArray=  getRandomIntegers(5);

        System.out.println(Arrays.toString(secondArray));

          System.out.println();
          int[] thirdArray = Arrays.copyOf(secondArray,secondArray.length);
          Arrays.sort(thirdArray);
         System.out.println(Arrays.toString(thirdArray));
         for(int i=thirdArray.length-1;i>=0;i--){
             System.out.print(thirdArray[i]+ " ");
         }

         int[] fourthArray = getRandomIntegers(5);
         System.out.println(Arrays.toString(fourthArray));

         System.out.println("---------------");
         descOrderArrays(fourthArray);

        System.out.println("---------------");
        int[] arr4 = new int[]{13,46,24,52,20,9};
         bubbleSort(arr4);

        System.out.println("----------");
        int[] arr5 = new int[]{13,46,24,52,20,9};
        select(arr5,6);
    }
}
