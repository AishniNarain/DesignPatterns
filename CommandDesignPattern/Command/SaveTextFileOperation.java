package Command;

public class SaveTextFileOperation implements TextFileOperation{
    
    private TextFile textfile;

    public SaveTextFileOperation(TextFile textfile){
        this.textfile = textfile;
    }

    public void execute(){
        textfile.save();
    }
}
