package Command;



public class TextFile {
    
    private String name;

    public TextFile(String name){
        this.name = name;
    }

    public void open(){
        System.out.println("Opening File"+name);
    }

    public void save(){
        System.out.println("Saving File"+name);
    }
}
