package ControlFlowStatements;

public class SharedDigit {

    public static boolean hasSharedDigit(int a,int b) {

        if((a<10)||(a>99)||(b<10)||(b>99)){
            return false;
        }
        int l = a % 10;
        int j = b % 10;
        int f = a / 10;
        int d = b /10;


        if (l == j) {
            return true;
        } else if (f == d) {
            return true;

        } else if (l == d) {
            return true;
        } else if (f == j) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,43));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }
}
