package unit_2_oop_concept;

abstract class Ride {
    abstract double calculateFare();
}

class BikeRide extends Ride {
    double calculateFare() { return 10 * 5; }
}

class AutoRide extends Ride {
    double calculateFare() { return 10 * 8; }
}

class CarRide extends Ride {
    double calculateFare() { return 10 * 12; }
}

public class RideBooking {
    public static void main(String[] args) {
        Ride[] rides = {
            new BikeRide(),
            new AutoRide(),
            new CarRide()
        };

        for (Ride r : rides) {
            System.out.println(r.calculateFare());
        }
    }
}
