package template;

public class Client {
  public static void main(String[] args) {
    OnlineShopping shoppingProcess = new OnlineShopping();
    shoppingProcess.processShopping();
    System.out.println("*******************************");
    ShoppingProcess shoppingProcess2 = new CounterShopping();
    shoppingProcess.processShopping();
  }
}

