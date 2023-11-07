package Strategy;

public class GoodsVehicle extends Vehicle{
    
    GoodsVehicle(){
        super(new SportsDriveStrategy());
    }
}
