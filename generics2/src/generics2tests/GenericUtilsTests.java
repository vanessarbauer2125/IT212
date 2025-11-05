package generics2tests;

import generics2.GenericUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class GenericUtilsTests {

    @Test
    void sort_shouldSortIntegerList() {
        List<Integer> list = Arrays.asList(5, 2, 8);
        GenericUtils.sort(list);
        assertEquals(Arrays.asList(2, 5, 8), list);
    }

    @Test
    void sort_shouldSortStringsAlphabetically() {
        List<String> list = Arrays.asList("Banana", "Apple", "Cherry");
        GenericUtils.sort(list);
        assertEquals(Arrays.asList("Apple", "Banana", "Cherry"), list);
    }

    @Test
    void sumOfNumberList_shouldReturnCorrectSum() {
        List<Double> list = Arrays.asList(1.5, 2.5, 3.0);
        double result = GenericUtils.sumOfNumberList(list);
        assertEquals(7.0, result, 0.0001);
    }

    @Test
    void printCollection_shouldHandleEmptyCollection() {
        List<String> empty = new ArrayList<>();
        assertDoesNotThrow(() -> GenericUtils.printCollection(empty));
    }
}
