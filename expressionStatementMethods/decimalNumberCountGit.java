package expressionStatementMethods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class decimalNumberCountGit {

    public static void main(String[] args) {

        //   https://stackoverflow.com/questions/6264576/number-of-decimal-digits-in-a-double
        //info
        double d = 234.12413;
        String text = Double.toString(Math.abs(d));
        int integerPlaces = text.indexOf('.');
        int decimalPlaces = text.length() - integerPlaces - 1;
        System.out.println(decimalPlaces);
        System.out.println("feature changes");
        System.out.println("first commit for cherry pick");
        System.out.println("second commit for cherry pick");


//https://www.javacodeexamples.com/java-regex-extract-numbers-from-string/3512
            /*    - - Minus sign
                ? - zero or one time
                \\d - any digit from 0 to 9
                + - One or more times
                ()? - Whole group zero or 1 time
                 \\.\\d+ A dot followed by any digit 1 or more times*/

        String strContent = "NT$335.43";
        String strPattern = "\\d+(\\.\\d+)";

        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(strContent);
        System.out.println(matcher);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
