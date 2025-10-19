package wordfrequencycountertests;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import wordfrequencycounter.*;

class WordFrequencyCounterTests {

    @Test
    void testExtractWords_removesPunctuationAndLowercases() {
        List<String> input = Arrays.asList(
                "Hello, World!",
                "HELLO again..."
        );

        List<String> expected = Arrays.asList("hello", "world", "hello", "again");

        List<String> result = WordFrequencyCounter.extractWords(input);

        assertEquals(expected, result);
    }

    @Test
    void testCountWordFrequencies_correctlyCounts() {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 3);
        expected.put("banana", 2);
        expected.put("orange", 1);

        Map<String, Integer> result = WordFrequencyCounter.countWordFrequencies(words);

        assertEquals(expected, result);
    }

    @Test
    void testSortByWord_sortsAlphabetically() {
        Map<String, Integer> unsorted = new HashMap<>();
        unsorted.put("banana", 2);
        unsorted.put("apple", 3);
        unsorted.put("orange", 1);

        Map<String, Integer> sorted = WordFrequencyCounter.sortByWord(unsorted);

        List<String> sortedKeys = new ArrayList<>(sorted.keySet());

        assertEquals(Arrays.asList("apple", "banana", "orange"), sortedKeys);
    }

    @Test
    void testExtractWords_emptyLines() {
        List<String> input = Arrays.asList("", "   ", "\n");

        List<String> result = WordFrequencyCounter.extractWords(input);

        assertTrue(result.isEmpty());
    }

    @Test
    void testCountWordFrequencies_emptyList() {
        Map<String, Integer> result = WordFrequencyCounter.countWordFrequencies(Collections.emptyList());

        assertTrue(result.isEmpty());
    }
}
