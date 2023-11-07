package Command;

public class OpenTextFileOperation implements TextFileOperation{
    
    private TextFile textfile;

    public OpenTextFileOperation(TextFile textfile){
        this.textfile = textfile;
    }

    public void execute(){
        textfile.open();
    }
}