package firststeps;

import java.util.Arrays;

public class CharClass {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar  = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        boolean myTrueBoolean  = true;
        boolean myFalseBoolean = false;

        System.out.println("*******************************");
        int[] a = {4,5,10,45,12};
        int diff = 0;
        for(int i=1; i<a.length;i++){
            if(a[i]-a[i-1]>diff)
            {
                diff= a[i]-a[i-1];
            }
        }
        System.out.println("Max difference " + diff);

        System.out.println("************Reverse***************");

        String s = "Queen";
        String t = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            t=t+s.charAt(i);
        }

        System.out.println("Reverse word " + t);

        if(t.equals(s))
        {
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("It is not Palindrome");
        }

        System.out.println("*******Anagram****");
        String a1 = "stops";
        String a2 = "stops";

        char[] a3 = a1.toLowerCase().toCharArray();
        char[] a4 = a2.toLowerCase().toCharArray();

        Arrays.sort(a3);
        Arrays.sort(a4);
        if(Arrays.equals(a3,a4))
        {
            System.out.println("Its Anagram");
        }else
        {
            System.out.println("Its not Anagram");
        }
    }
}
