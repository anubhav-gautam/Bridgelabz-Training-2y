
class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}


interface Refuelable {
    void refuel();
}


class ElectricVehicle extends Vehicle {
    int batteryCapacity; // in kWh

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println(model + " is charging. Battery capacity: " + batteryCapacity + " kWh");
    }
}


class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelCapacity;

    PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    public void refuel() {
        System.out.println(model + " is refueling. Fuel capacity: " + fuelCapacity + " liters");
    }
}


public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle honda = new PetrolVehicle("Honda City", 180, 40);

        // Electric Vehicle
        tesla.displayInfo();
        tesla.charge();

        System.out.println();

        // Petrol Vehicle
        honda.displayInfo();
        honda.refuel();
    }
}
