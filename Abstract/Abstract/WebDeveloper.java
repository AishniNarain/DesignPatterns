package Abstract;

public class WebDeveloper implements Employee{
    
    public int salary(){
        return 50000;
    }

    public String name(){
        System.out.println("I am Web Developer");
        return "WEB DEVELOPER";
    }
}
