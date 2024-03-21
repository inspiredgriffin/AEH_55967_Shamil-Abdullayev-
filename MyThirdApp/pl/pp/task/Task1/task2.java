package pl.pp.task.Task1;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.print("Enter the number of days (Enter a non-positive value to exit): ");
                int days = scanner.nextInt();

                if (days <= 0) {
                    System.out.println("Exiting the program...");
                    break;
                }

                int weeks = days / 7;
                int remainingDays = days % 7;

                System.out.println(days + " days is " + weeks + " weeks and " + remainingDays + " days.");
            }

            scanner.close();
        }
    }
}
