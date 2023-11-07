package Visitor;

public class Keyboard implements ComputerPart{
    
    public void accept(ComputerPartVisitor computerpartvisitor){
        computerpartvisitor.visit(this);
    }
}
