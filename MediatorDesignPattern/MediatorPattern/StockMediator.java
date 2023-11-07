package MediatorPattern;
import java.util.ArrayList;

public class StockMediator implements Mediator{

    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockBuyOffers;
    private ArrayList<StockOffer> stockSellOffers;

    private int colleagueCodes = 0;

    public StockMediator(){
        colleagues = new ArrayList<Colleague>();
        stockBuyOffers = new ArrayList<StockOffer>();
        stockSellOffers = new ArrayList<StockOffer>();
    }

    public void addColleague(Colleague newcolleague) {
        colleagues.add(newcolleague);
        colleagueCodes++;
        newcolleague.setColleagueCode(colleagueCodes);
    }

    @Override
    public void saleOffer(String stock, int shares, int collcode) {
        
        boolean StockSold = false;

        for(StockOffer offer : stockBuyOffers){

            if(offer.getstockSymbol()== stock && offer.getstockShares()== shares){
                System.out.println(shares + " shares of "+ stock + " sold to colleague code "+ offer.getcolleagueCode());

                stockBuyOffers.remove(offer);
                StockSold = true;
            }

            if(StockSold){
                break;
            }
        }

            if(!StockSold){
                System.out.println(shares + " shares of "+ stock + " added to inventory");

                StockOffer newOffering = new StockOffer(shares, stock, collcode);
                stockSellOffers.add(newOffering);
            }
    }
        
    

    @Override
    public void buyOffer(String stock, int shares, int collcode) {
        
        boolean StockBought = false;

        for(StockOffer offer : stockSellOffers){

            if(offer.getstockSymbol()== stock && offer.getstockShares()== shares){
                System.out.println(shares + " shares of "+ stock + " bought by colleague code "+ offer.getcolleagueCode());

                stockSellOffers.remove(offer);
                StockBought= true;
            }

            if(StockBought){
                break;
            }
        }

            if(!StockBought){
                System.out.println(shares + " shares of "+ stock + " added to inventory");

                StockOffer newOffering = new StockOffer(shares, stock, collcode);
                stockBuyOffers.add(newOffering);
            }
    }


    public void getStockOfferings(){

        System.out.println("Stocks for sale");

        for(StockOffer offer : stockSellOffers){
            System.out.println(offer.getstockShares() + " of " + offer.getstockSymbol());
        }

        System.out.println("Stocks Buy Offers");

        for(StockOffer offer : stockBuyOffers){
            System.out.println(offer.getstockShares() + " of " + offer.getstockSymbol());
        }

    }

    
    
    
}
