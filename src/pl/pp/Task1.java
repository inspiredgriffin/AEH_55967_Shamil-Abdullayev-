import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            int lower = scanner.nextInt();
            int upper = scanner.nextInt();

            if (upper <= lower) {
                System.out.println("Done");
                break;
            }

            int sum = 0;
//            for (int i = lower; i <= upper; i++) {
//                sum += i * i;
//            }

            System.out.println("The sums of the squares from " + (lower * lower) + " to " + (upper * upper) + " is " + sum);
            System.out.print("Enter next set of limits (or enter lower limit <= upper limit to quit): ");
        }

        scanner.close();
    }
}