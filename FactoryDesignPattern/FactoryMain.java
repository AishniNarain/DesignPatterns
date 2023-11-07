package FactoryDesignPattern;
import FactoryDesignPattern.phone.Android;
import FactoryDesignPattern.phone.OS;
import FactoryDesignPattern.phone.OSFactory;
import FactoryDesignPattern.phone.Windows;

public class FactoryMain {
    public static void main(String args[]){
        OSFactory osf = new OSFactory();

        OS obj1 = osf.getInstance("Other");
        OS obj2 = osf.getInstance("Open");
        OS obj3 = osf.getInstance("Closed");
        
    obj1.spec();
        obj2.spec();
        obj3.spec();
    }
}
