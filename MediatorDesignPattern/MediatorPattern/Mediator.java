package MediatorPattern;

public interface Mediator {
    
    public void saleOffer(String stock, int shares, int collcode);
    public void buyOffer(String stock, int shares, int collcode);
    public void addColleague(Colleague colleague);
}
