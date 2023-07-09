package ControlFlowStatements;

public class WhileLoop {

    public static boolean isEvenNumber(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void evenRange(int start, int end) {
        int count = 0;
        int sum = 0;
        while (start <= end) {
            start++;
            if (!isEvenNumber(start)) {
                continue;
            } else {
                System.out.println(start);
                sum += start;
                count++;
                System.out.println("Sum =" + sum);
                if (count == 5) {
                    break;
                }
            }

        }

    }

    public static void main(String[] args) {
        evenRange(4, 20);

    }
}
