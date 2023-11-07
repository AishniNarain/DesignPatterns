package Visitor;

public interface ComputerPartVisitor {
    
    public void visit(Computer computer);
    public void visit(Monitor monitor);
    public void visit(Keyboard keyboard);
    public void visit(Mouse mouse);

}
