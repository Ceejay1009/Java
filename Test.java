import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Test {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        //inputs
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = input.next();
        System.out.print("Enter patient ID: ");
        int patientID = input.nextInt();
        System.out.print("Enter patient date of birth by month day year: ");
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();
        System.out.print("Enter doctor's first name: ");
        String doctorFirstName = input.next();
        System.out.print("Enter doctor's last name: ");
        String doctorLastName = input.next();
        System.out.print("Enter doctor's specialty: ");
        String specialty = input.next();

        //object
        Doctor doctor = new Doctor(doctorFirstName, doctorLastName, specialty);
        Patient patient = new Patient(firstName, lastName, patientID
                , new Date(day, month, year)
                , doctor, new Date(15, 4, 2009)
                , new Date(21, 4, 2009));
        Bill bill = new Bill(patient.getPatientID(),245.50
                , 2500,3500.38);
        System.out.println(patient);
        System.out.println("\n" + bill);

        String filename = patient.getFirstName() + patient.getLastName() + ".txt";
        try{
            FileWriter fw = new FileWriter(filename);
            fw.write(patient.toString() + "\n");
            fw.write(String.valueOf(bill));
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
