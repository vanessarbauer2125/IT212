package patienthealthrecords;

public class Main {
    public static void main(String[] args) {
        // HealthMerge Inc. list
        PatientNode h1 = new PatientNode(111, 45, "Alice Smith");
        PatientNode h2 = new PatientNode(222, 60, "Bob Johnson");
        PatientNode h3 = new PatientNode(333, 50, "Charlie Adams");
        h1.next = h2;
        h2.next = h3;

        // CarePlus list
        PatientNode c1 = new PatientNode(150, 70, "David Clark");
        PatientNode c2 = new PatientNode(222, 61, "Bob Johnson Duplicate");
        PatientNode c3 = new PatientNode(400, 30, "Eva Brown");
        c1.next = c2;
        c2.next = c3;

        PatientListMerger listMerger = new PatientListMerger();
        PatientNode merged = listMerger.mergeSortedLists(h1, c1);

        System.out.println("Merged Patient Records:");
        listMerger.printList(merged);
    }
}
