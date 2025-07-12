package oops;

//Parcel Tracking
//Class:Parcel(trackingId,sender,destination,weight)
//Count parcels going to a given destination(case-insensitive)
//Return the heaviest parcel
import java.util.Scanner;

class Parcel {
    private String trackingId;
    private String sender;
    private String destination;
    private double weight;

    // Constructor
    public Parcel(String trackingId, String sender, String destination, double weight) {
        this.trackingId = trackingId;
        this.sender = sender;
        this.destination = destination;
        this.weight = weight;
    }

    // Getters
    public String getTrackingId() {
        return trackingId;
    }

    public String getSender() {
        return sender;
    }

    public String getDestination() {
        return destination;
    }

    public double getWeight() {
        return weight;
    }
}

class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of parcels
        int n = Integer.parseInt(sc.nextLine());
        Parcel[] parcels = new Parcel[n];

        // Input parcel data
        for (int i = 0; i < n; i++) {
            String trackingId = sc.nextLine();
            String sender = sc.nextLine();
            String destination = sc.nextLine();
            double weight = Double.parseDouble(sc.nextLine());

            parcels[i] = new Parcel(trackingId, sender, destination, weight);
        }

        // Input destination to search
        String searchDestination = sc.nextLine();

        // Task 1: Count parcels to given destination
        int count = 0;
        for (Parcel p : parcels) {
            if (p.getDestination().equalsIgnoreCase(searchDestination)) {
                count++;
            }
        }

        // Task 2: Find the heaviest parcel
        Parcel heaviest = parcels[0];
        for (int i = 1; i < n; i++) {
            if (parcels[i].getWeight() > heaviest.getWeight()) {
                heaviest = parcels[i];
            }
        }

        // Output
        System.out.println("Parcels to " + searchDestination + ": " + count);
        System.out.println("Heaviest Parcel:");
        System.out.println("Tracking ID: " + heaviest.getTrackingId());
        System.out.println("Sender: " + heaviest.getSender());
        System.out.println("Destination: " + heaviest.getDestination());
        System.out.println("Weight: " + heaviest.getWeight());

        sc.close();
    }
}
