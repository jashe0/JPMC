public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("The high score is "+highScore);

        System.out.println("The next high score is "+calculateScore(true,10000,8,200));

        int firstPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("John",firstPosition);
        displayHighScorePosition("Tim",calculateHighScorePosition(1000));
        displayHighScorePosition("Derek",calculateHighScorePosition(500));
        displayHighScorePosition("Peter",calculateHighScorePosition(100));
        displayHighScorePosition("Margot",calculateHighScorePosition(25));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name+" managed to get into position "+position+" on the high score list");
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000) {
            return 1;
        } else if (score >= 500) {
           return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }
}
