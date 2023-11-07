import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Example {
    public static void main(String args[]) throws Exception{

        /*Single single1 = Single.getObject();

        System.out.println(single1.hashCode());

        Single single2 = Single.getObject();

        System.out.println(single2.hashCode());

        System.out.println(Other.getObject2().hashCode());
        System.out.println(Other.getObject2().hashCode()); */


        // Single s1 = Single.getObject();

        
        // Single2 s1 = Single2.INSTANCE;     // using enum
        // System.out.println(s1.hashCode());

        // Constructor<Single2> constructor = Single2.class.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // Single2 s2 = constructor.newInstance();
        // System.out.println(s2.hashCode());

        Single s1 = Single.getObject();
        System.out.println(s1.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(s1);

        System.out.println("Serialization done..");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        Single s2 = (Single) ois.readObject();
        System.out.println(s2.hashCode());
    }
}
