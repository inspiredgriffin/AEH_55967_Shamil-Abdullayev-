import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.Scanner;

public class LineCounterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the path to the input text file:");
        String inputFilePath = scanner.nextLine();
        Path inputPath = Paths.get(inputFilePath);

        // Checking if the file exists; if not, prompt until a valid file is provided
        while (!Files.exists(inputPath)) {
            System.out.println("The file does not exist. Please enter a valid file path:");
            inputFilePath = scanner.nextLine();
            inputPath = Paths.get(inputFilePath);
        }

        System.out.println("Please enter the path to the output text file:");
        String outputFilePath = scanner.nextLine();
        Path outputPath = Paths.get(outputFilePath);

        try {
            // Reading the input file and counting lines
            long lineCount = Files.lines(inputPath).count();
            System.out.println("Number of lines in the file: " + lineCount);

            // Writing the output file with the file name and line count
            String outputContent = "File: " + inputFilePath + "\nNumber of Lines: " + lineCount;
            Files.write(outputPath, outputContent.getBytes(Charset.defaultCharset()));
            System.out.println("Output has been written to " + outputFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred during file processing: " + e.getMessage());
        }
    }
}