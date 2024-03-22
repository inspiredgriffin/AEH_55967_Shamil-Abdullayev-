import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Calculate the temperature in Fahrenheit and Kelvin
        double fahrenheit = 1.8 * celsius + 32.0;
        double kelvin = celsius + 273.16;

        // Display the results with two decimal places
        System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);
        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Temperature in Kelvin: %.2fK%n", kelvin);

        scanner.close();
    }
}