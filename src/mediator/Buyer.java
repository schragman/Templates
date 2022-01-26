package mediator;
//Colleague
public abstract class Buyer {
  protected AuctionMediator mediator;
  protected String name;
  protected int bid;

  public Buyer(String name, int bid, AuctionMediator med) {
    this.name = name;
    this.bid = bid;
    this.mediator = med;
  }

  public String getName() {
    return name;
  }

  public int getBid() {
    return bid;
  }

  public abstract void bid();

  public abstract void cancel();

  public void receiveNotification(Buyer buyer, String auctionName) {

  }
}
