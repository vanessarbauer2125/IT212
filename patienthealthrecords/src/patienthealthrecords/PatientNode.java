package patienthealthrecords;

public class PatientNode {
    public int ssn;
    int age;
    String fullName;
    public PatientNode next;

    public PatientNode(int ssn, int age, String fullName) {
        this.ssn = ssn;
        this.age = age;
        this.fullName = fullName;
        this.next = null;
    }
}
