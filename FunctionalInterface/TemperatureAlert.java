package FunctionalInterface;

import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> isHighTemp = temp -> temp > 40.0;

        double temp = 42.5;
        if (isHighTemp.test(temp))
            System.out.println("⚠️ Alert! Temperature too high: " + temp + "°C");
        else
            System.out.println("Temperature normal: " + temp + "°C");
    }
}