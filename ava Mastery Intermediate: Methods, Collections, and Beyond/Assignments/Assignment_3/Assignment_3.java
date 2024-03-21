import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment_3{

    public static void main(String[] args) {
        String fileName = "/Users/salonisharma/Documents/myproject/src/input.txt";

        try {
            Map<String, Integer> word_frequency = countWordFrequency(fileName);
            displayWordFrequency(word_frequency);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: ");
        }
    }

    public static Map<String, Integer> countWordFrequency(String fileName) throws FileNotFoundException {
        Map<String, Integer> wordFrequencyMap = new HashMap<String,Integer>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (!word.isEmpty()) {
                    wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                }
            }
        }
        return wordFrequencyMap;
    }

    public static void displayWordFrequency(Map<String, Integer> wordFrequencyMap) {
        System.out.println("Freequency of Each Word is :");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
