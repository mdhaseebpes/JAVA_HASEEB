package Abstraction.Interface;

class Satellite implements OrbitEarth{

   public void achieveOrbit(){

    }

    @Override
    public void flier() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void test01() {

    }
}

interface OrbitEarth extends FlightEnabled{




    void achieveOrbit();
}

public interface FlightEnabled {

    double KM_TO_MILES = 1.60;

    void flier();

    //public abstract void flier();  // all 3 declaration are same in interface by default in interface
                                     // methods are public abstract
    //abstract void flier();

    void takeOff();

    void land();

     default FlightStages transition(FlightStages stages){
        System.out.println("transition not implemented on" +
                this.getClass().getName());
        return null;
    }

    public static void test(){
        System.out.println("static methods in interface from java 8");
    }

    public void test01();
}
