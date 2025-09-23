import java.util.*;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id,String n,int a){ this.patientId=id; this.name=n; this.age=a; }
    public void getPatientDetails(){
        System.out.println("Patient: "+name+" Age:"+age+" ID:"+patientId);
    }
    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String rec);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private List<String> records=new ArrayList<>();
    private int days; private double rate;
    public InPatient(int id,String n,int a,int d,double r){ super(id,n,a); days=d; rate=r; }
    public double calculateBill(){ return days*rate; }
    public void addRecord(String rec){ records.add(rec); }
    public void viewRecords(){ System.out.println(records); }
}

class OutPatient extends Patient {
    private double fee;
    public OutPatient(int id,String n,int a,double f){ super(id,n,a); fee=f; }
    public double calculateBill(){ return fee; }
}

public class Hospital {
    public static void main(String[] args){
        List<Patient> plist=new ArrayList<>();
        plist.add(new InPatient(1,"Ram",30,5,2000));
        plist.add(new OutPatient(2,"Sita",25,500));

        for(Patient p: plist){
            p.getPatientDetails();
            System.out.println("Bill: "+p.calculateBill());
        }
    }
}
