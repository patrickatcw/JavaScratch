public class Practice {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            //created a variable finalScore in code block and able to access variables
            //outside of codeblack
            //int finalScore is 1300, boolean confirmed

        }

        //int savedFinalScore = finalscore;
        //would result in error b/c outside of codeblock and finalScore already
        //used in execution

    }
}

