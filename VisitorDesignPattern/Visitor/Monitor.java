package Visitor;

public class Monitor implements ComputerPart{
    
    public void accept(ComputerPartVisitor computerpartvisitor){
        computerpartvisitor.visit(this);
    }
}
