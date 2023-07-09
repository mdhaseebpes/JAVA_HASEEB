package Abstraction.Interface;

public class Bird extends Animal implements  FlightEnabled , Trackable{
    @Override
    void move() {
        System.out.println("Fly the bird wings");
    }

    @Override
    public void flier() {
        System.out.println(getClass().getSimpleName() + " flying ");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + "take off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " landing");
    }

    @Override
    public FlightStages transition(FlightStages stages) {
        return FlightEnabled.super.transition(stages);
    }

    @Override
    public void test01() {

    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() +  " tacking");
    }
}
