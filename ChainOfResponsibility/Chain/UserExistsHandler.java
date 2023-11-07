package Chain;

public class UserExistsHandler implements Handler{
    
    private Database database;

    public UserExistsHandler(Database database){
        this.database = database;
    }

    public boolean handle(String username, String password){
        if(!database.isValidUser(username)){
            System.out.println("This user is not registered");
            System.out.println("Sign Up to your app now");
            return false;
        }
        return handleNext(username, password);
    }

    

    
}

