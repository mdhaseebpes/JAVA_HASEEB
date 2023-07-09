package ControlFlowStatements;

import java.util.Scanner;

public class UserInputChallenge {

    public static boolean user() {
        int count =0;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter the number " + i + " : ");
            boolean check = scan.hasNextInt();
            if (check) {
                int number = scan.nextInt();
                count++;
                sum+=number;
            } else {
                System.out.println("Invalid Number ");

            }
            scan.nextLine();
        }
        scan.close();
        System.out.println("Sum of numbers " + sum);
        return  true;

    }

    public static void main(String[] args) {
        user();

    }

}

