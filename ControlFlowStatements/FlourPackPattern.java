package ControlFlowStatements;

public class FlourPackPattern {

    public static boolean canPack(int bigCount,int smallCount ,int goal){
        int actualBigCount = bigCount*5;

        if((actualBigCount+smallCount)<goal){
            return false;
        }
        if((actualBigCount+smallCount)>=goal) {
            return true;
        }return true;
    }

    public static void main(String[] args) {

        System.out.println(canPack(1,1,7));
    }
}
