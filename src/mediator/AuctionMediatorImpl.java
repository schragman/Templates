package mediator;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediatorImpl implements AuctionMediator {

  private List<Buyer> buyers;
  private String auctionName;

  public AuctionMediatorImpl(String auctionName) {
    buyers = new ArrayList<>();
    this.auctionName = auctionName;
  }

  @Override
  public void addBuyer(Buyer buyer) {
    buyers.add(buyer);
  }

  @Override
  public void removeBuyer(Buyer buyer) {
    System.out.println(buyer.name + " has retrieved from the auction "
        + this.auctionName);

    this.buyers.remove(buyer);
    this.findHighestBid();
  }

  @Override
  public void findHighestBid() {
    Buyer highestBid = new BuyerImpl("dummy", 0, this);
    for (Buyer buyer : this.buyers) {
      if (buyer.getBid() > highestBid.getBid()) {
        highestBid = buyer;
      }
    }
    for (Buyer buyer : this.buyers) {
      buyer.receiveNotification(highestBid, this.auctionName);
    }
  }

  @Override
  public String getName() {
    return this.auctionName;
  }

}
