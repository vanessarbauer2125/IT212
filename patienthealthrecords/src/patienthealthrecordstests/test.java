package patienthealthrecordstests;

import org.junit.jupiter.api.Test;
import patienthealthrecords.PatientListMerger;
import patienthealthrecords.PatientNode;

import static org.junit.jupiter.api.Assertions.*;

class PatientListMergerTest {

    // Utility to build lists quickly
    private PatientNode buildList(int[][] data) {
        // data[i] = {ssn, age}
        PatientNode dummy = new PatientNode(0, 0, "");
        PatientNode current = dummy;

        for (int[] record : data) {
            current.next = new PatientNode(record[0], record[1], "Test");
            current = current.next;
        }

        return dummy.next;
    }

    // Utility to extract SSNs from merged list
    private int[] listToSsnArray(PatientNode head) {
        return java.util.stream.Stream
                .iterate(head, n -> n != null, n -> n.next)
                .mapToInt(n -> n.ssn)
                .toArray();
    }

    // ------------------------------------------------------------
    // Test 1: Merge two sorted lists normally
    // ------------------------------------------------------------
    @Test
    void testMergeTwoSortedLists() {
        PatientNode list1 = buildList(new int[][] {
                {100, 40},
                {200, 50},
                {300, 60}
        });

        PatientNode list2 = buildList(new int[][] {
                {150, 55},
                {250, 65}
        });

        PatientNode merged = PatientListMerger.mergeSortedLists(list1, list2);

        assertArrayEquals(
                new int[] {100, 150, 200, 250, 300},
                listToSsnArray(merged),
                "Merged list must be sorted by SSN"
        );
    }

    // ------------------------------------------------------------
    // Test 2: Handle duplicates (same SSN appears twice)
    // ------------------------------------------------------------
    @Test
    void testMergeWithDuplicateSSN() {
        PatientNode list1 = buildList(new int[][] {
                {200, 40},
                {300, 50}
        });

        PatientNode list2 = buildList(new int[][] {
                {200, 41},
                {400, 60}
        });

        PatientNode merged = PatientListMerger.mergeSortedLists(list1, list2);

        assertArrayEquals(
                new int[] {200, 200, 300, 400},
                listToSsnArray(merged),
                "Merged list must preserve duplicate SSNs"
        );
    }

    // ------------------------------------------------------------
    // Test 3: First list empty
    // ------------------------------------------------------------
    @Test
    void testFirstListEmpty() {
        PatientNode list1 = null;

        PatientNode list2 = buildList(new int[][] {
                {100, 20},
                {200, 30}
        });

        PatientNode merged = PatientListMerger.mergeSortedLists(list1, list2);

        assertArrayEquals(
                new int[] {100, 200},
                listToSsnArray(merged),
                "Merged list should equal the second list when first is empty"
        );
    }

    // ------------------------------------------------------------
    // Test 4: Second list empty
    // ------------------------------------------------------------
    @Test
    void testSecondListEmpty() {
        PatientNode list1 = buildList(new int[][] {
                {50, 10},
                {150, 20}
        });

        PatientNode list2 = null;

        PatientNode merged = PatientListMerger.mergeSortedLists(list1, list2);

        assertArrayEquals(
                new int[] {50, 150},
                listToSsnArray(merged),
                "Merged list should equal the first list when second is empty"
        );
    }

    // ------------------------------------------------------------
    // Test 5: Both lists empty
    // ------------------------------------------------------------
    @Test
    void testBothListsEmpty() {
        PatientNode merged = PatientListMerger.mergeSortedLists(null, null);

        assertNull(merged, "Merged list of two empty lists should be null");
    }
}
