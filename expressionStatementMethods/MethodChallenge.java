package expressionStatementMethods;

public class MethodChallenge {

    public static void displayHighScorePosition(String name, int position){

        System.out.println( name + " managed to get into position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition(int score){
     /*   if(score >=1000){
            return 1;
        }else if(score >=500){
            return 2;
        }else if(score>=100){
            return 3;
        }
         return 4;*/

        int position =4;
        if(score>=1000){
            position =1;
        }else if(score >= 500){
            position =2;
        }else if(score >=100);{
            position=3;
        }
           return position;
    }
    public static void main(String[] args) {
        System.out.println("** Different ways of coding *****");
        int score = calculateHighScorePosition(1500);
        displayHighScorePosition("ABC" ,score);
         score =   calculateHighScorePosition(900);
        displayHighScorePosition("CDA" ,score);
        score =   calculateHighScorePosition(400);
        displayHighScorePosition("XYZ" ,score);
        score =   calculateHighScorePosition(50);
        displayHighScorePosition("BOB" ,score);
        score =   calculateHighScorePosition(1000);
        displayHighScorePosition("ALI" ,score);

    }
}
