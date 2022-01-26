package command;

public class Client {
  public static void main(String[] args) {
    //Initiating Receiver
    Stock receiver = new Stock(100, "Google");
    //Initiating Commands
    Order concreteCommand1 = new BuyStock(receiver);
    Order concreteCommand2 = new SellStock(receiver);
    Broker invoker = new Broker();

    invoker.takeOrder(concreteCommand1);
    invoker.takeOrder(concreteCommand2);

    invoker.placeOrders();

  }
}
