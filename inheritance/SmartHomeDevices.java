class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        Device genericDevice = new Device("D1001", "Online");
        Thermostat thermostat = new Thermostat("T2001", "Online", 22.5);

        System.out.println("--- Generic Device ---");
        genericDevice.displayStatus();
        System.out.println();

        System.out.println("--- Thermostat Device ---");
        thermostat.displayStatus();
    }
}
