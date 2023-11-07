package Chain;

public abstract class BaseHandler {
    
    private Handler next;

    public Handler setNextHandler(Handler next){
        this.next = next;
        return next;
    }

    public abstract boolean Handler(String username, String password);

    public boolean handleNext(String username, String password){
        if(next == null){
            return true;
        }
        return next.handle(username, password);
    }
}
