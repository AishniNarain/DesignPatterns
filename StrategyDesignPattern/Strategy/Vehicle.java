package Strategy;

public class Vehicle {
    
    DriveStrategy driveobject;

    public Vehicle(DriveStrategy driveobj){
        this.driveobject = driveobj;
    }

    public void drive(){
        driveobject.drive();
    }
}
