class Patient {
    static String hospitalName = "City Care Hospital";
    static int totalPatients = 0;

    final String patientID;
    String name;
    int age;
    String ailment;

    Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void display() {
        if (this instanceof Patient)
            System.out.println("ID: " + patientID + ", Name: " + name + ", Age: " + age +
                               ", Ailment: " + ailment + ", Hospital: " + hospitalName);
    }
}

public class HospitalTest {
    public static void main(String[] args) {
        Patient p1 = new Patient("Emma", 30, "Flu", "P001");
        Patient p2 = new Patient("Liam", 45, "Fracture", "P002");

        p1.display();
        p2.display();

        Patient.getTotalPatients();
    }
}
