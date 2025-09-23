import java.util.*;

abstract class RideVehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(int id,String d,double r){
        this.vehicleId=id; this.driverName=d; this.ratePerKm=r;
    }
    public int getVehicleId(){ return vehicleId; }
    public String getDriverName(){ return driverName; }
    public double getRatePerKm(){ return ratePerKm; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails(){
        System.out.println("Driver: "+driverName+" VehicleID:"+vehicleId);
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String loc);
}

class CarRide extends RideVehicle implements GPS {
    private String loc;
    public CarRide(int id,String d,double r){ super(id,d,r); }
    public double calculateFare(double dist){ return getRatePerKm()*dist; }
    public String getCurrentLocation(){ return loc; }
    public void updateLocation(String l){ loc=l; }
}

class BikeRide extends RideVehicle {
    public BikeRide(int id,String d,double r){ super(id,d,r); }
    public double calculateFare(double dist){ return getRatePerKm()*dist-10; }
}

class AutoRide extends RideVehicle {
    public AutoRide(int id,String d,double r){ super(id,d,r); }
    public double calculateFare(double dist){ return getRatePerKm()*dist+20; }
}

public class RideApp {
    public static void main(String[] args){
        List<RideVehicle> rides=new ArrayList<>();
        rides.add(new CarRide(101,"Ravi",15));
        rides.add(new BikeRide(102,"Amit",10));
        rides.add(new AutoRide(103,"Sohan",12));

        for(RideVehicle r: rides){
            r.getVehicleDetails();
            System.out.println("Fare: "+r.calculateFare(10));
        }
    }
}
