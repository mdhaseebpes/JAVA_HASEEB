package ControlFlowStatements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = 0;
        int min = 0;
        boolean first = true;

       int min1 = Integer.MAX_VALUE;  // 2147483647
       int max1 = Integer.MIN_VALUE;  //-2147483647

        while (true) {
            System.out.println("Enter the number : ");
            boolean check = scan.hasNextInt();
            if (check) {
                int number = scan.nextInt();
              if(number > max ){
                  max = number;
              }
              // if block can be added or removed depending on above selection
              if(first){
                  first =false;
                  max = number;
                  min = number;
              }
              if(number < min){
                  min = number;
              }
            } else {
                System.out.println(" Invalid number");
                break;
            }
            scan.nextLine();
        }
        System.out.println("Minimum number is " + min);
        System.out.println("Maximum number is " + max);
        scan.close();

    }
}
