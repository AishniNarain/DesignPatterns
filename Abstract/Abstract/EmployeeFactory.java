package Abstract;
import Abstract.Employee;

public class EmployeeFactory {
    
    public static Employee getEmployee(AbstractEmployeeFactory factory){
        return factory.CreateEmployee();
    }
}
