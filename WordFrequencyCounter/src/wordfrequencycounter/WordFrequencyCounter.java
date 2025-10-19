package wordfrequencycounter;

import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text (type 'exit' to finish):");
        List<String> inputLines = readInput(scanner);
        scanner.close();

        List<String> words = extractWords(inputLines);
        Map<String, Integer> frequencyMap = countWordFrequencies(words);
        Map<String, Integer> sortedMap = sortByWord(frequencyMap);

        printWordFrequencies(sortedMap);
    }

    // Reads multiple lines of input until "exit" is entered
    public static List<String> readInput(Scanner scanner) {
        List<String> lines = new ArrayList<>();
        while (true) {
            String line = scanner.nextLine().trim();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }
            lines.add(line);
        }
        return lines;
    }

    // Extracts and normalizes words from the input text
    public static List<String> extractWords(List<String> lines) {
        List<String> words = new ArrayList<>();
        for (String line : lines) {
            // Normalize: remove punctuation, convert to lowercase
            line = line.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
            String[] splitWords = line.split("\\s+");

            for (String word : splitWords) {
                if (!word.isEmpty()) {
                    words.add(word);
                }
            }
        }
        return words;
    }

    // Counts the frequency of each word
    public static Map<String, Integer> countWordFrequencies(List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    // Sorts the frequency map alphabetically by word
    public static Map<String, Integer> sortByWord(Map<String, Integer> wordCount) {
        return new TreeMap<>(wordCount);  // TreeMap auto-sorts keys (words)
    }

    // Prints the word frequencies
    public static void printWordFrequencies(Map<String, Integer> sortedMap) {
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
