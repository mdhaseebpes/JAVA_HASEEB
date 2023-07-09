package expressionStatementMethods;

public class StashMergeConflictGit {
    public static void main(String[] args) {
        //   master d1 

        double d= 234.12413;
        String text = Double.toString(Math.abs(d));
        int integerPlaces = text.indexOf('.');
        int decimalPlaces = text.length() - integerPlaces - 1;
        System.out.println(decimalPlaces);
        System.out.println("local d2 branch  changes");
        System.out.println("local d2 branch  commit for cherry pick");

    }

}
