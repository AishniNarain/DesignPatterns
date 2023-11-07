package Bridge;



abstract class TV{

    Remote remote;

    public TV(Remote r){
        this.remote = r;
    }

    abstract void on();
    abstract void off();

}

class Sony extends TV{
    Remote remotetype;

    Sony(Remote r){
        super(r);
        this.remotetype = r;
    }

    public void on(){
        System.out.print("Sony TV on : ");
        remotetype.on();
    }

    public void off(){
        System.out.print("Sony TV off : ");
        remotetype.off();
    }
}

class Philips extends TV{
    Remote remotetype;

    Philips(Remote r){
        super(r);
        this.remotetype = r;
    }

    public void on(){
        System.out.print("Philips TV on : ");
        remotetype.on();
    }

    public void off(){
        System.out.print("Philips TV off : ");
        remotetype.off();
    }
}

interface Remote{
    public void on();
    public void off();
}

class OldRemote implements Remote{

    public void on(){
        System.out.println("On with Old Remote");
    }

    public void off(){
        System.out.println("Off with Old Remote");
    }
}

class NewRemote implements Remote{

    public void on(){
        System.out.println("On with New Remote");
    }

    public void off(){
        System.out.println("Off with New Remote");
    }
}

public class Client{
    public static void main(String args[]){

        TV SonyOldRemote = new Sony(new OldRemote());
        SonyOldRemote.on();
        SonyOldRemote.off();
        System.out.println();

        TV SonyNewRemote = new Sony(new NewRemote());
        SonyNewRemote.on();
        SonyNewRemote.off();
        System.out.println();

        TV PhilipsOldRemote = new Philips(new OldRemote());
        PhilipsOldRemote.on();
        PhilipsOldRemote.off();
        System.out.println();

        TV PhilipsNewRemote = new Philips(new NewRemote());
        PhilipsNewRemote.on();
        PhilipsNewRemote.off();
        System.out.println();
    }
}



