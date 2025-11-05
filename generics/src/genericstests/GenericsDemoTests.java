package genericstests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import generics.*;

public class GenericsDemoTests {

    // ---------- TESTS FOR BOX ----------
    @Test
    void setAndGet_shouldStoreAndReturnValue() {
        Box<String> box = new Box<>();
        box.set("Hello");
        assertEquals("Hello", box.get());
    }

    @Test
    void printBox_shouldPrintCorrectValue() {
        Box<Integer> box = new Box<>();
        box.set(42);
        // No assertion here (prints to stdout), just ensure no exceptions
        assertDoesNotThrow(() -> Box.printBox(box));
    }

    // ---------- TESTS FOR NUMBERBOX ----------
    @Test
    void numberBox_shouldReturnDoubleValueForInteger() {
        NumberBox<Integer> numBox = new NumberBox<>();
        numBox.set(10);
        assertEquals(10.0, numBox.doubleValue());
    }

    @Test
    void numberBox_shouldReturnDoubleValueForDouble() {
        NumberBox<Double> numBox = new NumberBox<>();
        numBox.set(3.14);
        assertEquals(3.14, numBox.doubleValue());
    }

    // ---------- TESTS FOR STRINGPROCESSOR ----------
    @Test
    void process_shouldReverseString() {
        StringProcessor processor = new StringProcessor();
        assertEquals("olleh", processor.process("hello"));
    }

    @Test
    void process_emptyString_shouldReturnEmptyString() {
        StringProcessor processor = new StringProcessor();
        assertEquals("", processor.process(""));
    }

    @Test
    void process_singleCharacter_shouldReturnSameString() {
        StringProcessor processor = new StringProcessor();
        assertEquals("a", processor.process("a"));
    }

    // ---------- TESTS FOR LIBRARY ----------
    @Test
    void addItem_shouldAddBookToLibrary() {
        Library<Book> library = new Library<>();
        Book book = new Book("Effective Java");
        library.addItem(book);

        List<Book> found = library.findItemsByName("Effective");
        assertTrue(found.contains(book));
    }

    @Test
    void removeItem_shouldRemoveItemFromLibrary() {
        Library<DVD> library = new Library<>();
        DVD dvd = new DVD("Inception");
        library.addItem(dvd);
        library.removeItem(dvd);

        List<DVD> found = library.findItemsByName("Inception");
        assertTrue(found.isEmpty());
    }

    @Test
    void findItemsByName_shouldBeCaseInsensitive() {
        Library<Book> library = new Library<>();
        Book book = new Book("Clean Code");
        library.addItem(book);

        List<Book> results = library.findItemsByName("clean");
        assertEquals(1, results.size());
        assertEquals("Book: Clean Code", results.get(0).toString());
    }

    @Test
    void findItemsByName_shouldReturnEmptyIfNotFound() {
        Library<Book> library = new Library<>();
        library.addItem(new Book("Refactoring"));
        List<Book> results = library.findItemsByName("Design");
        assertTrue(results.isEmpty());
    }

    // ---------- EDGE CASES ----------
    @Test
    void box_shouldHandleNullValues() {
        Box<String> box = new Box<>();
        box.set(null);
        assertNull(box.get());
    }

    @Test
    void library_shouldHandleMultipleItemTypes() {
        Library<Object> library = new Library<>();
        library.addItem(new Book("Java in Action"));
        library.addItem(new DVD("The Matrix"));
        library.addItem("Random String");

        assertEquals(3, library.findItemsByName("a").size());
    }
}
