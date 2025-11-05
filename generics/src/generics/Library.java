package generics;

import java.util.ArrayList;
import java.util.List;

// -------------------- PART 3 --------------------
// Practical Example: Generic Library Class
public class Library<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> findItemsByName(String name) {
        List<T> results = new ArrayList<>();
        for (T item : items) {
            if (item.toString().toLowerCase().contains(name.toLowerCase())) {
                results.add(item);
            }
        }
        return results;
    }

    public void displayAll() {
        System.out.println("Library contents:");
        for (T item : items) {
            System.out.println("- " + item);
        }
    }
}
