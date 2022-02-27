public class Patient extends Person{
    //var
    private int patientID;
    private Date DoB;
    private Doctor physician;
    private Date attendDate;
    private Date dischargeDate;
    //constructor
    Patient(String firstName, String lastName, int patientID, Date DoB
            , Doctor physician, Date attendDate, Date dischargeDate){
        super(firstName,lastName);
        this.patientID = patientID;
        this.DoB = DoB;
        this.physician = physician;
        this.attendDate = attendDate;
        this.dischargeDate = dischargeDate;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setDoB(Date DoB) {
        this.DoB = DoB;
    }

    public void setPhysician(Doctor physician) {
        this.physician = physician;
    }

    public void setAttendDate(Date attendDate) {
        this.attendDate = attendDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public int getPatientID() {
        return patientID;
    }

    public Date getDoB() {
        return DoB;
    }

    public Doctor getPhysician() {
        return physician;
    }

    public Date getAttendDate() {
        return attendDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public String toString(){
        String P = "Patient: " + super.toString()
                + "\nDate of Birth: " + DoB
                + "\nAttending Physician: " + physician
                + "\nAdmit Date: " + attendDate
                + "\nDischarge Date: " + dischargeDate;
        return P;
    }
}
