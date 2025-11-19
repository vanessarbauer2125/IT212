package patienthealthrecords;

public class PatientListMerger {

    public static PatientNode mergeSortedLists(PatientNode headA, PatientNode headB) {

        // Dummy node to simplify list construction
        PatientNode dummy = new PatientNode(0, 0, "");
        PatientNode current = dummy;

        PatientNode p1 = headA;
        PatientNode p2 = headB;

        // Merge until one list ends
        while (p1 != null && p2 != null) {
            if (p1.ssn <= p2.ssn) {
                current.next = p1;
                p1 = p1.next;
            } else {
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }

        // Append the remaining nodes of the non-empty list
        if (p1 != null) current.next = p1;
        if (p2 != null) current.next = p2;

        return dummy.next; // Returns head of merged list
    }

    public static void printList(PatientNode head) {
        PatientNode current = head;
        while (current != null) {
            System.out.println("SSN: " + current.ssn
                    + ", Age: " + current.age
                    + ", Name: " + current.fullName);
            current = current.next;
        }
    }
}
