package firststeps;

public class OperandsOperator {

    public static void main(String[] args) {

        int result  = 1+ 2; //1+2 = 3
        System.out.println("Using + operator " + result);
        int previousResult = result -1 ; // 3-1
        System.out.println("Using - operator " + previousResult);
        System.out.println(result);
        result = result * 11 ; //3*11 = 33
        System.out.println("Using mutiply operator " + result);
        result  = result % 4; //33 % 4 =1
        System.out.println("Using remainder modulus operator " + result);
        result  = result /1 ; //1/1 = 1
        System.out.println("Using divide operator " + result);

        System.out.println("**************************");

        int result1 = 10;

        result1++; // 10+ 1 = 11;
        System.out.println("Using ++ operator " + result1);
        result1 +=2; // 11+2 = 13
        System.out.println("Using =+ operator " + result1);

        result1 /=3; //13/3 = 4;
        System.out.println("Using /= operator " + result1);

        result1 *=10; //4*10 = 40;
        System.out.println("Using *= operator " + result1);
        result1 -=2;  //40-2 = 38;
        System.out.println("Using =- operator " + result1);
        --result1; // 1-38 = 37;
        System.out.println("Using -- operator " + result1);

        ++result1; //1+37 = 38
        System.out.println("Using ++ operator " + result1);



    }
}
