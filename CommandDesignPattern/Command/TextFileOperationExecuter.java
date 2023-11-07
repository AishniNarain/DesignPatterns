package Command;
import java.util.List;
import java.util.ArrayList;

public class TextFileOperationExecuter {
    
    private final List<TextFileOperation> textfileoperations = new ArrayList<>();

    public void executeOperation(TextFileOperation TextFileOperation){
        textfileoperations.add(TextFileOperation);
        TextFileOperation.execute();
    }

}
