package arraylists;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> list = generateList(10);
        Iterator<Integer> it = list.listIterator();
        System.out.print("List: ");
        printIntList(list);

        // Removing a value using iterator
        removeIntFromListIterator(list);
        System.out.println();
        System.out.print("List after removal using iterator:  ");
        printIntList(list);

        // Adding to list while iterating
        addIntToList(list);
        System.out.println();
        System.out.print("List after add: ");
        printIntList(list);

        // Removing from list while iterating
        removeIntFromList(list);
        System.out.println();
        System.out.print("List after removal: ");
        printIntList(list);
    }

    // Generate a list with the given size populated with values from 0 to 99
    public static List<Integer> generateList(int size) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < size; i++) {
           l.add((int)(Math.random() * 100));
        }

        return l;
    }

    // Prints the contents of the iterator
    public static void printIntList(List<Integer> list) {
        Iterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

    // Attempt to remove a value from the list
    public static int removeIntFromListIterator(List<Integer> list) {
        Iterator<Integer> it = list.listIterator();
        if (it.hasNext()) {
            int removed = it.next();
            it.remove();
            return removed;
        }

        return -1;
    }

    // Add a value to the list
    public static void addIntToList(List<Integer> list) {
        int ogSize = list.size();
        for (int i = 0; i < ogSize; i++) {
            list.add((int) (Math.random() * 100));
        }
    }

    // Remove a value to the list
    public static void removeIntFromList(List<Integer> list) {
        int ogSize = list.size();
        for (int i = 0; i < ogSize; i++) {
            list.remove(0);
        }
    }

}