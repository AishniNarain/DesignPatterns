package Chain;

public class AuthService {
    private Handler handler;

    public AuthService(Handler handler){
        this.handler = handler;
    }

    public boolean LogIn(String email, String password){
        if(handler.handle(email, password)){
            System.out.println("Authorization Successful");
            return true;
        }
        return false;
    }
    
}
