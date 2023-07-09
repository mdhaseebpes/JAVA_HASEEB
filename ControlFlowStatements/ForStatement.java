package ControlFlowStatements;

public class ForStatement {
    public static void calculateInterest(){
       for(double i=2.0 ; i<=10.0 ;i++){
         String interestAmount =  String.format("%.2f",(10000 * (i/100)));
           System.out.println("10,000 at "+i+" interest = " + interestAmount );
       }
    }

    public static void calculateInterestReverse(){
        for(double i=10.0;i >=2.0;i--){
            String interestAmount = String.format("%.2f",(10000.0 * (i/100)));
            System.out.println("10,000 at "+i+" interest = " + interestAmount );
        }
    }
    public static void main(String[] args) {

        calculateInterest();
        System.out.println("************************");
        calculateInterestReverse();
    }
}
