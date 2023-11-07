import java.io.Serializable;

public class Single implements Serializable{
    // constructor private

    private static Single single;

    private Single(){
        if(single != null){
            throw new RuntimeException("You are trying to break singleton pattern");
        }
    }


    // Lazy way of creating singleton object
    /*public static Single getObject(){

        if(single == null){
            single = new Single();
        }

        return single;
    }*/

    // Lazy way of creating singleton object
    // Using Synchronised Block for proper functioning of multiple threads

    public static Single getObject(){
        if (single == null){

            synchronized(Single.class){
                if(single == null){
                single = new Single();
                }
            }
        }
        return single;
    }

    public Object readResolve(){
        return single;
    }
}