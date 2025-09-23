import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String num, String t, double r) {
        this.vehicleNumber=num; this.type=t; this.rentalRate=r;
    }
    public String getVehicleNumber(){ return vehicleNumber; }
    public double getRentalRate(){ return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    void getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String num,double r){ super(num,"Car",r); }
    public double calculateRentalCost(int d){ return getRentalRate()*d; }
    public double calculateInsurance(){ return 2000; }
    public void getInsuranceDetails(){ System.out.println("Car Insurance: 2000"); }
}

class Bike extends Vehicle {
    public Bike(String num,double r){ super(num,"Bike",r); }
    public double calculateRentalCost(int d){ return getRentalRate()*d; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String num,double r){ super(num,"Truck",r); }
    public double calculateRentalCost(int d){ return getRentalRate()*d+1000; }
    public double calculateInsurance(){ return 5000; }
    public void getInsuranceDetails(){ System.out.println("Truck Insurance: 5000"); }
}

public class VehicleRental {
    public static void main(String[] args) {
        List<Vehicle> vlist = new ArrayList<>();
        vlist.add(new Car("C101",1000));
        vlist.add(new Bike("B202",500));
        vlist.add(new Truck("T303",2000));

        for(Vehicle v: vlist){
            System.out.println(v.getVehicleNumber()+" Rent: "+v.calculateRentalCost(3));
            if(v instanceof Insurable){
                Insurable i=(Insurable)v;
                System.out.println("Insurance: "+i.calculateInsurance());
            }
        }
    }
}
