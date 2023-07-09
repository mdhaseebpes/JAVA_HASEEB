package Arrays.ArrayListJan23;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.

    private static Scanner scan = new Scanner(System.in);

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] intArray = new int[number];
        for(int i=0;i<intArray.length;i++){
            intArray[i]  = scan.nextInt();
        }
        return intArray;
    }

    public  static void printArray(int[] print){
        for(int i=0;i<print.length;i++){
            System.out.println("element " + i + ", typed value is " + print[i]);
        }
    }

    //different ways to sort array 01
    public static int[] sortInt(int[] array){
       /* int[] sortArray = new int[array.length];
        for(int i=0; i<array.length;i++){
            sortArray[i]=array[i];
        }*/
       int[] sortArray = Arrays.copyOf(array,array.length);
       boolean flag = true;
       int temp;
       while(flag) {
           flag =false;
           for (int i=0; i<sortArray.length-1;i++){
               if(sortArray[i]>sortArray[i+1]){
                   temp = sortArray[i];
                   sortArray[i] = sortArray[i+1];
                   sortArray[i+1] = temp;
                   flag = true;
               }
           }
       }
       return sortArray;
    }

    //different ways to sort array 02
    public static void sortIntegers(int[] print){
        int temp ;
        for(int i=0;i<print.length;i++){
            for(int j=0;j<print.length;j++) {
                if(print[i]>print[j]){
                    //swap
                    temp=print[i];
                    print[i]=print[j];
                    print[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array in descending");
        for(int c:print){
            System.out.println(c + " ");
        }
    }

    public static void main(String[] args) {
        int[] print =getIntegers(5);
        //sortIntegers(print);
        int[] sorted =sortInt(print);
        printArray(sorted);
    }
}
