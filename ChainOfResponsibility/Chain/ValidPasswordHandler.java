package Chain;

public class ValidPasswordHandler implements Handler{
    private Database database;

    public ValidPasswordHandler(Database database){
        this.database = database;
    }

    public boolean handle(String username, String password){
        if(!database.isValidPassword(username,password)){
            System.out.println("Wrong Password");
            
            return false;
        }
        return handleNext(username, password);
    }

    private boolean handleNext(String username, String password){
        return false;
    }
}
