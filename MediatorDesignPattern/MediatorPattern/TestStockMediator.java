package MediatorPattern;

public class TestStockMediator {
    
    public static void main(String args[]){

        StockMediator nyse = new StockMediator();

        GormanSlacks broker = new GormanSlacks(nyse);
        JTPoorMan broker2 = new JTPoorMan(nyse);

        broker.saleOffer("MSFT", 100);
        broker.saleOffer("GOOG", 50);

        broker2.buyOffer("MSFT", 100);
        broker2.saleOffer("NRG", 10);

        broker.buyOffer("NRG", 10);

        nyse.getStockOfferings();
    }
}
