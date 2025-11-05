package generics;

// -------------------- MAIN --------------------
public class GenericsDemo {
    public static void main(String[] args) {
        // ----- PART 1 -----
        System.out.println("=== Part 1: Generics Basics ===");
        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics!");

        // Using get()
        System.out.println("Integer box: " + intBox.get());
        System.out.println("String box: " + strBox.get());

        // Using generic method
        Box.printBox(intBox);
        Box.printBox(strBox);

        // Bounded Type Parameters
        NumberBox<Integer> numBoxInt = new NumberBox<>();
        numBoxInt.set(42);
        NumberBox<Double> numBoxDouble = new NumberBox<>();
        numBoxDouble.set(3.14159);

        System.out.println("Integer NumberBox double value: " + numBoxInt.doubleValue());
        System.out.println("Double NumberBox double value: " + numBoxDouble.doubleValue());
        // NumberBox<String> invalidBox = new NumberBox<>(); // ❌ Compile-time error

        // ----- PART 2 -----
        System.out.println("\n=== Part 2: Advanced Generics ===");
        Processor<String> processor = new StringProcessor();
        String input = "Generics";
        String reversed = processor.process(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);

        // Wildcards
        BoxPrinter.printNumberBox(numBoxInt);
        BoxPrinter.printNumberBox(numBoxDouble);

        // ----- PART 3 -----
        System.out.println("\n=== Part 3: Practical Application ===");
        Library<Book> bookLibrary = new Library<>();
        bookLibrary.addItem(new Book("The Pragmatic Programmer"));
        bookLibrary.addItem(new Book("Clean Code"));

        Library<DVD> dvdLibrary = new Library<>();
        dvdLibrary.addItem(new DVD("Inception"));
        dvdLibrary.addItem(new DVD("The Matrix"));

        bookLibrary.displayAll();
        dvdLibrary.displayAll();

        System.out.println("\nSearching for 'Code' in books:");
        for (Book b : bookLibrary.findItemsByName("Code")) {
            System.out.println("Found: " + b);
        }
    }
}
