import java.util.ArrayList;
import java.util.List;

// Donor class
class Donor {
    private String name;
    private String bloodType;
    private int age;
    private String contact;

    public Donor(String name, String bloodType, int age, String contact) {
        this.name = name;
        this.bloodType = bloodType;
        this.age = age;
        this.contact = contact;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

// Patient class
class Patient {
    private String name;
    private String bloodType;
    private int age;
    private String contact;

    public Patient(String name, String bloodType, int age, String contact) {
        this.name = name;
        this.bloodType = bloodType;
        this.age = age;
        this.contact = contact;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

// BloodBank class
class BloodBank {
    private List<Donor> donors;
    private List<Patient> patients;

    public BloodBank() {
        donors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addDonor(Donor donor) {
        donors.add(donor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Donor> getDonors() {
        return donors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    // Additional methods for blood donation, blood request, etc.
}

// Main class
public class Main {
    public static void main(String[] args) {
        BloodBank bloodBank = new BloodBank();

        // Adding donors and patients
        bloodBank.addDonor(new Donor("John Doe", "A+", 30, "1234567890"));
        bloodBank.addPatient(new Patient("Jane Doe", "A+", 25, "0987654321"));

        // Example of retrieving donors and patients
        List<Donor> donors = bloodBank.getDonors();
        List<Patient> patients = bloodBank.getPatients();

        // Print donor details
        for (Donor donor : donors) {
            so
            System.out.println("Donor: " + donor.getName() + ", Blood Type: " + donor.getBloodType());
        }

        // Print patient details
        for (Patient patient : patients) {
            System.out.println("Patient: " + patient.getName() + ", Blood Type: " + patient.getBloodType());
        }
    }
}
