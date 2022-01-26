package mediator;

public class Client {
  public static void main(String[] args) {
    System.out.println("We are starting the auction 'Vaccation in Las Vegas'");
    AuctionMediator auction = new AuctionMediatorImpl("Vacation in Las Vegas");
    Buyer[] buyers = new Buyer[4];
    buyers[0] = new BuyerImpl("James", 1000, auction);
    buyers[1] = new BuyerImpl("John", 2000, auction);
    buyers[2] = new BuyerImpl("Michael", 4000, auction);
    buyers[3] = new BuyerImpl("Henry", 8000, auction);

    for (int i = 0; i < buyers.length; i++) {
      buyers[i].bid();
    }

    auction.findHighestBid();


    buyers[3].cancel();

  }
}
