package Abstraction.Interface;


//Enum can implement interface but cannot extend classes
enum FlightStages implements Trackable{ GROUNDED,LAUNCH,CRUISE ,DATA_COLLECTION
    ;

    @Override
    public void track() {
        if(this == GROUNDED) {
            System.out.println("Monitoring =" + this);
        }
    }
}
public interface Trackable {

    void track();
}
