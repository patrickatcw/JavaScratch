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

        /*Challenge
        - print out a second score on the screen with the following
        - score set to 1000
        - levelCompleted set to 0
        - bonus set to 200
        but make sure the first print out still displays as well
        */

        score = 10000;   //same variable names but changed values, redefined
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            //int finalScore is 11600, boolean confirmed

        }




    }
}

