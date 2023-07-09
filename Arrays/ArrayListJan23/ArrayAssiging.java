package Arrays.ArrayListJan23;

import java.util.Scanner;

public class ArrayAssiging {

    private static Scanner scan = new Scanner(System.in);

    public static int[] myIntArray(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] myIntArray = new int[number];

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = scan.nextInt();
        }
        return myIntArray;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    public static void main(String[] args) {

        //ways of initialisation
        int[] myIntArray = new int[10];
        myIntArray[0] = 0;
        myIntArray[9] = 100;

        int[] myIntArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] numbers = myIntArray(5);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + ", typed value is " + numbers[i]);
        }

        System.out.println("Average value is  " + getAverage(numbers));
    }
}
