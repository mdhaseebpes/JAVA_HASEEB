package expressionStatementMethods;

public class MethodsJava {

    public static  int calculateScore(boolean gameOver, int score,int levelCompleted,int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("Final Score is  " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

      int finalScore =  calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println(finalScore);

        score = 20000;
        levelCompleted = 5;
        bonus = 30;
        finalScore =calculateScore(false,score,levelCompleted,bonus);
        System.out.println(finalScore);


    }
}
