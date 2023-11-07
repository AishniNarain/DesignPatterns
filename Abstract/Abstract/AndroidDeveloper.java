package Abstract;

public class AndroidDeveloper implements Employee{
    
    public int salary(){
        return 40000;
    }

    public String name(){
        System.out.println("I am Android Developer");
        return "ANDROID DEVELOPER";
    }
}
