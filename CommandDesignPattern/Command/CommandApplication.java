package Command;

public class CommandApplication {

    public static void main(String args[]){
    
        TextFileOperationExecuter textfileoperationExecuter = new TextFileOperationExecuter();

        textfileoperationExecuter.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt")));

        textfileoperationExecuter.executeOperation(new SaveTextFileOperation(new TextFile("file1.txt")));


    }

}
