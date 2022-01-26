package mediator;

public interface AuctionMediator {
  void addBuyer(Buyer buyer);

  void removeBuyer(Buyer buyer);

  void findHighestBid();

  String getName();
}
