package ControlFlowStatements;

public class IsPrime {

    public  static boolean prime(int n){
        if(n==1){
            return  false;
        }
        for(int i=2; i<n;i++){
            if(n%i==0){
                return  false;
            }
        }

        return  true;
    }

    public static void main(String[] args) {

        int count=0;
        for(int i=10;i<50;i++){
            if(prime(i)){
                count++;
                System.out.println("Number is " +i+ " is a prime number");
            }
        }


    }

}
