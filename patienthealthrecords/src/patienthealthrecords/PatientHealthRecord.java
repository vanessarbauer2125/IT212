package patienthealthrecords;

public class PatientHealthRecord {
    public int heartRate;
    public PatientHealthRecord nextRecord;

    public PatientHealthRecord(int heartRate) {
        this.heartRate = heartRate;
    }

    public PatientHealthRecord(int heartRate, PatientHealthRecord nextRecord) {
        this(heartRate);
        this.nextRecord = nextRecord;
    }
}
