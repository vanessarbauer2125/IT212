package generics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class AdvancedGenericsDemo {
    public static void main(String[] args) {

        // ----- PART 1 -----
        System.out.println("=== Part 1: Complex Data Structures ===");
        Pair<String, Integer> agePair = new Pair<>("Alice", 30);
        System.out.println(agePair);
        agePair.setValue(31);
        System.out.println("Updated Pair: " + agePair);

        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println(stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("After Pop: " + stack);

        try {
            Stack<Integer> emptyStack = new Stack<>();
            emptyStack.pop(); // should throw exception
        } catch (EmptyStackException e) {
            System.out.println("Handled underflow correctly!");
        }

        // ----- PART 2 -----
        System.out.println("\n=== Part 2: Generics in Collections ===");
        List<Integer> intList = new ArrayList<>(Arrays.asList(3, 1, 2));
        List<String> strList = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry"));
        List<Person> personList = new ArrayList<>(Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 30)
        ));

        GenericUtils.sort(intList);
        GenericUtils.sort(strList);
        GenericUtils.sort(personList);

        System.out.println("Sorted Integers: " + intList);
        System.out.println("Sorted Strings: " + strList);
        System.out.println("Sorted People: " + personList);

        System.out.println("\nPrinting any collection using wildcard:");
        GenericUtils.printCollection(strList);

        List<Double> doubles = Arrays.asList(2.5, 3.5, 4.0);
        System.out.println("Sum of doubles: " + GenericUtils.sumOfNumberList(doubles));

        // ----- PART 3 -----
        System.out.println("\n=== Part 3: Generic Cache ===");
        Cache<Person> personCache = new Cache<>();
        personCache.add("p1", new Person("Diana", 28));
        personCache.add("p2", new Person("Eve", 32));

        Cache<Person> morePeople = new Cache<>();
        morePeople.add("p3", new Person("Frank", 29));

        personCache.addAll(morePeople); // add from another cache
        System.out.println("Person Cache: " + personCache);

        Cache<Object> objectCache = new Cache<>();
        objectCache.addAll(personCache); // Works because Person extends Object
        System.out.println("Object Cache (after addAll): " + objectCache);
    }
}
