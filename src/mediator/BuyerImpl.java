package mediator;

public class BuyerImpl extends Buyer{

  public BuyerImpl(String name, int bid, AuctionMediator med) {
    super(name, bid, med);
  }

  @Override
  public void bid() {
    this.mediator.addBuyer(this);
  }

  @Override
  public void cancel() {
    this.mediator.removeBuyer(this);

  }

  @Override
  public void receiveNotification(Buyer buyer, String auctionName) {
    System.out.println("Message from buyer " + this.name +": The buyer "+buyer.getName()+" has won the auction " +
            auctionName + " with the bid of " +  buyer.getBid() + " EUR");
  }

}
