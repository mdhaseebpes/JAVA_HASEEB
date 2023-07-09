package firststeps;

public class IfThen {

    public static void main(String[] args) {

        int topScore  = 100;
        int secondScore = 80;
        boolean score = true;
        if(score ==false)
        {
            System.out.println("There is a score " + score);
        }
        if(topScore==100)
        {
            System.out.println("Using == operator" + topScore);
        }
        if(topScore>=100){
            System.out.println("Using >= operator " + topScore);
        }
        if(topScore<= 100)
        {
            System.out.println("Using <= operator " + topScore);
        }
        if(topScore != 100){
            System.out.println("Using != operator " + topScore);
        }
        if((topScore>=100) && (secondScore < 100))
        {
            System.out.println("Using >= && < operator " + topScore + secondScore);
        }
        if((topScore<=100) && (secondScore >100)){
            System.out.println("Using <= && > operator " + topScore +secondScore);
        }
        if((topScore<=100) || (secondScore >100)){
            System.out.println("Using <= || > operator " + topScore +secondScore);
        }
    }
}
