import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

public class myTwelfthApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path inputFilePath = null;

        // Prompt user for input file path until a valid file is provided
        while (true) {
            System.out.println("Please provide the path for the input text file:");
            String inputPath = scanner.nextLine();
            inputFilePath = Paths.get(inputPath);

            if (Files.exists(inputFilePath)) {
                break;
            } else {
                System.out.println("The file does not exist. Please provide a valid file path.");
            }
        }

        System.out.println("Please provide the path for the output file:");
        String outputPath = scanner.nextLine();
        Path outputFilePath = Paths.get(outputPath);

        try {
            // Read all content from the input file
            byte[] bytes = Files.readAllBytes(inputFilePath);
            String fileContent = new String(bytes, Charset.defaultCharset());

            // Count total number of words
            String[] words = fileContent.split("\\W+");
            int totalWordCount = words.length;
            System.out.println("Total number of words: " + totalWordCount);

            // Count occurrences of each word
            Map<String, Integer> wordCountMap = new HashMap<>();
            for (String word : words) {
                word = word.toLowerCase();
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }

            // Display word occurrences in the console
            System.out.println("Word occurrences:");
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Write the results to the output file
            List<String> outputLines = new ArrayList<>();
            outputLines.add("Input file: " + inputFilePath.toString());
            outputLines.add("Total number of words: " + totalWordCount);
            outputLines.add("Word occurrences:");
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                outputLines.add(entry.getKey() + ": " + entry.getValue());
            }
            Files.write(outputFilePath, outputLines, Charset.defaultCharset(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Results have been written to the output file: " + outputFilePath.toString());

        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing files: " + e.getMessage());
            e.printStackTrace();
        }
    }
}