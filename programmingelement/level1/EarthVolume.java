public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378; 
        double pi = Math.PI;
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);
        double km3ToMi3 = 0.239006;
        double volumeMi3 = volumeKm3 * km3ToMi3;

        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f",
                          volumeKm3, volumeMi3);
    }
}
