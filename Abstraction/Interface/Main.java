package Abstraction.Interface;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flightEnabled = bird;
        Trackable trackable = bird;

        animal.move();
        //flightEnabled.move();
        //trackable.move();

        flightEnabled.flier();
        flightEnabled.land();
        flightEnabled.takeOff();

        trackable.track();

        double kmsTravelled  = 100;
        double milesTravelled = kmsTravelled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck travelled %.2f km or %.2f miles%n", kmsTravelled , milesTravelled);
    }
}
