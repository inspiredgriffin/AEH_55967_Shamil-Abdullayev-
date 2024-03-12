package pl.pp;

public class myfifthapp {
    public static void main(String[] args) {

        // Calculations and display of the result for values assigned in the application code
        System.out.println("Calculations and display of the result for values assigned in the application code");
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your score #1 is " + finalScore);
        }

        // Calculations and display of the result for values assigned in the application code (different than before)
        System.out.println("Calculations and display of the result for values assigned in the application code (different than before)");
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your score #2 is " + finalScore);
        }

        // Calculations using the method calculateScore_noArguments(), but still for values assigned in the method code
        System.out.println("Calculations using the method calculateScore_noArguments(), but still for values assigned in the method code");
        calculateScore_noArguments();

        // Calculations using the method calculateScore(), but this time for values entered into the method call argument
        System.out.println("Calculations using the method calculateScore(), but this time for values entered into the method call argument");
        calculateScore_arguments(true, 2500, 9, 250);
        // it can be called using previously declared variables
        calculateScore_arguments(gameOver, score, levelCompleted, bonus);
        // but as you see, the display function is also with number #4 (because such display is recorded
        // in the method. What to do to avoid this? Below:

        // Calculations and display can be made independent from each other by adding a parameter that this method will return using return
        System.out.println("Calculations and display can be made independent from each other by adding a parameter that this method will return using return");
        finalScore = calculateScore_argumentsReturn(gameOver, score, levelCompleted, bonus);
        System.out.println("Your score #5 is " + finalScore);
    }

    private static void calculateScore_noArguments() {
        boolean gameOver = true;
        int score = 150;
        int levelCompleted = 2;
        int bonus = 1000;

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your score #3 is " + finalScore);
        }
    }
    private static void calculateScore_arguments(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your score #4 is " + finalScore);
        }
    }
    private static int calculateScore_argumentsReturn(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
