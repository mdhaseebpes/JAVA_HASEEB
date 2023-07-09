package expressionStatementMethods;

public class KeyWordsExpression {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if(gameOver){
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final score was  " + finalScore);
        }
        if((score==10000) && (levelCompleted==8) && (bonus==200)){
            System.out.println("score set to  10000");
            System.out.println("levelCompleted to  8");
            System.out.println("bonus to 20");
        }


    }
}
