package ControlFlowStatements;

public class ParsingString {

    public static void main(String[] args) {

        String numberAsString = "2021";

        int number = Integer.parseInt(numberAsString);

        number += 1;
        numberAsString += 1;
        System.out.println("numberAsString " + numberAsString);
        System.out.println("number " + number);

        System.out.println("**********Double************");

        String numberAsString1 = "2021.124";

        double number1 = Double.parseDouble(numberAsString);

        number1 += 1;
        numberAsString1 += 1;
        System.out.println("numberAsString1 " + numberAsString1);
        System.out.println("number1 " + number1);

    }
}
