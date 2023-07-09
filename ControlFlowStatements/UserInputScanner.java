package ControlFlowStatements;

import javafx.scene.control.DatePicker;

import java.util.Scanner;

public class UserInputScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Date of Birth");

        boolean checkInt = scan.hasNext();
        if (checkInt) {
            int yearOfBirth = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter your name : ");
            String name = scan.next();
            scan.nextLine();

            int currentAge = 2021 - yearOfBirth;
            if((currentAge<=0) || currentAge>100){
                System.out.println("Invalid date of birth ");
            }else {
                System.out.println(name + " Your age is " + currentAge);
            }

        } else {
            System.out.println("Unable to parse year of birth");
        }
        scan.close();
    }
}
