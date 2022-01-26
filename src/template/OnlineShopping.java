package template;

public class OnlineShopping extends ShoppingProcess{

  @Override
  protected void addItem() {
    System.out.println("Item added to online shopping cart!");
  }

  @Override
  protected void getDeliveryAdress() {
    System.out.println("Please provide delivery address.");
  }

  @Override
  protected void doPayment() {
    System.out.println("Online Payment through Netbanking, card or paypal");
  }

  @Override
  protected void provideDeliveryStatus() {
    System.out.println("Ship the item though post office to delivery address");
  }


}
