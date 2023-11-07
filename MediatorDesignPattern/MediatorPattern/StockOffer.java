package MediatorPattern;

public class StockOffer {
    
    private int stockShares;
    private String stockSymbol;
    private int colleagueCode;

    public StockOffer(int numOfShares, String stock, int collcode){
        stockShares = numOfShares;
        stockSymbol = stock;
        colleagueCode = collcode;
    }

    public int getstockShares(){
        return stockShares;
    }

    public String getstockSymbol(){
        return stockSymbol;
    }

    public int getcolleagueCode(){
        return colleagueCode;
    }
}