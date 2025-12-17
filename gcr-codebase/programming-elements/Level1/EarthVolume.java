public class EarthVolume {
    public static void main(String[] args) {

        double radiusKm = 6378;
        double pi = Math.PI;
        // Volume in cubic kilometers
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        // Convert km³ to miles³
        double kmToMile = 0.621371;
        double volumeMiles = volumeKm * Math.pow(kmToMile, 3);

	//Printing Volume in cubic kilometers and Volume in miles
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    } 
}
