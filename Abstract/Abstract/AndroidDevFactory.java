package Abstract;
import Abstract.Employee;
import Abstract.AndroidDeveloper;

public class AndroidDevFactory extends AbstractEmployeeFactory{
    
    @Override
    public Employee CreateEmployee(){
        return new AndroidDeveloper();
    }
}
