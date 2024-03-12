package pl.pp;

public class task2 {
    public static void main(String[] args) {
        // Commented out previous demonstration code
        /*
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

        System.out.println("Calculations using the method calculateScore_noArguments(), but still for values assigned in the method code");
        calculateScore_noArguments();

        System.out.println("Calculations using the method calculateScore(), but this time for values entered into the method call argument");
        calculateScore_arguments(true, 2500, 9, 250);

        calculateScore_arguments(gameOver, score, levelCompleted, bonus);

        System.out.println("Calculations and display can be made independent from each other by adding a parameter that this method will return using return");
        finalScore = calculateScore_argumentsReturn(gameOver, score, levelCompleted, bonus);
        System.out.println("Your score #5 is " + finalScore);
        */

        // Example usage of the new method
        System.out.println("Printing patterns using the printCharacter method:");

        // Print '*' pattern
        printCharacter('*', 5, 3);

        // Print '-' pattern
        printCharacter('-', 10, 2);
    }

    public static void printCharacter(char character, int timesInRow, int numLines) {
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < timesInRow; j++) {
                System.out.print(character);
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

    // Commented out previous method definitions
    /*
    private static void calculateScore_noArguments() {
        // Method body
    }

    private static void calculateScore_arguments(boolean gameOver, int score, int levelCompleted, int bonus) {
        // Method body
    }

    private static int calculateScore_argumentsReturn(boolean gameOver, int score, int levelCompleted, int bonus) {
        // Method body
    }
    */
}
