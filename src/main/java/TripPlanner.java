import java.text.DecimalFormat;
import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        // TODO: Get user input for trip details
        // - Distance (miles)
        // - Average speed (mph)
        // - Fuel efficiency (miles per gallon)
        // - Fuel price per gallon
        double distance, avgSpeed, mpg, fuelPrice, travelTime, fuelNeeded, tripCost;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print ("Enter trip distance (miles): ");
        distance = sc.nextDouble();
        System.out.print ("Enter average speed (mph): ");
        avgSpeed = sc.nextDouble();
        System.out.print ("Enter fuel efficiency (miles per gallon): ");
        mpg = sc.nextDouble();
        System.out.print ("Enter fuel price per gallon ($): ");
        fuelPrice = sc.nextDouble();
        System.out.println();
        
        // TODO: Calculate travel time using a return method
        travelTime = calculateTravelTime(distance, avgSpeed);

        // TODO: Calculate fuel needed using a return method
        fuelNeeded = calculateFuelNeeded(distance, mpg);
        
        // TODO: Calculate trip cost using a return method
        tripCost = calculateTripCost(fuelNeeded, fuelPrice);

        // TODO: Display results using a void method
        displayResults(travelTime, fuelNeeded, tripCost);
    }
    
    // TODO: Implement calculateTravelTime method
    public static double calculateTravelTime(double distance, double avgSpeed)
    {
        return distance / avgSpeed;
    }
    
    // TODO: Implement calculateFuelNeeded method
    public static double calculateFuelNeeded(double distance, double mpg)
    {
        return distance / mpg;
    }
    
    // TODO: Implement calculateTripCost method
    public static double calculateTripCost(double fuelNeeded, double fuelPrice)
    {
        return fuelNeeded * fuelPrice;
    }

    // TODO: Implement displayResults method
    public static void displayResults(double travelTime, double fuelNeeded, double tripCost)
    {
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println ("Results:");
        System.out.println ("Travel Time: " + df.format(travelTime) + " hours");
        System.out.println ("Fuel Needed: " + df.format(fuelNeeded) + " gallons");
        System.out.println ("Trip Cost: $" + df.format(tripCost));
    }
    
}
