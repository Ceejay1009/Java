public class Doctor extends Person{
    //var
    private String specialty;

    //constructor
    Doctor(String firstName, String lastName, String specialty){
        super(firstName, lastName);
        this.specialty = specialty;
    }

    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String toString(){
        return super.toString() + " " + specialty;
    }

}
