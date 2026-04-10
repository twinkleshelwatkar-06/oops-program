abstract class Ride {
    int distance;

    Ride(int distance) {
        this.distance = distance;
    }

    abstract void calculateFare();
}

class BikeRide extends Ride {

    BikeRide(int distance) {
        super(distance);
    }

    void calculateFare() {
        System.out.println("Bike Fare = " + (distance * 5));
    }
}

class AutoRide extends Ride {

    AutoRide(int distance) {
        super(distance);
    }

    void calculateFare() {
        System.out.println("Auto Fare = " + (distance * 8));
    }
}

class CarRide extends Ride {

    CarRide(int distance) {
        super(distance);
    }

    void calculateFare() {
        System.out.println("Car Fare = " + (distance * 12));
    }
}

public class RideDemo {
    public static void main(String[] args) {

        Ride rides[] = {
            new BikeRide(10),
            new AutoRide(10),
            new CarRide(10)
        };

        for (Ride r : rides) {
            r.calculateFare();
        }
    }
}