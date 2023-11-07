package Chain;

public class RoleCheckHandler implements Handler{
    
    private Database database;

    public RoleCheckHandler(Database database){
        this.database = database;
    }


    public boolean handle(String username, String password){
        if("admin_username".equals(username)) {
            System.out.println("Loading Admin Page...");
            return true;
        }
        System.out.println("Loading Default Page");
        return handleNext(username, password);
    }

    private boolean handleNext(String username, String password){
        return false;
    }

}
