package generics;

import java.util.*;

// -------------------- PART 1 --------------------
// Generic Class
public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    // Generic Method (can handle Box of any type)
    public static <U> void printBox(Box<U> box) {
        System.out.println("Box contains: " + box.get());
    }
}

// -------------------- PART 2 --------------------
// Generic Interface
interface Processor<T> {
    T process(T input);
}

// Demonstrating Wildcards
class BoxPrinter {
    // Accepts any Box whose type extends Number
    public static void printNumberBox(Box<? extends Number> box) {
        System.out.println("NumberBox contains: " + box.get());
    }
}

