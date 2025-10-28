package waitinglist;

import java.util.*;

public class WaitingListManager {
    private Queue<String> queue;
    private Set<String> set;

    public WaitingListManager() {
        queue = new LinkedList<>();
        set = new HashSet<>();
    }

    public void addPerson(String name) {
        if (name == null) {
            return;
        }

        if (set.contains(name)) {
            System.out.println(name + " is already in the waiting list.");
        } else {
            queue.add(name);
            set.add(name);
            System.out.println(name + " added to the waiting list.");
        }
    }

    public String servePerson() {
        if (queue.isEmpty()) {
            return "Waiting list is empty.";
        }
        String person = queue.poll();
        set.remove(person);
        return person + " has been served.";
    }

    public boolean isPersonInList(String name) {
        return set.contains(name);
    }

    public int waitingListSize() {
        return queue.size();
    }

    public void displayWaitingList() {
        if (queue.isEmpty()) {
            System.out.println("Waiting list is empty.");
        } else {
            System.out.println("Waiting list:");
            for (String person : queue) {
                System.out.println("- " + person);
            }
        }
    }
}
