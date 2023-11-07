package Strategy;

public class OffRoadVehicle extends Vehicle{
    
    OffRoadVehicle(){
        super(new NormalDriveStrategy());
    }
}
