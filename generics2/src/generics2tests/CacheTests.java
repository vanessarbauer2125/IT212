package generics2tests;

import generics2.Cache;
import generics2.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CacheTests {

    @Test
    void addAndGet_shouldStoreAndRetrieveValue() {
        Cache<String> cache = new Cache<>();
        cache.add("k1", "Hello");
        assertEquals("Hello", cache.get("k1"));
    }

    @Test
    void clear_shouldEmptyCache() {
        Cache<Integer> cache = new Cache<>();
        cache.add("num", 42);
        cache.clear();
        assertNull(cache.get("num"));
    }

    @Test
    void addAll_shouldCopyFromAnotherCache() {
        Cache<Person> cache1 = new Cache<>();
        cache1.add("p1", new Person("Alice", 25));

        Cache<Person> cache2 = new Cache<>();
        cache2.add("p2", new Person("Bob", 30));

        cache1.addAll(cache2);
        assertNotNull(cache1.get("p2"));
        assertEquals("Bob (30)", cache1.get("p2").toString());
    }

    @Test
    void addAll_shouldWorkWithSubtypes() {
        Cache<Object> objectCache = new Cache<>();
        Cache<Person> personCache = new Cache<>();
        personCache.add("p1", new Person("Alice", 25));

        objectCache.addAll(personCache); // Person extends Object
        assertEquals("Alice (25)", objectCache.get("p1").toString());
    }

    @Test
    void toString_shouldIncludeKeysAndValues() {
        Cache<String> cache = new Cache<>();
        cache.add("key1", "value1");
        assertTrue(cache.toString().contains("key1"));
        assertTrue(cache.toString().contains("value1"));
    }
}
