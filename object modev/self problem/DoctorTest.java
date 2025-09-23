import java.util.*;

class Patient {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    Patient(String name) { this.name = name; }
    void addDoctor(Doctor d) { doctors.add(d); }
}

class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();
    Doctor(String name) { this.name = name; }
    void consult(Patient p) {
        patients.add(p);
        p.addDoctor(this);
        System.out.println("Dr. " + name + " consulted " + p.name);
    }
}

public class DoctorTest {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Smith"), d2 = new Doctor("Maya");
        Patient p1 = new Patient("Alice"), p2 = new Patient("Bob");

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}
