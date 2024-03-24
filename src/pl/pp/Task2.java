import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");

            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice >= 1 && choice <= 5) {
                        break;
                    } else {
                        System.out.print("Please enter a number between 1 and 5: ");
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Please enter a number between 1 and 5: ");
                }
            }

            if (choice == 5) {
                System.out.println("bye!");
                break;
            }

            double num1, num2;
            System.out.print("Enter first number: ");
            while (true) {
                try {
                    num1 = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Please enter (valid input) a number: ");
                }
            }

            System.out.print("Enter second number: ");
            while (true) {
                try {
                    num2 = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Please enter (valid input) a number: ");
                }
            }

            double result = 0;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero!");
                        continue;
                    }
                    break;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}