package healthrecordsymmetry;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Test cases
        // Symmetric example: 80 → 90 → 100 → 90 → 80
        Node symmetric = buildList(new int[]{80, 90, 100, 90, 80});
        System.out.println("Test 1 (Should be true): " + isHealthRecordSymmetric(symmetric));

        // Asymmetric example: 70 → 85 → 90 → 100
        Node notSymmetric = buildList(new int[]{70, 85, 90, 100});
        System.out.println("Test 2 (Should be false): " + isHealthRecordSymmetric(notSymmetric));

        // Single-node (always symmetric)
        Node single = buildList(new int[]{120});
        System.out.println("Test 3 (Should be true): " + isHealthRecordSymmetric(single));

        // Even-length symmetric: 60 → 75 → 75 → 60
        Node evenSymmetric = buildList(new int[]{60, 75, 75, 60});
        System.out.println("Test 4 (Should be true): " + isHealthRecordSymmetric(evenSymmetric));

        // Empty list (symmetric by definition)
        Node empty = buildList(new int[]{});
        System.out.println("Test 5 (Should be true): " + isHealthRecordSymmetric(empty));

    }


    // Helper: build a list from array
    public static Node buildList(int[] values) {
        if (values.length == 0) return null;
        Node head = new Node(values[0]);
        Node current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
        return head;
    }

    public static boolean isHealthRecordSymmetric(Node head) {
        if (head == null || head.next == null) return true;

        // 1. Get size
        int size = getSize(head);

        // 2. Compute half index (index where second half begins)
        int halfIndex;
        if (size % 2 == 0) {
            halfIndex = size / 2 - 1;
        } else {
            halfIndex = size / 2;
        }

        // 3. Get node at halfIndex
        Node halfNode = getNodeAtIndex(head, halfIndex);

        // 4. Reverse the second half
        Node secondHalf;
        if (size % 2 == 0) {
            secondHalf = reverseList(halfNode.next);
        } else {
            secondHalf = reverseList(halfNode);
        }

        // 5. First half pointer starts at head
        Node firstHalf = head;

        // If size is even, skip the middle connection
        if (size % 2 == 0) {
            secondHalf = secondHalf;
        } else {
            secondHalf = secondHalf.next;
        }

        // 6. Compare corresponding nodes
        while (secondHalf != null) {
            if (firstHalf.value != secondHalf.value) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
    // Count the number of nodes
    private static int getSize(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Get node at a specific index (0-based)
    private static Node getNodeAtIndex(Node head, int index) {
        Node current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        return current;
    }

    // Reverse a singly linked list
    private static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }



}