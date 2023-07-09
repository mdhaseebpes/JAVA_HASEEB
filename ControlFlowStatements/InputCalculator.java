package ControlFlowStatements;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        double number = 0;
        double sum = 0;
        double count = 0;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number : ");
            boolean check = input.hasNextDouble();
            if (check) {
                number = input.nextDouble();
                sum += number;
                count++;
            } else {
                double average = sum / count;
                System.out.println("SUM = " + sum + " AVG = " + average + "");
                break;
            }
        }
    }
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
