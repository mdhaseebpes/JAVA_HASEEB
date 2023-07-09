package ControlFlowStatements;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int reverse=0;
        int number1 = number;
        while(number>0){
            int lastDigit = number%10;
            reverse= lastDigit + reverse*10;
            number/=10;
        }
      if(number1==reverse){
          System.out.println("Palindrome");
          return  true;
      }
        System.out.println("Not Palindrome");
       return false;
    }

    public static void main(String[] args) {
    isPalindrome(1221);
        isPalindrome(11212);
        isPalindrome(707);

    }
}
