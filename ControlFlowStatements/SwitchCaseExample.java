package ControlFlowStatements;

public class SwitchCaseExample {

    private static void printDayOfTheWeek(int day){
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }

    public static void main(String[] args) {

        printDayOfTheWeek(6);

        char switchValue = 'D';
        switch (switchValue){
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println( switchValue + " was Value");
                break;
            default:
                System.out.println("Was not A ,B ,C,D OR E");
                break;
        }

    }
}
