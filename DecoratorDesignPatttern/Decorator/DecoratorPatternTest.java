package Decorator;

interface Dress{
    public void assemble();
}

class BasicDress implements Dress{

    public void assemble(){
        System.out.println("Basic Dress Features");
    }
}

class DressDecorator implements Dress{
    protected Dress dress;

    public DressDecorator(Dress c){
        this.dress = c;
    }

    public void assemble(){
        this.dress.assemble();
    }
}

class CasualDress extends DressDecorator{

    public CasualDress(Dress c){
        super(c);
    }

    public void assemble(){
        super.assemble();
        System.out.println("Adding Casual Dress Features");
    }
}

class SportyDress extends DressDecorator{

    public SportyDress(Dress c){
        super(c);
    }

    public void assemble(){
        super.assemble();
        System.out.println("Adding Sporty Dress Features");
    }
}

class FancyDress extends DressDecorator{

    public FancyDress(Dress c){
        super(c);
    }

    public void assemble(){
        super.assemble();
        System.out.println("Adding Fancy Dress Features");
    }
}

public class DecoratorPatternTest{
    public static void main(String args[]){

        Dress sportydress = new SportyDress(new BasicDress());
        sportydress.assemble();
        System.out.println();

        Dress casualdress = new CasualDress(new BasicDress());
        casualdress.assemble();
        System.out.println();

        Dress fancydress = new FancyDress(new BasicDress());
        fancydress.assemble();
        System.out.println();

        Dress casualfancydress = new CasualDress(new FancyDress(new BasicDress()));
        casualfancydress.assemble();
        System.out.println();

        Dress sportyfancydress = new SportyDress(new FancyDress(new BasicDress()));
        sportyfancydress.assemble();
        System.out.println();
    }
}


 