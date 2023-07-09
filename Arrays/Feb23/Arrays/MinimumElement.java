package Arrays.Feb23.Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list  of integers ,separated by commas : ");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];
        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int ele : arr) {
            if (ele < min) {
                min = ele;
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] val = readIntegers();
        System.out.println(Arrays.toString(val));
        int minValue = findMin(val);
        System.out.println("min value is  " + minValue);
    }
}
