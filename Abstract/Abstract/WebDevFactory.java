package Abstract;
import Abstract.Employee;
import Abstract.WebDeveloper;

public class WebDevFactory extends AbstractEmployeeFactory{
    
    @Override
    public Employee CreateEmployee(){
        return new WebDeveloper();
    }
}
