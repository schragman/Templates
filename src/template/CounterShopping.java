package template;

public class CounterShopping extends ShoppingProcess{

  @Override
  protected void addItem() {
    System.out.println("Customer chose item from the shelf");
  }

  @Override
  protected void getDeliveryAdress() {
    System.out.println("Please note the counter where you can pick up the item");
  }

  @Override
  protected void doPayment() {
    System.out.println("Payment at counter through cash/POS");
  }

  @Override
  protected void provideDeliveryStatus() {
    System.out.println("Item delivered to in delivery counter");
  }


}
