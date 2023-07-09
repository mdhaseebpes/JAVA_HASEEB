package firststeps;

public class OperatorChallenge {

    public static void main(String[] args) {

        double myFirstDouble = 20.0d;
        double mySecondDouble =  80.0d;

        double myDoubleTotal = (myFirstDouble+mySecondDouble)*100;
        System.out.println("double total in Step 3  " + myDoubleTotal);

        myDoubleTotal%=40.0d;
        System.out.println("remainder operator in step 4 -- " + myDoubleTotal);

        boolean check  = (myDoubleTotal==0)? true :false;
        System.out.println("Value is 0 " + true);

        if(check==false){
            System.out.println("Got some remainder");
        }

        System.out.println("***********Precedence importance**********************");
        double myFirstDouble1 = 20.0d;
        double mySecondDouble1 =  80.0d;

        double myDoubleTotal1 = myFirstDouble1+ mySecondDouble1 *100;
        System.out.println("double total in Step 3  " + myDoubleTotal1);

        myDoubleTotal1%=40.0d;
        System.out.println("remainder operator in step 4 -- " + myDoubleTotal1);

        boolean check1  = (myDoubleTotal1==0)? true :false;
        System.out.println("Value is 0 " + true);

        if(check1==false){
            System.out.println("Got some remainder");
        }
    }
}
