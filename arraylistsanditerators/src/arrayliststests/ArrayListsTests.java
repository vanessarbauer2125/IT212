package arrayliststests;

import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import arraylists.*;

class ArrayListsTest {

    @Test
    void generateList_returnsCorrectSizeAndRange() {
        List<Integer> list = ArrayLists.generateList(10);

        assertEquals(10, list.size(), "List should have 10 elements");

        // Check that all values are between 0 and 99
        for (Integer val : list) {
            assertTrue(val >= 0 && val <= 99, "Value should be in range 0–99");
        }
    }

    @Test
    void generateList_returnsEmptyListWhenSizeIsZero() {
        List<Integer> list = ArrayLists.generateList(0);

        assertEquals(0, list.size(), "List should have 0 elements");
    }

    @Test
    void removeIntFromListIterator_removesFirstElement() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));
        int removed = ArrayLists.removeIntFromListIterator(list);

        assertEquals(10, removed, "Should remove the first element");
        assertEquals(Arrays.asList(20, 30), list, "List should have remaining elements");
    }

    @Test
    void removeIntFromListIterator_returnsMinusOneForEmptyList() {
        List<Integer> emptyList = new ArrayList<>();
        int removed = ArrayLists.removeIntFromListIterator(emptyList);

        assertEquals(-1, removed, "Should return -1 for empty list");
        assertTrue(emptyList.isEmpty(), "List should remain empty");
    }

    @Test
    void addIntToList_doublesListSize() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        int originalSize = list.size();

        ArrayLists.addIntToList(list);

        assertEquals(originalSize * 2, list.size(), "List size should double after adding");
    }

    @Test
    void removeIntFromList_removesAllElements() {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 15, 20));
        ArrayLists.removeIntFromList(list);

        assertTrue(list.isEmpty(), "List should be empty after removing all elements");
    }

    @Test
    void printIntList_printsWithoutThrowingException() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

        assertDoesNotThrow(() -> ArrayLists.printIntList(list),
                "Printing list should not throw any exceptions");
    }
}
