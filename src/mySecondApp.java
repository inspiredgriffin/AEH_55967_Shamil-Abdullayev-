package pl.pp;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Create an integer variable x and assign the value of 10 to it
        int x = 10;

        // Calculate the double of x and the value of x squared
        int doubleOfX = x * 2;
        int xSquared = x * x;

        // Display all three values on the console with descriptions
        System.out.println("x = " + x);
        System.out.println("Double of x = " + doubleOfX);
        System.out.println("x squared = " + xSquared);

        // Ask for user's age in years
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age in years:");
        int ageInYears = scanner.nextInt();
        scanner.close();

        // Convert the age to seconds
        long ageInSeconds = ageInYears * 365 * 24 * 60 * 60;

        // Display the age in seconds with proper description
        System.out.println("My age in seconds: " + ageInSeconds);
    }
}
