

public class task2 {
    public static void main(String[] args) {
        // Demo code commented out

        // Test calculating factorial iteratively
        int number = 10; // Change the number as needed
        long startTime = System.nanoTime();
        long factorialIterativeResult = factorialIterative(number);
        long endTime = System.nanoTime();
        long elapsedTimeIterative = endTime - startTime;
        System.out.println("Factorial of " + number + " (calculated iteratively): " + factorialIterativeResult);
        System.out.println("Time taken for iterative calculation: " + elapsedTimeIterative + " nanoseconds");

        // Test calculating factorial recursively
        startTime = System.nanoTime();
        long factorialRecursiveResult = factorialRecursive(number);
        endTime = System.nanoTime();
        long elapsedTimeRecursive = endTime - startTime;
        System.out.println("Factorial of " + number + " (calculated recursively): " + factorialRecursiveResult);
        System.out.println("Time taken for recursive calculation: " + elapsedTimeRecursive + " nanoseconds");
    }

    // Method to calculate factorial iteratively
    private static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate factorial recursively
    private static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }
}
