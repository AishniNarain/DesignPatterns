package MementoPattern;

public class TestMemento {
    
    public static void main(String args[]){
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        originator.setState("State 2");
        caretaker.add(originator.saveStatetoMemento());

        originator.setState("State 3");
        caretaker.add(originator.saveStatetoMemento());

        originator.setState("State 4");
        System.out.println("Current state : "+ originator.getState());

        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("First Saved State : " + originator.getState());

        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("Second saved State : " + originator.getState());
        
    }
}
