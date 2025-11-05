package generics2tests;

import generics2.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTests {

    @Test
    void compareTo_shouldCompareByAge() {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);
        assertTrue(p1.compareTo(p2) < 0);
        assertTrue(p2.compareTo(p1) > 0);
        assertEquals(0, p1.compareTo(new Person("Carol", 25)));
    }

    @Test
    void toString_shouldIncludeNameAndAge() {
        Person p = new Person("Alice", 25);
        assertEquals("Alice (25)", p.toString());
    }
}
