package Strategy;

public class Main {

    public static void main(String args[]){
    
        Vehicle vehicle1 = new SportsVehicle();
        Vehicle vehicle2 = new OffRoadVehicle();
        Vehicle vehicle3 = new GoodsVehicle();

        vehicle1.drive();
        vehicle2.drive();
        vehicle3.drive();

    }
}
